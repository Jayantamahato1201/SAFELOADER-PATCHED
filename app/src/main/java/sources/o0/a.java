package O0;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer f638a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f638a = num2;
            }
        } catch (Throwable unused) {
        }
        num = null;
        num2 = num;
        f638a = num2;
    }
}
