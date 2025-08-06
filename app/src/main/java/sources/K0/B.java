package K0;

import F.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

public final class B {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicInteger f495c = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final w f496a;
    public final l b;

    /* JADX WARNING: type inference failed for: r1v1, types: [F.l, java.lang.Object] */
    public B(w wVar, Uri uri) {
        wVar.getClass();
        this.f496a = wVar;
        ? obj = new Object();
        obj.b = uri;
        this.b = obj;
    }

    public final void a(ImageView imageView) {
        Bitmap bitmap;
        System.nanoTime();
        StringBuilder sb = G.f520a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        } else if (imageView != null) {
            l lVar = this.b;
            Uri uri = (Uri) lVar.b;
            w wVar = this.f496a;
            if (uri == null) {
                wVar.a(imageView);
                int i2 = x.f582e;
                imageView.setImageDrawable((Drawable) null);
                if (imageView.getDrawable() instanceof Animatable) {
                    ((Animatable) imageView.getDrawable()).start();
                    return;
                }
                return;
            }
            f495c.getAndIncrement();
            if (lVar.f210a == 0) {
                lVar.f210a = 2;
            }
            int i3 = lVar.f210a;
            Uri uri2 = (Uri) lVar.b;
            A a2 = new A(uri2, i3);
            wVar.getClass();
            StringBuilder sb2 = G.f520a;
            if (uri2 != null) {
                String uri3 = uri2.toString();
                sb2.ensureCapacity(uri3.length() + 50);
                sb2.append(uri3);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(0);
            }
            sb2.append(10);
            String sb3 = sb2.toString();
            sb2.setLength(0);
            p pVar = (p) ((o) wVar.f578d.b).get(sb3);
            if (pVar != null) {
                bitmap = pVar.f568a;
            } else {
                bitmap = null;
            }
            D d2 = wVar.f579e;
            if (bitmap != null) {
                d2.b.sendEmptyMessage(0);
            } else {
                d2.b.sendEmptyMessage(1);
            }
            if (bitmap != null) {
                wVar.a(imageView);
                Context context = wVar.b;
                int i4 = x.f582e;
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).stop();
                }
                imageView.setImageDrawable(new x(context, bitmap, drawable, 1));
                return;
            }
            int i5 = x.f582e;
            imageView.setImageDrawable((Drawable) null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            wVar.c(new n(wVar, imageView, a2, sb3));
        } else {
            throw new IllegalArgumentException("Target must not be null.");
        }
    }
}
