package q1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: q1.g0  reason: case insensitive filesystem */
public final class C0351g0 extends C0 {
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4098c;

    public /* synthetic */ C0351g0(AccessibleObject accessibleObject, int i2) {
        this.b = i2;
        this.f4098c = accessibleObject;
    }

    public Object a(Object obj) {
        switch (this.b) {
            case 0:
                return ((C0) this.f4098c).a(obj);
            case 2:
                return ((Field) this.f4098c).get(obj);
            default:
                return super.a(obj);
        }
    }

    public Object b(Object obj, Object... objArr) {
        switch (this.b) {
            case 1:
                return ((Method) this.f4098c).invoke(obj, objArr);
            default:
                return super.b(obj, objArr);
        }
    }

    public void c(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((C0) this.f4098c).c(obj, obj2);
                return;
            case 2:
                ((Field) this.f4098c).set(obj, obj2);
                return;
            default:
                return;
        }
    }

    public C0351g0(String str) {
        this.b = 0;
        this.f4098c = new Y(str, this);
    }
}
