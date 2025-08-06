package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import e.C0135f;
import i.C0176a;
import j.C0211o;
import k.r1;

public final class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1967a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(int i2, Object obj) {
        this.f1967a = i2;
        this.b = obj;
    }

    public final void onClick(View view) {
        Message message;
        Message message2;
        C0211o oVar;
        switch (this.f1967a) {
            case 0:
                l lVar = (l) this.b;
                int i2 = lVar.f1971V;
                if (i2 == 2) {
                    lVar.B(1);
                    return;
                } else if (i2 == 1) {
                    lVar.B(2);
                    return;
                } else {
                    return;
                }
            case 1:
                C0135f fVar = (C0135f) this.b;
                if (view != fVar.f2493g || (message2 = fVar.f2495i) == null) {
                    Button button = fVar.f2496j;
                    Button button2 = fVar.f2497k;
                    message = null;
                } else {
                    message = Message.obtain(message2);
                }
                if (message != null) {
                    message.sendToTarget();
                }
                fVar.f2511y.obtainMessage(1, fVar.b).sendToTarget();
                return;
            case 2:
                ((C0176a) this.b).a();
                return;
            default:
                r1 r1Var = ((Toolbar) this.b).f1035L;
                if (r1Var == null) {
                    oVar = null;
                } else {
                    oVar = r1Var.b;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
