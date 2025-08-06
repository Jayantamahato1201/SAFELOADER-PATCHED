package f0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: f0.b  reason: case insensitive filesystem */
public final class C0151b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2637a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0151b(Class cls, String str, int i2) {
        super(cls, str);
        this.f2637a = i2;
    }

    public final Object get(Object obj) {
        switch (this.f2637a) {
            case 0:
                C0154e eVar = (C0154e) obj;
                return null;
            case 1:
                C0154e eVar2 = (C0154e) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(w.f2693a.f((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.f2637a) {
            case 0:
                C0154e eVar = (C0154e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f2639a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.b = round;
                int i2 = eVar.f + 1;
                eVar.f = i2;
                if (i2 == eVar.f2643g) {
                    w.a(eVar.f2642e, eVar.f2639a, round, eVar.f2640c, eVar.f2641d);
                    eVar.f = 0;
                    eVar.f2643g = 0;
                    return;
                }
                return;
            case 1:
                C0154e eVar2 = (C0154e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f2640c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f2641d = round2;
                int i3 = eVar2.f2643g + 1;
                eVar2.f2643g = i3;
                if (eVar2.f == i3) {
                    w.a(eVar2.f2642e, eVar2.f2639a, eVar2.b, eVar2.f2640c, round2);
                    eVar2.f = 0;
                    eVar2.f2643g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f2693a.n((View) obj, floatValue);
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
