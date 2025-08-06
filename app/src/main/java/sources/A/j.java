package A;

import E.c;
import I.C0011c;
import I.C0013e;
import I.C0014f;
import J.m;
import K0.G;
import N.f;
import Q0.l;
import T.g;
import Z.e;
import android.animation.Animator;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.Log;
import android.util.LruCache;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.emoji2.text.a;
import androidx.emoji2.text.i;
import androidx.emoji2.text.k;
import androidx.fragment.app.N;
import androidx.fragment.app.r;
import androidx.profileinstaller.ProfileInstallReceiver;
import d1.C0115h;
import d1.J;
import d1.z;
import j.C0196F;
import j.C0203g;
import j.C0207k;
import j.C0209m;
import j.C0211o;
import j.y;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0248j;
import k.C0254m;
import k.M0;
import k.p1;

public class j implements C0011c, C0013e, e, i, c, M0, y, C0207k {

    /* renamed from: c  reason: collision with root package name */
    public static j f21c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22a;
    public Object b;

    public /* synthetic */ j(int i2, Object obj) {
        this.f22a = i2;
        this.b = obj;
    }

    public static void u(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= ' ' || charAt >= 127) {
                    Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i2), str};
                    byte[] bArr = e1.c.f2613a;
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                int i3 = 0;
                while (i3 < length2) {
                    char charAt2 = str2.charAt(i3);
                    if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                        i3++;
                    } else {
                        Object[] objArr2 = {Integer.valueOf(charAt2), Integer.valueOf(i3), str, str2};
                        byte[] bArr2 = e1.c.f2613a;
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
                    }
                }
                return;
            }
            throw new NullPointerException(g.i("value for name ", str, " == null"));
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public void A() {
        synchronized (this.b) {
        }
    }

    public boolean B(int i2, int i3, Bundle bundle) {
        return false;
    }

    public void C(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i2 < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                    arrayList.remove(i2);
                    arrayList.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            } else {
                return;
            }
        }
    }

    public void D() {
        synchronized (((C0115h) this.b)) {
        }
    }

    public void a(C0209m mVar, boolean z2) {
        if (mVar instanceof C0196F) {
            ((C0196F) mVar).f3048z.k().c(false);
        }
        y yVar = ((C0248j) this.b).f3478e;
        if (yVar != null) {
            yVar.a(mVar, z2);
        }
    }

    public boolean b(C0209m mVar) {
        C0248j jVar = (C0248j) this.b;
        if (mVar == jVar.f3476c) {
            return false;
        }
        ((C0196F) mVar).f3047A.getClass();
        jVar.getClass();
        y yVar = jVar.f3478e;
        if (yVar != null) {
            return yVar.b(mVar);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: j.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(j.C0209m r8, j.C0211o r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            j.g r0 = (j.C0203g) r0
            android.os.Handler r1 = r0.f
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.f3075h
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            j.f r6 = (j.C0202f) r6
            j.m r6 = r6.b
            if (r8 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = -1
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            j.f r2 = (j.C0202f) r2
        L_0x0035:
            j.e r1 = new j.e
            r1.<init>(r7, r2, r9, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r9 = r0.f
            r9.postAtTime(r1, r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.j.c(j.m, j.o):void");
    }

    public ClipData d() {
        return ((ContentInfo) this.b).getClip();
    }

    public void e(C0209m mVar) {
        p1 p1Var = ((ActionMenuView) this.b).f968u;
        if (p1Var != null) {
            p1Var.e(mVar);
        }
    }

    public boolean f(C0209m mVar, MenuItem menuItem) {
        C0254m mVar2 = ((ActionMenuView) this.b).f973z;
        if (mVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((p1) mVar2).f3550a.f1030G.f194c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        throw g.e(it);
    }

    public C0014f g() {
        return new C0014f(new j(((ContentInfo.Builder) this.b).build()));
    }

    public void h(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i2);
    }

    public int i() {
        return ((ContentInfo) this.b).getFlags();
    }

    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public ContentInfo k() {
        return (ContentInfo) this.b;
    }

    public void l(l lVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k(this, lVar, threadPoolExecutor, 0));
    }

    public void m(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public void n(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    public int o() {
        return ((ContentInfo) this.b).getSource();
    }

    public void p(C0209m mVar, C0211o oVar) {
        ((C0203g) this.b).f.removeCallbacksAndMessages(mVar);
    }

    public void q() {
        switch (this.f22a) {
            case 14:
                ((Animator) this.b).end();
                return;
            default:
                ((N) this.b).a();
                return;
        }
    }

    public void r(int i2) {
        ((ContentInfo.Builder) this.b).setFlags(i2);
    }

    public void s(String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            t(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            t("", str.substring(1));
        } else {
            t("", str);
        }
    }

    public void t(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public String toString() {
        switch (this.f22a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public synchronized void v(J j2) {
        ((LinkedHashSet) this.b).remove(j2);
    }

    public J.l w(int i2) {
        return null;
    }

    public J.l x(int i2) {
        return null;
    }

    public String y(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
        }
        return null;
    }

    public void z() {
        ((r) this.b).f1387o.I();
    }

    public j(int i2) {
        this.f22a = i2;
        switch (i2) {
            case 2:
                this.b = new Object();
                new Handler(Looper.getMainLooper(), new G0.e(this));
                return;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new m(this);
                    return;
                } else {
                    this.b = new m(this);
                    return;
                }
            case 23:
                this.b = new ArrayList(20);
                return;
            case 25:
                this.b = new LinkedHashSet();
                return;
            default:
                return;
        }
    }

    public j(Context context, int i2) {
        long j2;
        this.f22a = i2;
        switch (i2) {
            case 7:
                StringBuilder sb = G.f520a;
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j2 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
                } catch (IllegalArgumentException unused) {
                    j2 = 5242880;
                }
                long max = Math.max(Math.min(j2, 52428800), 5242880);
                d1.y yVar = new d1.y();
                yVar.f2390i = new C0115h(file, max);
                this.b = new z(yVar);
                return;
            case 13:
                this.b = context.getApplicationContext();
                return;
            default:
                StringBuilder sb2 = G.f520a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                this.b = new LruCache((int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7));
                return;
        }
    }

    public j(TextView textView) {
        this.f22a = 11;
        this.b = new g(textView);
    }

    public j(EditText editText) {
        this.f22a = 10;
        this.b = new F.c(editText);
    }

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f22a = 8;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new f(uri, clipDescription, uri2);
        } else {
            this.b = new N.g(uri, clipDescription, uri2);
        }
    }

    public j(ContentInfo contentInfo) {
        this.f22a = 4;
        contentInfo.getClass();
        this.b = B0.e.h(contentInfo);
    }

    public j(ClipData clipData, int i2) {
        this.f22a = 3;
        this.b = B0.e.f(clipData, i2);
    }
}
