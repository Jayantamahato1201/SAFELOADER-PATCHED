package q1;

import L0.b;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.util.ArrayList;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* renamed from: q1.m3  reason: case insensitive filesystem */
public abstract class C0390m3 extends ContentProvider {
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (H.f3901s == 0) {
                H.f3901s = Integer.parseInt(str);
                if (bundle != null) {
                    F f = F.f3877c;
                    C0382l1 l1Var = C0382l1.f4134c;
                    T3 t3 = T3.f3994c;
                    W w2 = W.f4022c;
                    C0448w2 w2Var = C0448w2.f4230c;
                    ArrayList arrayList = C0398o.b;
                    H.k(bundle);
                    H.f3889g = bundle.getBoolean("mundo_base_bundle", false);
                }
                Context context = C0394n1.f4143a;
                context.startService(new Intent(context, MundoService$Companion$STUB.class));
            }
        } catch (Exception unused) {
        }
        C0433u uVar = C0433u.b;
        synchronized (uVar) {
            C0433u.f4203o.a();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBinder("user_handler", uVar);
        bundle2.putInt("user_pid", Process.myPid());
        bundle2.putBoolean("mundo_am_service", H.f3895m);
        return bundle2;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).delete((Uri) a2.f, str, strArr);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).getStreamTypes((Uri) a2.f, str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final String getType(Uri uri) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).getType((Uri) a2.f);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).insert((Uri) a2.f, contentValues);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean onCreate() {
        Context context = C0394n1.f4143a;
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).openFile((Uri) a2.f, str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).query((Uri) a2.f, strArr, str, strArr2, str2);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        b a2;
        String str = C0446w0.f4224a;
        if (uri == null || (a2 = C0446w0.a(uri)) == null) {
            return false;
        }
        try {
            return ((ContentProvider) a2.f586g).refresh((Uri) a2.f, bundle, cancellationSignal);
        } catch (Exception unused) {
            return false;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        b a2 = C0446w0.a(uri);
        if (a2 != null) {
            try {
                return ((ContentProvider) a2.f586g).update((Uri) a2.f, contentValues, str, strArr);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
