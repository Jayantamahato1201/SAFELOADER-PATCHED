package k;

import A.i;
import O.t;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import c0.C0106d;

public final class r extends CheckedTextView implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C0106d f3554a = new C0106d(this);
    public final C0258o b;

    /* renamed from: c  reason: collision with root package name */
    public final C0236d0 f3555c;

    /* renamed from: d  reason: collision with root package name */
    public C0273w f3556d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|10|11|(1:15)|16|(1:18)|19|(1:21)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            k.m1.a(r8)
            r6 = 2130903212(0x7f0300ac, float:1.7413236E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            k.l1.a(r7, r8)
            k.d0 r8 = new k.d0
            r8.<init>(r7)
            r7.f3555c = r8
            r8.f(r9, r6)
            r8.b()
            k.o r8 = new k.o
            r8.<init>(r7)
            r7.b = r8
            r8.d(r9, r6)
            c0.d r8 = new c0.d
            r8.<init>(r7)
            r7.f3554a = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = d.a.f2202l
            N.g r8 = N.g.E(r8, r9, r3, r6)
            java.lang.Object r0 = r8.f606c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.f606c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            I.O.o(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch:{ all -> 0x0064 }
            r3 = 0
            if (r2 == 0) goto L_0x0067
            int r9 = r0.getResourceId(r9, r3)     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0067
            android.content.Context r2 = r7.getContext()     // Catch:{ NotFoundException -> 0x0067 }
            android.graphics.drawable.Drawable r9 = Q0.l.v(r2, r9)     // Catch:{ NotFoundException -> 0x0067 }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r9)     // Catch:{ NotFoundException -> 0x0067 }
            goto L_0x007e
        L_0x0064:
            r0 = move-exception
            r9 = r0
            goto L_0x00ab
        L_0x0067:
            boolean r9 = r0.hasValue(r3)     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x007e
            int r9 = r0.getResourceId(r3, r3)     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x007e
            android.content.Context r2 = r7.getContext()     // Catch:{ all -> 0x0064 }
            android.graphics.drawable.Drawable r9 = Q0.l.v(r2, r9)     // Catch:{ all -> 0x0064 }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r9)     // Catch:{ all -> 0x0064 }
        L_0x007e:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x008c
            android.content.res.ColorStateList r9 = r8.o(r9)     // Catch:{ all -> 0x0064 }
            r7.setCheckMarkTintList(r9)     // Catch:{ all -> 0x0064 }
        L_0x008c:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x00a0
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch:{ all -> 0x0064 }
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = k.C0268t0.b(r9, r0)     // Catch:{ all -> 0x0064 }
            r7.setCheckMarkTintMode(r9)     // Catch:{ all -> 0x0064 }
        L_0x00a0:
            r8.F()
            k.w r8 = r7.getEmojiTextViewHelper()
            r8.a(r4, r6)
            return
        L_0x00ab:
            r8.F()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0273w getEmojiTextViewHelper() {
        if (this.f3556d == null) {
            this.f3556d = new C0273w(this);
        }
        return this.f3556d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0236d0 d0Var = this.f3555c;
        if (d0Var != null) {
            d0Var.b();
        }
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.a();
        }
        C0106d dVar = this.f3554a;
        if (dVar != null) {
            dVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.w0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0106d dVar = this.f3554a;
        if (dVar != null) {
            return (ColorStateList) dVar.f1813e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0106d dVar = this.f3554a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3555c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3555c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.G(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0106d dVar = this.f3554a;
        if (dVar == null) {
            return;
        }
        if (dVar.f1811c) {
            dVar.f1811c = false;
            return;
        }
        dVar.f1811c = true;
        dVar.b();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.f3555c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.f3555c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.z0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0106d dVar = this.f3554a;
        if (dVar != null) {
            dVar.f1813e = colorStateList;
            dVar.f1810a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0106d dVar = this.f3554a;
        if (dVar != null) {
            dVar.f = mode;
            dVar.b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0236d0 d0Var = this.f3555c;
        d0Var.l(colorStateList);
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0236d0 d0Var = this.f3555c;
        d0Var.m(mode);
        d0Var.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0236d0 d0Var = this.f3555c;
        if (d0Var != null) {
            d0Var.g(context, i2);
        }
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(l.v(getContext(), i2));
    }
}
