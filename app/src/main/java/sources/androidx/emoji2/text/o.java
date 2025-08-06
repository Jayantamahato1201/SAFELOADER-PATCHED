package androidx.emoji2.text;

import A.i;
import E0.e;
import F.f;
import F.g;
import F.m;
import Q0.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1175a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final e f1176c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1177d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler f1178e;
    public ThreadPoolExecutor f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadPoolExecutor f1179g;

    /* renamed from: h  reason: collision with root package name */
    public l f1180h;

    public o(Context context, g gVar) {
        e eVar = p.f1181d;
        i.k("Context cannot be null", context);
        this.f1175a = context.getApplicationContext();
        this.b = gVar;
        this.f1176c = eVar;
    }

    public final void a() {
        synchronized (this.f1177d) {
            try {
                this.f1180h = null;
                Handler handler = this.f1178e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f1178e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1179g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f1179g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f1177d) {
            try {
                if (this.f1180h != null) {
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f1179g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new F0.g(7, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m c() {
        try {
            e eVar = this.f1176c;
            Context context = this.f1175a;
            g gVar = this.b;
            eVar.getClass();
            F.l a2 = f.a(context, gVar);
            int i2 = a2.f210a;
            if (i2 == 0) {
                m[] mVarArr = (m[]) a2.b;
                if (mVarArr != null && mVarArr.length != 0) {
                    return mVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + i2 + ")");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    public final void l(l lVar) {
        synchronized (this.f1177d) {
            this.f1180h = lVar;
        }
        b();
    }
}
