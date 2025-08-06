package Z;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f818a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final long f819c;

    /* renamed from: d  reason: collision with root package name */
    public final long f820d;

    public m(int i2, int i3, long j2, long j3) {
        this.f818a = i2;
        this.b = i3;
        this.f819c = j2;
        this.f820d = j3;
    }

    public static m a(File file) {
        Throwable th;
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            m mVar = new m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return mVar;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f818a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.f819c);
            dataOutputStream.writeLong(this.f820d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (this.b == mVar.b && this.f819c == mVar.f819c && this.f818a == mVar.f818a && this.f820d == mVar.f820d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.b), Long.valueOf(this.f819c), Integer.valueOf(this.f818a), Long.valueOf(this.f820d)});
    }
}
