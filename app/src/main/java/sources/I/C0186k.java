package i;

import A.i;
import I.V;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: i.k  reason: case insensitive filesystem */
public final class C0186k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2974a = new ArrayList();
    public long b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f2975c;

    /* renamed from: d  reason: collision with root package name */
    public i f2976d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2977e;
    public final C0185j f = new C0185j(this);

    public final void a() {
        if (this.f2977e) {
            ArrayList arrayList = this.f2974a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((V) obj).b();
            }
            this.f2977e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f2977e) {
            ArrayList arrayList = this.f2974a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                V v2 = (V) obj;
                long j2 = this.b;
                if (j2 >= 0) {
                    v2.c(j2);
                }
                Interpolator interpolator = this.f2975c;
                if (!(interpolator == null || (view = (View) v2.f399a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f2976d != null) {
                    v2.d(this.f);
                }
                View view2 = (View) v2.f399a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f2977e = true;
        }
    }
}
