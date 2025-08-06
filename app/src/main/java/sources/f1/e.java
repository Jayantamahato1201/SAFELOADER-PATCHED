package f1;

import e1.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import k1.a;
import o1.o;
import o1.v;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2704a;
    public final long[] b;

    /* renamed from: c  reason: collision with root package name */
    public final File[] f2705c;

    /* renamed from: d  reason: collision with root package name */
    public final File[] f2706d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2707e;
    public d f;

    /* renamed from: g  reason: collision with root package name */
    public long f2708g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f2709h;

    public e(g gVar, String str) {
        this.f2709h = gVar;
        this.f2704a = str;
        int i2 = gVar.f2720m;
        this.b = new long[i2];
        this.f2705c = new File[i2];
        this.f2706d = new File[i2];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i3 = 0; i3 < gVar.f2720m; i3++) {
            sb.append(i3);
            File[] fileArr = this.f2705c;
            String sb2 = sb.toString();
            File file = gVar.f2714g;
            fileArr[i3] = new File(file, sb2);
            sb.append(".tmp");
            this.f2706d[i3] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final f a() {
        v vVar;
        g gVar = this.f2709h;
        if (Thread.holdsLock(gVar)) {
            v[] vVarArr = new v[gVar.f2720m];
            int i2 = 0;
            int i3 = 0;
            while (i3 < gVar.f2720m) {
                try {
                    a aVar = gVar.f;
                    File file = this.f2705c[i3];
                    aVar.getClass();
                    vVarArr[i3] = o.b(file);
                    i3++;
                } catch (FileNotFoundException unused) {
                    while (i2 < gVar.f2720m && (vVar = vVarArr[i2]) != null) {
                        c.d(vVar);
                        i2++;
                    }
                    try {
                        gVar.w(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new f(gVar, this.f2704a, this.f2708g, vVarArr);
        }
        throw new AssertionError();
    }
}
