package top.bienvenido.mundo.common.ext;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class MundoServiceConnection extends IServiceConnection.Stub {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰  reason: collision with root package name */
    public final ServiceConnection f4716;

    public MundoServiceConnection(ServiceConnection serviceConnection) {
        this.f4716 = serviceConnection;
    }

    public void connected(ComponentName componentName, IBinder iBinder, boolean z2) {
        ServiceConnection serviceConnection;
        if (iBinder != null && (serviceConnection = this.f4716) != null) {
            serviceConnection.onServiceConnected(componentName, iBinder);
        }
    }

    public void connected(ComponentName componentName, IBinder iBinder) {
        ServiceConnection serviceConnection;
        if (iBinder != null && (serviceConnection = this.f4716) != null) {
            serviceConnection.onServiceConnected(componentName, iBinder);
        }
    }
}
