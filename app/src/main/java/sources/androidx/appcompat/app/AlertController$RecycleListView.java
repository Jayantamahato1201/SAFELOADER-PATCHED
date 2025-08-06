package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import d.a;

public class AlertController$RecycleListView extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final int f884a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2210t);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f884a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
