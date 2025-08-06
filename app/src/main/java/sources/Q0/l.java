package Q0;

import A.g;
import A.i;
import E.j;
import I.A;
import S.b;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.drm.DrmManagerClient;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.emoji2.text.r;
import b0.J;
import b0.V;
import e.C0124F;
import f0.v;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k.U0;
import k.x1;
import k.z1;
import o.C0298c;
import o.C0301f;
import o.C0302g;
import o1.f;
import org.xmlpull.v1.XmlSerializer;
import q1.C0345f0;
import q1.C0382l1;
import q1.C0422s0;
import q1.F;
import top.bienvenido.mundo.manifest.MundoSplashLauncher;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static Field f660a = null;
    public static boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public static Class f661c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f662d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Field f663e = null;
    public static boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Field f664g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f665h = false;

    /* renamed from: i  reason: collision with root package name */
    public static long f666i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static Method f667j = null;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f668k = true;

    public static boolean A(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean B(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean C() {
        try {
            if (f667j == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f667j == null) {
                f666i = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f667j = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f667j.invoke((Object) null, new Object[]{Long.valueOf(f666i)})).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }

    public static int D(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i4);
    }

    public static int E(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static Intent F(Context context, String str) {
        if (!((C0345f0) C0382l1.f4134c.b()).u0(str)) {
            ((C0422s0) F.f3877c.b()).a(str);
            return null;
        } else if (((C0422s0) F.f3877c.b()).p(str, "0")) {
            return null;
        } else {
            Intent intent = new Intent(context, MundoSplashLauncher.class);
            intent.putExtra("mundo_base_string", str);
            intent.putExtra("mundo_base_bundle", "0");
            return intent;
        }
    }

    public static void G(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static boolean Q(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static void R(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, (String) null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag((String) null, "locales");
                newSerializer.attribute((String) null, "application_locales", str);
                newSerializer.endTag((String) null, "locales");
                newSerializer.endDocument();
                Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Exception e2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                if (openFileOutput != null) {
                    openFileOutput.close();
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [S.b, I.A] */
    public static b U(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    j2 = -1;
                    break;
                }
                int i4 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j2 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i4) {
                    break;
                }
                i3++;
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j3 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i5 = 0; ((long) i5) < j3; i5++) {
                    int i6 = duplicate.getInt();
                    long j4 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (j4 + j2));
                        ? a2 = new A();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        a2.f386d = duplicate;
                        a2.f384a = position;
                        int i7 = position - duplicate.getInt(position);
                        a2.b = i7;
                        a2.f385c = ((ByteBuffer) a2.f386d).getShort(i7);
                        return a2;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (r3 == null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String V(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x006d }
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x004b }
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch:{ IOException | XmlPullParserException -> 0x004b }
            int r5 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004b }
        L_0x0017:
            int r6 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x004b }
            r7 = 1
            if (r6 == r7) goto L_0x0043
            r7 = 3
            if (r6 != r7) goto L_0x002a
            int r8 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004b }
            if (r8 <= r5) goto L_0x0043
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0067
        L_0x002a:
            if (r6 == r7) goto L_0x0017
            r7 = 4
            if (r6 != r7) goto L_0x0030
            goto L_0x0017
        L_0x0030:
            java.lang.String r6 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x004b }
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x004b }
            if (r6 == 0) goto L_0x0017
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch:{ IOException | XmlPullParserException -> 0x004b }
        L_0x0043:
            if (r3 == 0) goto L_0x0053
        L_0x0045:
            r3.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0053
        L_0x0049:
            goto L_0x0053
        L_0x004b:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0053
            goto L_0x0045
        L_0x0053:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0063
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L_0x0066
        L_0x0063:
            r9.deleteFile(r0)
        L_0x0066:
            return r2
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r9
        L_0x006d:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.l.V(android.content.Context):java.lang.String");
    }

    public static void Z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            x1.a(view, charSequence);
            return;
        }
        z1 z1Var = z1.f3612k;
        if (z1Var != null && z1Var.f3614a == view) {
            z1.b((z1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z1 z1Var2 = z1.f3613l;
            if (z1Var2 != null && z1Var2.f3614a == view) {
                z1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new z1(view, charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r9.right <= r11.left) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r9.top >= r11.bottom) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r9.left >= r11.right) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r9.bottom <= r11.top) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = f(r8, r9, r10)
            boolean r1 = f(r8, r9, r11)
            if (r1 != 0) goto L_0x0075
            if (r0 != 0) goto L_0x000e
            goto L_0x0075
        L_0x000e:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L_0x003c
            if (r8 == r2) goto L_0x0035
            if (r8 == r3) goto L_0x002e
            if (r8 != r1) goto L_0x0028
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L_0x0074
            goto L_0x0042
        L_0x0028:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L_0x002e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L_0x0074
            goto L_0x0042
        L_0x0035:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L_0x0074
            goto L_0x0042
        L_0x003c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L_0x0074
        L_0x0042:
            if (r8 == r4) goto L_0x0074
            if (r8 != r3) goto L_0x0047
            goto L_0x0074
        L_0x0047:
            int r10 = D(r8, r9, r10)
            if (r8 == r4) goto L_0x0069
            if (r8 == r2) goto L_0x0064
            if (r8 == r3) goto L_0x005f
            if (r8 != r1) goto L_0x0059
            int r8 = r11.bottom
            int r9 = r9.bottom
        L_0x0057:
            int r8 = r8 - r9
            goto L_0x006e
        L_0x0059:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L_0x005f:
            int r8 = r11.right
            int r9 = r9.right
            goto L_0x0057
        L_0x0064:
            int r8 = r9.top
            int r9 = r11.top
            goto L_0x0057
        L_0x0069:
            int r8 = r9.left
            int r9 = r11.left
            goto L_0x0057
        L_0x006e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L_0x0075
        L_0x0074:
            return r5
        L_0x0075:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.l.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void c0(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f668k) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f668k = false;
            }
        }
    }

    public static boolean f(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static final void n(XmlResourceParser xmlResourceParser, Throwable th) {
        if (th != null) {
            try {
                g.j(xmlResourceParser);
            } catch (Throwable th2) {
                i.d(th, th2);
            }
        } else if (xmlResourceParser instanceof AutoCloseable) {
            xmlResourceParser.close();
        } else if (xmlResourceParser instanceof ExecutorService) {
            j.x((ExecutorService) xmlResourceParser);
        } else if (xmlResourceParser instanceof TypedArray) {
            ((TypedArray) xmlResourceParser).recycle();
        } else if (xmlResourceParser instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) xmlResourceParser).release();
        } else if (xmlResourceParser instanceof MediaDrm) {
            ((MediaDrm) xmlResourceParser).release();
        } else if (xmlResourceParser instanceof DrmManagerClient) {
            ((DrmManagerClient) xmlResourceParser).release();
        } else if (xmlResourceParser instanceof ContentProviderClient) {
            ((ContentProviderClient) xmlResourceParser).release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int o(V v2, androidx.emoji2.text.g gVar, View view, View view2, J j2, boolean z2) {
        if (j2.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(J.H(view) - J.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int p(V v2, androidx.emoji2.text.g gVar, View view, View view2, J j2, boolean z2, boolean z3) {
        int i2;
        if (j2.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(J.H(view), J.H(view2));
        int max = Math.max(J.H(view), J.H(view2));
        if (z3) {
            i2 = Math.max(0, (v2.b() - max) - 1);
        } else {
            i2 = Math.max(0, min);
        }
        if (!z2) {
            return i2;
        }
        return Math.round((((float) i2) * (((float) Math.abs(gVar.b(view2) - gVar.e(view))) / ((float) (Math.abs(J.H(view) - J.H(view2)) + 1)))) + ((float) (gVar.k() - gVar.e(view))));
    }

    public static int q(V v2, androidx.emoji2.text.g gVar, View view, View view2, J j2, boolean z2) {
        if (j2.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return v2.b();
        }
        return (int) ((((float) (gVar.b(view2) - gVar.e(view))) / ((float) (Math.abs(J.H(view) - J.H(view2)) + 1))) * ((float) v2.b()));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.emoji2.text.g, androidx.emoji2.text.p] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.p t(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000e
            androidx.emoji2.text.c r0 = new androidx.emoji2.text.c
            r1 = 15
            r0.<init>((int) r1)
            goto L_0x0015
        L_0x000e:
            E0.e r0 = new E0.e
            r1 = 15
            r0.<init>((int) r1)
        L_0x0015:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            A.i.k(r2, r1)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L_0x002e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L_0x002e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L_0x002e
            goto L_0x004b
        L_0x004a:
            r4 = r5
        L_0x004b:
            if (r4 != 0) goto L_0x004f
        L_0x004d:
            r1 = r5
            goto L_0x007e
        L_0x004f:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0077 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0077 }
            android.content.pm.Signature[] r0 = r0.e(r1, r4)     // Catch:{ NameNotFoundException -> 0x0077 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0077 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0077 }
        L_0x005d:
            if (r3 >= r6) goto L_0x006b
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0077 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0077 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0077 }
            int r3 = r3 + 1
            goto L_0x005d
        L_0x006b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0077 }
            F.g r1 = new F.g     // Catch:{ NameNotFoundException -> 0x0077 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x004d
        L_0x007e:
            if (r1 != 0) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            androidx.emoji2.text.p r5 = new androidx.emoji2.text.p
            androidx.emoji2.text.o r0 = new androidx.emoji2.text.o
            r0.<init>(r8, r1)
            r5.<init>((androidx.emoji2.text.i) r0)
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.l.t(android.content.Context):androidx.emoji2.text.p");
    }

    public static void u(Object obj) {
        LongSparseArray longSparseArray;
        if (!f662d) {
            try {
                f661c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f662d = true;
        }
        Class cls = f661c;
        if (cls != null) {
            if (!f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f663e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f = true;
            }
            Field field = f663e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    C0124F.a(longSparseArray);
                }
            }
        }
    }

    public static Drawable v(Context context, int i2) {
        return U0.d().f(context, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Class x(Z0.b r2) {
        /*
            java.lang.String r0 = "<this>"
            U0.i.e(r0, r2)
            U0.e r2 = (U0.e) r2
            java.lang.Class r2 = r2.a()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L_0x0013
            goto L_0x0088
        L_0x0013:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L_0x0080;
                case 104431: goto L_0x0074;
                case 3039496: goto L_0x0068;
                case 3052374: goto L_0x005c;
                case 3327612: goto L_0x0050;
                case 3625364: goto L_0x0044;
                case 64711720: goto L_0x0038;
                case 97526364: goto L_0x002c;
                case 109413500: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0088
        L_0x0020:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0029
            goto L_0x0088
        L_0x0029:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L_0x002c:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x0088
        L_0x0035:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L_0x0038:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0041
            goto L_0x0088
        L_0x0041:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L_0x0044:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004d
            goto L_0x0088
        L_0x004d:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L_0x0050:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0059
            goto L_0x0088
        L_0x0059:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L_0x005c:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x0088
        L_0x0065:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L_0x0068:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0071
            goto L_0x0088
        L_0x0071:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L_0x0074:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007d
            goto L_0x0088
        L_0x007d:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L_0x0080:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0089
        L_0x0088:
            return r2
        L_0x0089:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.l.x(Z0.b):java.lang.Class");
    }

    public abstract void H(Throwable th);

    public abstract View I(int i2);

    public abstract boolean J();

    public abstract void K(r rVar);

    public abstract void M(int i2);

    public abstract void N(View view, int i2, int i3);

    public abstract void O(View view, float f2, float f3);

    public abstract Object P(int i2, Intent intent);

    public abstract void S(C0301f fVar, C0301f fVar2);

    public abstract void T(C0301f fVar, Thread thread);

    public abstract void X(boolean z2);

    public abstract void Y(boolean z2);

    public abstract void a0();

    public abstract void b0();

    public abstract boolean d0(View view, int i2);

    public abstract void e0(f fVar);

    public boolean g() {
        return false;
    }

    public abstract boolean h(C0302g gVar, C0298c cVar);

    public abstract boolean i(C0302g gVar, Object obj, Object obj2);

    public abstract boolean j(C0302g gVar, C0301f fVar, C0301f fVar2);

    public abstract int k(View view, int i2);

    public abstract int l(View view, int i2);

    public abstract List m(String str, List list);

    public abstract long r();

    public abstract d1.v s();

    public abstract InputFilter[] w(InputFilter[] inputFilterArr);

    public int y(View view) {
        return 0;
    }

    public int z() {
        return 0;
    }

    public void W() {
    }

    public void L(View view, int i2) {
    }
}
