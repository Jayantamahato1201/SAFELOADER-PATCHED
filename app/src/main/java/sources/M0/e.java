package M0;

import U0.i;
import java.util.Collection;
import java.util.List;

public abstract class e extends k {
    public static Object B0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String C0(Collection collection, String str, a aVar, int i2) {
        String str2;
        String str3 = "";
        if ((i2 & 2) != 0) {
            str2 = str3;
        } else {
            str2 = "[";
        }
        if ((i2 & 4) == 0) {
            str3 = "]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        int i3 = 0;
        for (Object next : collection) {
            boolean z2 = true;
            i3++;
            if (i3 > 1) {
                sb.append(str);
            }
            if (next != null) {
                z2 = next instanceof CharSequence;
            }
            if (z2) {
                sb.append((CharSequence) next);
            } else if (next instanceof Character) {
                sb.append(((Character) next).charValue());
            } else {
                sb.append(String.valueOf(next));
            }
        }
        sb.append(str3);
        String sb2 = sb.toString();
        i.d("joinTo(StringBuilder(), …ed, transform).toString()", sb2);
        return sb2;
    }
}
