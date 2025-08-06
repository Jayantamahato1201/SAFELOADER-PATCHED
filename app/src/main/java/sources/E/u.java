package e;

import N.g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.fragment.app.C0049f;
import java.util.Calendar;
import t0.C0486a;

public final class u extends C0049f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2538c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f2539d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2540e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(x xVar, g gVar) {
        super(xVar);
        this.f2539d = xVar;
        this.f2540e = gVar;
    }

    public final IntentFilter e() {
        switch (this.f2538c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.Object, e.G] */
    public final int f() {
        boolean z2;
        Location location;
        long j2;
        Location location2;
        switch (this.f2538c) {
            case 0:
                if (((PowerManager) this.f2540e).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                g gVar = (g) this.f2540e;
                C0126H h2 = (C0126H) gVar.f607d;
                if (h2.b > System.currentTimeMillis()) {
                    z2 = h2.f2441a;
                } else {
                    Context context = (Context) gVar.b;
                    int a2 = C0486a.a(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) gVar.f606c;
                    if (a2 == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                location2 = locationManager.getLastKnownLocation("network");
                                location = location2;
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (C0486a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z2 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0125G.f2438d == null) {
                            C0125G.f2438d = new Object();
                        }
                        C0125G g2 = C0125G.f2438d;
                        g2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        C0125G g3 = g2;
                        g3.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        C0125G g4 = g3;
                        if (g4.f2440c == 1) {
                            z2 = true;
                        }
                        long j3 = g4.b;
                        long j4 = j3;
                        long j5 = g4.f2439a;
                        g4.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j6 = g4.b;
                        if (j4 == -1 || j5 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j5) {
                                if (currentTimeMillis > j4) {
                                    j6 = j5;
                                } else {
                                    j6 = j4;
                                }
                            }
                            j2 = j6 + 60000;
                        }
                        h2.f2441a = z2;
                        h2.b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    return 2;
                }
                return 1;
        }
    }

    public final void h() {
        switch (this.f2538c) {
            case 0:
                this.f2539d.n(true, true);
                return;
            default:
                this.f2539d.n(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(x xVar, Context context) {
        super(xVar);
        this.f2539d = xVar;
        this.f2540e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
