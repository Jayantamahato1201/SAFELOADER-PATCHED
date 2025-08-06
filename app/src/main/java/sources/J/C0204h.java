package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.cheatbox.R;
import java.util.ArrayList;

/* renamed from: j.h  reason: case insensitive filesystem */
public final class C0204h extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public int f3094a = -1;
    public final /* synthetic */ C0205i b;

    public C0204h(C0205i iVar) {
        this.b = iVar;
        a();
    }

    public final void a() {
        C0209m mVar = this.b.f3096c;
        C0211o oVar = mVar.f3123v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f3111j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0211o) arrayList.get(i2)) == oVar) {
                    this.f3094a = i2;
                    return;
                }
            }
        }
        this.f3094a = -1;
    }

    /* renamed from: b */
    public final C0211o getItem(int i2) {
        C0205i iVar = this.b;
        C0209m mVar = iVar.f3096c;
        mVar.i();
        ArrayList arrayList = mVar.f3111j;
        iVar.getClass();
        int i3 = this.f3094a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0211o) arrayList.get(i2);
    }

    public final int getCount() {
        C0205i iVar = this.b;
        C0209m mVar = iVar.f3096c;
        mVar.i();
        int size = mVar.f3111j.size();
        iVar.getClass();
        if (this.f3094a < 0) {
            return size;
        }
        return size - 1;
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.MT_Bin, viewGroup, false);
        }
        ((C0191A) view).d(getItem(i2));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
