package P;

import android.database.Cursor;
import android.widget.Filter;
import k.k1;

public final class d extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public c f646a;

    public final CharSequence convertResultToString(Object obj) {
        return ((k1) this.f646a).c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            P.c r0 = r4.f646a
            k.k1 r0 = (k.k1) r0
            if (r5 != 0) goto L_0x0009
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x0009:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f3504k
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L_0x0034
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            android.app.SearchableInfo r1 = r0.f3505l     // Catch:{ RuntimeException -> 0x002c }
            android.database.Cursor r5 = r0.g(r1, r5)     // Catch:{ RuntimeException -> 0x002c }
            if (r5 == 0) goto L_0x0034
            r5.getCount()     // Catch:{ RuntimeException -> 0x002c }
            goto L_0x0035
        L_0x002c:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L_0x0034:
            r5 = r3
        L_0x0035:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0045
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x004a
        L_0x0045:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.d.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f646a;
        Cursor cursor = cVar.f642c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((k1) cVar).b((Cursor) obj);
        }
    }
}
