package k;

import J.d;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import j.C0200d;

public final class U extends Spinner {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f3409i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final C0258o f3410a;
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final J f3411c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f3412d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3413e;
    public final T f;

    /* renamed from: g  reason: collision with root package name */
    public int f3414g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f3415h = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r7 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130903964(0x7f03039c, float:1.741476E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f3415h = r1
            android.content.Context r1 = r12.getContext()
            k.l1.a(r12, r1)
            int[] r1 = d.a.f2212v
            N.g r2 = N.g.E(r13, r14, r1, r0)
            k.o r3 = new k.o
            r3.<init>(r12)
            r12.f3410a = r3
            java.lang.Object r3 = r2.f606c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L_0x0035
            i.d r6 = new i.d
            r6.<init>(r13, r4)
            r12.b = r6
            goto L_0x0037
        L_0x0035:
            r12.b = r13
        L_0x0037:
            r4 = -1
            r6 = 0
            int[] r7 = f3409i     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            boolean r8 = r7.hasValue(r5)     // Catch:{ Exception -> 0x004e }
            if (r8 == 0) goto L_0x0050
            int r4 = r7.getInt(r5, r5)     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x004a:
            r13 = move-exception
            r6 = r7
            goto L_0x00d5
        L_0x004e:
            r8 = move-exception
            goto L_0x0059
        L_0x0050:
            r7.recycle()
            goto L_0x0063
        L_0x0054:
            r13 = move-exception
            goto L_0x00d5
        L_0x0057:
            r8 = move-exception
            r7 = r6
        L_0x0059:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x0063
            goto L_0x0050
        L_0x0063:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x009d
            if (r4 == r8) goto L_0x006a
            goto L_0x00aa
        L_0x006a:
            k.Q r4 = new k.Q
            android.content.Context r9 = r12.b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.b
            N.g r1 = N.g.E(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f606c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f3414g = r9
            android.graphics.drawable.Drawable r9 = r1.p(r8)
            r4.l(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.D = r7
            r1.F()
            r12.f = r4
            k.J r1 = new k.J
            r1.<init>(r12, r12, r4)
            r12.f3411c = r1
            goto L_0x00aa
        L_0x009d:
            k.N r1 = new k.N
            r1.<init>(r12)
            r12.f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f3395c = r4
        L_0x00aa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto L_0x00c1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427438(0x7f0b006e, float:1.8476492E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00c1:
            r2.F()
            r12.f3413e = r8
            android.widget.SpinnerAdapter r13 = r12.f3412d
            if (r13 == 0) goto L_0x00cf
            r12.setAdapter((android.widget.SpinnerAdapter) r13)
            r12.f3412d = r6
        L_0x00cf:
            k.o r13 = r12.f3410a
            r13.d(r14, r0)
            return
        L_0x00d5:
            if (r6 == 0) goto L_0x00da
            r6.recycle()
        L_0x00da:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k.U.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.f3415h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i3;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            oVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        T t2 = this.f;
        if (t2 != null) {
            return t2.d();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        T t2 = this.f;
        if (t2 != null) {
            return t2.g();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f != null) {
            return this.f3414g;
        }
        return super.getDropDownWidth();
    }

    public final T getInternalPopup() {
        return this.f;
    }

    public Drawable getPopupBackground() {
        T t2 = this.f;
        if (t2 != null) {
            return t2.h();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.b;
    }

    public CharSequence getPrompt() {
        T t2 = this.f;
        if (t2 != null) {
            return t2.i();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T t2 = this.f;
        if (t2 != null && t2.b()) {
            t2.dismiss();
        }
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        S s2 = (S) parcelable;
        super.onRestoreInstanceState(s2.getSuperState());
        if (s2.f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0200d(2, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, k.S, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        T t2 = this.f;
        if (t2 == null || !t2.b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        baseSavedState.f = z2;
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        J j2 = this.f3411c;
        if (j2 == null || !j2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        T t2 = this.f;
        if (t2 == null) {
            return super.performClick();
        }
        if (t2.b()) {
            return true;
        }
        this.f.e(L.b(this), L.a(this));
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            oVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        T t2 = this.f;
        if (t2 != null) {
            t2.o(i2);
            t2.a(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        T t2 = this.f;
        if (t2 != null) {
            t2.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.f3414g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        T t2 = this.f;
        if (t2 != null) {
            t2.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(l.v(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        T t2 = this.f;
        if (t2 != null) {
            t2.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0258o oVar = this.f3410a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ListAdapter, java.lang.Object, k.O] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3413e) {
            this.f3412d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        T t2 = this.f;
        if (t2 != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.f3397a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && d.v(spinnerAdapter)) {
                M.a(d.f(spinnerAdapter), theme);
            }
            t2.n(obj);
        }
    }
}
