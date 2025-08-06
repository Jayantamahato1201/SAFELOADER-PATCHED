package d1;

public enum K {
    f2266g("TLSv1.3"),
    f2267h("TLSv1.2"),
    f2268i("TLSv1.1"),
    f2269j("TLSv1"),
    f2270k("SSLv3");
    
    public final String f;

    /* access modifiers changed from: public */
    K(String str) {
        this.f = str;
    }

    public static K a(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c2 = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c2 = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c2 = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c2 = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return f2268i;
            case 1:
                return f2267h;
            case 2:
                return f2266g;
            case 3:
                return f2270k;
            case 4:
                return f2269j;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }
}
