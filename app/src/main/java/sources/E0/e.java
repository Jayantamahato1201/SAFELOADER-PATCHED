package E0;

import A.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import f0.x;
import j.C0209m;
import j.y;
import j0.C0219a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e implements Z.e, y {
    public static e b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f96c = true;

    /* renamed from: d  reason: collision with root package name */
    public static Method f97d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f98e = false;
    public static Field f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f99g = false;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f100h = true;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f101i = true;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f102a;

    public /* synthetic */ e(int i2) {
        this.f102a = i2;
    }

    public static e c(Context context, int i2) {
        boolean z2;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.i("Cannot create a CalendarItemStyle with a styleResId of 0", z2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0219a.f3186m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        i.H(context, obtainStyledAttributes, 4);
        i.H(context, obtainStyledAttributes, 9);
        i.H(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a((float) 0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(23);
        i.j(rect.left);
        i.j(rect.top);
        i.j(rect.right);
        i.j(rect.bottom);
        return eVar;
    }

    public static Path d(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r11 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a2, code lost:
        if (r10 != -1) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(T.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00ef
            if (r9 < 0) goto L_0x00ef
            if (r10 >= 0) goto L_0x0009
            goto L_0x00ef
        L_0x0009:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00ef
            if (r2 == r3) goto L_0x00ef
            if (r1 == r2) goto L_0x001a
            goto L_0x00ef
        L_0x001a:
            r4 = 1
            if (r11 == 0) goto L_0x00a5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x002c
            if (r11 >= r1) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            if (r9 >= 0) goto L_0x002e
        L_0x002c:
            r1 = -1
            goto L_0x005d
        L_0x002e:
            r11 = 0
        L_0x002f:
            if (r9 != 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003b
            if (r11 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0039:
            r1 = 0
            goto L_0x005d
        L_0x003b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x0048
            goto L_0x002c
        L_0x0048:
            int r9 = r9 + -1
            goto L_0x002e
        L_0x004b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0054
            int r9 = r9 + -1
            goto L_0x002f
        L_0x0054:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005b
            goto L_0x002c
        L_0x005b:
            r11 = 1
            goto L_0x002f
        L_0x005d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x006c
            if (r10 >= r2) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            if (r9 >= 0) goto L_0x006e
        L_0x006c:
            r10 = -1
            goto L_0x00a0
        L_0x006e:
            r11 = 0
        L_0x006f:
            if (r9 != 0) goto L_0x0073
            r10 = r2
            goto L_0x00a0
        L_0x0073:
            if (r2 < r10) goto L_0x0078
            if (r11 == 0) goto L_0x00a0
            goto L_0x006c
        L_0x0078:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0085
            goto L_0x006c
        L_0x0085:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006e
        L_0x008a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0095
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006f
        L_0x0095:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x009c
            goto L_0x006c
        L_0x009c:
            int r2 = r2 + 1
            r11 = 1
            goto L_0x006f
        L_0x00a0:
            if (r1 == r3) goto L_0x00ef
            if (r10 != r3) goto L_0x00b3
            goto L_0x00ef
        L_0x00a5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b3:
            java.lang.Class<androidx.emoji2.text.u> r9 = androidx.emoji2.text.u.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji2.text.u[] r9 = (androidx.emoji2.text.u[]) r9
            if (r9 == 0) goto L_0x00ef
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00ef
            int r11 = r9.length
            r2 = 0
        L_0x00c2:
            if (r2 >= r11) goto L_0x00d9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c2
        L_0x00d9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r4
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.e.g(T.b, android.text.Editable, int, int, boolean):boolean");
    }

    public boolean b(C0209m mVar) {
        return false;
    }

    public Signature[] e(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public float f(View view) {
        if (f96c) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f96c = false;
            }
        }
        return view.getAlpha();
    }

    public void h(int i2, Serializable serializable) {
        String str;
        switch (this.f102a) {
            case 11:
                return;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                    default:
                        str = "";
                        break;
                }
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    return;
                } else {
                    Log.d("ProfileInstaller", str);
                    return;
                }
        }
    }

    public boolean i(CharSequence charSequence) {
        return false;
    }

    public void j() {
        switch (this.f102a) {
            case 11:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    public void m(View view, int i2, int i3, int i4, int i5) {
        if (!f98e) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f97d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e2);
            }
            f98e = true;
        }
        Method method = f97d;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public void n(View view, float f2) {
        if (f96c) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f96c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void o(View view, int i2) {
        if (!f99g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f99g = true;
        }
        Field field = f;
        if (field != null) {
            try {
                f.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void p(View view, Matrix matrix) {
        if (f100h) {
            try {
                f0.y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f100h = false;
            }
        }
    }

    public void q(View view, Matrix matrix) {
        if (f101i) {
            try {
                f0.y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f101i = false;
            }
        }
    }

    public String toString() {
        switch (this.f102a) {
            case 26:
                return new String(new byte[]{(byte) 520248, (byte) 246833, (byte) 1334, (byte) 218402869, (byte) 80950, (byte) 565, (byte) 52586038, (byte) 2214961, (byte) 108859952, (byte) 20530, (byte) 108602, (byte) 29632833, (byte) 65, (byte) 4677, (byte) 4451, (byte) 116, (byte) 96375673, (byte) 244823, (byte) 83, (byte) 1606, (byte) 126485571, (byte) 40646965, (byte) 6064231, (byte) 11882, (byte) 19026786, (byte) 18242, (byte) 169335, (byte) 49, (byte) 277369, (byte) 631886, (byte) 74560566, (byte) 3513137, (byte) 6827336, (byte) 8088934, (byte) 357720, (byte) 17207, (byte) 1123, (byte) 3380, (byte) 105521516, (byte) 886, (byte) 249026900, (byte) 32748102, (byte) 30313, (byte) 24431, (byte) 48, (byte) 90969});
            case 27:
                return new String(new byte[]{(byte) 37876017, (byte) 14640, (byte) 304, (byte) 34144818, (byte) 65332, (byte) 311, (byte) 220059184, (byte) 83065654, (byte) 102201, (byte) 28721, (byte) 125241, (byte) 226667577, (byte) 633938993});
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i2, Object obj) {
        this.f102a = i2;
    }

    public e(View view) {
        this.f102a = 4;
        if (Build.VERSION.SDK_INT >= 30) {
            new e(3, view);
        } else {
            new e(3, view);
        }
    }

    private final void k() {
    }

    private final void l(int i2, Serializable serializable) {
    }

    public void a(C0209m mVar, boolean z2) {
    }
}
