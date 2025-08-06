package com.google.android.material.datepicker;

import I.C0010b;
import J.k;
import J.l;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.cheatbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

public final class i extends C0010b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1963d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1964e;

    public /* synthetic */ i(int i2, Object obj) {
        this.f1963d = i2;
        this.f1964e = obj;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1963d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1964e).f2043d);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, l lVar) {
        String str;
        int i2;
        Object obj = this.f1964e;
        View.AccessibilityDelegate accessibilityDelegate = this.f409a;
        switch (this.f1963d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, lVar.f490a);
                l lVar2 = (l) obj;
                if (lVar2.f1978c0.getVisibility() == 0) {
                    str = lVar2.w().getResources().getString(R.string.MT_Bin);
                } else {
                    str = lVar2.w().getResources().getString(R.string.MT_Bin);
                }
                lVar.j(str);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, lVar.f490a);
                int i3 = MaterialButtonToggleGroup.f1914k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) != view) {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                    i2++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                i2 = -1;
                lVar.i(k.a(((MaterialButton) view).f1911o, 0, 1, i2, 1));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = lVar.f490a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2044e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2043d);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = lVar.f490a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2053x);
                return;
        }
    }
}
