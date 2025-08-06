package M0;

import A.i;

public abstract class d extends i {
    public static boolean A0(int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (i2 == iArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            return true;
        }
        return false;
    }

    public static final void B0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        U0.i.e("<this>", objArr);
        U0.i.e("destination", objArr2);
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static int C0(Object obj, Object[] objArr) {
        U0.i.e("<this>", objArr);
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
