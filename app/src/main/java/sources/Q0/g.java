package Q0;

import U0.i;
import java.io.File;

public final class g extends d {
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public File[] f652c;

    /* renamed from: d  reason: collision with root package name */
    public int f653d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f654e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, File file) {
        super(file);
        this.f654e = hVar;
    }

    public final File a() {
        boolean z2 = this.b;
        File file = this.f658a;
        h hVar = this.f654e;
        if (!z2) {
            hVar.f657i.getClass();
            this.b = true;
            return file;
        }
        File[] fileArr = this.f652c;
        if (fileArr == null || this.f653d < fileArr.length) {
            if (fileArr == null) {
                File[] listFiles = file.listFiles();
                this.f652c = listFiles;
                if (listFiles == null) {
                    hVar.f657i.getClass();
                }
                File[] fileArr2 = this.f652c;
                if (fileArr2 == null || fileArr2.length == 0) {
                    hVar.f657i.getClass();
                    return null;
                }
            }
            File[] fileArr3 = this.f652c;
            i.b(fileArr3);
            int i2 = this.f653d;
            this.f653d = i2 + 1;
            return fileArr3[i2];
        }
        hVar.f657i.getClass();
        return null;
    }
}
