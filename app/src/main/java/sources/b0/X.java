package b0;

import I.O;
import R.d;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class X implements Runnable {
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1621g;

    /* renamed from: h  reason: collision with root package name */
    public OverScroller f1622h;

    /* renamed from: i  reason: collision with root package name */
    public Interpolator f1623i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1624j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1625k = false;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1626l;

    public X(RecyclerView recyclerView) {
        this.f1626l = recyclerView;
        d dVar = RecyclerView.f1482w0;
        this.f1623i = dVar;
        this.f1622h = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f1624j) {
            this.f1625k = true;
            return;
        }
        RecyclerView recyclerView = this.f1626l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.f393a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i2, int i3, int i4, Interpolator interpolator) {
        boolean z2;
        int i5;
        int i6;
        RecyclerView recyclerView = this.f1626l;
        if (i4 == Integer.MIN_VALUE) {
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            if (abs > abs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int sqrt = (int) Math.sqrt((double) 0);
            int sqrt2 = (int) Math.sqrt((double) ((i3 * i3) + (i2 * i2)));
            if (z2) {
                i5 = recyclerView.getWidth();
            } else {
                i5 = recyclerView.getHeight();
            }
            int i7 = i5 / 2;
            float f2 = (float) i5;
            float f3 = (float) i7;
            float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i6 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i6, 2000);
        }
        int i8 = i4;
        if (interpolator == null) {
            interpolator = RecyclerView.f1482w0;
        }
        if (this.f1623i != interpolator) {
            this.f1623i = interpolator;
            this.f1622h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1621g = 0;
        this.f = 0;
        recyclerView.setScrollState(2);
        this.f1622h.startScroll(0, 0, i2, i3, i8);
        if (Build.VERSION.SDK_INT < 23) {
            this.f1622h.computeScrollOffset();
        }
        a();
    }

    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        RecyclerView recyclerView = this.f1626l;
        if (recyclerView.f1524l == null) {
            recyclerView.removeCallbacks(this);
            this.f1622h.abortAnimation();
            return;
        }
        this.f1625k = false;
        this.f1624j = true;
        recyclerView.m();
        OverScroller overScroller = this.f1622h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            this.f = currX;
            this.f1621g = currY;
            int i7 = currX - this.f;
            int[] iArr = recyclerView.f1530o0;
            iArr[0] = 0;
            iArr[1] = 0;
            int i8 = currY - this.f1621g;
            boolean r2 = recyclerView.r(i7, i8, iArr, (int[]) null, 1);
            int[] iArr2 = recyclerView.f1530o0;
            if (r2) {
                i3 = i7 - iArr2[0];
                i2 = i8 - iArr2[1];
            } else {
                i3 = i7;
                i2 = i8;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i3, i2);
            }
            if (recyclerView.f1522k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i3, i2, iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
                i3 -= i5;
                i2 -= i4;
                C0098w wVar = recyclerView.f1524l.f1580e;
                if (wVar != null && !wVar.f1787d && wVar.f1788e) {
                    int b = recyclerView.f1509c0.b();
                    if (b == 0) {
                        wVar.i();
                    } else if (wVar.f1785a >= b) {
                        wVar.f1785a = b - 1;
                        wVar.g(i5, i4);
                    } else {
                        wVar.g(i5, i4);
                    }
                }
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1526m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1530o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i5, i4, i3, i2, (int[]) null, 1, iArr3);
            int i9 = i3 - iArr2[0];
            int i10 = i2 - iArr2[1];
            if (!(i5 == 0 && i4 == 0)) {
                recyclerView.t(i5, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (overScroller.isFinished() || ((z2 || i9 != 0) && (z3 || i10 != 0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            C0098w wVar2 = recyclerView.f1524l.f1580e;
            if ((wVar2 == null || !wVar2.f1787d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i9 < 0) {
                        i6 = -currVelocity;
                    } else if (i9 > 0) {
                        i6 = currVelocity;
                    } else {
                        i6 = 0;
                    }
                    if (i10 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i10 <= 0) {
                        currVelocity = 0;
                    }
                    if (i6 < 0) {
                        recyclerView.v();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(-i6);
                        }
                    } else if (i6 > 0) {
                        recyclerView.w();
                        if (recyclerView.f1487F.isFinished()) {
                            recyclerView.f1487F.onAbsorb(i6);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1486E.isFinished()) {
                            recyclerView.f1486E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f1488G.isFinished()) {
                            recyclerView.f1488G.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i6 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = O.f393a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1480u0) {
                    C0090n nVar = recyclerView.f1507b0;
                    int[] iArr4 = nVar.f1747c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    nVar.f1748d = 0;
                }
            } else {
                a();
                C0092p pVar = recyclerView.f1506a0;
                if (pVar != null) {
                    pVar.a(recyclerView, i5, i4);
                }
            }
        }
        C0098w wVar3 = recyclerView.f1524l.f1580e;
        if (wVar3 != null && wVar3.f1787d) {
            wVar3.g(0, 0);
        }
        this.f1624j = false;
        if (this.f1625k) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.f393a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.c0(1);
    }
}
