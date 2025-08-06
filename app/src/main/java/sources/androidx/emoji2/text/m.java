package androidx.emoji2.text;

import S.a;
import java.nio.ByteBuffer;

public final class m {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f1168d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f1169a;
    public final r b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1170c = 0;

    public m(r rVar, int i2) {
        this.b = rVar;
        this.f1169a = i2;
    }

    public final int a(int i2) {
        a b2 = b();
        int a2 = b2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.f386d;
        int i3 = a2 + b2.f384a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, I.A] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final S.a b() {
        /*
            r4 = this;
            java.lang.ThreadLocal r0 = f1168d
            java.lang.Object r1 = r0.get()
            S.a r1 = (S.a) r1
            if (r1 != 0) goto L_0x0012
            S.a r1 = new S.a
            r1.<init>()
            r0.set(r1)
        L_0x0012:
            androidx.emoji2.text.r r0 = r4.b
            java.lang.Object r0 = r0.f1183a
            S.b r0 = (S.b) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L_0x005e
            int r3 = r0.f384a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f386d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.f1169a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f386d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.f386d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.f386d = r0
            if (r0 == 0) goto L_0x0057
            r1.f384a = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.b = r3
            java.lang.Object r0 = r1.f386d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.f385c = r0
            return r1
        L_0x0057:
            r0 = 0
            r1.f384a = r0
            r1.b = r0
            r1.f385c = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.m.b():S.a");
    }

    public final String toString() {
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a b2 = b();
        int a2 = b2.a(4);
        if (a2 != 0) {
            i2 = ((ByteBuffer) b2.f386d).getInt(a2 + b2.f384a);
        } else {
            i2 = 0;
        }
        sb.append(Integer.toHexString(i2));
        sb.append(", codepoints:");
        a b3 = b();
        int a3 = b3.a(16);
        if (a3 != 0) {
            int i4 = a3 + b3.f384a;
            i3 = ((ByteBuffer) b3.f386d).getInt(((ByteBuffer) b3.f386d).getInt(i4) + i4);
        } else {
            i3 = 0;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(Integer.toHexString(a(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
