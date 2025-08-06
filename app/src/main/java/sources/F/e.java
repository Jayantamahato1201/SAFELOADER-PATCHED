package F;

import E.j;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f195a;
    public final ContentProviderClient b;

    public e(Context context, Uri uri, int i2) {
        this.f195a = i2;
        switch (i2) {
            case 1:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
            default:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
        }
    }

    public final void a() {
        switch (this.f195a) {
            case 0:
                ContentProviderClient contentProviderClient = this.b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
            default:
                ContentProviderClient contentProviderClient2 = this.b;
                if (contentProviderClient2 == null) {
                    return;
                }
                if (contentProviderClient2 instanceof AutoCloseable) {
                    contentProviderClient2.close();
                    return;
                } else if (contentProviderClient2 instanceof ExecutorService) {
                    j.x((ExecutorService) contentProviderClient2);
                    return;
                } else {
                    contentProviderClient2.release();
                    return;
                }
        }
    }
}
