package q1;

import U0.i;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.concurrent.Callable;

public final class W0 implements Callable {
    public final C0 f = C0452x0.a(MessageQueue.class, "mMessages");

    /* renamed from: g  reason: collision with root package name */
    public final MessageQueue f4025g;

    /* renamed from: h  reason: collision with root package name */
    public final C0351g0 f4026h;

    public W0() {
        C0 a2 = C0452x0.a(Handler.class, "mQueue");
        C0433u.b.getClass();
        this.f4025g = (MessageQueue) a2.a(C0433u.f4193d);
        this.f4026h = new C0351g0("token");
    }

    public final Object call() {
        Message message;
        IBinder iBinder;
        try {
            if (!i.a(Looper.myLooper(), Looper.getMainLooper()) || (message = (Message) this.f.a(this.f4025g)) == null) {
                return null;
            }
            C0433u.b.getClass();
            if (i.a(C0433u.f4193d, message.getTarget())) {
                if (message.getCallback() == null) {
                    int i2 = message.what;
                    if (i2 == 100) {
                        Object obj = message.obj;
                        if (!(obj == null || (iBinder = (IBinder) ((C0) this.f4026h.f4098c).a(obj)) == null)) {
                            I2.c(obj, iBinder);
                        }
                    } else if (i2 == 112) {
                        Object obj2 = message.obj;
                        if (obj2 != null) {
                            I2.b(obj2);
                        }
                    }
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
