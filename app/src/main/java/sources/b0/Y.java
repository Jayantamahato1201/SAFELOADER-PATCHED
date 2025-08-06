package b0;

import I.O;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public abstract class Y {

    /* renamed from: s  reason: collision with root package name */
    public static final List f1627s = Collections.EMPTY_LIST;

    /* renamed from: a  reason: collision with root package name */
    public final View f1628a;
    public WeakReference b;

    /* renamed from: c  reason: collision with root package name */
    public int f1629c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1630d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f1631e = -1;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f1632g = -1;

    /* renamed from: h  reason: collision with root package name */
    public Y f1633h = null;

    /* renamed from: i  reason: collision with root package name */
    public Y f1634i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f1635j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f1636k = null;

    /* renamed from: l  reason: collision with root package name */
    public final List f1637l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f1638m = 0;

    /* renamed from: n  reason: collision with root package name */
    public P f1639n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1640o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f1641p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f1642q = -1;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f1643r;

    public Y(View view) {
        if (view != null) {
            this.f1628a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i2) {
        this.f1635j = i2 | this.f1635j;
    }

    public final int b() {
        int i2 = this.f1632g;
        if (i2 == -1) {
            return this.f1629c;
        }
        return i2;
    }

    public final List c() {
        ArrayList arrayList;
        if ((this.f1635j & 1024) != 0 || (arrayList = this.f1636k) == null || arrayList.size() == 0) {
            return f1627s;
        }
        return this.f1637l;
    }

    public final boolean d() {
        View view = this.f1628a;
        if (view.getParent() == null || view.getParent() == this.f1643r) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if ((this.f1635j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.f1635j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f1635j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = O.f393a;
        if (!this.f1628a.hasTransientState()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f1635j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.f1639n != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f1635j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f1635j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void l(int i2, boolean z2) {
        if (this.f1630d == -1) {
            this.f1630d = this.f1629c;
        }
        if (this.f1632g == -1) {
            this.f1632g = this.f1629c;
        }
        if (z2) {
            this.f1632g += i2;
        }
        this.f1629c += i2;
        View view = this.f1628a;
        if (view.getLayoutParams() != null) {
            ((K) view.getLayoutParams()).f1591c = true;
        }
    }

    public final void m() {
        this.f1635j = 0;
        this.f1629c = -1;
        this.f1630d = -1;
        this.f1631e = -1;
        this.f1632g = -1;
        this.f1638m = 0;
        this.f1633h = null;
        this.f1634i = null;
        ArrayList arrayList = this.f1636k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f1635j &= -1025;
        this.f1641p = 0;
        this.f1642q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z2) {
        int i2;
        int i3 = this.f1638m;
        if (z2) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        this.f1638m = i2;
        if (i2 < 0) {
            this.f1638m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f1635j |= 16;
        } else if (z2 && i2 == 0) {
            this.f1635j &= -17;
        }
    }

    public final boolean o() {
        if ((this.f1635j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.f1635j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1629c + " id=" + this.f1631e + ", oldPos=" + this.f1630d + ", pLpos:" + this.f1632g);
        if (i()) {
            sb.append(" scrap ");
            if (this.f1640o) {
                str2 = "[changeScrap]";
            } else {
                str2 = "[attachedScrap]";
            }
            sb.append(str2);
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f1635j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f1638m + ")");
        }
        if ((this.f1635j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f1628a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
