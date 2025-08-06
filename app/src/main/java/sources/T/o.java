package t;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class o extends View {
    public o(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        C0480e eVar = (C0480e) getLayoutParams();
        eVar.f4579a = i2;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i2) {
        C0480e eVar = (C0480e) getLayoutParams();
        eVar.b = i2;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f) {
        C0480e eVar = (C0480e) getLayoutParams();
        eVar.f4582c = f;
        setLayoutParams(eVar);
    }

    public final void draw(Canvas canvas) {
    }

    public void setVisibility(int i2) {
    }
}
