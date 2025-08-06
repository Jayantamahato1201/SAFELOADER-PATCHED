package K0;

import H0.r;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import o1.o;
import o1.v;

/* renamed from: K0.b  reason: case insensitive filesystem */
public final class C0035b extends C {

    /* renamed from: a  reason: collision with root package name */
    public final Context f523a;
    public final Object b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public AssetManager f524c;

    public C0035b(Context context) {
        this.f523a = context;
    }

    public final boolean a(A a2) {
        Uri uri = a2.f493a;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public final r c(A a2, int i2) {
        if (this.f524c == null) {
            synchronized (this.b) {
                try {
                    if (this.f524c == null) {
                        this.f524c = this.f523a.getAssets();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new r((v) o.c(this.f524c.open(a2.f493a.toString().substring(22))), 2);
    }
}
