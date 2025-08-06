package G0;

import android.os.Handler;
import android.os.Message;

public final class a implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        } else if (i2 != 1) {
            return false;
        } else {
            message.obj.getClass();
            throw new ClassCastException();
        }
    }
}
