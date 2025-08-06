package K0;

import A.j;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import q.h;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f552a;
    public final z b;

    /* renamed from: c  reason: collision with root package name */
    public final j f553c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f554d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f555e = new WeakHashMap();
    public final WeakHashMap f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashSet f556g = new LinkedHashSet();

    /* renamed from: h  reason: collision with root package name */
    public final j f557h;

    /* renamed from: i  reason: collision with root package name */
    public final u f558i;

    /* renamed from: j  reason: collision with root package name */
    public final j f559j;

    /* renamed from: k  reason: collision with root package name */
    public final D f560k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f561l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f562m;

    public m(Context context, z zVar, u uVar, j jVar, j jVar2, D d2) {
        boolean z2 = false;
        HandlerThread handlerThread = new HandlerThread("Picasso-Dispatcher", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = G.f520a;
        u uVar2 = new u(looper, 1);
        uVar2.sendMessageDelayed(uVar2.obtainMessage(), 1000);
        this.f552a = context;
        this.b = zVar;
        this.f557h = new j(handlerThread.getLooper(), this, 0);
        this.f553c = jVar;
        this.f558i = uVar;
        this.f559j = jVar2;
        this.f560k = d2;
        this.f561l = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f562m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? true : z2;
        l lVar = new l(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        m mVar = (m) lVar.b;
        if (mVar.f562m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        mVar.f552a.registerReceiver(lVar, intentFilter);
    }

    public final void a(C0039f fVar) {
        Future future = fVar.f541r;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = fVar.f540q;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f561l.add(fVar);
            j jVar = this.f557h;
            if (!jVar.hasMessages(7)) {
                jVar.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    public final void b(C0039f fVar) {
        j jVar = this.f557h;
        jVar.sendMessage(jVar.obtainMessage(4, fVar));
    }

    public final void c(C0039f fVar, boolean z2) {
        fVar.f530g.getClass();
        this.f554d.remove(fVar.f534k);
        a(fVar);
    }

    public final void d(n nVar, boolean z2) {
        C0039f fVar;
        m mVar;
        n nVar2;
        boolean contains = this.f556g.contains(nVar.f566e);
        w wVar = nVar.f563a;
        if (contains) {
            this.f.put(nVar.a(), nVar);
            wVar.getClass();
            return;
        }
        LinkedHashMap linkedHashMap = this.f554d;
        String str = nVar.f565d;
        C0039f fVar2 = (C0039f) linkedHashMap.get(str);
        A a2 = nVar.b;
        if (fVar2 != null) {
            fVar2.f530g.getClass();
            if (fVar2.f538o == null) {
                fVar2.f538o = nVar;
                return;
            }
            if (fVar2.f539p == null) {
                fVar2.f539p = new ArrayList(3);
            }
            fVar2.f539p.add(nVar);
            int i2 = a2.f494c;
            if (h.b(i2) > h.b(fVar2.f546w)) {
                fVar2.f546w = i2;
                return;
            }
            return;
        }
        z zVar = this.b;
        if (zVar.isShutdown()) {
            wVar.getClass();
            return;
        }
        Object obj = C0039f.f527x;
        List list = wVar.f576a;
        int i3 = 0;
        int size = list.size();
        while (true) {
            j jVar = this.f559j;
            int i4 = i3;
            D d2 = this.f560k;
            if (i4 >= size) {
                mVar = this;
                nVar2 = nVar;
                fVar = new C0039f(wVar, mVar, jVar, d2, nVar2, C0039f.f526A);
                break;
            }
            C c2 = (C) list.get(i4);
            if (c2.a(a2)) {
                mVar = this;
                nVar2 = nVar;
                fVar = new C0039f(wVar, mVar, jVar, d2, nVar2, c2);
                break;
            }
            i3 = i4 + 1;
        }
        fVar.f541r = zVar.submit(fVar);
        linkedHashMap.put(str, fVar);
        if (z2) {
            mVar.f555e.remove(nVar2.a());
        }
        wVar.getClass();
    }
}
