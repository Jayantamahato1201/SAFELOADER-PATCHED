package H;

import U0.i;
import q.c;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f260a;
    public final Object[] b;

    /* renamed from: c  reason: collision with root package name */
    public int f261c;

    public b(int i2) {
        this.f260a = 0;
        if (i2 > 0) {
            this.b = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        switch (this.f260a) {
            case 0:
                int i2 = this.f261c;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = i2 - 1;
                Object[] objArr = this.b;
                Object obj = objArr[i3];
                i.c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
                objArr[i3] = null;
                this.f261c--;
                return obj;
            default:
                int i4 = this.f261c;
                if (i4 <= 0) {
                    return null;
                }
                int i5 = i4 - 1;
                Object[] objArr2 = this.b;
                Object obj2 = objArr2[i5];
                objArr2[i5] = null;
                this.f261c = i4 - 1;
                return obj2;
        }
    }

    public void b(c cVar) {
        int i2 = this.f261c;
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = cVar;
            this.f261c = i2 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        i.e("instance", obj);
        int i2 = this.f261c;
        int i3 = 0;
        while (true) {
            objArr = this.b;
            if (i3 >= i2) {
                z2 = false;
                break;
            } else if (objArr[i3] == obj) {
                z2 = true;
                break;
            } else {
                i3++;
            }
        }
        if (!z2) {
            int i4 = this.f261c;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = obj;
            this.f261c = i4 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public b() {
        this.f260a = 1;
        this.b = new Object[256];
    }
}
