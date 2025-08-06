package d1;

import java.util.Comparator;

/* renamed from: d1.k  reason: case insensitive filesystem */
public final class C0118k implements Comparator {
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int min = Math.min(str.length(), str2.length());
        int i2 = 4;
        while (i2 < min) {
            char charAt = str.charAt(i2);
            char charAt2 = str2.charAt(i2);
            if (charAt == charAt2) {
                i2++;
            } else if (charAt < charAt2) {
                return -1;
            } else {
                return 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }
}
