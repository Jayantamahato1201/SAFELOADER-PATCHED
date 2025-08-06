package G;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f233e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f234a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public int f235c;

    /* renamed from: d  reason: collision with root package name */
    public char f236d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f233e[i2] = Character.getDirectionality(i2);
        }
    }

    public a(CharSequence charSequence) {
        this.f234a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f234a;
        char charAt = charSequence.charAt(this.f235c - 1);
        this.f236d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f235c);
            this.f235c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f235c--;
        char c2 = this.f236d;
        if (c2 < 1792) {
            return f233e[c2];
        }
        return Character.getDirectionality(c2);
    }
}
