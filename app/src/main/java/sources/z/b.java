package Z;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f793a;
    public final e b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f794c;

    /* renamed from: d  reason: collision with root package name */
    public final File f795d;

    /* renamed from: e  reason: collision with root package name */
    public final String f796e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public c[] f797g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f798h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f793a = executor;
        this.b = eVar;
        this.f796e = str;
        this.f795d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 >= 24 && i2 <= 33) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = f.f811h;
                    break;
                case 26:
                    bArr = f.f810g;
                    break;
                case 27:
                    bArr = f.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f809e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = f.f808d;
                    break;
            }
        }
        this.f794c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.j();
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f793a.execute(new a(this, i2, serializable));
    }
}
