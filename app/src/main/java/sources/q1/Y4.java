package q1;

import android.app.PropertyInvalidatedCache;
import android.bluetooth.BluetoothAdapter;
import android.os.IpcDataCache;
import top.bienvenido.mundo.common.ext.ExtQueryHandler;

public final class Y4 extends V4 {
    public static final Y4 b = new V4();

    public final void b() {
        Class<BluetoothAdapter> cls = BluetoothAdapter.class;
        IpcDataCache ipcDataCache = (IpcDataCache) C0452x0.a(cls, "sGetProfileConnectionStateCache").a((Object) null);
        if (ipcDataCache != null) {
            C0 a2 = C0452x0.a(PropertyInvalidatedCache.class, "mComputer");
            IpcDataCache.QueryHandler queryHandler = (IpcDataCache.QueryHandler) C0452x0.a(cls, "sBluetoothProfileQuery").a((Object) null);
            if (queryHandler != null) {
                a2.c(ipcDataCache, new ExtQueryHandler(queryHandler));
                ipcDataCache.clear();
            }
        }
    }
}
