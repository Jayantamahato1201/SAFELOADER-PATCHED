package C0;

import E0.g;
import android.graphics.drawable.Drawable;

public final class a extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public g f72a;
    public boolean b;

    public a(a aVar) {
        this.f72a = (g) aVar.f72a.f118a.newDrawable();
        this.b = aVar.b;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new b(new a(this));
    }
}
