package k;

import A.j;
import B.f;
import F.c;
import N.g;
import T.b;
import T.e;
import T.h;
import T.i;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import d.a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class D {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3334d = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3335a = 2;
    public View b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3336c;

    public /* synthetic */ D() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((c) ((j) this.f3336c).b).getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    public void b(AttributeSet attributeSet, int i2) {
        switch (this.f3335a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                g E2 = g.E(absSeekBar.getContext(), attributeSet, f3334d, i2);
                Drawable r2 = E2.r(0);
                if (r2 != null) {
                    if (r2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) r2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable e2 = e(animationDrawable.getFrame(i3), true);
                            e2.setLevel(10000);
                            animationDrawable2.addFrame(e2, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        r2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(r2);
                }
                Drawable r3 = E2.r(1);
                if (r3 != null) {
                    absSeekBar.setProgressDrawable(e(r3, false));
                }
                E2.F();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, a.f2199i, i2, 0);
                try {
                    boolean z2 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z2 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public b c(InputConnection inputConnection, EditorInfo editorInfo) {
        j jVar = (j) this.f3336c;
        if (inputConnection == null) {
            jVar.getClass();
            inputConnection = null;
        } else {
            c cVar = (c) jVar.b;
            cVar.getClass();
            if (!(inputConnection instanceof b)) {
                inputConnection = new b((EditText) cVar.b, inputConnection, editorInfo);
            }
        }
        return (b) inputConnection;
    }

    public void d(boolean z2) {
        i iVar = (i) ((c) ((j) this.f3336c).b).f194c;
        if (iVar.f718c != z2) {
            if (iVar.b != null) {
                androidx.emoji2.text.j a2 = androidx.emoji2.text.j.a();
                h hVar = iVar.b;
                a2.getClass();
                A.i.k("initCallback cannot be null", hVar);
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1157a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f718c = z2;
            if (z2) {
                i.a(iVar.f717a, androidx.emoji2.text.j.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z2) {
        boolean z3;
        if (drawable instanceof B.e) {
            f fVar = (f) ((B.e) drawable);
            Drawable drawable2 = fVar.f;
            if (drawable2 != null) {
                fVar.h(e(drawable2, z2));
                return drawable;
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                Drawable drawable3 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawableArr[i2] = e(drawable3, z3);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                layerDrawable2.setId(i3, layerDrawable.getId(i3));
                if (Build.VERSION.SDK_INT >= 23) {
                    C.a(layerDrawable, layerDrawable2, i3);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f3336c) == null) {
                this.f3336c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z2) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public D(AbsSeekBar absSeekBar) {
        this.b = absSeekBar;
    }

    public D(EditText editText) {
        this.b = editText;
        this.f3336c = new j(editText);
    }
}
