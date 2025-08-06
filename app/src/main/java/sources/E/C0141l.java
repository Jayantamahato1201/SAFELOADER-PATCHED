package e;

import E.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import n.C0290c;
import n.C0294g;

/* renamed from: e.l  reason: case insensitive filesystem */
public abstract class C0141l {

    /* renamed from: a  reason: collision with root package name */
    public static final C0122D f2523a = new C0122D(new Object());
    public static final int b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static g f2524c = null;

    /* renamed from: d  reason: collision with root package name */
    public static g f2525d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f2526e = null;
    public static boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final C0290c f2527g = new C0290c();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f2528h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f2529i = new Object();

    public static boolean c(Context context) {
        int i2;
        if (f2526e == null) {
            try {
                int i3 = C0121C.f2434a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i2 = C0120B.a() | 128;
                } else {
                    i2 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, C0121C.class), i2).metaData;
                if (bundle != null) {
                    f2526e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2526e = Boolean.FALSE;
            }
        }
        return f2526e.booleanValue();
    }

    public static void h(x xVar) {
        synchronized (f2528h) {
            try {
                Iterator it = f2527g.iterator();
                while (true) {
                    C0294g gVar = (C0294g) it;
                    if (gVar.hasNext()) {
                        C0141l lVar = (C0141l) ((WeakReference) gVar.next()).get();
                        if (lVar == xVar || lVar == null) {
                            gVar.remove();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void g();

    public abstract boolean i(int i2);

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
