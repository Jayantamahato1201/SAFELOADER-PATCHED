package androidx.appcompat.view.menu;

import N.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j.C0192B;
import j.C0208l;
import j.C0209m;
import j.C0211o;
import j.z;

public final class ExpandedMenuView extends ListView implements C0208l, C0192B, AdapterView.OnItemClickListener {
    public static final int[] b = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    public C0209m f896a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g E2 = g.E(context, attributeSet, b, 16842868);
        TypedArray typedArray = (TypedArray) E2.f606c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(E2.p(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(E2.p(1));
        }
        E2.F();
    }

    public final void a(C0209m mVar) {
        this.f896a = mVar;
    }

    public final boolean b(C0211o oVar) {
        return this.f896a.q(oVar, (z) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        b((C0211o) getAdapter().getItem(i2));
    }
}
