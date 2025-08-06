package l1;

import e1.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Method f3645c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3646d;

    public e(Method method, Method method2) {
        this.f3645c = method;
        this.f3646d = method2;
    }

    public final void e(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b = g.b(list);
            this.f3645c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to set ssl parameters", e2);
        }
    }

    public final String h(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f3646d.invoke(sSLSocket, (Object[]) null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to get selected protocols", e2);
        }
    }
}
