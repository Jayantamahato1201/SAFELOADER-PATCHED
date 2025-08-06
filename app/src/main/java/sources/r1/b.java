package r1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import q1.K2;
import top.bienvenido.mundo.manifest.MundoIntermediary;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4435a;
    public final /* synthetic */ MundoIntermediary b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f4436c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L0.b f4437d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Intent f4438e;

    public /* synthetic */ b(ArrayList arrayList, MundoIntermediary mundoIntermediary, Intent intent, L0.b bVar, Intent intent2) {
        this.f4435a = arrayList;
        this.b = mundoIntermediary;
        this.f4436c = intent;
        this.f4437d = bVar;
        this.f4438e = intent2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        ArrayList arrayList = this.f4435a;
        MundoIntermediary mundoIntermediary = this.b;
        Intent intent = this.f4436c;
        L0.b bVar = this.f4437d;
        Intent intent2 = this.f4438e;
        int i3 = MundoIntermediary.f4722a;
        try {
            ActivityInfo activityInfo = (ActivityInfo) arrayList.get(i2);
            if (K2.b.B0(activityInfo.packageName)) {
                str = (String) bVar.f586g;
            } else {
                str = null;
            }
            mundoIntermediary.a(intent, str, activityInfo, intent2);
        } catch (Exception unused) {
            mundoIntermediary.finish();
        }
    }
}
