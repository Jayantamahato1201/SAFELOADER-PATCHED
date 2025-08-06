package I;

import E0.e;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public int f384a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f385c;

    /* renamed from: d  reason: collision with root package name */
    public Object f386d;

    public A() {
        if (e.b == null) {
            e.b = new e(7);
        }
    }

    public int a(int i2) {
        if (i2 < this.f385c) {
            return ((ByteBuffer) this.f386d).getShort(this.b + i2);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object obj2;
        C0010b bVar;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            obj2 = b(view);
        } else {
            obj2 = view.getTag(this.f384a);
            if (!((Class) this.f386d).isInstance(obj2)) {
                obj2 = null;
            }
        }
        if (e(obj2, obj)) {
            View.AccessibilityDelegate c2 = O.c(view);
            if (c2 == null) {
                bVar = null;
            } else if (c2 instanceof C0009a) {
                bVar = ((C0009a) c2).f406a;
            } else {
                bVar = new C0010b(c2);
            }
            if (bVar == null) {
                bVar = new C0010b();
            }
            O.p(view, bVar);
            view.setTag(this.f384a, obj);
            O.i(view, this.f385c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
