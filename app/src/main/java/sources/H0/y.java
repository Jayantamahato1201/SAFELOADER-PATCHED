package H0;

import A.a;
import I.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

public final class y extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f375a;
    public ColorStateList b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f376c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(z zVar, Context context, int i2, String[] strArr) {
        super(context, i2, strArr);
        this.f376c = zVar;
        a();
    }

    public final void a() {
        boolean z2;
        ColorStateList colorStateList;
        z zVar = this.f376c;
        ColorStateList colorStateList2 = zVar.f383l;
        if (colorStateList2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z2) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.b = colorStateList;
        if (!(zVar.f382k == 0 || zVar.f383l == null)) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{a.b(zVar.f383l.getColorForState(iArr3, 0), zVar.f382k), a.b(zVar.f383l.getColorForState(iArr2, 0), zVar.f382k), zVar.f382k});
        }
        this.f375a = colorStateList3;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            z zVar = this.f376c;
            RippleDrawable rippleDrawable = null;
            if (zVar.getText().toString().contentEquals(textView.getText()) && zVar.f382k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(zVar.f382k);
                if (this.b != null) {
                    B.a.h(colorDrawable, this.f375a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = O.f393a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
