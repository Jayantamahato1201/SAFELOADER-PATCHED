package h1;

import d1.B;
import d1.C;
import d1.C0109b;
import d1.G;
import d1.u;
import g1.b;
import java.util.ArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2911a;
    public final g1.f b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2912c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2913d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2914e;
    public final C f;

    /* renamed from: g  reason: collision with root package name */
    public final B f2915g;

    /* renamed from: h  reason: collision with root package name */
    public final C0109b f2916h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2917i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2918j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2919k;

    /* renamed from: l  reason: collision with root package name */
    public int f2920l;

    public f(ArrayList arrayList, g1.f fVar, c cVar, b bVar, int i2, C c2, B b2, C0109b bVar2, int i3, int i4, int i5) {
        this.f2911a = arrayList;
        this.f2913d = bVar;
        this.b = fVar;
        this.f2912c = cVar;
        this.f2914e = i2;
        this.f = c2;
        this.f2915g = b2;
        this.f2916h = bVar2;
        this.f2917i = i3;
        this.f2918j = i4;
        this.f2919k = i5;
    }

    public final G a(C c2) {
        return b(c2, this.b, this.f2912c, this.f2913d);
    }

    public final G b(C c2, g1.f fVar, c cVar, b bVar) {
        ArrayList arrayList = this.f2911a;
        int size = arrayList.size();
        int i2 = this.f2914e;
        if (i2 < size) {
            this.f2920l++;
            c cVar2 = this.f2912c;
            C c3 = c2;
            if (cVar2 != null) {
                if (!this.f2913d.j(c3.f2231a)) {
                    throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port");
                }
            }
            if (cVar2 == null || this.f2920l <= 1) {
                int i3 = i2 + 1;
                String str = " must call proceed() exactly once";
                g1.f fVar2 = fVar;
                f fVar3 = new f(arrayList, fVar2, cVar, bVar, i3, c3, this.f2915g, this.f2916h, this.f2917i, this.f2918j, this.f2919k);
                u uVar = (u) arrayList.get(i2);
                G a2 = uVar.a(fVar3);
                if (cVar != null && i3 < arrayList.size() && fVar3.f2920l != 1) {
                    throw new IllegalStateException("network interceptor " + uVar + str);
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + uVar + " returned null");
                } else if (a2.f2255l != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + uVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }
}
