package k;

import P.a;
import P.b;
import P.c;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.cheatbox.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public final class k1 extends c implements View.OnClickListener {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f3500x = 0;

    /* renamed from: h  reason: collision with root package name */
    public final int f3501h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3502i;

    /* renamed from: j  reason: collision with root package name */
    public final LayoutInflater f3503j;

    /* renamed from: k  reason: collision with root package name */
    public final SearchView f3504k;

    /* renamed from: l  reason: collision with root package name */
    public final SearchableInfo f3505l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f3506m;

    /* renamed from: n  reason: collision with root package name */
    public final WeakHashMap f3507n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3508o;

    /* renamed from: p  reason: collision with root package name */
    public int f3509p = 1;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f3510q;

    /* renamed from: r  reason: collision with root package name */
    public int f3511r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f3512s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f3513t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f3514u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f3515v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f3516w = -1;

    public k1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.b = true;
        this.f642c = null;
        this.f641a = false;
        this.f643d = -1;
        this.f644e = new a(this);
        this.f = new b(0, this);
        this.f3502i = suggestionRowLayout;
        this.f3501h = suggestionRowLayout;
        this.f3503j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f3504k = searchView;
        this.f3505l = searchableInfo;
        this.f3508o = searchView.getSuggestionCommitIconResId();
        this.f3506m = context;
        this.f3507n = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            java.lang.Object r0 = r21.getTag()
            r3 = r0
            k.j1 r3 = (k.j1) r3
            int r0 = r1.f3516w
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r7 = r3.f3496a
            r8 = 8
            if (r7 == 0) goto L_0x0034
            int r0 = r1.f3511r
            java.lang.String r0 = h(r2, r0)
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0031
            r7.setVisibility(r8)
            goto L_0x0034
        L_0x0031:
            r7.setVisibility(r4)
        L_0x0034:
            r9 = 1
            r10 = 2
            android.content.Context r11 = r1.f3506m
            android.widget.TextView r0 = r3.b
            if (r0 == 0) goto L_0x00af
            int r12 = r1.f3513t
            java.lang.String r12 = h(r2, r12)
            if (r12 == 0) goto L_0x0082
            android.content.res.ColorStateList r13 = r1.f3510q
            if (r13 != 0) goto L_0x0063
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            android.content.res.Resources$Theme r14 = r11.getTheme()
            r15 = 2130904081(0x7f030411, float:1.7414998E38)
            r14.resolveAttribute(r15, r13, r9)
            android.content.res.Resources r14 = r11.getResources()
            int r13 = r13.resourceId
            android.content.res.ColorStateList r13 = r14.getColorStateList(r13)
            r1.f3510q = r13
        L_0x0063:
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r12)
            android.text.style.TextAppearanceSpan r14 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r15 = r1.f3510q
            r18 = r15
            r15 = 0
            r19 = 0
            r16 = 0
            r17 = 0
            r14.<init>(r15, r16, r17, r18, r19)
            int r12 = r12.length()
            r15 = 33
            r13.setSpan(r14, r4, r12, r15)
            goto L_0x0088
        L_0x0082:
            int r12 = r1.f3512s
            java.lang.String r13 = h(r2, r12)
        L_0x0088:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 == 0) goto L_0x0097
            if (r7 == 0) goto L_0x009f
            r7.setSingleLine(r4)
            r7.setMaxLines(r10)
            goto L_0x009f
        L_0x0097:
            if (r7 == 0) goto L_0x009f
            r7.setSingleLine(r9)
            r7.setMaxLines(r9)
        L_0x009f:
            r0.setText(r13)
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 == 0) goto L_0x00ac
            r0.setVisibility(r8)
            goto L_0x00af
        L_0x00ac:
            r0.setVisibility(r4)
        L_0x00af:
            android.widget.ImageView r13 = r3.f3497c
            if (r13 == 0) goto L_0x015e
            int r0 = r1.f3514u
            if (r0 != r5) goto L_0x00ba
            r0 = 0
            goto L_0x014a
        L_0x00ba:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00c6
            goto L_0x014a
        L_0x00c6:
            android.app.SearchableInfo r0 = r1.f3505l
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r14 = r0.flattenToShortString()
            java.util.WeakHashMap r15 = r1.f3507n
            boolean r16 = r15.containsKey(r14)
            if (r16 == 0) goto L_0x00eb
            java.lang.Object r0 = r15.get(r14)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00e2
            r0 = 0
            goto L_0x013f
        L_0x00e2:
            android.content.res.Resources r14 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r14)
            goto L_0x013f
        L_0x00eb:
            java.lang.String r12 = "SuggestionsAdapter"
            android.content.pm.PackageManager r10 = r11.getPackageManager()
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r8 = r10.getActivityInfo(r0, r8)     // Catch:{ NameNotFoundException -> 0x012b }
            int r5 = r8.getIconResource()
            if (r5 != 0) goto L_0x00ff
        L_0x00fd:
            r0 = 0
            goto L_0x0134
        L_0x00ff:
            java.lang.String r9 = r0.getPackageName()
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            android.graphics.drawable.Drawable r8 = r10.getDrawable(r9, r5, r8)
            if (r8 != 0) goto L_0x0129
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Invalid icon resource "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = " for "
            r8.append(r5)
            java.lang.String r0 = r0.flattenToShortString()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.w(r12, r0)
            goto L_0x00fd
        L_0x0129:
            r0 = r8
            goto L_0x0134
        L_0x012b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            goto L_0x00fd
        L_0x0134:
            if (r0 != 0) goto L_0x0138
            r5 = 0
            goto L_0x013c
        L_0x0138:
            android.graphics.drawable.Drawable$ConstantState r5 = r0.getConstantState()
        L_0x013c:
            r15.put(r14, r5)
        L_0x013f:
            if (r0 == 0) goto L_0x0142
            goto L_0x014a
        L_0x0142:
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x014a:
            r13.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0154
            r0 = 4
            r13.setVisibility(r0)
            goto L_0x015e
        L_0x0154:
            r13.setVisibility(r4)
            r0.setVisible(r4, r4)
            r5 = 1
            r0.setVisible(r5, r4)
        L_0x015e:
            android.widget.ImageView r0 = r3.f3498d
            if (r0 == 0) goto L_0x0187
            int r5 = r1.f3515v
            r8 = -1
            if (r5 != r8) goto L_0x0169
            r12 = 0
            goto L_0x0171
        L_0x0169:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r12 = r1.f(r2)
        L_0x0171:
            r0.setImageDrawable(r12)
            if (r12 != 0) goto L_0x017c
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0187
        L_0x017c:
            r0.setVisibility(r4)
            r12.setVisible(r4, r4)
            r5 = 1
            r12.setVisible(r5, r4)
            goto L_0x0188
        L_0x0187:
            r5 = 1
        L_0x0188:
            int r0 = r1.f3509p
            android.widget.ImageView r2 = r3.f3499e
            r3 = 2
            if (r0 == r3) goto L_0x019c
            if (r0 != r5) goto L_0x0196
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0196
            goto L_0x019c
        L_0x0196:
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x01a9
        L_0x019c:
            r2.setVisibility(r4)
            java.lang.CharSequence r0 = r7.getText()
            r2.setTag(r0)
            r2.setOnClickListener(r1)
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.k1.a(android.view.View, android.database.Cursor):void");
    }

    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f3511r = cursor.getColumnIndex("suggest_text_1");
                this.f3512s = cursor.getColumnIndex("suggest_text_2");
                this.f3513t = cursor.getColumnIndex("suggest_text_2_url");
                this.f3514u = cursor.getColumnIndex("suggest_icon_1");
                this.f3515v = cursor.getColumnIndex("suggest_icon_2");
                this.f3516w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    public final String c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        SearchableInfo searchableInfo = this.f3505l;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    public final View d(ViewGroup viewGroup) {
        View inflate = this.f3503j.inflate(this.f3501h, viewGroup, false);
        inflate.setTag(new j1(inflate));
        ((ImageView) inflate.findViewById(R.id.MT_Bin)).setImageResource(this.f3508o);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3506m.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            r10 = this;
            java.util.WeakHashMap r0 = r10.f3507n
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r2 = r10.f3506m
            java.lang.String r3 = "android.resource://"
            r4 = 0
            if (r11 == 0) goto L_0x0115
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0115
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x001b
            goto L_0x0115
        L_0x001b:
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r6.<init>(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r6.append(r5)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.String r3 = r6.toString()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            if (r6 != 0) goto L_0x0041
            r6 = r4
            goto L_0x0045
        L_0x0041:
            android.graphics.drawable.Drawable r6 = r6.newDrawable()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            return r6
        L_0x0048:
            android.graphics.drawable.Drawable r5 = y.C0498a.b(r2, r5)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            if (r5 == 0) goto L_0x0055
            android.graphics.drawable.Drawable$ConstantState r6 = r5.getConstantState()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r0.put(r3, r6)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
        L_0x0055:
            return r5
        L_0x0056:
            goto L_0x0062
        L_0x0058:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r11 = r0.concat(r11)
            android.util.Log.w(r1, r11)
            return r4
        L_0x0062:
            java.lang.Object r3 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L_0x006c
            r3 = r4
            goto L_0x0070
        L_0x006c:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()
        L_0x0070:
            if (r3 == 0) goto L_0x0073
            return r3
        L_0x0073:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r3.getScheme()     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch:{ FileNotFoundException -> 0x008f }
            if (r8 == 0) goto L_0x00a3
            android.graphics.drawable.Drawable r4 = r10.e(r3)     // Catch:{ NotFoundException -> 0x0091 }
            goto L_0x010c
        L_0x008f:
            r2 = move-exception
            goto L_0x00ef
        L_0x0091:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x008f }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            throw r2     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00a3:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x008f }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            if (r2 == 0) goto L_0x00dd
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r2, r4)     // Catch:{ all -> 0x00c7 }
            r2.close()     // Catch:{ IOException -> 0x00b6 }
        L_0x00b4:
            r4 = r6
            goto L_0x010c
        L_0x00b6:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x008f }
            goto L_0x00b4
        L_0x00c7:
            r6 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00dc
        L_0x00cc:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00dc:
            throw r6     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00dd:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x008f }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            throw r2     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00ef:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Icon not found: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r1, r2)
        L_0x010c:
            if (r4 == 0) goto L_0x0115
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            r0.put(r11, r1)
        L_0x0115:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.k1.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f3506m.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f3503j.inflate(this.f3502i, viewGroup, false);
            if (inflate != null) {
                ((j1) inflate.getTag()).f3496a.setText(e2.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(viewGroup);
            ((j1) d2.getTag()).f3496a.setText(e2.toString());
            return d2;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f642c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f642c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3504k.r((CharSequence) tag);
        }
    }
}
