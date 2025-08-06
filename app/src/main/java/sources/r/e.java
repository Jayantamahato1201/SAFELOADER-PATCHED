package R;

import H0.E;
import I.O;
import Q0.l;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;

public final class e {

    /* renamed from: v  reason: collision with root package name */
    public static final d f686v = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public int f687a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public int f688c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f689d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f690e;
    public float[] f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f691g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f692h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f693i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f694j;

    /* renamed from: k  reason: collision with root package name */
    public int f695k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f696l;

    /* renamed from: m  reason: collision with root package name */
    public final float f697m;

    /* renamed from: n  reason: collision with root package name */
    public final float f698n;

    /* renamed from: o  reason: collision with root package name */
    public final int f699o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f700p;

    /* renamed from: q  reason: collision with root package name */
    public final l f701q;

    /* renamed from: r  reason: collision with root package name */
    public View f702r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f703s;

    /* renamed from: t  reason: collision with root package name */
    public final CoordinatorLayout f704t;

    /* renamed from: u  reason: collision with root package name */
    public final E f705u = new E(3, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, l lVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (lVar != null) {
            this.f704t = coordinatorLayout;
            this.f701q = lVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f699o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.f697m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f698n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f700p = new OverScroller(context, f686v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f688c = -1;
        float[] fArr = this.f689d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f690e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.f691g, 0.0f);
            Arrays.fill(this.f692h, 0);
            Arrays.fill(this.f693i, 0);
            Arrays.fill(this.f694j, 0);
            this.f695k = 0;
        }
        VelocityTracker velocityTracker = this.f696l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f696l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f704t;
        if (parent == coordinatorLayout) {
            this.f702r = view;
            this.f688c = i2;
            this.f701q.L(view, i2);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    public final boolean c(View view, float f2, float f3) {
        boolean z2;
        boolean z3;
        if (view != null) {
            l lVar = this.f701q;
            if (lVar.y(view) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lVar.z() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                float f4 = f3 * f3;
                int i2 = this.b;
                if (f4 + (f2 * f2) > ((float) (i2 * i2))) {
                    return true;
                }
            } else if (!z2 ? !z3 || Math.abs(f3) <= ((float) this.b) : Math.abs(f2) <= ((float) this.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void d(int i2) {
        float[] fArr = this.f689d;
        if (fArr != null) {
            int i3 = this.f695k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f690e[i2] = 0.0f;
                this.f[i2] = 0.0f;
                this.f691g[i2] = 0.0f;
                this.f692h[i2] = 0;
                this.f693i[i2] = 0;
                this.f694j[i2] = 0;
                this.f695k = (~i4) & i3;
            }
        }
    }

    public final int e(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.f704t.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    public final boolean f() {
        if (this.f687a == 2) {
            OverScroller overScroller = this.f700p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f702r.getLeft();
            int top2 = currY - this.f702r.getTop();
            if (left != 0) {
                O.j(this.f702r, left);
            }
            if (top2 != 0) {
                O.k(this.f702r, top2);
            }
            if (!(left == 0 && top2 == 0)) {
                this.f701q.N(this.f702r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f704t.post(this.f705u);
            }
        }
        if (this.f687a == 2) {
            return true;
        }
        return false;
    }

    public final View g(int i2, int i3) {
        CoordinatorLayout coordinatorLayout = this.f704t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f701q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f702r.getLeft();
        int top2 = this.f702r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top2;
        OverScroller overScroller = this.f700p;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f702r;
        int i8 = (int) this.f698n;
        int i9 = (int) this.f697m;
        int abs = Math.abs(i4);
        if (abs < i8) {
            i4 = 0;
        } else if (abs > i9) {
            if (i4 > 0) {
                i4 = i9;
            } else {
                i4 = -i9;
            }
        }
        int abs2 = Math.abs(i5);
        if (abs2 < i8) {
            i5 = 0;
        } else if (abs2 > i9) {
            if (i5 > 0) {
                i5 = i9;
            } else {
                i5 = -i9;
            }
        }
        int abs3 = Math.abs(i6);
        int abs4 = Math.abs(i7);
        int abs5 = Math.abs(i4);
        int abs6 = Math.abs(i5);
        int i10 = abs5 + abs6;
        int i11 = abs3 + abs4;
        if (i4 != 0) {
            f2 = (float) abs5;
            f3 = (float) i10;
        } else {
            f2 = (float) abs3;
            f3 = (float) i11;
        }
        float f6 = f2 / f3;
        if (i5 != 0) {
            f4 = (float) abs6;
            f5 = (float) i10;
        } else {
            f4 = (float) abs4;
            f5 = (float) i11;
        }
        float f7 = f4 / f5;
        l lVar = this.f701q;
        overScroller.startScroll(left, top2, i6, i7, (int) ((((float) e(i7, i5, lVar.z())) * f7) + (((float) e(i6, i4, lVar.y(view))) * f6)));
        n(2);
        return true;
    }

    public final boolean i(int i2) {
        if ((this.f695k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f696l == null) {
            this.f696l = VelocityTracker.obtain();
        }
        this.f696l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g2 = g((int) x2, (int) y2);
            l(x2, y2, pointerId);
            q(g2, pointerId);
            int i4 = this.f692h[pointerId];
        } else if (actionMasked != 1) {
            l lVar = this.f701q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f687a == 1) {
                        this.f703s = true;
                        lVar.O(this.f702r, 0.0f, 0.0f);
                        this.f703s = false;
                        if (this.f687a == 1) {
                            n(0);
                        }
                    }
                    a();
                } else if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    l(x3, y3, pointerId2);
                    if (this.f687a == 0) {
                        q(g((int) x3, (int) y3), pointerId2);
                        int i5 = this.f692h[pointerId2];
                        return;
                    }
                    int i6 = (int) x3;
                    int i7 = (int) y3;
                    View view = this.f702r;
                    if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        q(this.f702r, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f687a == 1 && pointerId3 == this.f688c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i3 >= pointerCount) {
                                i2 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i3);
                            if (pointerId4 != this.f688c) {
                                View g3 = g((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                View view2 = this.f702r;
                                if (g3 == view2 && q(view2, pointerId4)) {
                                    i2 = this.f688c;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (i2 == -1) {
                            k();
                        }
                    }
                    d(pointerId3);
                }
            } else if (this.f687a != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i3 < pointerCount2) {
                    int pointerId5 = motionEvent.getPointerId(i3);
                    if (i(pointerId5)) {
                        float x4 = motionEvent.getX(i3);
                        float y4 = motionEvent.getY(i3);
                        float f2 = x4 - this.f689d[pointerId5];
                        float f3 = y4 - this.f690e[pointerId5];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i8 = this.f692h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i9 = this.f692h[pointerId5];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i10 = this.f692h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i11 = this.f692h[pointerId5];
                        if (this.f687a != 1) {
                            View g4 = g((int) x4, (int) y4);
                            if (c(g4, f2, f3) && q(g4, pointerId5)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                m(motionEvent);
            } else if (i(this.f688c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f688c);
                float x5 = motionEvent.getX(findPointerIndex);
                float y5 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f;
                int i12 = this.f688c;
                int i13 = (int) (x5 - fArr[i12]);
                int i14 = (int) (y5 - this.f691g[i12]);
                int left = this.f702r.getLeft() + i13;
                int top2 = this.f702r.getTop() + i14;
                int left2 = this.f702r.getLeft();
                int top3 = this.f702r.getTop();
                if (i13 != 0) {
                    left = lVar.k(this.f702r, left);
                    O.j(this.f702r, left - left2);
                }
                if (i14 != 0) {
                    top2 = lVar.l(this.f702r, top2);
                    O.k(this.f702r, top2 - top3);
                }
                if (!(i13 == 0 && i14 == 0)) {
                    lVar.N(this.f702r, left, top2);
                }
                m(motionEvent);
            }
        } else {
            if (this.f687a == 1) {
                k();
            }
            a();
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f696l;
        float f2 = this.f697m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f696l.getXVelocity(this.f688c);
        float f3 = this.f698n;
        float abs = Math.abs(xVelocity);
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity > 0.0f) {
                xVelocity = f2;
            } else {
                xVelocity = -f2;
            }
        }
        float yVelocity = this.f696l.getYVelocity(this.f688c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f2 = 0.0f;
        } else if (abs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.f703s = true;
        this.f701q.O(this.f702r, xVelocity, f2);
        this.f703s = false;
        if (this.f687a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f3, int i2) {
        float[] fArr = this.f689d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f690e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f691g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f692h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f693i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f694j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f689d = fArr2;
            this.f690e = fArr3;
            this.f = fArr4;
            this.f691g = fArr5;
            this.f692h = iArr;
            this.f693i = iArr2;
            this.f694j = iArr3;
        }
        float[] fArr9 = this.f689d;
        this.f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f690e;
        this.f691g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f692h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f704t;
        int left = coordinatorLayout.getLeft();
        int i7 = this.f699o;
        if (i5 < left + i7) {
            i3 = 1;
        }
        if (i6 < coordinatorLayout.getTop() + i7) {
            i3 |= 4;
        }
        if (i5 > coordinatorLayout.getRight() - i7) {
            i3 |= 2;
        }
        if (i6 > coordinatorLayout.getBottom() - i7) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.f695k |= 1 << i2;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f[pointerId] = x2;
                this.f691g[pointerId] = y2;
            }
        }
    }

    public final void n(int i2) {
        this.f704t.removeCallbacks(this.f705u);
        if (this.f687a != i2) {
            this.f687a = i2;
            this.f701q.M(i2);
            if (this.f687a == 0) {
                this.f702r = null;
            }
        }
    }

    public final boolean o(int i2, int i3) {
        if (this.f703s) {
            return h(i2, i3, (int) this.f696l.getXVelocity(this.f688c), (int) this.f696l.getYVelocity(this.f688c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r12 != r11) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            int r3 = r1.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r0.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f696l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f696l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f696l
            r4.addMovement(r1)
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0118
            if (r2 == r4) goto L_0x0114
            if (r2 == r5) goto L_0x0067
            r7 = 3
            if (r2 == r7) goto L_0x0114
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r5 = 6
            if (r2 == r5) goto L_0x0034
            goto L_0x013c
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.d(r1)
            goto L_0x013c
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.l(r7, r1, r2)
            int r3 = r0.f687a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.f692h
            r1 = r1[r2]
            goto L_0x013c
        L_0x0056:
            if (r3 != r5) goto L_0x013c
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.g(r3, r1)
            android.view.View r3 = r0.f702r
            if (r1 != r3) goto L_0x013c
            r0.q(r1, r2)
            goto L_0x013c
        L_0x0067:
            float[] r2 = r0.f689d
            if (r2 == 0) goto L_0x013c
            float[] r2 = r0.f690e
            if (r2 != 0) goto L_0x0071
            goto L_0x013c
        L_0x0071:
            int r2 = r1.getPointerCount()
            r3 = 0
        L_0x0076:
            if (r3 >= r2) goto L_0x0110
            int r5 = r1.getPointerId(r3)
            boolean r7 = r0.i(r5)
            if (r7 != 0) goto L_0x0084
            goto L_0x010c
        L_0x0084:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f689d
            r9 = r9[r5]
            float r9 = r7 - r9
            float[] r10 = r0.f690e
            r10 = r10[r5]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.g(r7, r8)
            if (r7 == 0) goto L_0x00a8
            boolean r8 = r0.c(r7, r9, r10)
            if (r8 == 0) goto L_0x00a8
            r8 = 1
            goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            if (r8 == 0) goto L_0x00d6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            Q0.l r13 = r0.f701q
            int r12 = r13.k(r7, r12)
            int r14 = r7.getTop()
            int r15 = (int) r10
            int r15 = r15 + r14
            int r15 = r13.l(r7, r15)
            int r16 = r13.y(r7)
            int r13 = r13.z()
            if (r16 == 0) goto L_0x00cf
            if (r16 <= 0) goto L_0x00d6
            if (r12 != r11) goto L_0x00d6
        L_0x00cf:
            if (r13 == 0) goto L_0x0110
            if (r13 <= 0) goto L_0x00d6
            if (r15 != r14) goto L_0x00d6
            goto L_0x0110
        L_0x00d6:
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.f692h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r11 = r0.f692h
            r11 = r11[r5]
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.f692h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r9 = r0.f692h
            r9 = r9[r5]
            int r9 = r0.f687a
            if (r9 != r4) goto L_0x0103
            goto L_0x0110
        L_0x0103:
            if (r8 == 0) goto L_0x010c
            boolean r5 = r0.q(r7, r5)
            if (r5 == 0) goto L_0x010c
            goto L_0x0110
        L_0x010c:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x0110:
            r17.m(r18)
            goto L_0x013c
        L_0x0114:
            r0.a()
            goto L_0x013c
        L_0x0118:
            float r2 = r1.getX()
            float r3 = r1.getY()
            int r1 = r1.getPointerId(r6)
            r0.l(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.g(r2, r3)
            android.view.View r3 = r0.f702r
            if (r2 != r3) goto L_0x0138
            int r3 = r0.f687a
            if (r3 != r5) goto L_0x0138
            r0.q(r2, r1)
        L_0x0138:
            int[] r2 = r0.f692h
            r1 = r2[r1]
        L_0x013c:
            int r1 = r0.f687a
            if (r1 != r4) goto L_0x0141
            return r4
        L_0x0141:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i2) {
        if (view == this.f702r && this.f688c == i2) {
            return true;
        }
        if (view == null || !this.f701q.d0(view, i2)) {
            return false;
        }
        this.f688c = i2;
        b(view, i2);
        return true;
    }
}
