package z;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: z.k  reason: case insensitive filesystem */
public final class C0512k {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f4867a;
    public final Configuration b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4868c;

    public C0512k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int i2;
        this.f4867a = colorStateList;
        this.b = configuration;
        if (theme == null) {
            i2 = 0;
        } else {
            i2 = theme.hashCode();
        }
        this.f4868c = i2;
    }
}
