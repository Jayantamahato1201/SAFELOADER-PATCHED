package A;

import E.j;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.D;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import p1.a;
import q.h;

public abstract /* synthetic */ class g {
    public static final void a(View view, int i2) {
        int b = h.b(i2);
        if (b == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (D.D(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
            }
        } else if (b == 1) {
            if (D.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
        } else if (b == 2) {
            if (D.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
        } else if (b == 3) {
            if (D.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            view.setVisibility(4);
        }
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(f(i2, "Unknown visibility "));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ int d(int i2) {
        switch (i2) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static ClassCastException e(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String f(int i2, String str) {
        return str + i2;
    }

    public static String g(long j2, StringBuilder sb) {
        sb.append(a.a(j2));
        return sb.toString();
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void j(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
        } else if (autoCloseable instanceof ExecutorService) {
            j.x((ExecutorService) autoCloseable);
        } else if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
        } else if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
        } else if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static /* synthetic */ boolean k(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String l(int i2) {
        switch (i2) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String m(int i2) {
        if (i2 == 1) {
            return "NONE";
        }
        if (i2 != 2) {
            return i2 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String n(int i2) {
        if (i2 == 1) {
            return "REMOVED";
        }
        if (i2 == 2) {
            return "VISIBLE";
        }
        if (i2 != 3) {
            return i2 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }
}
