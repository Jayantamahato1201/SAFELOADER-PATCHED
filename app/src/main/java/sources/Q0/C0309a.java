package q0;

import F0.g;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: q0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0309a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3854a;

    public /* synthetic */ C0309a(CarouselLayoutManager carouselLayoutManager) {
        this.f3854a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        CarouselLayoutManager carouselLayoutManager = this.f3854a;
        if (i2 != i6 || i3 != i7 || i4 != i8 || i5 != i9) {
            view.post(new g(11, carouselLayoutManager));
        }
    }
}
