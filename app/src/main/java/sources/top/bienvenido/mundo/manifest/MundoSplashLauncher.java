package top.bienvenido.mundo.manifest;

import L0.d;
import Z.g;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b1.i;
import q1.H3;
import q1.O3;
import q1.T4;

public final class MundoSplashLauncher extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4723a = 0;

    public final void a(Intent intent) {
        H3 h3;
        try {
            String stringExtra = intent.getStringExtra("mundo_base_string");
            if (stringExtra == null || i.h0(stringExtra)) {
                finish();
                return;
            }
            try {
                h3 = (H3) O3.f3952a.a(stringExtra.hashCode());
            } catch (Exception unused) {
                h3 = null;
            }
            if (h3 != null) {
                if (T4.f) {
                    getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
                Drawable drawable = h3.f3903a;
                d dVar = h3.b;
                if (dVar == null) {
                    getWindow().getDecorView().setBackground(drawable);
                } else {
                    int applyDimension = (int) TypedValue.applyDimension(1, (float) 20, getResources().getDisplayMetrics());
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Integer num = (Integer) dVar.f589g;
                    Integer num2 = (Integer) dVar.f590h;
                    ImageView imageView = new ImageView(this);
                    int i2 = applyDimension * 14;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
                    layoutParams.gravity = 17;
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageDrawable(drawable);
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).start();
                    }
                    if (!(num2 == null || num2.equals(num) || num2.intValue() == 0)) {
                        imageView.setBackgroundColor(num2.intValue());
                    }
                    frameLayout.addView(imageView);
                    Drawable drawable2 = (Drawable) dVar.f;
                    if (drawable2 != null) {
                        View view = new View(this);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(applyDimension * 10, applyDimension * 4);
                        layoutParams2.gravity = 81;
                        layoutParams2.bottomMargin = applyDimension * 3;
                        view.setLayoutParams(layoutParams2);
                        view.setBackground(drawable2);
                        if (T4.f3998c) {
                            view.forceHasOverlappingRendering(false);
                        }
                        frameLayout.addView(view);
                    }
                    if (num != null) {
                        frameLayout.setBackgroundColor(num.intValue());
                    } else {
                        frameLayout.setBackground(getWindow().getDecorView().getBackground());
                    }
                    setContentView(frameLayout);
                }
            }
            getWindow().getDecorView().findViewById(16908290).post(new g(stringExtra, 6, intent.getStringExtra("mundo_base_bundle")));
        } catch (Exception unused2) {
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            a(intent);
        } else {
            finish();
        }
    }

    public final void onPause() {
        super.onPause();
        finish();
    }
}
