package K0;

import A.j;
import android.os.HandlerThread;
import android.os.Looper;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final j f497a;
    public final j b;

    /* renamed from: c  reason: collision with root package name */
    public long f498c;

    /* renamed from: d  reason: collision with root package name */
    public long f499d;

    /* renamed from: e  reason: collision with root package name */
    public long f500e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f501g;

    /* renamed from: h  reason: collision with root package name */
    public long f502h;

    /* renamed from: i  reason: collision with root package name */
    public long f503i;

    /* renamed from: j  reason: collision with root package name */
    public long f504j;

    /* renamed from: k  reason: collision with root package name */
    public int f505k;

    /* renamed from: l  reason: collision with root package name */
    public int f506l;

    /* renamed from: m  reason: collision with root package name */
    public int f507m;

    public D(j jVar) {
        this.f497a = jVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = G.f520a;
        u uVar = new u(looper, 1);
        uVar.sendMessageDelayed(uVar.obtainMessage(), 1000);
        this.b = new j(handlerThread.getLooper(), this, 1);
    }

    public final E a() {
        o oVar = (o) this.f497a.b;
        int maxSize = oVar.maxSize();
        int size = oVar.size();
        long j2 = this.f498c;
        long j3 = this.f499d;
        long j4 = this.f500e;
        long j5 = this.f;
        long j6 = this.f501g;
        long j7 = this.f502h;
        int i2 = maxSize;
        long j8 = this.f503i;
        long j9 = this.f504j;
        int i3 = this.f505k;
        int i4 = this.f506l;
        int i5 = i3;
        int i6 = i5;
        int i7 = i4;
        return new E(i2, size, j2, j3, j4, j5, j6, j7, j8, j9, i6, i7, this.f507m, System.currentTimeMillis());
    }
}
