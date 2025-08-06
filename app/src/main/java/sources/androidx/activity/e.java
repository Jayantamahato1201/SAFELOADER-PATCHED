package androidx.activity;

import android.os.Bundle;
import c0.C0105c;
import e.C0137h;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class e implements C0105c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0137h f842a;

    public /* synthetic */ e(C0137h hVar) {
        this.f842a = hVar;
    }

    public final Bundle a() {
        C0137h hVar = this.f842a;
        Bundle bundle = new Bundle();
        g gVar = hVar.f859j;
        gVar.getClass();
        HashMap hashMap = gVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(gVar.f846d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.f848g.clone());
        return bundle;
    }
}
