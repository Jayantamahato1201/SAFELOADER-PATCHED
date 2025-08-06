package o;

import A.g;
import Q0.l;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.g  reason: case insensitive filesystem */
public abstract class C0302g implements Future {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f3723i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f3724j;

    /* renamed from: k  reason: collision with root package name */
    public static final l f3725k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f3726l = new Object();
    public volatile Object f;

    /* renamed from: g  reason: collision with root package name */
    public volatile C0298c f3727g;

    /* renamed from: h  reason: collision with root package name */
    public volatile C0301f f3728h;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: o.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: o.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: o.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<o.f> r0 = o.C0301f.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f3723i = r1
            java.lang.Class<o.g> r1 = o.C0302g.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f3724j = r2
            o.d r3 = new o.d     // Catch:{ all -> 0x0047 }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch:{ all -> 0x0047 }
            java.lang.Class<o.c> r0 = o.C0298c.class
            java.lang.String r2 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch:{ all -> 0x0047 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)     // Catch:{ all -> 0x0047 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0047 }
            r0 = 0
            goto L_0x004d
        L_0x0047:
            r0 = move-exception
            o.e r3 = new o.e
            r3.<init>()
        L_0x004d:
            f3725k = r3
            if (r0 == 0) goto L_0x005a
            java.util.logging.Logger r1 = f3724j
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005a:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f3726l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0302g.<clinit>():void");
    }

    public static void b(C0302g gVar) {
        C0301f fVar;
        C0298c cVar;
        do {
            fVar = gVar.f3728h;
        } while (!f3725k.j(gVar, fVar, C0301f.f3721c));
        while (fVar != null) {
            Thread thread = fVar.f3722a;
            if (thread != null) {
                fVar.f3722a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.b;
        }
        do {
            cVar = gVar.f3727g;
        } while (!f3725k.h(gVar, cVar));
        C0298c cVar2 = null;
        while (cVar != null) {
            C0298c cVar3 = cVar.f3715a;
            cVar.f3715a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f3715a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f3724j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0296a) {
            CancellationException cancellationException = ((C0296a) obj).f3714a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        } else if (obj instanceof C0297b) {
            ((C0297b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        } else if (obj == f3726l) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object d(C0302g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String str;
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            if (d2 == this) {
                str = "this future";
            } else {
                str = String.valueOf(d2);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z2) {
        C0296a aVar;
        Object obj = this.f;
        if (obj != null) {
            return false;
        }
        if (f3723i) {
            aVar = new C0296a(z2, new CancellationException("Future.cancel() was called."));
        } else if (z2) {
            aVar = C0296a.b;
        } else {
            aVar = C0296a.f3713c;
        }
        if (!f3725k.i(this, obj, aVar)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0301f fVar) {
        fVar.f3722a = null;
        while (true) {
            C0301f fVar2 = this.f3728h;
            if (fVar2 != C0301f.f3721c) {
                C0301f fVar3 = null;
                while (fVar2 != null) {
                    C0301f fVar4 = fVar2.b;
                    if (fVar2.f3722a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.b = fVar4;
                        if (fVar3.f3722a == null) {
                        }
                    } else if (!f3725k.j(this, fVar2, fVar4)) {
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0301f fVar = this.f3728h;
                C0301f fVar2 = C0301f.f3721c;
                if (fVar != fVar2) {
                    C0301f fVar3 = new C0301f();
                    do {
                        l lVar = f3725k;
                        lVar.S(fVar3, fVar);
                        if (lVar.j(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar = this.f3728h;
                        }
                    } while (fVar != fVar2);
                }
                return c(this.f);
            }
            while (nanos > 0) {
                Object obj3 = this.f;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String h2 = g.h(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z2 = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str2 = h2 + convert + " " + lowerCase;
                    if (z2) {
                        str2 = g.h(str2, ",");
                    }
                    h2 = g.h(str2, " ");
                }
                if (z2) {
                    h2 = h2 + nanos2 + " nanoseconds ";
                }
                str = g.h(h2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(g.h(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f instanceof C0296a;
    }

    public final boolean isDone() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof C0296a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return c(obj2);
            }
            C0301f fVar = this.f3728h;
            C0301f fVar2 = C0301f.f3721c;
            if (fVar != fVar2) {
                C0301f fVar3 = new C0301f();
                do {
                    l lVar = f3725k;
                    lVar.S(fVar3, fVar);
                    if (lVar.j(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f3728h;
                } while (fVar != fVar2);
            }
            return c(this.f);
        }
        throw new InterruptedException();
    }
}
