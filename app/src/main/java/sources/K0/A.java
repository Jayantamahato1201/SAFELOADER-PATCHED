package K0;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f493a;
    public final List b = null;

    /* renamed from: c  reason: collision with root package name */
    public final int f494c;

    static {
        TimeUnit.SECONDS.toNanos(5);
    }

    public A(Uri uri, int i2) {
        this.f493a = uri;
        this.f494c = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        sb.append(this.f493a);
        List list = this.b;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    sb.append(' ');
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
