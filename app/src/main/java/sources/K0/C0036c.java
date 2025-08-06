package K0;

import e1.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* renamed from: K0.c  reason: case insensitive filesystem */
public final class C0036c extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f525a;

    public /* synthetic */ C0036c(int i2) {
        this.f525a = i2;
    }

    public final Object initialValue() {
        switch (this.f525a) {
            case 0:
                return new StringBuilder("Picasso-");
            case 1:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(c.f2616e);
                return simpleDateFormat;
        }
    }
}
