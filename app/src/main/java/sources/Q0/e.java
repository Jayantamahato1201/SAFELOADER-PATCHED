package Q0;

import U0.i;
import java.io.File;

public final class e extends d {
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public File[] f649c;

    /* renamed from: d  reason: collision with root package name */
    public int f650d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f651e;
    public final /* synthetic */ h f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h hVar, File file) {
        super(file);
        this.f = hVar;
    }

    public final File a() {
        boolean z2 = this.f651e;
        File file = this.f658a;
        h hVar = this.f;
        if (!z2 && this.f649c == null) {
            hVar.f657i.getClass();
            File[] listFiles = file.listFiles();
            this.f649c = listFiles;
            if (listFiles == null) {
                hVar.f657i.getClass();
                this.f651e = true;
            }
        }
        File[] fileArr = this.f649c;
        if (fileArr != null && this.f650d < fileArr.length) {
            i.b(fileArr);
            int i2 = this.f650d;
            this.f650d = i2 + 1;
            return fileArr[i2];
        } else if (!this.b) {
            this.b = true;
            return file;
        } else {
            hVar.f657i.getClass();
            return null;
        }
    }
}
