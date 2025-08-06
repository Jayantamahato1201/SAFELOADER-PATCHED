package e;

import K0.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.cheatbox.R;
import com.google.android.material.datepicker.k;
import d.a;
import java.lang.ref.WeakReference;

/* renamed from: e.f  reason: case insensitive filesystem */
public final class C0135f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2489a;
    public final C0136g b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f2490c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2491d;

    /* renamed from: e  reason: collision with root package name */
    public String f2492e;
    public AlertController$RecycleListView f;

    /* renamed from: g  reason: collision with root package name */
    public Button f2493g;

    /* renamed from: h  reason: collision with root package name */
    public String f2494h;

    /* renamed from: i  reason: collision with root package name */
    public Message f2495i;

    /* renamed from: j  reason: collision with root package name */
    public Button f2496j;

    /* renamed from: k  reason: collision with root package name */
    public Button f2497k;

    /* renamed from: l  reason: collision with root package name */
    public NestedScrollView f2498l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f2499m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f2500n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f2501o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f2502p;

    /* renamed from: q  reason: collision with root package name */
    public View f2503q;

    /* renamed from: r  reason: collision with root package name */
    public ListAdapter f2504r;

    /* renamed from: s  reason: collision with root package name */
    public int f2505s = -1;

    /* renamed from: t  reason: collision with root package name */
    public final int f2506t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2507u;

    /* renamed from: v  reason: collision with root package name */
    public final int f2508v;

    /* renamed from: w  reason: collision with root package name */
    public final int f2509w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f2510x;

    /* renamed from: y  reason: collision with root package name */
    public final j f2511y;

    /* renamed from: z  reason: collision with root package name */
    public final k f2512z = new k(1, this);

    public C0135f(Context context, C0136g gVar, Window window) {
        this.f2489a = context;
        this.b = gVar;
        this.f2490c = window;
        j jVar = new j();
        jVar.b = new WeakReference(gVar);
        this.f2511y = jVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a.f2196e, R.attr.MT_Bin, 0);
        this.f2506t = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2507u = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2508v = obtainStyledAttributes.getResourceId(7, 0);
        this.f2509w = obtainStyledAttributes.getResourceId(3, 0);
        this.f2510x = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.c().i(1);
    }

    public static void a(View view, View view2, View view3) {
        int i2;
        int i3 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i3 = 0;
            }
            view3.setVisibility(i3);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
