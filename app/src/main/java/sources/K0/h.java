package K0;

import H0.r;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;
import o1.o;
import o1.v;

public class h extends C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f548a;
    public final Context b;

    public /* synthetic */ h(Context context, int i2) {
        this.f548a = i2;
        this.b = context;
    }

    public boolean a(A a2) {
        switch (this.f548a) {
            case 0:
                return "content".equals(a2.f493a.getScheme());
            default:
                return "android.resource".equals(a2.f493a.getScheme());
        }
    }

    public r c(A a2, int i2) {
        Resources resources;
        int i3;
        Context context = this.b;
        switch (this.f548a) {
            case 0:
                return new r((v) o.c(context.getContentResolver().openInputStream(a2.f493a)), 2);
            default:
                StringBuilder sb = G.f520a;
                a2.getClass();
                Uri uri = a2.f493a;
                if (uri == null) {
                    resources = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority != null) {
                        try {
                            resources = context.getPackageManager().getResourcesForApplication(authority);
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new FileNotFoundException("Unable to obtain resources for package: " + uri);
                        }
                    } else {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                }
                if (uri == null) {
                    i3 = 0;
                } else {
                    String authority2 = uri.getAuthority();
                    if (authority2 != null) {
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments == null || pathSegments.isEmpty()) {
                            throw new FileNotFoundException("No path segments: " + uri);
                        } else if (pathSegments.size() == 1) {
                            try {
                                i3 = Integer.parseInt(pathSegments.get(0));
                            } catch (NumberFormatException unused2) {
                                throw new FileNotFoundException("Last path segment is not a resource ID: " + uri);
                            }
                        } else if (pathSegments.size() == 2) {
                            i3 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                        } else {
                            throw new FileNotFoundException("More than two path segments: " + uri);
                        }
                    } else {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i3, (BitmapFactory.Options) null);
                if (decodeResource != null) {
                    return new r(decodeResource, (v) null, 2, 0);
                }
                throw new NullPointerException("bitmap == null");
        }
    }
}
