package U;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public final class a extends InputStream implements DataInput {

    /* renamed from: j  reason: collision with root package name */
    public static final ByteOrder f720j = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: k  reason: collision with root package name */
    public static final ByteOrder f721k = ByteOrder.BIG_ENDIAN;
    public final DataInputStream f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f722g;

    /* renamed from: h  reason: collision with root package name */
    public final int f723h;

    /* renamed from: i  reason: collision with root package name */
    public int f724i;

    public a(InputStream inputStream) {
        this.f722g = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f = dataInputStream;
        int available = dataInputStream.available();
        this.f723h = available;
        this.f724i = 0;
        dataInputStream.mark(available);
    }

    public final int available() {
        return this.f.available();
    }

    public final void k(long j2) {
        int i2 = this.f724i;
        if (((long) i2) > j2) {
            this.f724i = 0;
            DataInputStream dataInputStream = this.f;
            dataInputStream.reset();
            dataInputStream.mark(this.f723h);
        } else {
            j2 -= (long) i2;
        }
        int i3 = (int) j2;
        if (skipBytes(i3) != i3) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int read() {
        this.f724i++;
        return this.f.read();
    }

    public final boolean readBoolean() {
        this.f724i++;
        return this.f.readBoolean();
    }

    public final byte readByte() {
        int i2 = this.f724i + 1;
        this.f724i = i2;
        if (i2 <= this.f723h) {
            int read = this.f.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f724i += 2;
        return this.f.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr, int i2, int i3) {
        int i4 = this.f724i + i3;
        this.f724i = i4;
        if (i4 > this.f723h) {
            throw new EOFException();
        } else if (this.f.read(bArr, i2, i3) != i3) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final int readInt() {
        int i2 = this.f724i + 4;
        this.f724i = i2;
        if (i2 <= this.f723h) {
            DataInputStream dataInputStream = this.f;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f722g;
                if (byteOrder == f720j) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f721k) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f722g);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        long j2;
        long j3;
        int i2 = this.f724i + 8;
        this.f724i = i2;
        if (i2 <= this.f723h) {
            DataInputStream dataInputStream = this.f;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f722g;
                if (byteOrder == f720j) {
                    j2 = (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8);
                    j3 = (long) read;
                } else if (byteOrder == f721k) {
                    j2 = (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8);
                    j3 = (long) read8;
                } else {
                    throw new IOException("Invalid byte order: " + this.f722g);
                }
                return j2 + j3;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i2 = this.f724i + 2;
        this.f724i = i2;
        if (i2 <= this.f723h) {
            DataInputStream dataInputStream = this.f;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f722g;
                if (byteOrder == f720j) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f721k) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f722g);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f724i += 2;
        return this.f.readUTF();
    }

    public final int readUnsignedByte() {
        this.f724i++;
        return this.f.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        int i2 = this.f724i + 2;
        this.f724i = i2;
        if (i2 <= this.f723h) {
            DataInputStream dataInputStream = this.f;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f722g;
                if (byteOrder == f720j) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f721k) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f722g);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i2) {
        int min = Math.min(i2, this.f723h - this.f724i);
        int i3 = 0;
        while (i3 < min) {
            i3 += this.f.skipBytes(min - i3);
        }
        this.f724i += i3;
        return i3;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f.read(bArr, i2, i3);
        this.f724i += read;
        return read;
    }

    public final void readFully(byte[] bArr) {
        int length = this.f724i + bArr.length;
        this.f724i = length;
        if (length > this.f723h) {
            throw new EOFException();
        } else if (this.f.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public a(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr));
    }
}
