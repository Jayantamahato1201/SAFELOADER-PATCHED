package androidx.emoji2.text;

import S.a;
import android.util.SparseArray;
import java.nio.ByteBuffer;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public int f1171a = 1;
    public final q b;

    /* renamed from: c  reason: collision with root package name */
    public q f1172c;

    /* renamed from: d  reason: collision with root package name */
    public q f1173d;

    /* renamed from: e  reason: collision with root package name */
    public int f1174e;
    public int f;

    public n(q qVar) {
        this.b = qVar;
        this.f1172c = qVar;
    }

    public final int a(int i2) {
        q qVar;
        SparseArray sparseArray = this.f1172c.f1182a;
        if (sparseArray == null) {
            qVar = null;
        } else {
            qVar = (q) sparseArray.get(i2);
        }
        int i3 = 1;
        if (this.f1171a != 2) {
            if (qVar == null) {
                b();
                this.f1174e = i2;
                return i3;
            }
            this.f1171a = 2;
            this.f1172c = qVar;
            this.f = 1;
        } else if (qVar != null) {
            this.f1172c = qVar;
            this.f++;
        } else {
            if (i2 == 65038) {
                b();
            } else if (i2 != 65039) {
                q qVar2 = this.f1172c;
                if (qVar2.b != null) {
                    if (this.f != 1) {
                        this.f1173d = qVar2;
                        b();
                    } else if (c()) {
                        this.f1173d = this.f1172c;
                        b();
                    } else {
                        b();
                    }
                    i3 = 3;
                } else {
                    b();
                }
            }
            this.f1174e = i2;
            return i3;
        }
        i3 = 2;
        this.f1174e = i2;
        return i3;
    }

    public final void b() {
        this.f1171a = 1;
        this.f1172c = this.b;
        this.f = 0;
    }

    public final boolean c() {
        a b2 = this.f1172c.b.b();
        int a2 = b2.a(6);
        if ((a2 == 0 || ((ByteBuffer) b2.f386d).get(a2 + b2.f384a) == 0) && this.f1174e != 65039) {
            return false;
        }
        return true;
    }
}
