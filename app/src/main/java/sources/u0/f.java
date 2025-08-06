package U0;

import T0.a;
import T0.c;
import T0.d;
import T0.e;
import T0.g;
import T0.h;
import T0.i;
import T0.j;
import T0.k;
import T0.l;
import T0.m;
import T0.n;
import T0.o;
import T0.p;
import T0.q;
import T0.r;
import T0.s;
import T0.t;
import T0.u;
import T0.v;
import T0.w;
import Z0.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class f implements b, e {
    public static final Map b;

    /* renamed from: a  reason: collision with root package name */
    public final Class f768a;

    static {
        int i2 = 0;
        List asList = Arrays.asList(new Class[]{a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, T0.b.class, c.class, d.class, e.class, T0.f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class});
        i.d("asList(this)", asList);
        ArrayList arrayList = new ArrayList(M0.g.A0(asList));
        for (Object next : asList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new L0.b((Class) next, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        b = M0.p.B0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d("primitiveFqNames.values", values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.d("kotlinName", str);
            sb.append(b1.i.k0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(M0.p.A0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), b1.i.k0((String) entry2.getValue()));
        }
    }

    public f(Class cls) {
        this.f768a = cls;
    }

    public final Class a() {
        return this.f768a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f) || !Q0.l.x(this).equals(Q0.l.x((b) obj))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Q0.l.x(this).hashCode();
    }

    public final String toString() {
        return this.f768a.toString() + " (Kotlin reflection is not available)";
    }
}
