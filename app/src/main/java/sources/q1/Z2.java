package q1;

import android.accounts.Account;
import java.util.Objects;

public final class Z2 {

    /* renamed from: a  reason: collision with root package name */
    public final Account f4044a;
    public final String b;

    public Z2(Account account, String str) {
        this.f4044a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z2) {
            Z2 z2 = (Z2) obj;
            if (!Objects.equals(this.f4044a, z2.f4044a) || !Objects.equals(this.b, z2.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4044a.hashCode() ^ this.b.hashCode();
    }
}
