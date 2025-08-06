package Z;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import java.io.Serializable;
import q1.C0433u;
import q1.X3;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f790g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f791h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f792i;

    public /* synthetic */ a(b bVar, int i2, Serializable serializable) {
        this.f = 0;
        this.f791h = bVar;
        this.f790g = i2;
        this.f792i = serializable;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                ((b) this.f791h).b.h(this.f790g, (Serializable) this.f792i);
                return;
            case 1:
                IBinder iBinder = (IBinder) this.f791h;
                Intent intent = (Intent) this.f792i;
                int i2 = this.f790g;
                try {
                    Service service = (Service) C0433u.f4206r.get(iBinder);
                    if (service != null) {
                        intent.setExtrasClassLoader(service.getClassLoader());
                        service.onStartCommand(intent, 0, i2);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                X3 x3 = (X3) this.f791h;
                x3.f4037g.c(this.f790g, ((ComponentName) this.f792i).getClassName());
                x3.f4037g.d();
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, int i3) {
        this.f = i3;
        this.f791h = obj;
        this.f792i = obj2;
        this.f790g = i2;
    }
}
