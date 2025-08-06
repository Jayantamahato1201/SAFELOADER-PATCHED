package o;

import Q0.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.d  reason: case insensitive filesystem */
public final class C0299d extends l {

    /* renamed from: l  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3716l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3717m;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3718n;

    /* renamed from: o  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3719o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3720p;

    public C0299d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3716l = atomicReferenceFieldUpdater;
        this.f3717m = atomicReferenceFieldUpdater2;
        this.f3718n = atomicReferenceFieldUpdater3;
        this.f3719o = atomicReferenceFieldUpdater4;
        this.f3720p = atomicReferenceFieldUpdater5;
    }

    public final void S(C0301f fVar, C0301f fVar2) {
        this.f3717m.lazySet(fVar, fVar2);
    }

    public final void T(C0301f fVar, Thread thread) {
        this.f3716l.lazySet(fVar, thread);
    }

    public final boolean h(C0302g gVar, C0298c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0298c cVar2 = C0298c.b;
        do {
            atomicReferenceFieldUpdater = this.f3719o;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    public final boolean i(C0302g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3720p;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    public final boolean j(C0302g gVar, C0301f fVar, C0301f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3718n;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
