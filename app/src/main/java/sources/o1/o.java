package o1;

import j1.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3758a = Logger.getLogger(o.class.getName());

    public static a a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            x xVar = new x(1, socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(xVar, new a((x) xVar, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static b b(File file) {
        if (file != null) {
            return c(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, o1.x] */
    public static b c(InputStream inputStream) {
        ? obj = new Object();
        if (inputStream != null) {
            return new b((x) obj, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static b d(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            x xVar = new x(1, socket);
            InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return new b(xVar, new b((x) xVar, inputStream));
            }
            throw new IllegalArgumentException("in == null");
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
