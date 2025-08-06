package B0;

import android.content.pm.SigningInfo;
import android.text.PrecomputedText;
import android.text.TextPaint;

public abstract /* synthetic */ class f {
    public static /* synthetic */ PrecomputedText.Params.Builder l(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return SigningInfo.class;
    }

    public static /* bridge */ /* synthetic */ boolean z(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
