package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import i.C0177b;

/* renamed from: j.q  reason: case insensitive filesystem */
public final class C0213q extends FrameLayout implements C0177b {

    /* renamed from: a  reason: collision with root package name */
    public final CollapsibleActionView f3157a;

    public C0213q(View view) {
        super(view.getContext());
        this.f3157a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void c() {
        this.f3157a.onActionViewExpanded();
    }

    public final void e() {
        this.f3157a.onActionViewCollapsed();
    }
}
