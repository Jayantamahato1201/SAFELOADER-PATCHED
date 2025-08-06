package d1;

import A.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f2358a;

    public r(j jVar) {
        ArrayList arrayList = (ArrayList) jVar.b;
        this.f2358a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String a(String str) {
        String[] strArr = this.f2358a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String b(int i2) {
        return this.f2358a[i2 * 2];
    }

    public final j c() {
        j jVar = new j(23);
        Collections.addAll((ArrayList) jVar.b, this.f2358a);
        return jVar;
    }

    public final int d() {
        return this.f2358a.length / 2;
    }

    public final String e(int i2) {
        return this.f2358a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r) || !Arrays.equals(((r) obj).f2358a, this.f2358a)) {
            return false;
        }
        return true;
    }

    public final List f(String str) {
        int d2 = d();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < d2; i2++) {
            if (str.equalsIgnoreCase(b(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i2));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2358a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int d2 = d();
        for (int i2 = 0; i2 < d2; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(e(i2));
            sb.append("\n");
        }
        return sb.toString();
    }

    public r(String[] strArr) {
        this.f2358a = strArr;
    }
}
