package d0;

import Q0.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.cheatbox.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: d0.a  reason: case insensitive filesystem */
public final class C0107a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile C0107a f2217d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2218e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2219a = new HashMap();
    public final HashSet b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f2220c;

    public C0107a(Context context) {
        this.f2220c = context.getApplicationContext();
    }

    public static C0107a c(Context context) {
        if (f2217d == null) {
            synchronized (f2218e) {
                try {
                    if (f2217d == null) {
                        f2217d = new C0107a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2217d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2220c.getString(R.string.MT_Bin);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (l.C()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f2219a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f2220c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
