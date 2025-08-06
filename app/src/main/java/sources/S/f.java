package s;

import java.util.ArrayList;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public m f4456a = null;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4457c = false;

    /* renamed from: d  reason: collision with root package name */
    public final m f4458d;

    /* renamed from: e  reason: collision with root package name */
    public int f4459e = 1;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f4460g;

    /* renamed from: h  reason: collision with root package name */
    public int f4461h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f4462i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4463j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4464k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4465l = new ArrayList();

    public f(m mVar) {
        this.f4458d = mVar;
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.f4465l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (!((f) obj).f4463j) {
                return;
            }
        }
        this.f4457c = true;
        m mVar = this.f4456a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.b) {
            this.f4458d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f4463j) {
            g gVar = this.f4462i;
            if (gVar != null) {
                if (gVar.f4463j) {
                    this.f = this.f4461h * gVar.f4460g;
                } else {
                    return;
                }
            }
            d(fVar.f4460g + this.f);
        }
        m mVar2 = this.f4456a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(m mVar) {
        this.f4464k.add(mVar);
        if (this.f4463j) {
            mVar.a(mVar);
        }
    }

    public final void c() {
        this.f4465l.clear();
        this.f4464k.clear();
        this.f4463j = false;
        this.f4460g = 0;
        this.f4457c = false;
        this.b = false;
    }

    public void d(int i2) {
        if (!this.f4463j) {
            this.f4463j = true;
            this.f4460g = i2;
            ArrayList arrayList = this.f4464k;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4458d.b.f4307W);
        sb.append(":");
        switch (this.f4459e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.f4463j) {
            obj = Integer.valueOf(this.f4460g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f4465l.size());
        sb.append(":d=");
        sb.append(this.f4464k.size());
        sb.append(">");
        return sb.toString();
    }
}
