package k;

import android.graphics.drawable.LayerDrawable;

public abstract class C {
    public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i2) {
        layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
        layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
        layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
        layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
        layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
        layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
        layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
        layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
        layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
    }
}
