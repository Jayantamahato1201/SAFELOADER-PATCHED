package K0;

import android.widget.ImageView;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final w f563a;
    public final A b;

    /* renamed from: c  reason: collision with root package name */
    public final C0034a f564c;

    /* renamed from: d  reason: collision with root package name */
    public final String f565d;

    /* renamed from: e  reason: collision with root package name */
    public final n f566e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f567g;

    public n(w wVar, ImageView imageView, A a2, String str) {
        C0034a aVar;
        this.f563a = wVar;
        this.b = a2;
        if (imageView == null) {
            aVar = null;
        } else {
            aVar = new C0034a(this, imageView, wVar.f581h);
        }
        this.f564c = aVar;
        this.f565d = str;
        this.f566e = this;
    }

    public final Object a() {
        C0034a aVar = this.f564c;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }
}
