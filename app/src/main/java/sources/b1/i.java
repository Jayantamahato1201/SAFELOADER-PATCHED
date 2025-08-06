package b1;

import F.c;
import M0.g;
import Y0.a;
import Y0.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class i extends g {
    public static boolean f0(String str, String str2) {
        U0.i.e("<this>", str);
        return str.endsWith(str2);
    }

    public static int g0(String str) {
        U0.i.e("<this>", str);
        return str.indexOf(47, 0);
    }

    public static boolean h0(String str) {
        if (str.length() != 0) {
            a aVar = new a(0, str.length() - 1, 1);
            if (!(aVar instanceof Collection) || !((Collection) aVar).isEmpty()) {
                Iterator it = aVar.iterator();
                while (((b) it).f787h) {
                    char charAt = str.charAt(((b) it).a());
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List i0(String str, char[] cArr) {
        if (cArr.length == 1) {
            int i2 = 0;
            String valueOf = String.valueOf(cArr[0]);
            U0.i.e("string", valueOf);
            int indexOf = str.indexOf(valueOf, 0);
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList(10);
                do {
                    arrayList.add(str.subSequence(i2, indexOf).toString());
                    i2 = valueOf.length() + indexOf;
                    indexOf = str.indexOf(valueOf, i2);
                } while (indexOf != -1);
                arrayList.add(str.subSequence(i2, str.length()).toString());
                return arrayList;
            }
            List singletonList = Collections.singletonList(str.toString());
            U0.i.d("singletonList(element)", singletonList);
            return singletonList;
        }
        a1.a aVar = new a1.a(new c((Object) str, 14, (Object) new h(cArr)));
        ArrayList arrayList2 = new ArrayList(g.A0(aVar));
        Iterator it = aVar.iterator();
        while (true) {
            a aVar2 = (a) it;
            if (!aVar2.hasNext()) {
                return arrayList2;
            }
            Y0.c cVar = (Y0.c) aVar2.next();
            U0.i.e("range", cVar);
            arrayList2.add(str.subSequence(cVar.f, cVar.f784g + 1).toString());
        }
    }

    public static boolean j0(String str, String str2) {
        U0.i.e("<this>", str);
        U0.i.e("prefix", str2);
        return str.startsWith(str2);
    }

    public static String k0(String str) {
        U0.i.e("<this>", str);
        U0.i.e("missingDelimiterValue", str);
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        U0.i.d("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }
}
