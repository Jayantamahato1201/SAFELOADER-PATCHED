package k;

import A.i;
import A.j;
import I.C0012d;
import I.C0014f;
import I.O;
import I.r;
import O.t;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.cheatbox.R;

/* renamed from: k.v  reason: case insensitive filesystem */
public class C0271v extends EditText implements r, t {

    /* renamed from: a  reason: collision with root package name */
    public final C0258o f3570a;
    public final C0236d0 b;

    /* renamed from: c  reason: collision with root package name */
    public final D f3571c;

    /* renamed from: d  reason: collision with root package name */
    public final O.r f3572d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final D f3573e;
    public C0269u f;

    /* JADX WARNING: type inference failed for: r5v5, types: [O.r, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0271v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.MT_Bin);
        m1.a(context);
        l1.a(this, getContext());
        C0258o oVar = new C0258o(this);
        this.f3570a = oVar;
        oVar.d(attributeSet, R.attr.MT_Bin);
        C0236d0 d0Var = new C0236d0(this);
        this.b = d0Var;
        d0Var.f(attributeSet, R.attr.MT_Bin);
        d0Var.b();
        D d2 = new D();
        d2.b = this;
        this.f3571c = d2;
        D d3 = new D((EditText) this);
        this.f3573e = d3;
        d3.b(attributeSet, R.attr.MT_Bin);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = d3.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C0269u getSuperCaller() {
        if (this.f == null) {
            this.f = new C0269u(this);
        }
        return this.f;
    }

    public final C0014f a(C0014f fVar) {
        return this.f3572d.a(this, fVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            oVar.a();
        }
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.w0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public TextClassifier getTextClassifier() {
        D d2;
        if (Build.VERSION.SDK_INT >= 28 || (d2 = this.f3571c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) d2.f3336c;
        if (textClassifier == null) {
            return V.a((TextView) d2.b);
        }
        return textClassifier;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            k.d0 r1 = r7.b
            r1.getClass()
            k.C0236d0.h(r8, r0, r7)
            Q0.l.G(r8, r0, r7)
            if (r0 == 0) goto L_0x0076
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L_0x0076
            java.lang.String[] r2 = I.O.g(r7)
            if (r2 == 0) goto L_0x0076
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L_0x0029
            r8.contentMimeTypes = r2
            goto L_0x003e
        L_0x0029:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0034
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0034:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L_0x003e:
            H0.l r2 = new H0.l
            r2.<init>(r7)
            if (r1 < r5) goto L_0x004c
            N.d r1 = new N.d
            r1.<init>(r0, r2)
        L_0x004a:
            r0 = r1
            goto L_0x0076
        L_0x004c:
            java.lang.String[] r6 = N.c.f600a
            if (r1 < r5) goto L_0x0058
            java.lang.String[] r1 = r8.contentMimeTypes
            if (r1 == 0) goto L_0x006c
        L_0x0056:
            r6 = r1
            goto L_0x006c
        L_0x0058:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L_0x005d
            goto L_0x006c
        L_0x005d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L_0x0069
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L_0x0069:
            if (r1 == 0) goto L_0x006c
            goto L_0x0056
        L_0x006c:
            int r1 = r6.length
            if (r1 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            N.e r1 = new N.e
            r1.<init>(r0, r2)
            goto L_0x004a
        L_0x0076:
            k.D r1 = r7.f3573e
            T.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0271v.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 < 31 && i2 >= 24 && dragEvent.getLocalState() == null && O.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = G.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i2) {
        ClipData clipData;
        j jVar;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || O.g(this) == null || (i2 != 16908322 && i2 != 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            if (i4 >= 31) {
                jVar = new j(clipData, 1);
            } else {
                C0012d dVar = new C0012d();
                dVar.b = clipData;
                dVar.f413c = 1;
                jVar = dVar;
            }
            if (i2 == 16908322) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            jVar.r(i3);
            O.l(this, jVar.g());
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.z0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3573e.d(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3573e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.f3570a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0236d0 d0Var = this.b;
        d0Var.l(colorStateList);
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0236d0 d0Var = this.b;
        d0Var.m(mode);
        d0Var.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0236d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.g(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        D d2;
        if (Build.VERSION.SDK_INT >= 28 || (d2 = this.f3571c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d2.f3336c = textClassifier;
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
