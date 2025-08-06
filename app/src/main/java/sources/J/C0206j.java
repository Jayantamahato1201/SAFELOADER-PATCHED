package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: j.j  reason: case insensitive filesystem */
public final class C0206j extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final C0209m f3099a;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3100c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3101d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f3102e;
    public final int f;

    public C0206j(C0209m mVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f3101d = z2;
        this.f3102e = layoutInflater;
        this.f3099a = mVar;
        this.f = i2;
        a();
    }

    public final void a() {
        C0209m mVar = this.f3099a;
        C0211o oVar = mVar.f3123v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f3111j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0211o) arrayList.get(i2)) == oVar) {
                    this.b = i2;
                    return;
                }
            }
        }
        this.b = -1;
    }

    /* renamed from: b */
    public final C0211o getItem(int i2) {
        ArrayList arrayList;
        C0209m mVar = this.f3099a;
        if (this.f3101d) {
            mVar.i();
            arrayList = mVar.f3111j;
        } else {
            arrayList = mVar.l();
        }
        int i3 = this.b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0211o) arrayList.get(i2);
    }

    public final int getCount() {
        ArrayList arrayList;
        C0209m mVar = this.f3099a;
        if (this.f3101d) {
            mVar.i();
            arrayList = mVar.f3111j;
        } else {
            arrayList = mVar.l();
        }
        if (this.b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        boolean z2 = false;
        if (view == null) {
            view = this.f3102e.inflate(this.f, viewGroup, false);
        }
        int i4 = getItem(i2).b;
        int i5 = i2 - 1;
        if (i5 >= 0) {
            i3 = getItem(i5).b;
        } else {
            i3 = i4;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3099a.m() && i4 != i3) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        C0191A a2 = (C0191A) view;
        if (this.f3100c) {
            listMenuItemView.setForceShowIcon(true);
        }
        a2.d(getItem(i2));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
