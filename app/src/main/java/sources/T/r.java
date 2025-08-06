package t;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import r.g;

public abstract class r extends C0478c {

    /* renamed from: g  reason: collision with root package name */
    public boolean f4713g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4714h;

    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f4713g = true;
                } else if (index == 13) {
                    this.f4714h = true;
                }
            }
        }
    }

    public abstract void h(g gVar, int i2, int i3);

    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f4713g || this.f4714h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.b; i2++) {
                View view = (View) constraintLayout.f1071a.get(this.f4549a[i2]);
                if (view != null) {
                    if (this.f4713g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f4714h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}
