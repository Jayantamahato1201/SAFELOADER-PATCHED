package K0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public final class u extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f572a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Looper looper, int i2) {
        super(looper);
        this.f572a = i2;
    }

    public final void handleMessage(Message message) {
        boolean z2;
        Bitmap bitmap;
        switch (this.f572a) {
            case 0:
                int i2 = message.what;
                if (i2 == 3) {
                    n nVar = (n) message.obj;
                    nVar.f563a.getClass();
                    nVar.f563a.a(nVar.a());
                    return;
                } else if (i2 == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C0039f fVar = (C0039f) list.get(i3);
                        w wVar = fVar.f530g;
                        wVar.getClass();
                        n nVar2 = fVar.f538o;
                        ArrayList arrayList = fVar.f539p;
                        if (arrayList == null || arrayList.isEmpty()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (nVar2 != null || z2) {
                            Uri uri = fVar.f535l.f493a;
                            Exception exc = fVar.f543t;
                            Bitmap bitmap2 = fVar.f540q;
                            int i4 = fVar.f542s;
                            if (nVar2 != null) {
                                wVar.b(bitmap2, i4, nVar2, exc);
                            }
                            if (z2) {
                                int size2 = arrayList.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    wVar.b(bitmap2, i4, (n) arrayList.get(i5), exc);
                                }
                            }
                        }
                    }
                    return;
                } else if (i2 == 13) {
                    List list2 = (List) message.obj;
                    int size3 = list2.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        n nVar3 = (n) list2.get(i6);
                        w wVar2 = nVar3.f563a;
                        wVar2.getClass();
                        p pVar = (p) ((o) wVar2.f578d.b).get(nVar3.f565d);
                        if (pVar != null) {
                            bitmap = pVar.f568a;
                        } else {
                            bitmap = null;
                        }
                        D d2 = wVar2.f579e;
                        if (bitmap != null) {
                            d2.b.sendEmptyMessage(0);
                        } else {
                            d2.b.sendEmptyMessage(1);
                        }
                        if (bitmap != null) {
                            wVar2.b(bitmap, 1, nVar3, (Exception) null);
                        } else {
                            wVar2.c(nVar3);
                        }
                    }
                    return;
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            default:
                sendMessageDelayed(obtainMessage(), 1000);
                return;
        }
    }
}
