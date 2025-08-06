package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
public final class C0044a implements B {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1272a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1273c;

    /* renamed from: d  reason: collision with root package name */
    public int f1274d;

    /* renamed from: e  reason: collision with root package name */
    public int f1275e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1276g;

    /* renamed from: h  reason: collision with root package name */
    public String f1277h;

    /* renamed from: i  reason: collision with root package name */
    public int f1278i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1279j;

    /* renamed from: k  reason: collision with root package name */
    public int f1280k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1281l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f1282m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f1283n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1284o;

    /* renamed from: p  reason: collision with root package name */
    public final D f1285p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1286q;

    /* renamed from: r  reason: collision with root package name */
    public int f1287r;

    public C0044a(D d2) {
        d2.A();
        r rVar = d2.f1210n;
        if (rVar != null) {
            rVar.f1385m.getClassLoader();
        }
        this.f1272a = new ArrayList();
        this.f1284o = false;
        this.f1287r = -1;
        this.f1285p = d2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (D.D(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1276g) {
            return true;
        }
        D d2 = this.f1285p;
        if (d2.f1201d == null) {
            d2.f1201d = new ArrayList();
        }
        d2.f1201d.add(this);
        return true;
    }

    public final void b(J j2) {
        this.f1272a.add(j2);
        j2.f1256c = this.b;
        j2.f1257d = this.f1273c;
        j2.f1258e = this.f1274d;
        j2.f = this.f1275e;
    }

    public final void c(int i2) {
        if (this.f1276g) {
            if (D.D(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f1272a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                J j2 = (J) arrayList.get(i3);
                C0058o oVar = j2.b;
                if (oVar != null) {
                    oVar.f1372q += i2;
                    if (D.D(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + j2.b + " to " + j2.b.f1372q);
                    }
                }
            }
        }
    }

    public final void d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1277h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1287r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1286q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (!(this.b == 0 && this.f1273c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1273c));
            }
            if (!(this.f1274d == 0 && this.f1275e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1274d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1275e));
            }
            if (!(this.f1278i == 0 && this.f1279j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1278i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1279j);
            }
            if (!(this.f1280k == 0 && this.f1281l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1280k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1281l);
            }
        }
        ArrayList arrayList = this.f1272a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                J j2 = (J) arrayList.get(i2);
                switch (j2.f1255a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + j2.f1255a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(j2.b);
                if (z2) {
                    if (!(j2.f1256c == 0 && j2.f1257d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(j2.f1256c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(j2.f1257d));
                    }
                    if (j2.f1258e != 0 || j2.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(j2.f1258e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(j2.f));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1287r >= 0) {
            sb.append(" #");
            sb.append(this.f1287r);
        }
        if (this.f1277h != null) {
            sb.append(" ");
            sb.append(this.f1277h);
        }
        sb.append("}");
        return sb.toString();
    }
}
