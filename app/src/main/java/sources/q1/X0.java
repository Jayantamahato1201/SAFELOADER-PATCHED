package q1;

import android.net.Uri;
import android.os.IBinder;
import java.util.ArrayList;

public final class X0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f4031a;
    public final ArrayList b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4032c = new ArrayList();

    public X0(String str) {
        this.f4031a = str;
    }

    public final void a(Uri uri, int i2, IBinder iBinder, boolean z2) {
        int i3;
        String str;
        if (uri == null) {
            i3 = 0;
        } else {
            i3 = uri.getPathSegments().size() + 1;
        }
        if (i2 == i3) {
            this.f4032c.add(new R0(this, iBinder, z2));
            return;
        }
        if (uri == null) {
            str = null;
        } else if (i2 == 0) {
            str = uri.getAuthority();
        } else {
            str = uri.getPathSegments().get(i2 - 1);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X0 x02 = (X0) arrayList.get(i4);
            if (x02.f4031a.equals(str)) {
                x02.a(uri, i2 + 1, iBinder, z2);
                return;
            }
        }
        X0 x03 = new X0(str);
        arrayList.add(x03);
        x03.a(uri, i2 + 1, iBinder, z2);
    }

    public final void b(Uri uri, int i2, IBinder iBinder, boolean z2, ArrayList arrayList) {
        int i3;
        ArrayList arrayList2 = arrayList;
        if (uri == null) {
            i3 = 0;
        } else {
            i3 = uri.getPathSegments().size() + 1;
        }
        String str = null;
        if (i2 >= i3) {
            c(true, iBinder, z2, arrayList2);
        } else {
            if (uri != null) {
                if (i2 == 0) {
                    str = uri.getAuthority();
                } else {
                    str = uri.getPathSegments().get(i2 - 1);
                }
            }
            c(false, iBinder, z2, arrayList2);
        }
        String str2 = str;
        ArrayList arrayList3 = this.b;
        int size = arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            X0 x02 = (X0) arrayList3.get(i4);
            if (str2 == null || x02.f4031a.equals(str2)) {
                x02.b(uri, i2 + 1, iBinder, z2, arrayList2);
                if (str2 != null) {
                    return;
                }
            }
            i4++;
            arrayList2 = arrayList;
        }
    }

    public final void c(boolean z2, IBinder iBinder, boolean z3, ArrayList arrayList) {
        ArrayList arrayList2 = this.f4032c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            R0 r02 = (R0) arrayList2.get(i2);
            IBinder iBinder2 = r02.f3978a;
            if ((iBinder2 != iBinder || z3) && (z2 || r02.b)) {
                arrayList.add(new N0(this, iBinder2, z3));
            }
        }
    }

    public final boolean d(IBinder iBinder) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((X0) arrayList.get(i2)).d(iBinder)) {
                arrayList.remove(i2);
                i2--;
                size--;
            }
            i2++;
        }
        ArrayList arrayList2 = this.f4032c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            R0 r02 = (R0) arrayList2.get(i3);
            if (r02.f3978a == iBinder) {
                arrayList2.remove(i3);
                iBinder.unlinkToDeath(r02, 0);
                break;
            }
            i3++;
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return false;
        }
        return true;
    }
}
