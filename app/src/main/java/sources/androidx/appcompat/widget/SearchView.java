package androidx.appcompat.widget;

import H0.x;
import I.O;
import N.g;
import P.c;
import Q.b;
import Q0.l;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.cheatbox.R;
import d.a;
import i.C0177b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.C0228a1;
import k.C0231b1;
import k.C0234c1;
import k.C0237d1;
import k.C0256n;
import k.E0;
import k.F0;
import k.Y0;
import k.Z0;
import k.e1;
import k.f1;
import k.g1;
import k.h1;
import k.i1;
import k.k1;

public class SearchView extends E0 implements C0177b {

    /* renamed from: g0  reason: collision with root package name */
    public static final g1 f983g0;

    /* renamed from: A  reason: collision with root package name */
    public final Rect f984A;

    /* renamed from: B  reason: collision with root package name */
    public final int[] f985B;

    /* renamed from: C  reason: collision with root package name */
    public final int[] f986C;
    public final ImageView D;

    /* renamed from: E  reason: collision with root package name */
    public final Drawable f987E;

    /* renamed from: F  reason: collision with root package name */
    public final int f988F;

    /* renamed from: G  reason: collision with root package name */
    public final int f989G;

    /* renamed from: H  reason: collision with root package name */
    public final Intent f990H;

    /* renamed from: I  reason: collision with root package name */
    public final Intent f991I;

    /* renamed from: J  reason: collision with root package name */
    public final CharSequence f992J;

    /* renamed from: K  reason: collision with root package name */
    public View.OnFocusChangeListener f993K;

    /* renamed from: L  reason: collision with root package name */
    public View.OnClickListener f994L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f995M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f996N;

    /* renamed from: O  reason: collision with root package name */
    public c f997O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f998P;

    /* renamed from: Q  reason: collision with root package name */
    public CharSequence f999Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f1000R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f1001S;

    /* renamed from: T  reason: collision with root package name */
    public int f1002T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f1003U;

    /* renamed from: V  reason: collision with root package name */
    public CharSequence f1004V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f1005W;

    /* renamed from: a0  reason: collision with root package name */
    public int f1006a0;

    /* renamed from: b0  reason: collision with root package name */
    public SearchableInfo f1007b0;

    /* renamed from: c0  reason: collision with root package name */
    public Bundle f1008c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Z0 f1009d0;
    public final Z0 e0;

    /* renamed from: f0  reason: collision with root package name */
    public final WeakHashMap f1010f0;

    /* renamed from: p  reason: collision with root package name */
    public final SearchAutoComplete f1011p;

    /* renamed from: q  reason: collision with root package name */
    public final View f1012q;

    /* renamed from: r  reason: collision with root package name */
    public final View f1013r;

    /* renamed from: s  reason: collision with root package name */
    public final View f1014s;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f1015t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f1016u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f1017v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f1018w;

    /* renamed from: x  reason: collision with root package name */
    public final View f1019x;

    /* renamed from: y  reason: collision with root package name */
    public i1 f1020y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f1021z;

    public static class SearchAutoComplete extends C0256n {

        /* renamed from: e  reason: collision with root package name */
        public int f1022e = getThreshold();
        public SearchView f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1023g;

        /* renamed from: h  reason: collision with root package name */
        public final d f1024h = new d(this);

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 >= 600) {
                return 192;
            }
            if (i2 < 640 || i3 < 480) {
                return 160;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            g1 g1Var = SearchView.f983g0;
            g1Var.getClass();
            g1.a();
            Method method = g1Var.f3462c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            if (this.f1022e <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1023g) {
                d dVar = this.f1024h;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f;
            searchView.y(searchView.f996N);
            searchView.post(searchView.f1009d0);
            if (searchView.f1011p.hasFocus()) {
                searchView.n();
            }
        }

        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f.hasFocus() && getVisibility() == 0) {
                this.f1023g = true;
                Context context = getContext();
                g1 g1Var = SearchView.f983g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f1024h;
            if (!z2) {
                this.f1023g = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1023g = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1023g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1022e = i2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, k.g1] */
    static {
        g1 g1Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            ? obj = new Object();
            obj.f3461a = null;
            obj.b = null;
            obj.f3462c = null;
            g1.a();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                obj.f3461a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                obj.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                obj.f3462c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            g1Var = obj;
        }
        f983g0 = g1Var;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.MT_Bin);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.MT_Bin);
    }

    private void setQuery(CharSequence charSequence) {
        int i2;
        SearchAutoComplete searchAutoComplete = this.f1011p;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i2 = 0;
        } else {
            i2 = charSequence.length();
        }
        searchAutoComplete.setSelection(i2);
    }

    public final void c() {
        if (!this.f1005W) {
            this.f1005W = true;
            SearchAutoComplete searchAutoComplete = this.f1011p;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.f1006a0 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public final void clearFocus() {
        this.f1001S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1011p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1001S = false;
    }

    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f1011p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1004V = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f1006a0);
        this.f1005W = false;
    }

    public int getImeOptions() {
        return this.f1011p.getImeOptions();
    }

    public int getInputType() {
        return this.f1011p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1002T;
    }

    public CharSequence getQuery() {
        return this.f1011p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f999Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1007b0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f992J;
        }
        return getContext().getText(this.f1007b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f989G;
    }

    public int getSuggestionRowLayout() {
        return this.f988F;
    }

    public c getSuggestionsAdapter() {
        return this.f997O;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1004V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1008c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1007b0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i2;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1008c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        } else {
            i2 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1011p;
        if (i2 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        g1 g1Var = f983g0;
        g1Var.getClass();
        g1.a();
        Method method = g1Var.f3461a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, (Object[]) null);
            } catch (Exception unused) {
            }
        }
        g1Var.getClass();
        g1.a();
        Method method2 = g1Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, (Object[]) null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1011p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f995M) {
            clearFocus();
            y(true);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1009d0);
        post(this.e0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = z2;
        if (z3) {
            int[] iArr = this.f985B;
            SearchAutoComplete searchAutoComplete = this.f1011p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f986C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            Rect rect = this.f1021z;
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f984A;
            rect2.set(i8, 0, i9, i10);
            i1 i1Var = this.f1020y;
            if (i1Var == null) {
                i1 i1Var2 = new i1(rect2, rect, searchAutoComplete);
                this.f1020y = i1Var2;
                setTouchDelegate(i1Var2);
                return;
            }
            i1Var.b.set(rect2);
            Rect rect3 = i1Var.f3473d;
            rect3.set(rect2);
            int i11 = -i1Var.f3474e;
            rect3.inset(i11, i11);
            i1Var.f3472c.set(rect);
        }
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f996N) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1002T;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1002T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1002T) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h1 h1Var = (h1) parcelable;
        super.onRestoreInstanceState(h1Var.f);
        y(h1Var.f3469h);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, Q.b, k.h1] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        bVar.f3469h = this.f996N;
        return bVar;
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1009d0);
    }

    public final void p(int i2) {
        int i3;
        Uri uri;
        String h2;
        Cursor cursor = this.f997O.f642c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = k1.f3500x;
                String h3 = k1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f1007b0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = k1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f1007b0.getSuggestIntentData();
                }
                if (!(h4 == null || (h2 = k1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                if (h4 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(h4);
                }
                intent = l(h3, uri, k1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), k1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1011p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i2) {
        Editable text = this.f1011p.getText();
        Cursor cursor = this.f997O.f642c;
        if (cursor != null) {
            if (cursor.moveToPosition(i2)) {
                String c2 = this.f997O.c(cursor);
                if (c2 != null) {
                    setQuery(c2);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f1001S || !isFocusable()) {
            return false;
        }
        if (this.f996N) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1011p.requestFocus(i2, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f1011p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1007b0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1008c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f1011p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f994L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f995M != z2) {
            this.f995M = z2;
            y(z2);
            v();
        }
    }

    public void setImeOptions(int i2) {
        this.f1011p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1011p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1002T = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f993K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f994L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f999Q = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        int i2;
        this.f1000R = z2;
        c cVar = this.f997O;
        if (cVar instanceof k1) {
            k1 k1Var = (k1) cVar;
            if (z2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            k1Var.f3509p = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1007b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f1011p
            if (r7 == 0) goto L_0x0065
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f1007b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f1007b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L_0x0031
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1007b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0031
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L_0x0031:
            r2.setInputType(r7)
            P.c r7 = r6.f997O
            if (r7 == 0) goto L_0x003b
            r7.b(r0)
        L_0x003b:
            android.app.SearchableInfo r7 = r6.f1007b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x0062
            k.k1 r7 = new k.k1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1007b0
            java.util.WeakHashMap r5 = r6.f1010f0
            r7.<init>(r3, r6, r4, r5)
            r6.f997O = r7
            r2.setAdapter(r7)
            P.c r7 = r6.f997O
            k.k1 r7 = (k.k1) r7
            boolean r3 = r6.f1000R
            if (r3 == 0) goto L_0x005f
            r3 = 2
            goto L_0x0060
        L_0x005f:
            r3 = 1
        L_0x0060:
            r7.f3509p = r3
        L_0x0062:
            r6.v()
        L_0x0065:
            android.app.SearchableInfo r7 = r6.f1007b0
            r3 = 0
            if (r7 == 0) goto L_0x0098
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x0098
            android.app.SearchableInfo r7 = r6.f1007b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x007b
            android.content.Intent r0 = r6.f990H
            goto L_0x0085
        L_0x007b:
            android.app.SearchableInfo r7 = r6.f1007b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x0085
            android.content.Intent r0 = r6.f991I
        L_0x0085:
            if (r0 == 0) goto L_0x0098
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            r6.f1003U = r1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        L_0x00a2:
            boolean r7 = r6.f996N
            r6.y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f998P = z2;
        y(this.f996N);
    }

    public void setSuggestionsAdapter(c cVar) {
        this.f997O = cVar;
        this.f1011p.setAdapter(cVar);
    }

    public final void t() {
        int i2;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f1011p.getText());
        if (!isEmpty || (this.f995M && !this.f1005W)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        ImageView imageView = this.f1017v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.f1011p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1013r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1014s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f995M;
        SearchAutoComplete searchAutoComplete = this.f1011p;
        if (z2 && (drawable = this.f987E) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        int i2;
        if ((this.f998P || this.f1003U) && !this.f996N && (this.f1016u.getVisibility() == 0 || this.f1018w.getVisibility() == 0)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.f1014s.setVisibility(i2);
    }

    public final void x(boolean z2) {
        int i2;
        boolean z3 = this.f998P;
        if (!z3 || ((!z3 && !this.f1003U) || this.f996N || !hasFocus() || (!z2 && this.f1003U))) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f1016u.setVisibility(i2);
    }

    public final void y(boolean z2) {
        int i2;
        int i3;
        int i4;
        this.f996N = z2;
        int i5 = 8;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f1011p.getText());
        this.f1015t.setVisibility(i2);
        x(!isEmpty);
        if (z2) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.f1012q.setVisibility(i3);
        ImageView imageView = this.D;
        if (imageView.getDrawable() == null || this.f995M) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        imageView.setVisibility(i4);
        t();
        if (this.f1003U && !this.f996N && isEmpty) {
            this.f1016u.setVisibility(8);
            i5 = 0;
        }
        this.f1018w.setVisibility(i5);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Bin);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        this.f1021z = new Rect();
        this.f984A = new Rect();
        this.f985B = new int[2];
        this.f986C = new int[2];
        this.f1009d0 = new Z0(this, 0);
        this.e0 = new Z0(this, 1);
        this.f1010f0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C0234c1 c1Var = new C0234c1(this);
        x xVar = new x(2, this);
        F0 f02 = new F0(1, this);
        Y0 y02 = new Y0(this);
        int[] iArr = a.f2211u;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i3, 0);
        g gVar = new g(context2, obtainStyledAttributes);
        O.o(this, context2, iArr, attributeSet2, obtainStyledAttributes, i3);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.MT_Bin), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.MT_Bin);
        this.f1011p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1012q = findViewById(R.id.MT_Bin);
        View findViewById = findViewById(R.id.MT_Bin);
        this.f1013r = findViewById;
        View findViewById2 = findViewById(R.id.MT_Bin);
        this.f1014s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.MT_Bin);
        this.f1015t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Bin);
        this.f1016u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Bin);
        this.f1017v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Bin);
        this.f1018w = imageView4;
        b bVar2 = bVar;
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Bin);
        this.D = imageView5;
        findViewById.setBackground(gVar.p(20));
        findViewById2.setBackground(gVar.p(25));
        imageView.setImageDrawable(gVar.p(23));
        imageView2.setImageDrawable(gVar.p(15));
        imageView3.setImageDrawable(gVar.p(12));
        imageView4.setImageDrawable(gVar.p(28));
        imageView5.setImageDrawable(gVar.p(23));
        this.f987E = gVar.p(22);
        l.Z(imageView, getResources().getString(R.string.MT_Bin));
        this.f988F = obtainStyledAttributes.getResourceId(26, R.layout.MT_Bin);
        this.f989G = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(y02);
        searchAutoComplete.setOnEditorActionListener(c1Var);
        searchAutoComplete.setOnItemClickListener(xVar);
        searchAutoComplete.setOnItemSelectedListener(f02);
        searchAutoComplete.setOnKeyListener(bVar2);
        searchAutoComplete.setOnFocusChangeListener(new C0228a1(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f992J = obtainStyledAttributes.getText(14);
        this.f999Q = obtainStyledAttributes.getText(21);
        int i4 = obtainStyledAttributes.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(5, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        gVar.F();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f990H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f991I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1019x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0231b1(0, this));
        }
        y(this.f995M);
        v();
    }

    public void setOnCloseListener(C0237d1 d1Var) {
    }

    public void setOnQueryTextListener(e1 e1Var) {
    }

    public void setOnSuggestionListener(f1 f1Var) {
    }
}
