package O;

import I.C0013e;
import I.C0014f;
import I.C0025q;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public final class r implements C0025q {
    public final C0014f a(View view, C0014f fVar) {
        CharSequence charSequence;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + fVar);
        }
        if (fVar.f420a.o() == 2) {
            return fVar;
        }
        C0013e eVar = fVar.f420a;
        ClipData d2 = eVar.d();
        int i2 = eVar.i();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i3 = 0; i3 < d2.getItemCount(); i3++) {
            ClipData.Item itemAt = d2.getItemAt(i3);
            if ((i2 & 1) != 0) {
                charSequence = itemAt.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence = charSequence.toString();
                }
            } else {
                charSequence = itemAt.coerceToStyledText(context);
            }
            if (charSequence != null) {
                if (!z2) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, charSequence);
                    z2 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequence);
                }
            }
        }
        return null;
    }
}
