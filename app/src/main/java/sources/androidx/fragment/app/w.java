package androidx.fragment.app;

import U0.h;
import com.cheatbox.MainActivity;
import java.util.concurrent.CopyOnWriteArrayList;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1396a;
    public final CopyOnWriteArrayList b;

    /* renamed from: c  reason: collision with root package name */
    public h f1397c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1398d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1399e;

    public w(boolean z2) {
        this.f1396a = z2;
        this.b = new CopyOnWriteArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w(MainActivity mainActivity) {
        this(true);
        this.f1398d = 1;
        this.f1399e = mainActivity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w(D d2) {
        this(false);
        this.f1398d = 0;
        this.f1399e = d2;
    }
}
