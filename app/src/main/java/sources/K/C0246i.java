package k;

import B.a;
import Q0.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.cheatbox.R;
import j.C0198b;

/* renamed from: k.i  reason: case insensitive filesystem */
public final class C0246i extends C0279z implements C0250k {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0248j f3470d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0246i(C0248j jVar, Context context) {
        super(context, (AttributeSet) null, R.attr.MT_Bin);
        this.f3470d = jVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        l.Z(this, getContentDescription());
        setOnTouchListener(new C0198b(this, this));
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3470d.l();
        return true;
    }

    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
