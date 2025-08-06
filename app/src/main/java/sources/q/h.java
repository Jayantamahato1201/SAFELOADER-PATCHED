package q;

public abstract /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3834a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static StringBuilder a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ int b(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i2) {
        int[] iArr = new int[i2];
        System.arraycopy(f3834a, 0, iArr, 0, i2);
        return iArr;
    }
}
