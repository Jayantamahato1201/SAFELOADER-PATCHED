package t;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import r.C0472d;
import r.i;

/* renamed from: t.c  reason: case insensitive filesystem */
public abstract class C0478c extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4549a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public Context f4550c;

    /* renamed from: d  reason: collision with root package name */
    public i f4551d;

    /* renamed from: e  reason: collision with root package name */
    public String f4552e;
    public HashMap f;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00ac
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00ac
        L_0x000a:
            android.content.Context r0 = r5.f4550c
            if (r0 != 0) goto L_0x0010
            goto L_0x00ac
        L_0x0010:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0022
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0022:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0032
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0033
        L_0x0032:
            r1 = r2
        L_0x0033:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            boolean r3 = A.g.k(r6)
            if (r3 == 0) goto L_0x0052
            java.util.HashMap r3 = r1.f1081m
            if (r3 == 0) goto L_0x0052
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0052
            java.util.HashMap r3 = r1.f1081m
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0053
        L_0x0052:
            r3 = r2
        L_0x0053:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 != 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            int r3 = r5.d(r1, r6)
        L_0x0067:
            if (r3 != 0) goto L_0x0075
            java.lang.Class<t.p> r1 = t.p.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0074 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            if (r3 != 0) goto L_0x0085
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0085:
            if (r3 == 0) goto L_0x0094
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f
            r1.put(r0, r6)
            r5.b(r3)
            goto L_0x00ac
        L_0x0094:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0478c.a(java.lang.String):void");
    }

    public final void b(int i2) {
        if (i2 != getId()) {
            int i3 = this.b + 1;
            int[] iArr = this.f4549a;
            if (i3 > iArr.length) {
                this.f4549a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f4549a;
            int i4 = this.b;
            iArr2[i4] = i2;
            this.b = i4 + 1;
        }
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.b; i2++) {
                View view = (View) constraintLayout.f1071a.get(this.f4549a[i2]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (!(str == null || (resources = this.f4550c.getResources()) == null)) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4552e = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(C0472d dVar, boolean z2);

    public final void g() {
        if (this.f4551d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0480e) {
                ((C0480e) layoutParams).f4597k0 = this.f4551d;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4549a, this.b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4552e;
        if (str != null) {
            setIds(str);
        }
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4552e = str;
        if (str != null) {
            int i2 = 0;
            this.b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4552e = null;
        this.b = 0;
        for (int b2 : iArr) {
            b(b2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }
}
