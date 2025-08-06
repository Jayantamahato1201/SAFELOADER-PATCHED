package n;

/* renamed from: n.d  reason: case insensitive filesystem */
public abstract class C0291d {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3684a = new int[0];
    public static final Object[] b = new Object[0];

    public static int a(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static int b(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
            if (i6 < 0) {
                i4 = i5 + 1;
            } else if (i6 <= 0) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
