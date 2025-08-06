package A;

import B.b;
import B.f;
import E0.u;
import I.D;
import I.O;
import I.W;
import N.g;
import O.c;
import O.d;
import O.e;
import O.m;
import O.n;
import O.o;
import O.p;
import O.q;
import O0.a;
import Q0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import k.B;
import k.C0245h0;
import t0.C0486a;
import w0.C0492a;
import z.C0507f;

public abstract class i implements W {

    /* renamed from: a  reason: collision with root package name */
    public static Method f9a = null;
    public static boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public static Method f10c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f11d = false;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f12e = false;
    public static Method f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f13g = false;

    /* renamed from: h  reason: collision with root package name */
    public static Field f14h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f15i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f16j;

    /* renamed from: k  reason: collision with root package name */
    public static Method f17k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f18l;

    /* renamed from: m  reason: collision with root package name */
    public static Field f19m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f20n;

    public i() {
        new ConcurrentHashMap();
    }

    public static Path A(String str) {
        Path path = new Path();
        try {
            h.b(z(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static h[] B(h[] hVarArr) {
        h[] hVarArr2 = new h[hVarArr.length];
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            hVarArr2[i2] = new h(hVarArr[i2]);
        }
        return hVarArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: type inference failed for: r1v5, types: [I.N, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean C(android.view.View r3, android.view.KeyEvent r4) {
        /*
            java.util.WeakHashMap r0 = I.O.f393a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000a
            goto L_0x009d
        L_0x000a:
            java.util.ArrayList r0 = I.N.f390d
            r0 = 2131231135(0x7f08019f, float:1.8078342E38)
            java.lang.Object r1 = r3.getTag(r0)
            I.N r1 = (I.N) r1
            r2 = 0
            if (r1 != 0) goto L_0x0026
            I.N r1 = new I.N
            r1.<init>()
            r1.f391a = r2
            r1.b = r2
            r1.f392c = r2
            r3.setTag(r0, r1)
        L_0x0026:
            java.lang.ref.WeakReference r3 = r1.f392c
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L_0x0031
            goto L_0x009d
        L_0x0031:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r1.f392c = r3
            android.util.SparseArray r3 = r1.b
            if (r3 != 0) goto L_0x0043
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.b = r3
        L_0x0043:
            android.util.SparseArray r3 = r1.b
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L_0x005f
            int r0 = r4.getKeyCode()
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x005f
            java.lang.Object r2 = r3.valueAt(r0)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r3.removeAt(r0)
        L_0x005f:
            if (r2 != 0) goto L_0x006c
            int r4 = r4.getKeyCode()
            java.lang.Object r3 = r3.get(r4)
            r2 = r3
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
        L_0x006c:
            if (r2 == 0) goto L_0x009d
            java.lang.Object r3 = r2.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x009c
            boolean r4 = r3.isAttachedToWindow()
            if (r4 == 0) goto L_0x009c
            r4 = 2131231136(0x7f0801a0, float:1.8078344E38)
            java.lang.Object r3 = r3.getTag(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x009c
            int r4 = r3.size()
            int r4 = r4 - r1
            if (r4 >= 0) goto L_0x008f
            goto L_0x009c
        L_0x008f:
            java.lang.Object r3 = r3.get(r4)
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L_0x009c:
            return r1
        L_0x009d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.C(android.view.View, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean D(I.C0018j r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0006
            goto L_0x00e7
        L_0x0006:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0011
            boolean r7 = r7.c(r10)
            return r7
        L_0x0011:
            boolean r2 = r9 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0084
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0067
            android.app.ActionBar r8 = r9.getActionBar()
            int r2 = r10.getKeyCode()
            r4 = 82
            if (r2 != r4) goto L_0x0067
            if (r8 == 0) goto L_0x0067
            boolean r2 = f12e
            if (r2 != 0) goto L_0x004d
            java.lang.Class r2 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x004b }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004b }
            f = r2     // Catch:{ NoSuchMethodException -> 0x004b }
        L_0x004b:
            f12e = r0
        L_0x004d:
            java.lang.reflect.Method r2 = f
            if (r2 == 0) goto L_0x0064
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0063 }
            r4[r1] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0063 }
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0063 }
            if (r8 != 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0063 }
            boolean r1 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x0083
        L_0x0067:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006e
            goto L_0x0083
        L_0x006e:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = I.O.b(r7, r10)
            if (r8 == 0) goto L_0x0079
            goto L_0x0083
        L_0x0079:
            if (r7 == 0) goto L_0x007f
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L_0x007f:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L_0x0083:
            return r0
        L_0x0084:
            boolean r2 = r9 instanceof android.app.Dialog
            if (r2 == 0) goto L_0x00d8
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f13g
            if (r7 != 0) goto L_0x009d
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x009b }
            f14h = r7     // Catch:{ NoSuchFieldException -> 0x009b }
            r7.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x009b }
        L_0x009b:
            f13g = r0
        L_0x009d:
            java.lang.reflect.Field r7 = f14h
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a8 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a8 }
            goto L_0x00aa
        L_0x00a8:
        L_0x00a9:
            r7 = r3
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b7
            goto L_0x00d7
        L_0x00b7:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00c2
            goto L_0x00d7
        L_0x00c2:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = I.O.b(r7, r10)
            if (r8 == 0) goto L_0x00cd
            goto L_0x00d7
        L_0x00cd:
            if (r7 == 0) goto L_0x00d3
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L_0x00d3:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L_0x00d7:
            return r0
        L_0x00d8:
            if (r8 == 0) goto L_0x00e0
            boolean r8 = I.O.b(r8, r10)
            if (r8 != 0) goto L_0x00e6
        L_0x00e0:
            boolean r7 = r7.c(r10)
            if (r7 == 0) goto L_0x00e7
        L_0x00e6:
            return r0
        L_0x00e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.D(I.j, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static Drawable F(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(compoundButton);
        }
        if (!f16j) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f15i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f16j = true;
        }
        Field field = f15i;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f15i = null;
            }
        }
        return null;
    }

    public static ColorStateList G(Context context, g gVar, int i2) {
        int resourceId;
        ColorStateList g2;
        TypedArray typedArray = (TypedArray) gVar.f606c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (g2 = C0486a.g(context, resourceId)) == null) {
            return gVar.o(i2);
        }
        return g2;
    }

    public static ColorStateList H(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList g2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (g2 = C0486a.g(context, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return g2;
    }

    public static float J(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable K(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable v2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (v2 = l.v(context, resourceId)) == null) {
            return typedArray.getDrawable(i2);
        }
        return v2;
    }

    public static int N(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(drawable);
        }
        if (!f11d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", (Class[]) null);
                f10c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f11d = true;
        }
        Method method = f10c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, (Object[]) null)).intValue();
        } catch (Exception e3) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
            f10c = null;
            return 0;
        }
    }

    public static File T(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i2 = 0;
        while (i2 < 100) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i2++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static G.g U(C0245h0 h0Var) {
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new G.g(p.c(h0Var));
        }
        TextPaint textPaint = new TextPaint(h0Var.getPaint());
        boolean z2 = false;
        if (i4 >= 23) {
            i3 = 1;
            i2 = 1;
        } else {
            i3 = 0;
            i2 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i4 >= 23) {
            i3 = n.a(h0Var);
            i2 = n.d(h0Var);
        }
        if (h0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 < 28 || (h0Var.getInputType() & 15) != 3) {
            if (h0Var.getLayoutDirection() == 1) {
                z2 = true;
            }
            switch (h0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(p.b(o.a(h0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new G.g(textPaint, textDirectionHeuristic, i3, i2);
    }

    public static int V(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(g.f(i2, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean W(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static boolean Y(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static Typeface b0(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, l(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static MappedByteBuffer c0(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th2;
            throw th;
        } catch (IOException unused) {
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    public static void d(Throwable th, Throwable th2) {
        U0.i.e("<this>", th);
        if (th != th2) {
            Integer num = a.f638a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = N0.a.f608a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = y0(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                B.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                B.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                B.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static float f0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f2, f3);
        }
        d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void g0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = y0(drawable).mutate();
            B.a.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static boolean h(h[] hVarArr, h[] hVarArr2) {
        if (hVarArr == null || hVarArr2 == null || hVarArr.length != hVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            h hVar = hVarArr[i2];
            char c2 = hVar.f8a;
            h hVar2 = hVarArr2[i2];
            if (c2 != hVar2.f8a || hVar.b.length != hVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static TypedValue h0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static void i(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean i0(Context context, int i2, boolean z2) {
        TypedValue h02 = h0(context, i2);
        if (h02 == null || h02.type != 18) {
            return z2;
        }
        if (h02.data != 0) {
            return true;
        }
        return false;
    }

    public static void j(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static TypedValue j0(Context context, int i2, String str) {
        TypedValue h02 = h0(context, i2);
        if (h02 != null) {
            return h02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    public static void k(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int l(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        if (i2 > i4) {
            return i4;
        }
        return i2;
    }

    public static void m(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof B.e) {
            m(((f) ((B.e) drawable)).f);
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    m(child);
                }
            }
        }
    }

    public static void m0(TextView textView, int i2) {
        int i3;
        j(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final void n(Closeable closeable, Throwable th) {
        try {
            closeable.close();
        } catch (Throwable th2) {
            d(th, th2);
        }
    }

    public static void n0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z2;
        WeakHashMap weakHashMap = O.f393a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (hasOnClickListeners || z2) {
            z3 = true;
        }
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z3) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void o0(TextView textView, int i2) {
        int i3;
        j(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static ImageView.ScaleType p(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i2 != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public static boolean p0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(drawable, i2);
        }
        if (!b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f9a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            b = true;
        }
        Method method = f9a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i2)});
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f9a = null;
            }
        }
        return false;
    }

    public static float[] q(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static void q0(B b2, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.c(b2, z2);
            return;
        }
        if (!f20n) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f19m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f20n = true;
        }
        Field field = f19m;
        if (field != null) {
            try {
                field.set(b2, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static final long r(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static void r0(View view, E0.g gVar) {
        C0492a aVar = gVar.f118a.b;
        if (aVar != null && aVar.f4749a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = O.f393a;
                f2 += D.i((View) parent);
            }
            E0.f fVar = gVar.f118a;
            if (fVar.f112l != f2) {
                fVar.f112l = f2;
                gVar.m();
            }
        }
    }

    public static boolean s(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean t2 = t(file, inputStream);
                o(inputStream);
                return t2;
            } catch (Throwable th) {
                th = th;
                o(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            o(inputStream);
            throw th;
        }
    }

    public static void s0(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static boolean t(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        o(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                o(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            o(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static void t0(Drawable drawable, int i2) {
        B.a.g(drawable, i2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, A.i] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, A.i] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, A.i] */
    public static i u(int i2) {
        if (i2 == 0) {
            return new Object();
        }
        if (i2 != 1) {
            return new Object();
        }
        return new Object();
    }

    public static void u0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(popupWindow, i2);
            return;
        }
        if (!f18l) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f17k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f18l = true;
        }
        Method method = f17k;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i2)});
            } catch (Exception unused2) {
            }
        }
    }

    public static ActionMode.Callback w0(ActionMode.Callback callback) {
        if (!(callback instanceof q) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((q) callback).f634a;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [B.f, android.graphics.drawable.Drawable] */
    public static Drawable y0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof B.d)) {
            return drawable;
        }
        ? drawable2 = new Drawable();
        drawable2.f46d = drawable2.c();
        drawable2.h(drawable);
        f.a();
        return drawable2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r13 = false;
        r15 = true;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r13 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[Catch:{ NumberFormatException -> 0x00ac }, LOOP:3: B:22:0x006a->B:41:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static A.h[] z(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r4 = 1
            r5 = 0
        L_0x000a:
            int r6 = r0.length()
            if (r4 >= r6) goto L_0x00e0
        L_0x0010:
            int r6 = r0.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0036
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002e
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0033
        L_0x002e:
            if (r6 == r8) goto L_0x0033
            if (r6 == r7) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0036:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d9
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00cb
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0056
            goto L_0x00cb
        L_0x0056:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00ac }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            r10 = 1
            r11 = 0
        L_0x0062:
            if (r10 >= r9) goto L_0x00b6
            r12 = r10
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x006a:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            if (r12 >= r3) goto L_0x009c
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00ac }
            r2 = 32
            if (r3 == r2) goto L_0x0093
            if (r3 == r7) goto L_0x0091
            if (r3 == r8) goto L_0x0091
            switch(r3) {
                case 44: goto L_0x0093;
                case 45: goto L_0x008a;
                case 46: goto L_0x0080;
                default: goto L_0x007f;
            }     // Catch:{ NumberFormatException -> 0x00ac }
        L_0x007f:
            goto L_0x008f
        L_0x0080:
            if (r14 != 0) goto L_0x0085
            r13 = 0
            r14 = 1
            goto L_0x0095
        L_0x0085:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0095
        L_0x008a:
            if (r12 == r10) goto L_0x008f
            if (r13 != 0) goto L_0x008f
            goto L_0x0085
        L_0x008f:
            r13 = 0
            goto L_0x0095
        L_0x0091:
            r13 = 1
            goto L_0x0095
        L_0x0093:
            r13 = 0
            r15 = 1
        L_0x0095:
            if (r15 == 0) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x006a
        L_0x009c:
            if (r10 >= r12) goto L_0x00ae
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00ac }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00ac }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00ac }
            r11 = r2
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            goto L_0x00bd
        L_0x00ae:
            if (r16 == 0) goto L_0x00b3
            r10 = r12
        L_0x00b1:
            r2 = 0
            goto L_0x0062
        L_0x00b3:
            int r10 = r12 + 1
            goto L_0x00b1
        L_0x00b6:
            float[] r2 = q(r6, r11)     // Catch:{ NumberFormatException -> 0x00ac }
            r3 = r2
            r2 = 0
            goto L_0x00cd
        L_0x00bd:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = A.g.i(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r3 = new float[r2]
        L_0x00cd:
            char r5 = r5.charAt(r2)
            A.h r2 = new A.h
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d9:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00e0:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00fa
            int r2 = r0.length()
            if (r5 >= r2) goto L_0x00fa
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            A.h r4 = new A.h
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            A.h[] r0 = new A.h[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            A.h[] r0 = (A.h[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.z(java.lang.String):A.h[]");
    }

    public static ActionMode.Callback z0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i2 > 27 || (callback instanceof q) || callback == null) {
            return callback;
        }
        return new q(callback, textView);
    }

    public F.m E(int i2, F.m[] mVarArr) {
        int i3;
        boolean z2;
        int i4;
        new E0.e(1);
        if ((i2 & 1) == 0) {
            i3 = 400;
        } else {
            i3 = 700;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        F.m mVar = null;
        int i5 = Integer.MAX_VALUE;
        for (F.m mVar2 : mVarArr) {
            int abs = Math.abs(mVar2.f212c - i3) * 2;
            if (mVar2.f213d == z2) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i6 = abs + i4;
            if (mVar == null || i5 > i6) {
                mVar = mVar2;
                i5 = i6;
            }
        }
        return mVar;
    }

    public abstract void I(u uVar, float f2, float f3);

    public abstract int L();

    public abstract int M();

    public abstract int O();

    public abstract int P();

    public abstract int Q(View view);

    public abstract int R(CoordinatorLayout coordinatorLayout);

    public abstract int S();

    public abstract boolean X(float f2);

    public abstract boolean Z(View view);

    public abstract boolean a0(float f2, float f3);

    public abstract void d0(int i2);

    public abstract void e0(Typeface typeface, boolean z2);

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i2);

    public abstract Typeface v(Context context, C0507f fVar, Resources resources, int i2);

    public abstract boolean v0(View view, float f2);

    public abstract Typeface w(Context context, F.m[] mVarArr, int i2);

    public Typeface x(Context context, InputStream inputStream) {
        File T2 = T(context);
        if (T2 == null) {
            return null;
        }
        try {
            if (!t(T2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(T2.getPath());
            T2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            T2.delete();
        }
    }

    public abstract void x0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public Typeface y(Context context, Resources resources, int i2, String str, int i3) {
        File T2 = T(context);
        if (T2 == null) {
            return null;
        }
        try {
            if (!s(T2, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(T2.getPath());
            T2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            T2.delete();
        }
    }

    public void k0(boolean z2) {
    }

    public void l0(boolean z2) {
    }

    public void b() {
    }

    public void c() {
    }
}
