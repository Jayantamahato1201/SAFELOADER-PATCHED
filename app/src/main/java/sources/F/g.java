package F;

import A.j;
import H.b;
import Q0.l;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0071A;
import b0.C0077a;
import d1.C;
import d1.s;
import d1.t;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f197a;
    public Object b;

    /* renamed from: c  reason: collision with root package name */
    public Object f198c;

    /* renamed from: d  reason: collision with root package name */
    public Object f199d;

    /* renamed from: e  reason: collision with root package name */
    public Object f200e;
    public Object f;

    public /* synthetic */ g(boolean z2) {
        this.f197a = 2;
    }

    public C a() {
        if (((t) this.f198c) != null) {
            return new C(this);
        }
        throw new IllegalStateException("url == null");
    }

    public boolean b(int i2) {
        ArrayList arrayList = (ArrayList) this.f199d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            C0077a aVar = (C0077a) arrayList.get(i3);
            int i4 = aVar.f1646a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = aVar.b;
                    int i6 = aVar.f1647c + i5;
                    while (i5 < i6) {
                        if (f(i5, i3 + 1) != i2) {
                            i5++;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i3++;
            } else if (f(aVar.f1647c, i3 + 1) != i2) {
                i3++;
            }
            return true;
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f199d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0071A) this.f200e).a((C0077a) arrayList.get(i2));
        }
        l(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f198c;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C0077a aVar = (C0077a) arrayList2.get(i3);
            int i4 = aVar.f1646a;
            C0071A a2 = (C0071A) this.f200e;
            if (i4 == 1) {
                a2.a(aVar);
                a2.d(aVar.b, aVar.f1647c);
            } else if (i4 == 2) {
                a2.a(aVar);
                int i5 = aVar.b;
                int i6 = aVar.f1647c;
                RecyclerView recyclerView = a2.f1567a;
                recyclerView.O(i5, i6, true);
                recyclerView.f1513f0 = true;
                recyclerView.f1509c0.f1610c += i6;
            } else if (i4 == 4) {
                a2.a(aVar);
                a2.c(aVar.b, aVar.f1647c);
            } else if (i4 == 8) {
                a2.a(aVar);
                a2.e(aVar.b, aVar.f1647c);
            }
        }
        l(arrayList2);
    }

    public void d(C0077a aVar) {
        int i2;
        b bVar;
        int i3 = aVar.f1646a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int n2 = n(aVar.b, i3);
        int i4 = aVar.b;
        int i5 = aVar.f1646a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + aVar);
        }
        int i6 = 1;
        int i7 = 1;
        while (true) {
            int i8 = aVar.f1647c;
            bVar = (b) this.b;
            if (i6 >= i8) {
                break;
            }
            int n3 = n((i2 * i6) + aVar.b, aVar.f1646a);
            int i9 = aVar.f1646a;
            if (i9 == 2 ? n3 != n2 : !(i9 == 4 && n3 == n2 + 1)) {
                C0077a j2 = j(i9, n2, i7);
                e(j2, i4);
                bVar.c(j2);
                if (aVar.f1646a == 4) {
                    i4 += i7;
                }
                n2 = n3;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
        }
        bVar.c(aVar);
        if (i7 > 0) {
            C0077a j3 = j(aVar.f1646a, n2, i7);
            e(j3, i4);
            bVar.c(j3);
        }
    }

    public void e(C0077a aVar, int i2) {
        C0071A a2 = (C0071A) this.f200e;
        a2.a(aVar);
        int i3 = aVar.f1646a;
        if (i3 == 2) {
            int i4 = aVar.f1647c;
            RecyclerView recyclerView = a2.f1567a;
            recyclerView.O(i2, i4, true);
            recyclerView.f1513f0 = true;
            recyclerView.f1509c0.f1610c += i4;
        } else if (i3 == 4) {
            a2.c(i2, aVar.f1647c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int f(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f199d;
        int size = arrayList.size();
        while (i3 < size) {
            C0077a aVar = (C0077a) arrayList.get(i3);
            int i4 = aVar.f1646a;
            if (i4 == 8) {
                int i5 = aVar.b;
                if (i5 == i2) {
                    i2 = aVar.f1647c;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (aVar.f1647c <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = aVar.b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = aVar.f1647c;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += aVar.f1647c;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean g() {
        if (((ArrayList) this.f198c).size() > 0) {
            return true;
        }
        return false;
    }

    public void h(String str, String str2) {
        j jVar = (j) this.f199d;
        jVar.getClass();
        j.u(str, str2);
        jVar.C(str);
        jVar.t(str, str2);
    }

    public void i(String str, l lVar) {
        if (str == null) {
            throw new NullPointerException("method == null");
        } else if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        } else if (lVar != null && !l.Q(str)) {
            throw new IllegalArgumentException(A.g.i("method ", str, " must not have a request body."));
        } else if (lVar != null || (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT"))) {
            this.b = str;
            this.f200e = lVar;
        } else {
            throw new IllegalArgumentException(A.g.i("method ", str, " must have a request body."));
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, b0.a] */
    public C0077a j(int i2, int i3, int i4) {
        C0077a aVar = (C0077a) ((b) this.b).a();
        if (aVar == null) {
            ? obj = new Object();
            obj.f1646a = i2;
            obj.b = i3;
            obj.f1647c = i4;
            return obj;
        }
        aVar.f1646a = i2;
        aVar.b = i3;
        aVar.f1647c = i4;
        return aVar;
    }

    public void k(C0077a aVar) {
        ((ArrayList) this.f199d).add(aVar);
        int i2 = aVar.f1646a;
        C0071A a2 = (C0071A) this.f200e;
        if (i2 == 1) {
            a2.d(aVar.b, aVar.f1647c);
        } else if (i2 == 2) {
            int i3 = aVar.b;
            int i4 = aVar.f1647c;
            RecyclerView recyclerView = a2.f1567a;
            recyclerView.O(i3, i4, false);
            recyclerView.f1513f0 = true;
        } else if (i2 == 4) {
            a2.c(aVar.b, aVar.f1647c);
        } else if (i2 == 8) {
            a2.e(aVar.b, aVar.f1647c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0077a aVar = (C0077a) arrayList.get(i2);
            aVar.getClass();
            ((b) this.b).c(aVar);
        }
        arrayList.clear();
    }

    public void m(String str) {
        ((j) this.f199d).C(str);
    }

    public int n(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = (ArrayList) this.f199d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0077a aVar = (C0077a) arrayList.get(size);
            int i6 = aVar.f1646a;
            if (i6 == 8) {
                int i7 = aVar.b;
                int i8 = aVar.f1647c;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            aVar.b = i7 + 1;
                            aVar.f1647c = i8 + 1;
                        } else if (i3 == 2) {
                            aVar.b = i7 - 1;
                            aVar.f1647c = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        aVar.f1647c = i8 + 1;
                    } else if (i3 == 2) {
                        aVar.f1647c = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        aVar.b = i7 + 1;
                    } else if (i3 == 2) {
                        aVar.b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = aVar.b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= aVar.f1647c;
                    } else if (i6 == 2) {
                        i2 += aVar.f1647c;
                    }
                } else if (i3 == 1) {
                    aVar.b = i9 + 1;
                } else if (i3 == 2) {
                    aVar.b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0077a aVar2 = (C0077a) arrayList.get(size2);
            int i10 = aVar2.f1646a;
            b bVar = (b) this.b;
            if (i10 == 8) {
                int i11 = aVar2.f1647c;
                if (i11 == aVar2.b || i11 < 0) {
                    arrayList.remove(size2);
                    bVar.c(aVar2);
                }
            } else if (aVar2.f1647c <= 0) {
                arrayList.remove(size2);
                bVar.c(aVar2);
            }
        }
        return i2;
    }

    public void o(String str) {
        String str2;
        if (str != null) {
            String str3 = str;
            if (str3.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str3.substring(3);
            } else if (str3.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str3.substring(4);
            } else {
                str2 = str3;
            }
            s sVar = new s();
            t tVar = null;
            if (sVar.b((t) null, str2) == 1) {
                tVar = sVar.a();
            }
            if (tVar != null) {
                this.f198c = tVar;
                return;
            }
            throw new IllegalArgumentException("unexpected url: ".concat(str2));
        }
        throw new NullPointerException("url == null");
    }

    public String toString() {
        switch (this.f197a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.b) + ", mProviderPackage: " + ((String) this.f198c) + ", mQuery: " + ((String) this.f199d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f;
                    if (i2 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i2);
                        for (int i3 = 0; i3 < list2.size(); i3++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i2++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public g(String str, String str2, String str3, List list) {
        this.f197a = 0;
        str.getClass();
        this.b = str;
        str2.getClass();
        this.f198c = str2;
        this.f199d = str3;
        list.getClass();
        this.f = list;
        this.f200e = str + "-" + str2 + "-" + str3;
    }

    public g(C0071A a2) {
        this.f197a = 1;
        this.b = new b(30);
        this.f198c = new ArrayList();
        this.f199d = new ArrayList();
        this.f200e = a2;
        this.f = new j(19, (Object) this);
    }

    public g() {
        this.f197a = 2;
        this.b = "GET";
        this.f199d = new j(23);
    }
}
