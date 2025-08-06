package k;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

public final class O implements ListAdapter, SpinnerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public SpinnerAdapter f3397a;
    public ListAdapter b;

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i2, view, viewGroup);
    }

    public final Object getItem(int i2) {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i2);
    }

    public final long getItemId(int i2) {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i2);
    }

    public final int getItemViewType(int i2) {
        return 0;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        return getDropDownView(i2, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled(int i2) {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i2);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f3397a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
