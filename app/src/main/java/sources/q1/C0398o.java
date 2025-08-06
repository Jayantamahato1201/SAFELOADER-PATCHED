package q1;

import T0.l;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import java.util.ArrayList;

/* renamed from: q1.o  reason: case insensitive filesystem */
public abstract class C0398o {
    public static final ArrayList b = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public IInterface f4148a;

    public C0398o() {
        try {
            b.add(new C0392n(0, this));
        } catch (Exception unused) {
        }
    }

    public final IInterface b() {
        IInterface iInterface = this.f4148a;
        if (iInterface != null) {
            return iInterface;
        }
        try {
            ContentResolver contentResolver = C0394n1.f4143a.getContentResolver();
            String str = C0394n1.b;
            Bundle call = contentResolver.call(Uri.parse("content://" + str + ".service.provider"), "method", (String) null, (Bundle) null);
            if (call != null) {
                H.k(call);
            }
        } catch (Exception unused) {
        }
        return this.f4148a;
    }

    public abstract l c();

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r3 = q1.C0394n1.f4143a;
        r3.startService(new android.content.Intent(r3, top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(T0.l r3) {
        /*
            r2 = this;
            android.os.IInterface r0 = r2.b()     // Catch:{ Exception -> 0x0009 }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ Exception -> 0x0009 }
            return r3
        L_0x0009:
            android.content.Context r3 = q1.C0394n1.f4143a     // Catch:{ Exception -> 0x0015 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0015 }
            java.lang.Class<top.bienvenido.mundo.manifest.MundoService$Companion$STUB> r1 = top.bienvenido.mundo.manifest.MundoService$Companion$STUB.class
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0015 }
            r3.startService(r0)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C0398o.d(T0.l):java.lang.Object");
    }

    public abstract String e();

    public void a() {
    }
}
