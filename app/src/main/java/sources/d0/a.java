package D0;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f75i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f76j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f77k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f78l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f79a;
    public final Paint b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f80c;

    /* renamed from: d  reason: collision with root package name */
    public final int f81d;

    /* renamed from: e  reason: collision with root package name */
    public final int f82e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f83g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f84h;

    public a() {
        Paint paint = new Paint();
        this.f84h = paint;
        Paint paint2 = new Paint();
        this.f79a = paint2;
        this.f81d = A.a.d(-16777216, 68);
        this.f82e = A.a.d(-16777216, 20);
        this.f = A.a.d(-16777216, 0);
        paint2.setColor(this.f81d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f80c = new Paint(paint3);
    }
}
