package A;

import F.m;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z.C0507f;
import z.C0508g;

public class n extends l {

    /* renamed from: t  reason: collision with root package name */
    public final Class f33t;

    /* renamed from: u  reason: collision with root package name */
    public final Constructor f34u;

    /* renamed from: v  reason: collision with root package name */
    public final Method f35v;

    /* renamed from: w  reason: collision with root package name */
    public final Method f36w;

    /* renamed from: x  reason: collision with root package name */
    public final Method f37x;

    /* renamed from: y  reason: collision with root package name */
    public final Method f38y;

    /* renamed from: z  reason: collision with root package name */
    public final Method f39z;

    public n() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor((Class[]) null);
            method4 = H0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3});
            method2 = cls2.getMethod("freeze", (Class[]) null);
            method = cls2.getMethod("abortCreation", (Class[]) null);
            Class<?> cls4 = cls2;
            method5 = I0(cls2);
            cls = cls4;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f33t = cls;
        this.f34u = constructor;
        this.f35v = method4;
        this.f36w = method3;
        this.f37x = method2;
        this.f38y = method;
        this.f39z = method5;
    }

    public static Method H0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final void C0(Object obj) {
        try {
            this.f38y.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean D0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f35v.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface E0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f33t, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f39z.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean F0(Object obj) {
        try {
            return ((Boolean) this.f37x.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object G0() {
        try {
            return this.f34u.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method I0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface v(Context context, C0507f fVar, Resources resources, int i2) {
        Method method = this.f35v;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            Object G02 = G0();
            if (G02 != null) {
                C0508g[] gVarArr = fVar.f4859a;
                int length = gVarArr.length;
                int i3 = 0;
                while (i3 < length) {
                    C0508g gVar = gVarArr[i3];
                    String str = gVar.f4860a;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gVar.f4862d);
                    Context context2 = context;
                    if (!D0(context2, G02, str, gVar.f4863e, gVar.b, gVar.f4861c ? 1 : 0, fromFontVariationSettings)) {
                        C0(G02);
                        return null;
                    }
                    i3++;
                    context = context2;
                }
                if (F0(G02)) {
                    return E0(G02);
                }
            }
            return null;
        }
        return super.v(context, fVar, resources, i2);
    }

    public final Typeface w(Context context, m[] mVarArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        Typeface E02;
        boolean z2;
        if (mVarArr.length >= 1) {
            Method method = this.f35v;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (m mVar : mVarArr) {
                    if (mVar.f214e == 0) {
                        Uri uri = mVar.f211a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, i.c0(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object G02 = G0();
                if (G02 != null) {
                    boolean z3 = false;
                    for (m mVar2 : mVarArr) {
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f211a);
                        if (byteBuffer != null) {
                            try {
                                z2 = ((Boolean) this.f36w.invoke(G02, new Object[]{byteBuffer, Integer.valueOf(mVar2.b), null, Integer.valueOf(mVar2.f212c), Integer.valueOf(mVar2.f213d ? 1 : 0)})).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z2 = false;
                            }
                            if (!z2) {
                                C0(G02);
                                return null;
                            }
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        C0(G02);
                        return null;
                    } else if (F0(G02) && (E02 = E0(G02)) != null) {
                        return Typeface.create(E02, i2);
                    }
                }
            } else {
                m E2 = E(i2, mVarArr);
                try {
                    openFileDescriptor = context.getContentResolver().openFileDescriptor(E2.f211a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(E2.f212c).setItalic(E2.f213d).build();
                        openFileDescriptor.close();
                        return build;
                    } else if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        return null;
        throw th;
    }

    public final Typeface y(Context context, Resources resources, int i2, String str, int i3) {
        Method method = this.f35v;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.y(context, resources, i2, str, i3);
        }
        Object G02 = G0();
        if (G02 != null) {
            if (!D0(context, G02, str, 0, -1, -1, (FontVariationAxis[]) null)) {
                C0(G02);
                return null;
            } else if (F0(G02)) {
                return E0(G02);
            }
        }
        return null;
    }
}
