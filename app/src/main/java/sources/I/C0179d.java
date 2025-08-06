package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.cheatbox.R;

/* renamed from: i.d  reason: case insensitive filesystem */
public final class C0179d extends ContextWrapper {
    public static Configuration f;

    /* renamed from: a  reason: collision with root package name */
    public int f2926a;
    public Resources.Theme b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f2927c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f2928d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f2929e;

    public C0179d(Context context, int i2) {
        super(context);
        this.f2926a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f2929e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f2928d == null) {
            this.f2928d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.f2926a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f2929e
            if (r0 != 0) goto L_0x0038
            android.content.res.Configuration r0 = r3.f2928d
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f = r1
        L_0x001c:
            android.content.res.Configuration r1 = f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.content.res.Configuration r0 = r3.f2928d
            android.content.Context r0 = i.C0178c.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f2929e = r0
            goto L_0x0038
        L_0x0032:
            android.content.res.Resources r0 = super.getResources()
            r3.f2929e = r0
        L_0x0038:
            android.content.res.Resources r0 = r3.f2929e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0179d.getResources():android.content.res.Resources");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2927c == null) {
            this.f2927c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2927c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f2926a == 0) {
            this.f2926a = R.style.MT_Bin;
        }
        b();
        return this.b;
    }

    public final void setTheme(int i2) {
        if (this.f2926a != i2) {
            this.f2926a = i2;
            b();
        }
    }
}
