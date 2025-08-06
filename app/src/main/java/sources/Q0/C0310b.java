package q0;

import A.a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import b0.G;
import com.cheatbox.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: q0.b  reason: case insensitive filesystem */
public final class C0310b extends G {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3855a;
    public final List b = Collections.unmodifiableList(new ArrayList());

    public C0310b() {
        Paint paint = new Paint();
        this.f3855a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i2;
        int i3;
        int i4;
        int i5;
        Paint paint = this.f3855a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.MT_Bin));
        for (C0312d dVar : this.b) {
            dVar.getClass();
            ThreadLocal threadLocal = a.f2a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                C0311c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1924q;
                switch (cVar.b) {
                    case 0:
                        i4 = 0;
                        break;
                    default:
                        i4 = cVar.f3857c.G();
                        break;
                }
                float f2 = (float) i4;
                C0311c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1924q;
                switch (cVar2.b) {
                    case 0:
                        i5 = cVar2.f3857c.f1589o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f3857c;
                        i5 = carouselLayoutManager.f1589o - carouselLayoutManager.D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, (float) i5, paint);
            } else {
                canvas2 = canvas;
                C0311c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1924q;
                switch (cVar3.b) {
                    case 0:
                        i2 = cVar3.f3857c.E();
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                float f3 = (float) i2;
                C0311c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1924q;
                switch (cVar4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f3857c;
                        i3 = carouselLayoutManager2.f1588n - carouselLayoutManager2.F();
                        break;
                    default:
                        i3 = cVar4.f3857c.f1588n;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, (float) i3, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
