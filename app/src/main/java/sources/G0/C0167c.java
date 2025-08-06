package g0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import n.C0289b;

/* renamed from: g0.c  reason: case insensitive filesystem */
public final class C0167c extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public q f2801a;
    public AnimatorSet b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f2802c;

    /* renamed from: d  reason: collision with root package name */
    public C0289b f2803d;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
