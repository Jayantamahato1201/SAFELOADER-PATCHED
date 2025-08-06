package j1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o1.c;
import o1.o;

public final class x extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f3300k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f3301l;

    public /* synthetic */ x(int i2, Object obj) {
        this.f3300k = i2;
        this.f3301l = obj;
    }

    public final IOException l(IOException iOException) {
        switch (this.f3300k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    public final void m() {
        switch (this.f3300k) {
            case 0:
                y yVar = (y) this.f3301l;
                if (yVar.d(6)) {
                    yVar.f3304d.r(yVar.f3303c, 6);
                    return;
                }
                return;
            default:
                Socket socket = (Socket) this.f3301l;
                try {
                    socket.close();
                    return;
                } catch (Exception e2) {
                    Logger logger = o.f3758a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + socket, e2);
                    return;
                } catch (AssertionError e3) {
                    if (e3.getCause() == null || e3.getMessage() == null || !e3.getMessage().contains("getsockname failed")) {
                        throw e3;
                    }
                    Logger logger2 = o.f3758a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + socket, e3);
                    return;
                }
        }
    }

    public void n() {
        if (k()) {
            throw l((IOException) null);
        }
    }
}
