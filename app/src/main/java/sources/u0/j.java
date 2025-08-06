package U0;

import java.io.Serializable;

public abstract class j implements Serializable {
    public final String toString() {
        m.f774a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d("renderLambdaToString(this)", obj);
        return obj;
    }
}
