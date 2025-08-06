package q1;

import L0.b;
import android.app.LoadedApk;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

public final /* synthetic */ class P0 implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3953g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3954h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3955i;

    public /* synthetic */ P0(Object obj, Object obj2, Object obj3, int i2) {
        this.f = i2;
        this.f3953g = obj;
        this.f3954h = obj2;
        this.f3955i = obj3;
    }

    private final void a() {
        Q0.a((LoadedApk) this.f3953g, (Intent) this.f3954h, (String) this.f3955i);
    }

    public final void run() {
        switch (this.f) {
            case 0:
                a();
                return;
            case 1:
                C3 c3 = (C3) this.f3953g;
                Q2 q2 = (Q2) this.f3954h;
                IBinder iBinder = (IBinder) this.f3955i;
                try {
                    for (IBinder isBinderAlive : (IBinder[]) c3.f.toArray(new IBinder[0])) {
                        if (!isBinderAlive.isBinderAlive()) {
                            q2.f3970k.remove(iBinder);
                            c3.f.f.c(iBinder.hashCode());
                            C0330c3.f4069c.remove(iBinder);
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                C0330c3.U0((IBinder) this.f3953g, (C3) this.f3954h, (b) this.f3955i);
                return;
            case 3:
                Q2 q22 = (Q2) this.f3953g;
                ServiceInfo serviceInfo = (ServiceInfo) this.f3955i;
                Intent intent = (Intent) this.f3954h;
                try {
                    C3 c32 = (C3) q22.f3971l.a(serviceInfo.name.hashCode());
                    if (c32 == null) {
                        c32 = new C3(q22, serviceInfo);
                        q22.f3971l.b(serviceInfo.name.hashCode(), c32);
                        c32.f3868d++;
                    }
                    C0318a3 a3Var = q22.f3967h;
                    if (a3Var != null) {
                        a3Var.W(serviceInfo.name, intent, c32, c32.f3868d);
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 4:
                Q2 q23 = (Q2) this.f3953g;
                C3 c33 = (C3) this.f3954h;
                ServiceInfo serviceInfo2 = (ServiceInfo) this.f3955i;
                try {
                    C0318a3 a3Var2 = q23.f3967h;
                    if (a3Var2 != null) {
                        a3Var2.h0(c33);
                    }
                    q23.f3971l.c(serviceInfo2.name.hashCode());
                    return;
                } catch (Exception unused3) {
                    return;
                }
            default:
                IBinder iBinder2 = (IBinder) this.f3953g;
                C0320b bVar = (C0320b) this.f3954h;
                Q2 q24 = (Q2) this.f3955i;
                try {
                    iBinder2.unlinkToDeath(bVar, 0);
                    C0360h3.c(q24);
                    return;
                } catch (Exception unused4) {
                    return;
                }
        }
    }

    public /* synthetic */ P0(Q2 q2, ServiceInfo serviceInfo, Intent intent) {
        this.f = 3;
        this.f3953g = q2;
        this.f3955i = serviceInfo;
        this.f3954h = intent;
    }
}
