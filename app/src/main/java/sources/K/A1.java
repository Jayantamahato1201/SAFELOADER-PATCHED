package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.cheatbox.R;

public final class A1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3320a;
    public final View b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f3321c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f3322d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3323e = new Rect();
    public final int[] f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3324g = new int[2];

    public A1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3322d = layoutParams;
        this.f3320a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.MT_Bin, (ViewGroup) null);
        this.b = inflate;
        this.f3321c = (TextView) inflate.findViewById(R.id.MT_Bin);
        layoutParams.setTitle(A1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.MT_Bin;
        layoutParams.flags = 24;
    }
}
