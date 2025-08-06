package b1;

import L0.b;
import T0.p;
import U0.i;
import U0.j;
import Y0.a;
import java.util.NoSuchElementException;

public final class h extends j implements p {
    public final /* synthetic */ char[] f;

    public h(char[] cArr) {
        this.f = cArr;
    }

    public final Object d(Object obj, Object obj2) {
        int i2;
        int i3;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        i.e("$this$$receiver", charSequence);
        char[] cArr = this.f;
        i.e("<this>", charSequence);
        boolean z2 = true;
        if (cArr.length != 1 || !(charSequence instanceof String)) {
            if (intValue < 0) {
                intValue = 0;
            }
            int i4 = new a(intValue, charSequence.length() - 1, 1).f784g;
            if (intValue > i4) {
                z2 = false;
            }
            if (!z2) {
                intValue = i4;
            }
            loop0:
            while (true) {
                if (!z2) {
                    i2 = -1;
                    break;
                }
                if (intValue != i4) {
                    i3 = intValue + 1;
                } else if (z2) {
                    i3 = intValue;
                    z2 = false;
                } else {
                    throw new NoSuchElementException();
                }
                char charAt = charSequence.charAt(intValue);
                for (char c2 : cArr) {
                    if (c2 == charAt) {
                        i2 = intValue;
                        break loop0;
                    }
                }
                intValue = i3;
            }
        } else {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                i2 = ((String) charSequence).indexOf(cArr[0], intValue);
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
        if (i2 < 0) {
            return null;
        }
        return new b(Integer.valueOf(i2), 1);
    }
}
