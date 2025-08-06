package H0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.C0245h0;

public final class u extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f343a;
    public final /* synthetic */ TextView b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f344c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f345d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w f346e;

    public u(w wVar, int i2, TextView textView, int i3, TextView textView2) {
        this.f346e = wVar;
        this.f343a = i2;
        this.b = textView;
        this.f344c = i3;
        this.f345d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        C0245h0 h0Var;
        int i2 = this.f343a;
        w wVar = this.f346e;
        wVar.f361n = i2;
        wVar.f359l = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f344c == 1 && (h0Var = wVar.f365r) != null) {
                h0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f345d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f345d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
