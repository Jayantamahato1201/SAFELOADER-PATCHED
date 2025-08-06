package i0;

import F.g;
import android.os.AsyncTask;
import android.os.Build;
import d1.B;
import d1.C0109b;
import d1.D;
import d1.E;
import d1.G;
import d1.v;
import d1.w;
import d1.x;
import d1.y;
import d1.z;
import e1.c;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o1.h;
import p1.a;

/* renamed from: i0.a  reason: case insensitive filesystem */
public final class C0190a extends AsyncTask {
    public final Object doInBackground(Object[] objArr) {
        boolean z2;
        boolean z3 = false;
        File file = ((File[]) objArr)[0];
        try {
            String str = a.a(47567544489161682L) + Build.MANUFACTURER + a.a(47567389870339026L) + Build.MODEL + a.a(47567381280404434L) + Build.VERSION.RELEASE + a.a(47567308265960402L) + b.b() + a.a(47567243841450962L) + b.a();
            y yVar = new y();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yVar.f2401t = c.c(10);
            yVar.f2403v = c.c(15);
            yVar.f2402u = c.c(15);
            yVar.f2400s = true;
            z zVar = new z(yVar);
            String uuid = UUID.randomUUID().toString();
            v vVar = x.f2376p;
            ArrayList arrayList = new ArrayList();
            h f = h.f(uuid);
            v vVar2 = x.f2376p;
            if (vVar2 == null) {
                throw new NullPointerException("type == null");
            } else if (vVar2.b.equals("multipart")) {
                String a2 = a.a(47567200891778002L);
                String str2 = b.f2979d;
                Charset charset = c.f2615d;
                byte[] bytes = str2.getBytes(charset);
                int length = bytes.length;
                long length2 = (long) bytes.length;
                long j2 = (long) 0;
                z zVar2 = zVar;
                long j3 = (long) length;
                if ((j2 | j3) < 0 || j2 > length2 || length2 - j2 < j3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                arrayList.add(w.a(a2, (String) null, new D((v) null, length, bytes)));
                String a3 = a.a(47567166532039634L);
                byte[] bytes2 = str.getBytes(charset);
                int length3 = bytes2.length;
                long length4 = (long) bytes2.length;
                long j4 = (long) length3;
                if ((j2 | j4) < 0 || j2 > length4 || length4 - j2 < j4) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                arrayList.add(w.a(a3, (String) null, new D((v) null, length3, bytes2)));
                arrayList.add(w.a(a.a(47567132172301266L), file.getName(), new E(v.a(a.a(47567093517595602L)), file)));
                if (!arrayList.isEmpty()) {
                    x xVar = new x(f, vVar2, arrayList);
                    g gVar = new g();
                    gVar.o(a.a(47567046272955346L) + b.f2978c + a.a(47566921718903762L));
                    gVar.i("POST", xVar);
                    z zVar3 = zVar2;
                    B b = new B(zVar3, gVar.a());
                    zVar3.f2412k.getClass();
                    b.f2228h = C0109b.f2282d;
                    G a4 = b.a();
                    int i2 = a4.f2251h;
                    if (i2 < 200 || i2 >= 300) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    a4.close();
                    z3 = z2;
                    return Boolean.valueOf(z3);
                }
                throw new IllegalStateException("Multipart body must have at least one part.");
            } else {
                throw new IllegalArgumentException("multipart != " + vVar2);
            }
        } catch (Exception unused) {
        }
    }

    public final void onPostExecute(Object obj) {
        ((Boolean) obj).getClass();
    }
}
