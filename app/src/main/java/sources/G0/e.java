package G0;

import A.j;
import android.os.Handler;
import android.os.Message;

public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f258a;

    public e(j jVar) {
        this.f258a = jVar;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        j jVar = this.f258a;
        if (message.obj == null) {
            synchronized (jVar.b) {
                throw null;
            }
        }
        throw new ClassCastException();
    }
}
