package com.google.android.material.button;

import E0.j;
import E0.k;
import I.O;
import J0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.cheatbox.R;
import com.google.android.material.datepicker.i;
import com.google.android.material.timepicker.f;
import j0.C0219a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k.C0241f0;
import p0.C0306a;
import p0.d;
import p0.e;
import y0.l;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f1914k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1915a = new ArrayList();
    public final C0241f0 b = new C0241f0((Object) this);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f1916c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public final d f1917d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f1918e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1919g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1920h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1921i;

    /* renamed from: j  reason: collision with root package name */
    public HashSet f1922j = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin), attributeSet, R.attr.MT_Bin);
        TypedArray f2 = l.f(getContext(), attributeSet, C0219a.f3184k, R.attr.MT_Bin, R.style.MT_Bin, new int[0]);
        setSingleSelection(f2.getBoolean(3, false));
        this.f1921i = f2.getResourceId(1, -1);
        this.f1920h = f2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f2.getBoolean(0, true));
        f2.recycle();
        WeakHashMap weakHashMap = O.f393a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = O.f393a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f1911o);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1915a.add(new e(shapeAppearanceModel.f152e, shapeAppearanceModel.f154h, shapeAppearanceModel.f, shapeAppearanceModel.f153g));
        materialButton.setEnabled(isEnabled());
        O.p(materialButton, new i(1, this));
    }

    public final void b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f1922j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f1919g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (!z2 && hashSet.contains(Integer.valueOf(i2))) {
            if (!this.f1920h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i2) {
        if (getChildAt(i2).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f1922j;
        this.f1922j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1916c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1917d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f1918e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z2;
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                j e2 = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f1915a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    E0.a aVar = e.f3799e;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z2) {
                            eVar = new e(eVar2.f3800a, aVar, eVar2.b, aVar);
                        } else if (l.e(this)) {
                            eVar = new e(aVar, aVar, eVar2.b, eVar2.f3801c);
                        } else {
                            eVar = new e(eVar2.f3800a, eVar2.f3802d, aVar, aVar);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        eVar2 = null;
                    } else if (!z2) {
                        eVar = new e(aVar, eVar2.f3802d, aVar, eVar2.f3801c);
                    } else if (l.e(this)) {
                        eVar = new e(eVar2.f3800a, eVar2.f3802d, aVar, aVar);
                    } else {
                        eVar = new e(aVar, aVar, eVar2.b, eVar2.f3801c);
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e2.f142e = new E0.a(0.0f);
                    e2.f = new E0.a(0.0f);
                    e2.f143g = new E0.a(0.0f);
                    e2.f144h = new E0.a(0.0f);
                } else {
                    e2.f142e = eVar2.f3800a;
                    e2.f144h = eVar2.f3802d;
                    e2.f = eVar2.b;
                    e2.f143g = eVar2.f3801c;
                }
                materialButton.setShapeAppearanceModel(e2.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1919g || this.f1922j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1922j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f1922j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f1918e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f1921i;
        if (i2 != -1) {
            d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f1919g) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i2));
    }

    public final void onMeasure(int i2, int i3) {
        e();
        a();
        super.onMeasure(i2, i3);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((C0306a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1915a.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f1920h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f1919g != z2) {
            this.f1919g = z2;
            d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f1919g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
