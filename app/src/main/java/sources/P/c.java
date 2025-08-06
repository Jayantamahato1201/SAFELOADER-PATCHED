package P;

import A.g;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.k1;

public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f641a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f642c;

    /* renamed from: d  reason: collision with root package name */
    public int f643d;

    /* renamed from: e  reason: collision with root package name */
    public a f644e;
    public b f;

    /* renamed from: g  reason: collision with root package name */
    public d f645g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f642c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f644e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f642c = cursor;
            if (cursor != null) {
                a aVar2 = this.f644e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f643d = cursor.getColumnIndexOrThrow("_id");
                this.f641a = true;
                notifyDataSetChanged();
            } else {
                this.f643d = -1;
                this.f641a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f641a || (cursor = this.f642c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f641a) {
            return null;
        }
        this.f642c.moveToPosition(i2);
        if (view == null) {
            k1 k1Var = (k1) this;
            view = k1Var.f3503j.inflate(k1Var.f3502i, viewGroup, false);
        }
        a(view, this.f642c);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [P.d, android.widget.Filter] */
    public final Filter getFilter() {
        if (this.f645g == null) {
            ? filter = new Filter();
            filter.f646a = this;
            this.f645g = filter;
        }
        return this.f645g;
    }

    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f641a || (cursor = this.f642c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f642c;
    }

    public final long getItemId(int i2) {
        Cursor cursor;
        if (!this.f641a || (cursor = this.f642c) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f642c.getLong(this.f643d);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f641a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f642c.moveToPosition(i2)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.f642c);
            return view;
        } else {
            throw new IllegalStateException(g.f(i2, "couldn't move cursor to position "));
        }
    }
}
