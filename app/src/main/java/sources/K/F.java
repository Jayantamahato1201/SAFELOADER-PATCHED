package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;
import com.cheatbox.R;

public final class F extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final D f3354a;

    public F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        l1.a(this, getContext());
        D d2 = new D((AbsSeekBar) this);
        this.f3354a = d2;
        d2.b(attributeSet, R.attr.MT_Bin);
    }

    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = (Bitmap) this.f3354a.f3336c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
