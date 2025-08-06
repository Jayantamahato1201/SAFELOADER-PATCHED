package I;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k0.C0281a;

/* renamed from: I.d  reason: case insensitive filesystem */
public final class C0012d implements C0011c, C0013e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f412a;
    public Object b;

    /* renamed from: c  reason: collision with root package name */
    public int f413c;

    /* renamed from: d  reason: collision with root package name */
    public int f414d;

    /* renamed from: e  reason: collision with root package name */
    public Object f415e;
    public Cloneable f;

    public /* synthetic */ C0012d() {
        this.f412a = 0;
    }

    public void a(t0 t0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if ((g0Var.f430a.c() & 8) != 0) {
                ((View) this.f415e).setTranslationY((float) C0281a.c(this.f414d, 0, g0Var.f430a.b()));
                return;
            }
        }
    }

    public ClipData d() {
        return (ClipData) this.b;
    }

    public C0014f g() {
        return new C0014f(new C0012d(this));
    }

    public int i() {
        return this.f414d;
    }

    public ContentInfo k() {
        return null;
    }

    public void m(Bundle bundle) {
        this.f = bundle;
    }

    public void n(Uri uri) {
        this.f415e = uri;
    }

    public int o() {
        return this.f413c;
    }

    public void r(int i2) {
        this.f414d = i2;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        switch (this.f412a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                int i2 = this.f413c;
                if (i2 == 0) {
                    str = "SOURCE_APP";
                } else if (i2 == 1) {
                    str = "SOURCE_CLIPBOARD";
                } else if (i2 == 2) {
                    str = "SOURCE_INPUT_METHOD";
                } else if (i2 == 3) {
                    str = "SOURCE_DRAG_AND_DROP";
                } else if (i2 == 4) {
                    str = "SOURCE_AUTOFILL";
                } else if (i2 != 5) {
                    str = String.valueOf(i2);
                } else {
                    str = "SOURCE_PROCESS_TEXT";
                }
                sb.append(str);
                sb.append(", flags=");
                int i3 = this.f414d;
                if ((i3 & 1) != 0) {
                    str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str2 = String.valueOf(i3);
                }
                sb.append(str2);
                String str4 = "";
                Uri uri = (Uri) this.f415e;
                if (uri == null) {
                    str3 = str4;
                } else {
                    str3 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str3);
                if (((Bundle) this.f) != null) {
                    str4 = ", hasExtras";
                }
                sb.append(str4);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Cloneable, int[]] */
    public C0012d(View view) {
        this.f412a = 2;
        this.f = new int[2];
        this.f415e = view;
    }

    public C0012d(C0012d dVar) {
        this.f412a = 1;
        ClipData clipData = (ClipData) dVar.b;
        clipData.getClass();
        this.b = clipData;
        int i2 = dVar.f413c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i2 <= 5) {
            this.f413c = i2;
            int i3 = dVar.f414d;
            if ((i3 & 1) == i3) {
                this.f414d = i3;
                this.f415e = (Uri) dVar.f415e;
                this.f = (Bundle) dVar.f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
