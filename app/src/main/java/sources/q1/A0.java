package q1;

import android.content.IntentFilter;
import android.os.IBinder;
import java.util.ArrayList;

public final class A0 extends ArrayList {
    public final IBinder f;

    /* renamed from: g  reason: collision with root package name */
    public final Q2 f3860g;

    public A0(IBinder iBinder, Q2 q2) {
        this.f = iBinder;
        this.f3860g = q2;
    }

    public final boolean a(IntentFilter intentFilter) {
        int countDataSchemes;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            IntentFilter intentFilter2 = (IntentFilter) get(i2);
            int countActions = intentFilter2.countActions();
            if (countActions == intentFilter.countActions()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= countActions) {
                        int countCategories = intentFilter2.countCategories();
                        if (countCategories != intentFilter.countCategories()) {
                            continue;
                        } else {
                            int i4 = 0;
                            while (true) {
                                if (i4 < countCategories) {
                                    if (!intentFilter.hasCategory(intentFilter2.getCategory(i4))) {
                                        break;
                                    }
                                    i4++;
                                } else if (intentFilter2.countDataTypes() == intentFilter.countDataTypes() && (countDataSchemes = intentFilter2.countDataSchemes()) == intentFilter.countDataSchemes()) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < countDataSchemes) {
                                            if (!intentFilter.hasDataScheme(intentFilter2.getDataScheme(i5))) {
                                                break;
                                            }
                                            i5++;
                                        } else if (intentFilter2.countDataAuthorities() == intentFilter.countDataAuthorities() && intentFilter2.countDataPaths() == intentFilter.countDataPaths() && intentFilter2.countDataSchemeSpecificParts() == intentFilter.countDataSchemeSpecificParts()) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!intentFilter.hasAction(intentFilter2.getAction(i3))) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C0450w4)) {
            return false;
        }
        return super.contains((C0450w4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C0450w4)) {
            return -1;
        }
        return super.indexOf((C0450w4) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C0450w4)) {
            return -1;
        }
        return super.lastIndexOf((C0450w4) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C0450w4)) {
            return false;
        }
        return super.remove((C0450w4) obj);
    }
}
