package d1;

import java.io.IOException;

public enum A {
    f2221g("http/1.0"),
    f2222h("http/1.1"),
    f2223i("spdy/3.1"),
    f2224j("h2"),
    f2225k("quic");
    
    public final String f;

    /* access modifiers changed from: public */
    A(String str) {
        this.f = str;
    }

    public static A a(String str) {
        if (str.equals("http/1.0")) {
            return f2221g;
        }
        if (str.equals("http/1.1")) {
            return f2222h;
        }
        if (str.equals("h2")) {
            return f2224j;
        }
        if (str.equals("spdy/3.1")) {
            return f2223i;
        }
        if (str.equals("quic")) {
            return f2225k;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public final String toString() {
        return this.f;
    }
}
