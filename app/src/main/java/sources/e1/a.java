package e1;

import java.util.Locale;

public abstract class a implements Runnable {
    public final String f;

    public a(String str, Object... objArr) {
        byte[] bArr = c.f2613a;
        this.f = String.format(Locale.US, str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
