package F;

import android.content.Context;
import java.util.concurrent.Callable;

public final class h implements Callable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f201g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f202h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f203i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f204j;

    public /* synthetic */ h(String str, Context context, g gVar, int i2, int i3) {
        this.f = i3;
        this.f201g = str;
        this.f202h = context;
        this.f203i = gVar;
        this.f204j = i2;
    }

    public final Object call() {
        switch (this.f) {
            case 0:
                return k.a(this.f201g, this.f202h, this.f203i, this.f204j);
            default:
                try {
                    return k.a(this.f201g, this.f202h, this.f203i, this.f204j);
                } catch (Throwable unused) {
                    return new j(-3);
                }
        }
    }
}
