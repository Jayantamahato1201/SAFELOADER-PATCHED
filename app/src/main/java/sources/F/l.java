package F;

import J.v;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.C0133d;
import e.C0136g;

public final class l implements v {

    /* renamed from: a  reason: collision with root package name */
    public int f210a;
    public Object b;

    public l(Context context) {
        this(context, C0136g.h(context, 0));
    }

    public boolean a(View view) {
        ((BottomSheetBehavior) this.b).B(this.f210a);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.widget.ArrayAdapter} */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.C0136g b() {
        /*
            r10 = this;
            e.g r0 = new e.g
            java.lang.Object r1 = r10.b
            e.d r1 = (e.C0133d) r1
            android.view.ContextThemeWrapper r2 = r1.f2478a
            int r3 = r10.f210a
            r0.<init>(r2, r3)
            android.view.View r2 = r1.f2481e
            e.f r3 = r0.f
            if (r2 == 0) goto L_0x0016
            r3.f2503q = r2
            goto L_0x0036
        L_0x0016:
            java.lang.CharSequence r2 = r1.f2480d
            if (r2 == 0) goto L_0x0023
            r3.f2491d = r2
            android.widget.TextView r4 = r3.f2501o
            if (r4 == 0) goto L_0x0023
            r4.setText(r2)
        L_0x0023:
            android.graphics.drawable.Drawable r2 = r1.f2479c
            if (r2 == 0) goto L_0x0036
            r3.f2499m = r2
            android.widget.ImageView r4 = r3.f2500n
            if (r4 == 0) goto L_0x0036
            r5 = 0
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r3.f2500n
            r4.setImageDrawable(r2)
        L_0x0036:
            java.lang.String r2 = r1.f
            if (r2 == 0) goto L_0x0043
            r3.f2492e = r2
            android.widget.TextView r4 = r3.f2502p
            if (r4 == 0) goto L_0x0043
            r4.setText(r2)
        L_0x0043:
            java.lang.String r2 = r1.f2482g
            r4 = 0
            if (r2 != 0) goto L_0x0049
            goto L_0x005a
        L_0x0049:
            android.content.DialogInterface$OnClickListener r5 = r1.f2483h
            if (r5 == 0) goto L_0x0055
            K0.j r6 = r3.f2511y
            r7 = -1
            android.os.Message r5 = r6.obtainMessage(r7, r5)
            goto L_0x0056
        L_0x0055:
            r5 = r4
        L_0x0056:
            r3.f2494h = r2
            r3.f2495i = r5
        L_0x005a:
            java.lang.Object r2 = r1.f2485j
            r5 = 1
            if (r2 == 0) goto L_0x009c
            int r2 = r3.f2507u
            android.view.LayoutInflater r6 = r1.b
            android.view.View r2 = r6.inflate(r2, r4)
            androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController$RecycleListView) r2
            boolean r6 = r1.f2487l
            if (r6 == 0) goto L_0x0070
            int r6 = r3.f2508v
            goto L_0x0072
        L_0x0070:
            int r6 = r3.f2509w
        L_0x0072:
            java.lang.Object r7 = r1.f2485j
            if (r7 == 0) goto L_0x0077
            goto L_0x0081
        L_0x0077:
            e.e r7 = new e.e
            android.view.ContextThemeWrapper r8 = r1.f2478a
            r9 = 16908308(0x1020014, float:2.3877285E-38)
            r7.<init>(r8, r6, r9, r4)
        L_0x0081:
            r3.f2504r = r7
            int r6 = r1.f2488m
            r3.f2505s = r6
            android.content.DialogInterface$OnClickListener r6 = r1.f2486k
            if (r6 == 0) goto L_0x0093
            e.c r6 = new e.c
            r6.<init>(r1, r3)
            r2.setOnItemClickListener(r6)
        L_0x0093:
            boolean r6 = r1.f2487l
            if (r6 == 0) goto L_0x009a
            r2.setChoiceMode(r5)
        L_0x009a:
            r3.f = r2
        L_0x009c:
            r0.setCancelable(r5)
            r0.setCanceledOnTouchOutside(r5)
            r0.setOnCancelListener(r4)
            r0.setOnDismissListener(r4)
            j.n r1 = r1.f2484i
            if (r1 == 0) goto L_0x00af
            r0.setOnKeyListener(r1)
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.l.b():e.g");
    }

    public l(Context context, int i2) {
        this.b = new C0133d(new ContextThemeWrapper(context, C0136g.h(context, i2)));
        this.f210a = i2;
    }

    public l(int i2, m[] mVarArr) {
        this.f210a = i2;
        this.b = mVarArr;
    }

    public l(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.b = bottomSheetBehavior;
        this.f210a = i2;
    }
}
