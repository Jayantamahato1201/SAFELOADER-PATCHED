package top.bienvenido.mundo.supervisor;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import i0.l;
import q1.C0330c3;
import q1.C0339e0;
import q1.C0364i1;
import q1.C0382l1;
import q1.C0394n1;
import q1.C0395n2;
import q1.C0448w2;
import q1.F;
import q1.K2;
import q1.T3;
import q1.W;
import q1.Z;

public final class MundoSupervisorProvider extends ContentProvider {
    public final Bundle call(String str, String str2, Bundle bundle) {
        C0364i1.f4115a.getClass();
        return C0364i1.b;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final /* bridge */ /* synthetic */ String getType(Uri uri) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = C0394n1.f4143a;
        new Thread(new l(12)).start();
        F.f3877c.f4148a = C0339e0.b;
        C0382l1.f4134c.f4148a = K2.b;
        W.f4022c.f4148a = Z.b;
        T3.f3994c.f4148a = C0330c3.b;
        C0448w2.f4230c.f4148a = C0395n2.b;
        return true;
    }

    public final /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
