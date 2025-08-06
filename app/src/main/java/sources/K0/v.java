package K0;

import H0.E;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

public final class v extends Thread {
    public final ReferenceQueue f;

    /* renamed from: g  reason: collision with root package name */
    public final u f573g;

    public v(ReferenceQueue referenceQueue, u uVar) {
        this.f = referenceQueue;
        this.f573g = uVar;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    public final void run() {
        u uVar = this.f573g;
        Process.setThreadPriority(10);
        while (true) {
            try {
                C0034a aVar = (C0034a) this.f.remove(1000);
                Message obtainMessage = uVar.obtainMessage();
                if (aVar != null) {
                    obtainMessage.what = 3;
                    obtainMessage.obj = aVar.f522a;
                    uVar.sendMessage(obtainMessage);
                } else {
                    obtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e2) {
                uVar.post(new E(1, e2));
                return;
            }
        }
    }
}
