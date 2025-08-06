package j;

import F.l;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import e.C0133d;
import e.C0136g;

/* renamed from: j.i  reason: case insensitive filesystem */
public final class C0205i implements z, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f3095a;
    public LayoutInflater b;

    /* renamed from: c  reason: collision with root package name */
    public C0209m f3096c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f3097d;

    /* renamed from: e  reason: collision with root package name */
    public y f3098e;
    public C0204h f;

    public C0205i(ContextWrapper contextWrapper) {
        this.f3095a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    public final void a(C0209m mVar, boolean z2) {
        y yVar = this.f3098e;
        if (yVar != null) {
            yVar.a(mVar, z2);
        }
    }

    public final void c(Context context, C0209m mVar) {
        if (this.f3095a != null) {
            this.f3095a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.f3096c = mVar;
        C0204h hVar = this.f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(C0211o oVar) {
        return false;
    }

    public final void g() {
        C0204h hVar = this.f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public final boolean h(C0211o oVar) {
        return false;
    }

    public final void i(y yVar) {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, j.y, java.lang.Object, j.n, android.content.DialogInterface$OnDismissListener] */
    public final boolean k(C0196F f2) {
        if (!f2.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.f3126a = f2;
        Context context = f2.f3104a;
        l lVar = new l(context);
        C0133d dVar = (C0133d) lVar.b;
        C0205i iVar = new C0205i(dVar.f2478a);
        obj.f3127c = iVar;
        iVar.f3098e = obj;
        f2.b(iVar, context);
        C0205i iVar2 = obj.f3127c;
        if (iVar2.f == null) {
            iVar2.f = new C0204h(iVar2);
        }
        dVar.f2485j = iVar2.f;
        dVar.f2486k = obj;
        View view = f2.f3116o;
        if (view != null) {
            dVar.f2481e = view;
        } else {
            dVar.f2479c = f2.f3115n;
            dVar.f2480d = f2.f3114m;
        }
        dVar.f2484i = obj;
        C0136g b2 = lVar.b();
        obj.b = b2;
        b2.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        y yVar = this.f3098e;
        if (yVar == null) {
            return true;
        }
        yVar.b(f2);
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f3096c.q(this.f.getItem(i2), this, 0);
    }
}
