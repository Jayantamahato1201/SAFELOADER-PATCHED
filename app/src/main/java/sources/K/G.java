package k;

import A.j;
import I.C0012d;
import I.O;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public abstract class G {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        j jVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jVar = new j(clipData, 3);
            } else {
                C0012d dVar = new C0012d();
                dVar.b = clipData;
                dVar.f413c = 3;
                jVar = dVar;
            }
            O.l(textView, jVar.g());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        j jVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j(clipData, 3);
        } else {
            C0012d dVar = new C0012d();
            dVar.b = clipData;
            dVar.f413c = 3;
            jVar = dVar;
        }
        O.l(view, jVar.g());
        return true;
    }
}
