package c0;

import A.i;
import B.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import k.r;
import m.c;
import m.f;

/* renamed from: c0.d  reason: case insensitive filesystem */
public final class C0106d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1810a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1811c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1812d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable f1813e;
    public Object f;

    public /* synthetic */ C0106d(TextView textView) {
        this.f1813e = null;
        this.f = null;
        this.f1810a = false;
        this.b = false;
        this.f1812d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f1812d;
        Drawable F2 = i.F(compoundButton);
        if (F2 == null) {
            return;
        }
        if (this.f1810a || this.b) {
            Drawable mutate = i.y0(F2).mutate();
            if (this.f1810a) {
                a.h(mutate, (ColorStateList) this.f1813e);
            }
            if (this.b) {
                a.i(mutate, (PorterDuff.Mode) this.f);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        r rVar = (r) this.f1812d;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f1810a || this.b) {
            Drawable mutate = i.y0(checkMarkDrawable).mutate();
            if (this.f1810a) {
                a.h(mutate, (ColorStateList) this.f1813e);
            }
            if (this.b) {
                a.i(mutate, (PorterDuff.Mode) this.f);
            }
            if (mutate.isStateful()) {
                mutate.setState(rVar.getDrawableState());
            }
            rVar.setCheckMarkDrawable(mutate);
        }
    }

    public Bundle c(String str) {
        if (this.b) {
            Bundle bundle = (Bundle) this.f1813e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f1813e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f1813e;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f1813e = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|10|11|(1:15)|16|(1:18)|19|(1:21)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f1812d
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = d.a.f2203m
            N.g r7 = N.g.E(r0, r9, r3, r10)
            java.lang.Object r0 = r7.f606c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f606c
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            I.O.o(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r10 == 0) goto L_0x003e
            int r9 = r0.getResourceId(r9, r2)     // Catch:{ all -> 0x003b }
            if (r9 == 0) goto L_0x003e
            android.content.Context r10 = r1.getContext()     // Catch:{ NotFoundException -> 0x003e }
            android.graphics.drawable.Drawable r9 = Q0.l.v(r10, r9)     // Catch:{ NotFoundException -> 0x003e }
            r1.setButtonDrawable(r9)     // Catch:{ NotFoundException -> 0x003e }
            goto L_0x0055
        L_0x003b:
            r0 = move-exception
            r9 = r0
            goto L_0x007b
        L_0x003e:
            boolean r9 = r0.hasValue(r2)     // Catch:{ all -> 0x003b }
            if (r9 == 0) goto L_0x0055
            int r9 = r0.getResourceId(r2, r2)     // Catch:{ all -> 0x003b }
            if (r9 == 0) goto L_0x0055
            android.content.Context r10 = r1.getContext()     // Catch:{ all -> 0x003b }
            android.graphics.drawable.Drawable r9 = Q0.l.v(r10, r9)     // Catch:{ all -> 0x003b }
            r1.setButtonDrawable(r9)     // Catch:{ all -> 0x003b }
        L_0x0055:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x0063
            android.content.res.ColorStateList r9 = r7.o(r9)     // Catch:{ all -> 0x003b }
            O.b.c(r1, r9)     // Catch:{ all -> 0x003b }
        L_0x0063:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x0077
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch:{ all -> 0x003b }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = k.C0268t0.b(r9, r10)     // Catch:{ all -> 0x003b }
            O.b.d(r1, r9)     // Catch:{ all -> 0x003b }
        L_0x0077:
            r7.F()
            return
        L_0x007b:
            r7.F()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0106d.d(android.util.AttributeSet, int):void");
    }

    public void e(String str, C0105c cVar) {
        Object obj;
        f fVar = (f) this.f1812d;
        c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3653g;
        } else {
            c cVar2 = new c(str, cVar);
            fVar.f3660i++;
            c cVar3 = fVar.f3658g;
            if (cVar3 == null) {
                fVar.f = cVar2;
                fVar.f3658g = cVar2;
            } else {
                cVar3.f3654h = cVar2;
                cVar2.f3655i = cVar3;
                fVar.f3658g = cVar2;
            }
            obj = null;
        }
        if (((C0105c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0106d() {
        this.f1812d = new f();
        this.f1811c = true;
    }
}
