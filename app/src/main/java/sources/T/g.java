package T;

import Q0.l;
import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class g extends l {

    /* renamed from: l  reason: collision with root package name */
    public final f f715l;

    public g(TextView textView) {
        this.f715l = new f(textView);
    }

    public final void X(boolean z2) {
        boolean z3;
        if (j.f1156j != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f715l.X(z2);
        }
    }

    public final void Y(boolean z2) {
        boolean z3;
        if (j.f1156j != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f fVar = this.f715l;
        if (!z3) {
            fVar.f714n = z2;
        } else {
            fVar.Y(z2);
        }
    }

    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        boolean z2;
        if (j.f1156j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return inputFilterArr;
        }
        return this.f715l.w(inputFilterArr);
    }
}
