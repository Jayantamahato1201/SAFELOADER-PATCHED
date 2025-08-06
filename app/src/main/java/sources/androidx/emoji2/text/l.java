package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class l extends Q0.l {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Q0.l f1166l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1167m;

    public l(Q0.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1166l = lVar;
        this.f1167m = threadPoolExecutor;
    }

    public final void H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1167m;
        try {
            this.f1166l.H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void K(r rVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1167m;
        try {
            this.f1166l.K(rVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
