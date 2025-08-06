package w0;

import A.i;
import android.content.Context;
import com.cheatbox.R;
import t0.C0486a;

/* renamed from: w0.a  reason: case insensitive filesystem */
public final class C0492a {
    public static final int f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4749a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4750c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4751d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4752e;

    public C0492a(Context context) {
        boolean i02 = i.i0(context, R.attr.MT_Bin, false);
        int e2 = C0486a.e(context, R.attr.MT_Bin, 0);
        int e3 = C0486a.e(context, R.attr.MT_Bin, 0);
        int e4 = C0486a.e(context, R.attr.MT_Bin, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4749a = i02;
        this.b = e2;
        this.f4750c = e3;
        this.f4751d = e4;
        this.f4752e = f2;
    }
}
