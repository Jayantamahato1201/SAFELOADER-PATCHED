package H0;

import A.j;
import I.C0012d;
import I.O;
import N.h;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import k.C0271v;

public final /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f299a;

    public /* synthetic */ l(Object obj) {
        this.f299a = obj;
    }

    public boolean a(j jVar, int i2, Bundle bundle) {
        j jVar2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 25 && (i2 & 1) != 0) {
            try {
                ((h) jVar.b).a();
                Parcelable parcelable = (Parcelable) ((h) jVar.b).d();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipDescription c2 = ((h) jVar.b).c();
        h hVar = (h) jVar.b;
        ClipData clipData = new ClipData(c2, new ClipData.Item(hVar.e()));
        if (i3 >= 31) {
            jVar2 = new j(clipData, 2);
        } else {
            C0012d dVar = new C0012d();
            dVar.b = clipData;
            dVar.f413c = 2;
            jVar2 = dVar;
        }
        jVar2.n(hVar.b());
        jVar2.m(bundle);
        if (O.l((C0271v) this.f299a, jVar2.g()) == null) {
            return true;
        }
        return false;
    }
}
