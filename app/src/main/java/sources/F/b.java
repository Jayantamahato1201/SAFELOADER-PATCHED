package F;

import A.i;
import A.j;
import android.util.Log;
import androidx.emoji2.text.h;
import androidx.recyclerview.widget.RecyclerView;
import b0.J;
import com.google.android.material.datepicker.l;
import java.util.ArrayList;
import java.util.List;
import z.C0503b;

public final class b implements Runnable {
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f191g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f192h;

    public /* synthetic */ b(Object obj, int i2, int i3) {
        this.f = i3;
        this.f192h = obj;
        this.f191g = i2;
    }

    public final void run() {
        switch (this.f) {
            case 0:
                C0503b bVar = (C0503b) ((j) this.f192h).b;
                if (bVar != null) {
                    bVar.h(this.f191g);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f192h;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f191g != 1) {
                    while (i2 < size) {
                        ((h) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    return;
                }
                while (i2 < size) {
                    ((h) arrayList.get(i2)).a();
                    i2++;
                }
                return;
            default:
                RecyclerView recyclerView = ((l) this.f192h).f1974Y;
                if (!recyclerView.f1539u) {
                    J j2 = recyclerView.f1524l;
                    if (j2 == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        j2.x0(recyclerView, this.f191g);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public b(List list, int i2, Throwable th) {
        this.f = 1;
        i.k("initCallbacks cannot be null", list);
        this.f192h = new ArrayList(list);
        this.f191g = i2;
    }
}
