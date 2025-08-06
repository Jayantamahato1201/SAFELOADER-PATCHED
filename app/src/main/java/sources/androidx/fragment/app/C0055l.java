package androidx.fragment.app;

import A.g;
import A.j;
import H0.E;
import Q0.l;
import U0.i;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.cheatbox.R;
import e.C0137h;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.l  reason: case insensitive filesystem */
public class C0055l extends C0058o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: R  reason: collision with root package name */
    public final C0052i f1319R = new C0052i(this);

    /* renamed from: S  reason: collision with root package name */
    public final C0053j f1320S = new C0053j(this);

    /* renamed from: T  reason: collision with root package name */
    public int f1321T = 0;

    /* renamed from: U  reason: collision with root package name */
    public int f1322U = 0;

    /* renamed from: V  reason: collision with root package name */
    public boolean f1323V = true;

    /* renamed from: W  reason: collision with root package name */
    public boolean f1324W = true;

    /* renamed from: X  reason: collision with root package name */
    public int f1325X = -1;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f1326Y;

    /* renamed from: Z  reason: collision with root package name */
    public final j f1327Z = new j(15, (Object) this);

    /* renamed from: a0  reason: collision with root package name */
    public Dialog f1328a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1329b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1330c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1331d0 = false;

    public C0055l() {
        new E(6, this);
    }

    public Dialog A() {
        if (D.D(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(w(), this.f1322U);
    }

    public final l c() {
        return new C0054k(this, new C0056m(this));
    }

    public final void l(C0137h hVar) {
        super.l(hVar);
        this.f1355N.d(this.f1327Z);
        this.f1330c0 = false;
    }

    public void m(Bundle bundle) {
        boolean z2;
        super.m(bundle);
        new Handler();
        if (this.f1378w == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1324W = z2;
        if (bundle != null) {
            this.f1321T = bundle.getInt("android:style", 0);
            this.f1322U = bundle.getInt("android:theme", 0);
            this.f1323V = bundle.getBoolean("android:cancelable", true);
            this.f1324W = bundle.getBoolean("android:showsDialog", this.f1324W);
            this.f1325X = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void o() {
        this.f1345C = true;
        Dialog dialog = this.f1328a0;
        if (dialog != null) {
            this.f1329b0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1328a0.dismiss();
            if (!this.f1330c0) {
                onDismiss(this.f1328a0);
            }
            this.f1328a0 = null;
            this.f1331d0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1329b0) {
            if (D.D(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.f1330c0) {
                this.f1330c0 = true;
                Dialog dialog = this.f1328a0;
                if (dialog != null) {
                    dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    this.f1328a0.dismiss();
                }
                this.f1329b0 = true;
                if (this.f1325X >= 0) {
                    D j2 = j();
                    int i2 = this.f1325X;
                    if (i2 >= 0) {
                        j2.u(new C(j2, i2), false);
                        this.f1325X = -1;
                        return;
                    }
                    throw new IllegalArgumentException(g.f(i2, "Bad id: "));
                }
                C0044a aVar = new C0044a(j());
                D d2 = this.f1373r;
                if (d2 == null || d2 == aVar.f1285p) {
                    aVar.b(new J(3, this));
                    if (!aVar.f1286q) {
                        if (D.D(2)) {
                            Log.v("FragmentManager", "Commit: " + aVar);
                            PrintWriter printWriter = new PrintWriter(new L());
                            aVar.d("  ", printWriter, true);
                            printWriter.close();
                        }
                        aVar.f1286q = true;
                        boolean z2 = aVar.f1276g;
                        D d3 = aVar.f1285p;
                        if (z2) {
                            aVar.f1287r = d3.f1205i.getAndIncrement();
                        } else {
                            aVar.f1287r = -1;
                        }
                        d3.u(aVar, true);
                        return;
                    }
                    throw new IllegalStateException("commit already called");
                }
                throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
            }
        }
    }

    public final void p() {
        this.f1345C = true;
        if (!this.f1330c0) {
            this.f1330c0 = true;
        }
        j jVar = this.f1327Z;
        x xVar = this.f1355N;
        xVar.getClass();
        x.a("removeObserver");
        w wVar = (w) xVar.b.b(jVar);
        if (wVar != null) {
            wVar.d();
            wVar.c(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[Catch:{ all -> 0x0050 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater q(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.q(r8)
            boolean r0 = r7.f1324W
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L_0x009c
            boolean r3 = r7.f1326Y
            if (r3 == 0) goto L_0x0011
            goto L_0x009c
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x0073
        L_0x0014:
            boolean r0 = r7.f1331d0
            if (r0 != 0) goto L_0x0073
            r0 = 0
            r3 = 1
            r7.f1326Y = r3     // Catch:{ all -> 0x0050 }
            android.app.Dialog r4 = r7.A()     // Catch:{ all -> 0x0050 }
            r7.f1328a0 = r4     // Catch:{ all -> 0x0050 }
            boolean r5 = r7.f1324W     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x006a
            int r5 = r7.f1321T     // Catch:{ all -> 0x0050 }
            if (r5 == r3) goto L_0x003b
            if (r5 == r2) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r4.getWindow()     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x0050 }
        L_0x003b:
            r4.requestWindowFeature(r3)     // Catch:{ all -> 0x0050 }
        L_0x003e:
            android.content.Context r4 = r7.h()     // Catch:{ all -> 0x0050 }
            boolean r5 = A.g.k(r4)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0052
            android.app.Dialog r5 = r7.f1328a0     // Catch:{ all -> 0x0050 }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x0050 }
            r5.setOwnerActivity(r4)     // Catch:{ all -> 0x0050 }
            goto L_0x0052
        L_0x0050:
            r8 = move-exception
            goto L_0x0070
        L_0x0052:
            android.app.Dialog r4 = r7.f1328a0     // Catch:{ all -> 0x0050 }
            boolean r5 = r7.f1323V     // Catch:{ all -> 0x0050 }
            r4.setCancelable(r5)     // Catch:{ all -> 0x0050 }
            android.app.Dialog r4 = r7.f1328a0     // Catch:{ all -> 0x0050 }
            androidx.fragment.app.i r5 = r7.f1319R     // Catch:{ all -> 0x0050 }
            r4.setOnCancelListener(r5)     // Catch:{ all -> 0x0050 }
            android.app.Dialog r4 = r7.f1328a0     // Catch:{ all -> 0x0050 }
            androidx.fragment.app.j r5 = r7.f1320S     // Catch:{ all -> 0x0050 }
            r4.setOnDismissListener(r5)     // Catch:{ all -> 0x0050 }
            r7.f1331d0 = r3     // Catch:{ all -> 0x0050 }
            goto L_0x006d
        L_0x006a:
            r3 = 0
            r7.f1328a0 = r3     // Catch:{ all -> 0x0050 }
        L_0x006d:
            r7.f1326Y = r0
            goto L_0x0073
        L_0x0070:
            r7.f1326Y = r0
            throw r8
        L_0x0073:
            boolean r0 = androidx.fragment.app.D.D(r2)
            if (r0 == 0) goto L_0x008f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x008f:
            android.app.Dialog r0 = r7.f1328a0
            if (r0 == 0) goto L_0x00d7
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L_0x009c:
            boolean r0 = androidx.fragment.app.D.D(r2)
            if (r0 == 0) goto L_0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f1324W
            if (r2 != 0) goto L_0x00c6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        L_0x00c6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        L_0x00d7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0055l.q(android.os.Bundle):android.view.LayoutInflater");
    }

    public void r(Bundle bundle) {
        Dialog dialog = this.f1328a0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f1321T;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f1322U;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.f1323V;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1324W;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f1325X;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void s() {
        this.f1345C = true;
        Dialog dialog = this.f1328a0;
        if (dialog != null) {
            this.f1329b0 = false;
            dialog.show();
            View decorView = this.f1328a0.getWindow().getDecorView();
            i.e("<this>", decorView);
            decorView.setTag(R.id.MT_Bin, this);
            decorView.setTag(R.id.MT_Bin, this);
            decorView.setTag(R.id.MT_Bin, this);
        }
    }

    public void t() {
        this.f1345C = true;
        Dialog dialog = this.f1328a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void u(Bundle bundle) {
        Bundle bundle2;
        this.f1345C = true;
        if (this.f1328a0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1328a0.onRestoreInstanceState(bundle2);
        }
    }

    public final void v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.v(layoutInflater, viewGroup, bundle);
        if (this.f1346E == null && this.f1328a0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1328a0.onRestoreInstanceState(bundle2);
        }
    }
}
