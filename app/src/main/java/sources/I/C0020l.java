package I;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: I.l  reason: case insensitive filesystem */
public final class C0020l {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f441a;
    public ViewParent b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f442c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f443d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f444e;

    public C0020l(ViewGroup viewGroup) {
        this.f442c = viewGroup;
    }

    public final boolean a(float f, float f2, boolean z2) {
        ViewParent e2;
        if (this.f443d && (e2 = e(0)) != null) {
            try {
                return U.a(e2, this.f442c, f, f2, z2);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    public final boolean b(float f, float f2) {
        ViewParent e2;
        if (this.f443d && (e2 = e(0)) != null) {
            try {
                return U.b(e2, this.f442c, f, f2);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent e2;
        int i5;
        int i6;
        int[] iArr3 = iArr2;
        int i7 = i4;
        if (!this.f443d || (e2 = e(i7)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            ViewGroup viewGroup = this.f442c;
            if (iArr3 != null) {
                viewGroup.getLocationInWindow(iArr3);
                i6 = iArr3[0];
                i5 = iArr3[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f444e == null) {
                    this.f444e = new int[2];
                }
                iArr = this.f444e;
            }
            int[] iArr4 = iArr;
            iArr4[0] = 0;
            iArr4[1] = 0;
            if (e2 instanceof C0021m) {
                ((C0021m) e2).c(viewGroup, i2, i3, iArr4, i7);
            } else if (i4 == 0) {
                try {
                    U.c(e2, viewGroup, i2, i3, iArr4);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e3);
                }
            }
            if (iArr3 != null) {
                viewGroup.getLocationInWindow(iArr3);
                iArr3[0] = iArr3[0] - i6;
                iArr3[1] = iArr3[1] - i5;
            }
            if (iArr4[0] == 0 && iArr4[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr3 == null) {
            return false;
        } else {
            iArr3[0] = 0;
            iArr3[1] = 0;
            return false;
        }
    }

    public final boolean d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent e2;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i9 = i6;
        if (this.f443d && (e2 = e(i9)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                ViewGroup viewGroup = this.f442c;
                if (iArr4 != null) {
                    viewGroup.getLocationInWindow(iArr4);
                    i8 = iArr4[0];
                    i7 = iArr4[1];
                } else {
                    i8 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f444e == null) {
                        this.f444e = new int[2];
                    }
                    int[] iArr5 = this.f444e;
                    iArr5[0] = 0;
                    iArr5[1] = 0;
                    iArr3 = iArr5;
                } else {
                    iArr3 = iArr2;
                }
                if (e2 instanceof C0022n) {
                    ((C0022n) e2).d(viewGroup, i2, i3, i4, i5, i9, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i4;
                    iArr3[1] = iArr3[1] + i5;
                    if (e2 instanceof C0021m) {
                        ((C0021m) e2).e(viewGroup, i2, i3, i4, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            U.d(e2, viewGroup, i2, i3, i4, i5);
                        } catch (AbstractMethodError e3) {
                            AbstractMethodError abstractMethodError = e3;
                            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", abstractMethodError);
                        }
                    }
                }
                if (iArr4 != null) {
                    viewGroup.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i8;
                    iArr4[1] = iArr4[1] - i7;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f441a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i2) {
        if (e(i2) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i2, int i3) {
        boolean z2;
        if (!f(i3)) {
            if (this.f443d) {
                View view = this.f442c;
                ViewParent parent = view.getParent();
                View view2 = view;
                while (parent != null) {
                    boolean z3 = parent instanceof C0021m;
                    if (z3) {
                        z2 = ((C0021m) parent).f(view2, view, i2, i3);
                    } else {
                        if (i3 == 0) {
                            try {
                                z2 = U.f(parent, view2, view, i2);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        if (i3 == 0) {
                            this.f441a = parent;
                        } else if (i3 == 1) {
                            this.b = parent;
                        }
                        if (z3) {
                            ((C0021m) parent).a(view2, view, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                U.e(parent, view2, view, i2);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i2) {
        ViewParent e2 = e(i2);
        if (e2 != null) {
            boolean z2 = e2 instanceof C0021m;
            ViewGroup viewGroup = this.f442c;
            if (z2) {
                ((C0021m) e2).b(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    U.g(e2, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i2 == 0) {
                this.f441a = null;
            } else if (i2 == 1) {
                this.b = null;
            }
        }
    }
}
