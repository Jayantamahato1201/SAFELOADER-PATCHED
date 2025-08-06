package androidx.fragment.app;

import I.C0026s;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class s extends AnimationSet implements Runnable {
    public final ViewGroup f;

    /* renamed from: g  reason: collision with root package name */
    public final View f1389g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1390h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1391i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1392j = true;

    public s(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f = viewGroup;
        this.f1389g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1392j = true;
        if (this.f1390h) {
            return !this.f1391i;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1390h = true;
            C0026s.a(this.f, this);
        }
        return true;
    }

    public final void run() {
        boolean z2 = this.f1390h;
        ViewGroup viewGroup = this.f;
        if (z2 || !this.f1392j) {
            viewGroup.endViewTransition(this.f1389g);
            this.f1391i = true;
            return;
        }
        this.f1392j = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1392j = true;
        if (this.f1390h) {
            return !this.f1391i;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1390h = true;
            C0026s.a(this.f, this);
        }
        return true;
    }
}
