package androidx.activity;

import F.c;
import Q0.l;
import W0.d;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.a;
import androidx.activity.result.b;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.HashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f844a = new HashMap();
    public final HashMap b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f845c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f846d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient HashMap f847e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f848g = new Bundle();

    public final boolean a(int i2, int i3, Intent intent) {
        String str = (String) this.f844a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        b bVar = (b) this.f847e.get(str);
        if (bVar != null) {
            v vVar = bVar.f876a;
            if (this.f846d.contains(str)) {
                vVar.a(bVar.b.P(i3, intent));
                this.f846d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f848g.putParcelable(str, new a(i3, intent));
        return true;
    }

    public final c b(String str, l lVar, v vVar) {
        int i2;
        HashMap hashMap;
        HashMap hashMap2 = this.b;
        if (((Integer) hashMap2.get(str)) == null) {
            W0.a aVar = d.f;
            int nextInt = d.f.a().nextInt(2147418112);
            while (true) {
                i2 = nextInt + 65536;
                hashMap = this.f844a;
                if (!hashMap.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                W0.a aVar2 = d.f;
                nextInt = d.f.a().nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i2), str);
            hashMap2.put(str, Integer.valueOf(i2));
        }
        this.f847e.put(str, new b(vVar, lVar));
        HashMap hashMap3 = this.f;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            vVar.a(obj);
        }
        Bundle bundle = this.f848g;
        a aVar3 = (a) bundle.getParcelable(str);
        if (aVar3 != null) {
            bundle.remove(str);
            vVar.a(lVar.P(aVar3.f, aVar3.f875g));
        }
        return new c(this, str, 6, false);
    }
}
