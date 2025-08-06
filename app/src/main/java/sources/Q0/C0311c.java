package q0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: q0.c  reason: case insensitive filesystem */
public final class C0311c {

    /* renamed from: a  reason: collision with root package name */
    public final int f3856a;
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3857c;

    public C0311c(int i2) {
        this.f3856a = i2;
    }

    public final int a() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3857c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1588n;
                }
                return 0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0311c(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.b = i2;
        switch (i2) {
            case 1:
                this.f3857c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f3857c = carouselLayoutManager;
                return;
        }
    }
}
