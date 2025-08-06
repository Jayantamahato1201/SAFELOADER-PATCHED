package q1;

import android.content.pm.ProviderInfo;
import java.util.Comparator;

/* renamed from: q1.i  reason: case insensitive filesystem */
public final class C0362i implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((ProviderInfo) obj2).initOrder);
        Integer valueOf2 = Integer.valueOf(((ProviderInfo) obj).initOrder);
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }
}
