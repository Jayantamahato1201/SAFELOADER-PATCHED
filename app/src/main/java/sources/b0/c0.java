package b0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1654a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1655c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1656d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1657e;
    public int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1658g;

    public c0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1658g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f1654a = -1;
        this.b = Integer.MIN_VALUE;
        this.f1655c = false;
        this.f1656d = false;
        this.f1657e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
