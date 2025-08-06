package x0;

import E0.g;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: x0.a  reason: case insensitive filesystem */
public final class C0497a extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f4764a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public C0497a(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.f2031l != null) {
            if (shapeableImageView.f2030k == null) {
                shapeableImageView.f2030k = new g(shapeableImageView.f2031l);
            }
            RectF rectF = shapeableImageView.f2025e;
            Rect rect = this.f4764a;
            rectF.round(rect);
            shapeableImageView.f2030k.setBounds(rect);
            shapeableImageView.f2030k.getOutline(outline);
        }
    }
}
