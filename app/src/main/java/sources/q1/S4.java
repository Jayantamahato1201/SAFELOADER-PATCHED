package q1;

import android.bluetooth.IBluetooth;
import android.bluetooth.IBluetoothManagerCallback;
import android.os.IBinder;
import android.os.IInterface;
import top.bienvenido.mundo.common.ext.MundoBleCallback;

public final class S4 extends MundoBleCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IBluetoothManagerCallback f3990a;
    public final /* synthetic */ L3 b;

    public S4(IBluetoothManagerCallback iBluetoothManagerCallback, L3 l3) {
        this.f3990a = iBluetoothManagerCallback;
        this.b = l3;
    }

    public final void onBluetoothOff() {
        try {
            this.f3990a.onBluetoothOff();
        } catch (Exception unused) {
        }
    }

    public final void onBluetoothOn() {
        try {
            this.f3990a.onBluetoothOn();
        } catch (Exception unused) {
        }
    }

    public final void onBluetoothServiceDown() {
        try {
            this.f3990a.onBluetoothServiceDown();
        } catch (Exception unused) {
        }
    }

    public final void onBluetoothServiceUp(IBluetooth iBluetooth) {
        try {
            this.f3990a.onBluetoothServiceUp(iBluetooth != null ? (IBluetooth) H.g(iBluetooth, this.b) : null);
        } catch (Exception unused) {
        }
    }

    public final void onBrEdrDown() {
        try {
            this.f3990a.onBrEdrDown();
        } catch (Exception unused) {
        }
    }

    public final void onBluetoothServiceUp(IBinder iBinder) {
        try {
            this.f3990a.onBluetoothServiceUp(new O(iBinder, (IInterface) H.g(IBluetooth.Stub.asInterface(iBinder), this.b)));
        } catch (Exception unused) {
        }
    }
}
