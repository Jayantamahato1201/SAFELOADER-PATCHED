package d1;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f2372c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f2373d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f2374a;
    public final String b;

    public v(String str, String str2, String str3) {
        this.f2374a = str;
        this.b = str2;
    }

    public static v a(String str) {
        Matcher matcher = f2372c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = f2373d.matcher(str);
            int end = matcher.end();
            String str2 = null;
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        }
                    }
                    end = matcher2.end();
                }
            }
            return new v(str, lowerCase, str2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v) || !((v) obj).f2374a.equals(this.f2374a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2374a.hashCode();
    }

    public final String toString() {
        return this.f2374a;
    }
}
