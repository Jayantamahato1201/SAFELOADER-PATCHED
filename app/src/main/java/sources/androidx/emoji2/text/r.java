package androidx.emoji2.text;

import A.i;
import C.a;
import H.b;
import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import i.C0176a;
import i.C0181f;
import j.C0193C;
import j.C0209m;
import j.C0216t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import n.C0292e;
import n.k;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Object f1183a;
    public Object b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1184c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1185d;

    public r(int i2) {
        switch (i2) {
            case 4:
                this.f1183a = new b(10);
                this.b = new k();
                this.f1184c = new ArrayList();
                this.f1185d = new HashSet();
                return;
            default:
                this.f1183a = new k();
                this.b = new SparseArray();
                this.f1184c = new C0292e();
                this.f1185d = new k();
                return;
        }
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((k) this.b).getOrDefault(obj, (Object) null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public C0181f b(C0176a aVar) {
        ArrayList arrayList = (ArrayList) this.f1184c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0181f fVar = (C0181f) arrayList.get(i2);
            if (fVar != null && fVar.b == aVar) {
                return fVar;
            }
        }
        C0181f fVar2 = new C0181f((Context) this.b, aVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    public boolean c(C0176a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1183a).onActionItemClicked(b(aVar), new C0216t((Context) this.b, (a) menuItem));
    }

    public boolean d(C0176a aVar, C0209m mVar) {
        C0181f b2 = b(aVar);
        k kVar = (k) this.f1185d;
        Menu menu = (Menu) kVar.getOrDefault(mVar, (Object) null);
        if (menu == null) {
            menu = new C0193C((Context) this.b, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f1183a).onCreateActionMode(b2, menu);
    }

    public r(Typeface typeface, S.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f1185d = typeface;
        this.f1183a = bVar;
        this.f1184c = new q(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + bVar.f384a;
            i2 = ((ByteBuffer) bVar.f386d).getInt(((ByteBuffer) bVar.f386d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.b = new char[(i2 * 2)];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i7 = a3 + bVar.f384a;
            i3 = ((ByteBuffer) bVar.f386d).getInt(((ByteBuffer) bVar.f386d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            m mVar = new m(this, i8);
            S.a b2 = mVar.b();
            int a4 = b2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) b2.f386d).getInt(a4 + b2.f384a) : 0, (char[]) this.b, i8 * 2);
            S.a b3 = mVar.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.f384a;
                i4 = ((ByteBuffer) b3.f386d).getInt(((ByteBuffer) b3.f386d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            i.i("invalid metadata codepoint length", i4 > 0);
            S.a b4 = mVar.b();
            int a6 = b4.a(16);
            if (a6 != 0) {
                int i10 = a6 + b4.f384a;
                i5 = ((ByteBuffer) b4.f386d).getInt(((ByteBuffer) b4.f386d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            ((q) this.f1184c).a(mVar, 0, i5 - 1);
        }
    }
}
