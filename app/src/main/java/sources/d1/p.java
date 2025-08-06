package d1;

import e1.c;
import h1.d;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class p {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f2344j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f2345k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f2346l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f2347m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f2348a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2349c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2350d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2351e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2352g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2353h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2354i;

    public p(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2348a = str;
        this.b = str2;
        this.f2349c = j2;
        this.f2350d = str3;
        this.f2351e = str4;
        this.f = z2;
        this.f2352g = z3;
        this.f2354i = z4;
        this.f2353h = z5;
    }

    public static int a(String str, int i2, int i3, boolean z2) {
        boolean z3;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long b(int i2, String str) {
        int a2 = a(str, 0, i2, false);
        Pattern pattern = f2347m;
        Matcher matcher = pattern.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(pattern).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f2346l).matches()) {
                if (i6 == -1) {
                    Pattern pattern2 = f2345k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i6 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f2344j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f2616e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f2348a.equals(this.f2348a) && pVar.b.equals(this.b) && pVar.f2350d.equals(this.f2350d) && pVar.f2351e.equals(this.f2351e) && pVar.f2349c == this.f2349c && pVar.f == this.f && pVar.f2352g == this.f2352g && pVar.f2353h == this.f2353h && pVar.f2354i == this.f2354i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f2350d.hashCode();
        int hashCode3 = this.f2351e.hashCode();
        long j2 = this.f2349c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f2348a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ^ true ? 1 : 0)) * 31) + (this.f2352g ^ true ? 1 : 0)) * 31) + (this.f2353h ^ true ? 1 : 0)) * 31) + (this.f2354i ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2348a);
        sb.append('=');
        sb.append(this.b);
        if (this.f2353h) {
            long j2 = this.f2349c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) d.f2908a.get()).format(new Date(j2)));
            }
        }
        if (!this.f2354i) {
            sb.append("; domain=");
            sb.append(this.f2350d);
        }
        sb.append("; path=");
        sb.append(this.f2351e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.f2352g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
