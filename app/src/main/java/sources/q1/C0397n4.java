package q1;

import L0.e;
import T0.l;
import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.ClientTransactionItem;
import android.app.servertransaction.LaunchActivityItem;
import android.app.servertransaction.NewIntentItem;
import java.util.List;

/* renamed from: q1.n4  reason: case insensitive filesystem */
public final class C0397n4 extends V4 {
    public static final C0397n4 b = new V4();

    public static final e d(l lVar, ClientTransaction clientTransaction) {
        e eVar = e.f591c;
        try {
            List list = (List) lVar.e(clientTransaction);
            if (list != null) {
                Object B02 = M0.e.B0(list);
                if (B02 != null) {
                    if (B02 instanceof LaunchActivityItem) {
                        I2 i2 = I2.f3913a;
                        I2.c(B02, clientTransaction.getActivityToken());
                        if (T4.f4003i) {
                            C0409p4.b(B02);
                            return eVar;
                        }
                    } else if (B02 instanceof NewIntentItem) {
                        I2.b(B02);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return eVar;
    }

    public static final void e(LaunchActivityItem launchActivityItem) {
        try {
            I2 i2 = I2.f3913a;
            I2.c(launchActivityItem, launchActivityItem.getActivityToken());
            C0409p4.b(launchActivityItem);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, T0.l] */
    public static void f() {
        l lVar;
        if (!T4.f4006l) {
            if (T4.f4005k) {
                try {
                    ClientTransactionItem.class.getDeclaredMethod("getActivityToken", (Class[]) null);
                } catch (Throwable unused) {
                }
            }
            if (T4.f4002h) {
                lVar = C0343e4.f4090n;
            } else {
                lVar = new B4();
            }
            E.a(ClientTransaction.class, ClientTransaction.CREATOR, new C0385l4(lVar));
            return;
        }
        E.a(LaunchActivityItem.class, LaunchActivityItem.CREATOR, new Object());
        E.a(NewIntentItem.class, NewIntentItem.CREATOR, new B(1, I2.f3913a, I2.class, "handleNewIntent", "handleNewIntent(Ljava/lang/Object;)V", 0, 6));
    }

    public final void b() {
        f();
    }
}
