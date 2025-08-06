package K0;

import A.j;
import F.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class w {

    /* renamed from: i  reason: collision with root package name */
    public static final u f574i = new u(Looper.getMainLooper(), 0);

    /* renamed from: j  reason: collision with root package name */
    public static volatile w f575j = null;

    /* renamed from: a  reason: collision with root package name */
    public final List f576a;
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final m f577c;

    /* renamed from: d  reason: collision with root package name */
    public final j f578d;

    /* renamed from: e  reason: collision with root package name */
    public final D f579e;
    public final WeakHashMap f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap f580g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ReferenceQueue f581h;

    public w(Context context, m mVar, j jVar, D d2) {
        this.b = context;
        this.f577c = mVar;
        this.f578d = jVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new h(context, 1));
        arrayList.add(new C0040g(context));
        arrayList.add(new q(context, 0));
        arrayList.add(new h(context, 0));
        arrayList.add(new C0035b(context));
        arrayList.add(new q(context, 1));
        arrayList.add(new t(mVar.f553c, d2));
        this.f576a = Collections.unmodifiableList(arrayList);
        this.f579e = d2;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f581h = referenceQueue;
        new v(referenceQueue, f574i).start();
    }

    public static w d() {
        if (f575j == null) {
            synchronized (w.class) {
                try {
                    if (f575j == null) {
                        Context context = PicassoProvider.f2191a;
                        if (context != null) {
                            Context applicationContext = context.getApplicationContext();
                            j jVar = new j(applicationContext, 7);
                            j jVar2 = new j(applicationContext, 6);
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o(1));
                            D d2 = new D(jVar2);
                            f575j = new w(applicationContext, new m(applicationContext, threadPoolExecutor, f574i, jVar, jVar2, d2), jVar2, d2);
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f575j;
    }

    public final void a(Object obj) {
        StringBuilder sb = G.f520a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            n nVar = (n) this.f.remove(obj);
            if (nVar != null) {
                nVar.f567g = true;
                j jVar = this.f577c.f557h;
                jVar.sendMessage(jVar.obtainMessage(2, nVar));
            }
            if (obj instanceof ImageView) {
                if (this.f580g.remove((ImageView) obj) != null) {
                    throw new ClassCastException();
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    public final void b(Bitmap bitmap, int i2, n nVar, Exception exc) {
        if (!nVar.f567g) {
            if (!nVar.f) {
                this.f.remove(nVar.a());
            }
            C0034a aVar = nVar.f564c;
            if (bitmap == null) {
                ImageView imageView = (ImageView) aVar.get();
                if (imageView != null) {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                }
            } else if (i2 != 0) {
                ImageView imageView2 = (ImageView) aVar.get();
                if (imageView2 != null) {
                    Context context = nVar.f563a.b;
                    int i3 = x.f582e;
                    Drawable drawable2 = imageView2.getDrawable();
                    if (drawable2 instanceof Animatable) {
                        ((Animatable) drawable2).stop();
                    }
                    imageView2.setImageDrawable(new x(context, bitmap, drawable2, i2));
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public final void c(n nVar) {
        Object a2 = nVar.a();
        if (a2 != null) {
            WeakHashMap weakHashMap = this.f;
            if (weakHashMap.get(a2) != nVar) {
                a(a2);
                weakHashMap.put(a2, nVar);
            }
        }
        j jVar = this.f577c.f557h;
        jVar.sendMessage(jVar.obtainMessage(1, nVar));
    }

    public final B e(String str) {
        if (str == null) {
            return new B(this, (Uri) null);
        }
        if (str.trim().length() != 0) {
            return new B(this, Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }
}
