package K0;

import java.io.PrintWriter;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final int f508a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final long f509c;

    /* renamed from: d  reason: collision with root package name */
    public final long f510d;

    /* renamed from: e  reason: collision with root package name */
    public final long f511e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f512g;

    /* renamed from: h  reason: collision with root package name */
    public final long f513h;

    /* renamed from: i  reason: collision with root package name */
    public final long f514i;

    /* renamed from: j  reason: collision with root package name */
    public final long f515j;

    /* renamed from: k  reason: collision with root package name */
    public final int f516k;

    /* renamed from: l  reason: collision with root package name */
    public final int f517l;

    /* renamed from: m  reason: collision with root package name */
    public final int f518m;

    /* renamed from: n  reason: collision with root package name */
    public final long f519n;

    public E(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.f508a = i2;
        this.b = i3;
        this.f509c = j2;
        this.f510d = j3;
        this.f511e = j4;
        this.f = j5;
        this.f512g = j6;
        this.f513h = j7;
        this.f514i = j8;
        this.f515j = j9;
        this.f516k = i4;
        this.f517l = i5;
        this.f518m = i6;
        this.f519n = j10;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        int i2 = this.f508a;
        printWriter.println(i2);
        printWriter.print("  Cache Size: ");
        int i3 = this.b;
        printWriter.println(i3);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) i3) / ((float) i2)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f509c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f510d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f516k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f511e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f513h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f517l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f518m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f512g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f514i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f515j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f508a + ", size=" + this.b + ", cacheHits=" + this.f509c + ", cacheMisses=" + this.f510d + ", downloadCount=" + this.f516k + ", totalDownloadSize=" + this.f511e + ", averageDownloadSize=" + this.f513h + ", totalOriginalBitmapSize=" + this.f + ", totalTransformedBitmapSize=" + this.f512g + ", averageOriginalBitmapSize=" + this.f514i + ", averageTransformedBitmapSize=" + this.f515j + ", originalBitmapCount=" + this.f517l + ", transformedBitmapCount=" + this.f518m + ", timeStamp=" + this.f519n + '}';
    }
}
