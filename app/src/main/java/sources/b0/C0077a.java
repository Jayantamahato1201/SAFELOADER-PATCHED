package b0;

/* renamed from: b0.a  reason: case insensitive filesystem */
public final class C0077a {

    /* renamed from: a  reason: collision with root package name */
    public int f1646a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1647c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0077a.class != obj.getClass()) {
                return false;
            }
            C0077a aVar = (C0077a) obj;
            int i2 = this.f1646a;
            if (i2 != aVar.f1646a) {
                return false;
            }
            if (!(i2 == 8 && Math.abs(this.f1647c - this.b) == 1 && this.f1647c == aVar.b && this.b == aVar.f1647c)) {
                if (this.f1647c == aVar.f1647c && this.b == aVar.b) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1646a * 31) + this.b) * 31) + this.f1647c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f1646a;
        if (i2 == 1) {
            str = "add";
        } else if (i2 == 2) {
            str = "rm";
        } else if (i2 == 4) {
            str = "up";
        } else if (i2 != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.f1647c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
