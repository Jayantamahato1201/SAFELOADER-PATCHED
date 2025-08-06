package com.google.android.material.textfield;

import J0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.cheatbox.R;
import j0.C0219a;
import java.util.Locale;
import k.C0271v;
import y0.l;

public class TextInputEditText extends C0271v {

    /* renamed from: g  reason: collision with root package name */
    public final Rect f2080g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2081h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.MT_Bin, 0), attributeSet);
        int[] iArr = C0219a.f3173A;
        l.a(context, attributeSet, R.attr.MT_Bin, R.style.MT_Bin);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        l.b(context2, attributeSet2, iArr, R.attr.MT_Bin, R.style.MT_Bin, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, R.attr.MT_Bin, R.style.MT_Bin);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f2081h && rect != null) {
            Rect rect2 = this.f2080g;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f2081h) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.f2088E) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f2088E && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean isEmpty = TextUtils.isEmpty(text);
            String str2 = "";
            if (!TextUtils.isEmpty(hint)) {
                str = hint.toString();
            } else {
                str = str2;
            }
            if (!isEmpty) {
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = ", " + str;
                }
                sb.append(str2);
                str2 = sb.toString();
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f2081h || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight() - getHeight();
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom + height;
        Rect rect2 = this.f2080g;
        rect2.set(i2, i3, i4, i5);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z2) {
        this.f2081h = z2;
    }
}
