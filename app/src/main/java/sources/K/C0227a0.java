package k;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: k.a0  reason: case insensitive filesystem */
public abstract class C0227a0 {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
