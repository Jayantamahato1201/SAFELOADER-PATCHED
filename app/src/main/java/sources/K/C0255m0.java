package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: k.m0  reason: case insensitive filesystem */
public final class C0255m0 extends C0253l0 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
