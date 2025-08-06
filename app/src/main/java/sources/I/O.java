package I;

import J.g;
import J.v;
import O.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.cheatbox.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0271v;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f393a = null;
    public static Field b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f394c = false;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadLocal f395d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f396e = {R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin, R.id.MT_Bin};
    public static final C0031x f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final C0033z f397g = new C0033z();

    public static V a(View view) {
        if (f393a == null) {
            f393a = new WeakHashMap();
        }
        V v2 = (V) f393a.get(view);
        if (v2 != null) {
            return v2;
        }
        V v3 = new V(view);
        f393a.put(view, v3);
        return v3;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [I.N, java.lang.Object] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = N.f390d;
        N n2 = (N) view.getTag(R.id.MT_Bin);
        N n3 = n2;
        if (n2 == null) {
            ? obj = new Object();
            obj.f391a = null;
            obj.b = null;
            obj.f392c = null;
            view.setTag(R.id.MT_Bin, obj);
            n3 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = n3.f391a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = N.f390d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (n3.f391a == null) {
                            n3.f391a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = N.f390d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                n3.f391a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    n3.f391a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = n3.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (n3.b == null) {
                    n3.b = new SparseArray();
                }
                n3.b.put(keyCode, new WeakReference(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return I.a(view);
        }
        if (f394c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f394c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f394c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = H.b(view);
        } else {
            obj = view.getTag(R.id.MT_Bin);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Bin);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.MT_Bin, arrayList2);
        return arrayList2;
    }

    public static Rect f() {
        if (f395d == null) {
            f395d = new ThreadLocal();
        }
        Rect rect = (Rect) f395d.get();
        if (rect == null) {
            rect = new Rect();
            f395d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(C0271v vVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return K.a(vVar);
        }
        return (String[]) vVar.getTag(R.id.MT_Bin);
    }

    public static t0 h(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return E.a(view);
        }
        return D.j(view);
    }

    public static void i(View view, int i2) {
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (d(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z2) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                obtain.setContentChangeTypes(i2);
                if (z2) {
                    obtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                }
            }
        }
    }

    public static void j(View view, int i2) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect f2 = f();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !f2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            s(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z2 && f2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f2);
        }
    }

    public static void k(View view, int i2) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect f2 = f();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !f2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            s(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z2 && f2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f2);
        }
    }

    public static C0014f l(View view, C0014f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return K.b(view, fVar);
        }
        C0025q qVar = (C0025q) view.getTag(R.id.MT_Bin);
        r rVar = f;
        if (qVar != null) {
            C0014f a2 = ((r) qVar).a(view, fVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.a(a2);
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.a(fVar);
    }

    public static void m(View view, int i2) {
        ArrayList e2 = e(view);
        for (int i3 = 0; i3 < e2.size(); i3++) {
            if (((g) e2.get(i3)).a() == i2) {
                e2.remove(i3);
                return;
            }
        }
    }

    public static void n(View view, g gVar, v vVar) {
        C0010b bVar;
        g gVar2 = new g((Object) null, gVar.b, (String) null, vVar, gVar.f486c);
        View.AccessibilityDelegate c2 = c(view);
        if (c2 == null) {
            bVar = null;
        } else if (c2 instanceof C0009a) {
            bVar = ((C0009a) c2).f406a;
        } else {
            bVar = new C0010b(c2);
        }
        if (bVar == null) {
            bVar = new C0010b();
        }
        p(view, bVar);
        m(view, gVar2.a());
        e(view).add(gVar2);
        i(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            I.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void p(View view, C0010b bVar) {
        C0009a aVar;
        if (bVar == null && (c(view) instanceof C0009a)) {
            bVar = new C0010b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void q(View view, CharSequence charSequence) {
        boolean z2;
        new C0032y(R.id.MT_Bin, CharSequence.class, 8, 28, 1).d(view, charSequence);
        C0033z zVar = f397g;
        if (charSequence != null) {
            WeakHashMap weakHashMap = zVar.f474a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z2));
            view.addOnAttachStateChangeListener(zVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zVar);
                return;
            }
            return;
        }
        zVar.f474a.remove(view);
        view.removeOnAttachStateChangeListener(zVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(zVar);
    }

    public static void r(View view, ColorStateList colorStateList) {
        boolean z2;
        int i2 = Build.VERSION.SDK_INT;
        D.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            if (D.g(view) == null && D.h(view) == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (background != null && z2) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
