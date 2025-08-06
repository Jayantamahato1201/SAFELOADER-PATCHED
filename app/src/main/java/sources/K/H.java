package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.cheatbox.R;

public final class H extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final I f3356a;

    public H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        l1.a(this, getContext());
        I i2 = new I(this);
        this.f3356a = i2;
        i2.b(attributeSet, R.attr.MT_Bin);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        I i2 = this.f3356a;
        Drawable drawable = i2.f;
        if (drawable != null && drawable.isStateful()) {
            H h2 = i2.f3357e;
            if (drawable.setState(h2.getDrawableState())) {
                h2.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3356a.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3356a.g(canvas);
    }
}
