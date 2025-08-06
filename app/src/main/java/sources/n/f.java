package N;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final InputContentInfo f603a;

    public f(Object obj) {
        this.f603a = (InputContentInfo) obj;
    }

    public final void a() {
        this.f603a.requestPermission();
    }

    public final Uri b() {
        return this.f603a.getLinkUri();
    }

    public final ClipDescription c() {
        return this.f603a.getDescription();
    }

    public final Object d() {
        return this.f603a;
    }

    public final Uri e() {
        return this.f603a.getContentUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f603a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
