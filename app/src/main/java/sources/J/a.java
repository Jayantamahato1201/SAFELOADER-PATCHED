package J;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f475a;
    public final l b;

    /* renamed from: c  reason: collision with root package name */
    public final int f476c;

    public a(int i2, l lVar, int i3) {
        this.f475a = i2;
        this.b = lVar;
        this.f476c = i3;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f475a);
        this.b.f490a.performAction(this.f476c, bundle);
    }
}
