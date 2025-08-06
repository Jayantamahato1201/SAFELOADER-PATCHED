package T;

import E0.e;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.f;
import androidx.emoji2.text.j;
import java.nio.ByteBuffer;

public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f708a;
    public final e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i2;
        e eVar = new e(8);
        this.f708a = editText;
        this.b = eVar;
        if (j.f1156j != null) {
            j a2 = j.a();
            if (a2.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                f fVar = a2.f1160e;
                fVar.getClass();
                Bundle bundle = editorInfo.extras;
                S.b bVar = (S.b) fVar.f1152c.f1183a;
                int a3 = bVar.a(4);
                if (a3 != 0) {
                    i2 = ((ByteBuffer) bVar.f386d).getInt(a3 + bVar.f384a);
                } else {
                    i2 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i2);
                Bundle bundle2 = editorInfo.extras;
                fVar.f1151a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f708a.getEditableText();
        this.b.getClass();
        if (e.g(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f708a.getEditableText();
        this.b.getClass();
        if (e.g(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3)) {
            return true;
        }
        return false;
    }
}
