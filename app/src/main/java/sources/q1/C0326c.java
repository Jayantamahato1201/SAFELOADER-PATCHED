package q1;

import L0.e;
import T0.l;
import U0.i;
import U0.o;
import V0.a;
import android.os.IBinder;
import java.io.File;
import java.nio.file.Files;
import java.util.Map;

/* renamed from: q1.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0326c implements l {
    public final /* synthetic */ int f;

    public /* synthetic */ C0326c(int i2) {
        this.f = i2;
    }

    public final Object e(Object obj) {
        String str;
        boolean z2;
        boolean z3;
        switch (this.f) {
            case 0:
                Class<o> cls = o.class;
                if (obj instanceof a) {
                    if (obj == null) {
                        str = "null";
                    } else {
                        str = obj.getClass().getName();
                    }
                    ClassCastException classCastException = new ClassCastException(str.concat(" cannot be cast to kotlin.collections.MutableMap"));
                    i.f(classCastException, cls.getName());
                    throw classCastException;
                }
                try {
                    ((Map) obj).clear();
                    return e.f591c;
                } catch (ClassCastException e2) {
                    i.f(e2, cls.getName());
                    throw e2;
                }
            case 1:
                C0339e0.g1((IBinder) obj);
                return e.f591c;
            case 2:
                C0339e0.S0((IBinder) obj);
                return e.f591c;
            case 3:
                C0339e0.e1((IBinder) obj);
                return e.f591c;
            case 4:
                C0339e0.U0((IBinder) obj);
                return e.f591c;
            case 5:
                return Integer.valueOf(C0339e0.f1((IBinder) obj));
            case 6:
                return Integer.valueOf(C0339e0.T0((IBinder) obj));
            case 7:
                return Integer.valueOf(C0339e0.i1((IBinder) obj));
            case 8:
                return C0388m1.a((O) obj);
            case 9:
                return C0388m1.e((O) obj);
            case 10:
                File file = (File) obj;
                if (Files.isSymbolicLink(file.toPath())) {
                    z2 = file.delete();
                } else {
                    z2 = S1.a(file);
                }
                return Boolean.valueOf(z2);
            case 11:
                File file2 = (File) obj;
                if (i.a(file2.getCanonicalPath(), file2.getAbsolutePath())) {
                    z3 = S1.a(file2);
                } else if (file2.delete() || S1.a(file2.getCanonicalFile())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 12:
                return ((K3) obj).P0();
            default:
                return ((K3) obj).G();
        }
    }
}
