package t;

import A.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p.C0305a;
import q.h;
import r.i;

public final class m {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4702d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f4703e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4704a = new HashMap();
    public final boolean b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4705c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4703e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(C0476a aVar, String str) {
        int i2;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            Object obj = null;
            try {
                i2 = p.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (g.k(trim)) {
                    HashMap hashMap = constraintLayout.f1081m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1081m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        if (i4 != split.length) {
            return Arrays.copyOf(iArr, i4);
        }
        return iArr;
    }

    public static C0483h d(Context context, AttributeSet attributeSet) {
        C0483h hVar = new C0483h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f4706a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            k kVar = hVar.b;
            C0485j jVar = hVar.f4623c;
            l lVar = hVar.f4625e;
            C0484i iVar = hVar.f4624d;
            if (!(index == 1 || 23 == index || 24 == index)) {
                jVar.getClass();
                iVar.getClass();
                lVar.getClass();
            }
            SparseIntArray sparseIntArray = f4703e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    iVar.f4672o = f(obtainStyledAttributes, index, iVar.f4672o);
                    break;
                case 2:
                    iVar.f4631F = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4631F);
                    break;
                case 3:
                    iVar.f4671n = f(obtainStyledAttributes, index, iVar.f4671n);
                    break;
                case 4:
                    iVar.f4670m = f(obtainStyledAttributes, index, iVar.f4670m);
                    break;
                case 5:
                    iVar.f4679v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    iVar.f4683z = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f4683z);
                    break;
                case 7:
                    iVar.f4627A = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f4627A);
                    break;
                case 8:
                    iVar.f4632G = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4632G);
                    break;
                case 9:
                    iVar.f4676s = f(obtainStyledAttributes, index, iVar.f4676s);
                    break;
                case 10:
                    iVar.f4675r = f(obtainStyledAttributes, index, iVar.f4675r);
                    break;
                case 11:
                    iVar.f4637L = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4637L);
                    break;
                case 12:
                    iVar.f4638M = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4638M);
                    break;
                case 13:
                    iVar.f4634I = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4634I);
                    break;
                case 14:
                    iVar.f4636K = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4636K);
                    break;
                case 15:
                    iVar.f4639N = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4639N);
                    break;
                case 16:
                    iVar.f4635J = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4635J);
                    break;
                case 17:
                    iVar.f4657d = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f4657d);
                    break;
                case 18:
                    iVar.f4659e = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f4659e);
                    break;
                case 19:
                    iVar.f = obtainStyledAttributes.getFloat(index, iVar.f);
                    break;
                case 20:
                    iVar.f4677t = obtainStyledAttributes.getFloat(index, iVar.f4677t);
                    break;
                case 21:
                    iVar.f4655c = obtainStyledAttributes.getLayoutDimension(index, iVar.f4655c);
                    break;
                case 22:
                    int i3 = obtainStyledAttributes.getInt(index, kVar.f4688a);
                    kVar.f4688a = i3;
                    kVar.f4688a = f4702d[i3];
                    break;
                case 23:
                    iVar.b = obtainStyledAttributes.getLayoutDimension(index, iVar.b);
                    break;
                case 24:
                    iVar.f4629C = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4629C);
                    break;
                case 25:
                    iVar.f4661g = f(obtainStyledAttributes, index, iVar.f4661g);
                    break;
                case 26:
                    iVar.f4663h = f(obtainStyledAttributes, index, iVar.f4663h);
                    break;
                case 27:
                    iVar.f4628B = obtainStyledAttributes.getInt(index, iVar.f4628B);
                    break;
                case 28:
                    iVar.D = obtainStyledAttributes.getDimensionPixelSize(index, iVar.D);
                    break;
                case 29:
                    iVar.f4665i = f(obtainStyledAttributes, index, iVar.f4665i);
                    break;
                case 30:
                    iVar.f4667j = f(obtainStyledAttributes, index, iVar.f4667j);
                    break;
                case 31:
                    iVar.f4633H = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4633H);
                    break;
                case 32:
                    iVar.f4673p = f(obtainStyledAttributes, index, iVar.f4673p);
                    break;
                case 33:
                    iVar.f4674q = f(obtainStyledAttributes, index, iVar.f4674q);
                    break;
                case 34:
                    iVar.f4630E = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4630E);
                    break;
                case 35:
                    iVar.f4669l = f(obtainStyledAttributes, index, iVar.f4669l);
                    break;
                case 36:
                    iVar.f4668k = f(obtainStyledAttributes, index, iVar.f4668k);
                    break;
                case 37:
                    iVar.f4678u = obtainStyledAttributes.getFloat(index, iVar.f4678u);
                    break;
                case 38:
                    hVar.f4622a = obtainStyledAttributes.getResourceId(index, hVar.f4622a);
                    break;
                case 39:
                    iVar.f4641P = obtainStyledAttributes.getFloat(index, iVar.f4641P);
                    break;
                case 40:
                    iVar.f4640O = obtainStyledAttributes.getFloat(index, iVar.f4640O);
                    break;
                case 41:
                    iVar.f4642Q = obtainStyledAttributes.getInt(index, iVar.f4642Q);
                    break;
                case 42:
                    iVar.f4643R = obtainStyledAttributes.getInt(index, iVar.f4643R);
                    break;
                case 43:
                    kVar.f4689c = obtainStyledAttributes.getFloat(index, kVar.f4689c);
                    break;
                case 44:
                    lVar.f4700k = true;
                    lVar.f4701l = obtainStyledAttributes.getDimension(index, lVar.f4701l);
                    break;
                case 45:
                    lVar.b = obtainStyledAttributes.getFloat(index, lVar.b);
                    break;
                case 46:
                    lVar.f4693c = obtainStyledAttributes.getFloat(index, lVar.f4693c);
                    break;
                case 47:
                    lVar.f4694d = obtainStyledAttributes.getFloat(index, lVar.f4694d);
                    break;
                case 48:
                    lVar.f4695e = obtainStyledAttributes.getFloat(index, lVar.f4695e);
                    break;
                case 49:
                    lVar.f = obtainStyledAttributes.getDimension(index, lVar.f);
                    break;
                case 50:
                    lVar.f4696g = obtainStyledAttributes.getDimension(index, lVar.f4696g);
                    break;
                case 51:
                    lVar.f4697h = obtainStyledAttributes.getDimension(index, lVar.f4697h);
                    break;
                case 52:
                    lVar.f4698i = obtainStyledAttributes.getDimension(index, lVar.f4698i);
                    break;
                case 53:
                    lVar.f4699j = obtainStyledAttributes.getDimension(index, lVar.f4699j);
                    break;
                case 54:
                    iVar.f4644S = obtainStyledAttributes.getInt(index, iVar.f4644S);
                    break;
                case 55:
                    iVar.f4645T = obtainStyledAttributes.getInt(index, iVar.f4645T);
                    break;
                case 56:
                    iVar.f4646U = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4646U);
                    break;
                case 57:
                    iVar.f4647V = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4647V);
                    break;
                case 58:
                    iVar.f4648W = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4648W);
                    break;
                case 59:
                    iVar.f4649X = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4649X);
                    break;
                case 60:
                    lVar.f4692a = obtainStyledAttributes.getFloat(index, lVar.f4692a);
                    break;
                case 61:
                    iVar.f4680w = f(obtainStyledAttributes, index, iVar.f4680w);
                    break;
                case 62:
                    iVar.f4681x = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4681x);
                    break;
                case 63:
                    iVar.f4682y = obtainStyledAttributes.getFloat(index, iVar.f4682y);
                    break;
                case 64:
                    jVar.f4685a = f(obtainStyledAttributes, index, jVar.f4685a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = C0305a.f3776a[obtainStyledAttributes.getInteger(index, 0)];
                        jVar.getClass();
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        jVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    jVar.getClass();
                    break;
                case 67:
                    jVar.f4687d = obtainStyledAttributes.getFloat(index, jVar.f4687d);
                    break;
                case 68:
                    kVar.f4690d = obtainStyledAttributes.getFloat(index, kVar.f4690d);
                    break;
                case 69:
                    iVar.f4650Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    iVar.f4651Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    iVar.f4653a0 = obtainStyledAttributes.getInt(index, iVar.f4653a0);
                    break;
                case 73:
                    iVar.f4654b0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f4654b0);
                    break;
                case 74:
                    iVar.e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    iVar.f4666i0 = obtainStyledAttributes.getBoolean(index, iVar.f4666i0);
                    break;
                case 76:
                    jVar.b = obtainStyledAttributes.getInt(index, jVar.b);
                    break;
                case 77:
                    iVar.f4660f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    kVar.b = obtainStyledAttributes.getInt(index, kVar.b);
                    break;
                case 79:
                    jVar.f4686c = obtainStyledAttributes.getFloat(index, jVar.f4686c);
                    break;
                case 80:
                    iVar.f4662g0 = obtainStyledAttributes.getBoolean(index, iVar.f4662g0);
                    break;
                case 81:
                    iVar.f4664h0 = obtainStyledAttributes.getBoolean(index, iVar.f4664h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return hVar;
    }

    public static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [t.a, t.c, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v4, types: [r.a, r.i] */
    public final void a(ConstraintLayout constraintLayout) {
        int i2;
        HashSet hashSet;
        HashSet hashSet2;
        String str;
        m mVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i3 = 1;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = mVar.f4705c;
        HashSet hashSet3 = new HashSet(hashMap.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout2.getChildAt(i4);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else if (mVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet3.remove(Integer.valueOf(id));
                    C0483h hVar = (C0483h) hashMap.get(Integer.valueOf(id));
                    if (childAt instanceof C0476a) {
                        hVar.f4624d.f4656c0 = i3;
                    }
                    int i5 = hVar.f4624d.f4656c0;
                    if (i5 != -1 && i5 == i3) {
                        C0476a aVar = (C0476a) childAt;
                        aVar.setId(id);
                        C0484i iVar = hVar.f4624d;
                        aVar.setType(iVar.f4653a0);
                        aVar.setMargin(iVar.f4654b0);
                        aVar.setAllowsGoneWidget(iVar.f4666i0);
                        int[] iArr = iVar.f4658d0;
                        if (iArr != null) {
                            aVar.setReferencedIds(iArr);
                        } else {
                            String str2 = iVar.e0;
                            if (str2 != null) {
                                int[] c2 = c(aVar, str2);
                                iVar.f4658d0 = c2;
                                aVar.setReferencedIds(c2);
                            }
                        }
                    }
                    C0480e eVar = (C0480e) childAt.getLayoutParams();
                    eVar.a();
                    hVar.a(eVar);
                    HashMap hashMap2 = hVar.f;
                    Class<?> cls = childAt.getClass();
                    for (String str3 : hashMap2.keySet()) {
                        C0477b bVar = (C0477b) hashMap2.get(str3);
                        int i6 = childCount;
                        String str4 = "set" + str3;
                        try {
                            int b2 = h.b(bVar.f4545a);
                            Class cls2 = Integer.TYPE;
                            Class cls3 = Float.TYPE;
                            switch (b2) {
                                case 0:
                                    hashSet2 = hashSet3;
                                    cls.getMethod(str4, new Class[]{cls2}).invoke(childAt, new Object[]{Integer.valueOf(bVar.b)});
                                    break;
                                case 1:
                                    hashSet2 = hashSet3;
                                    cls.getMethod(str4, new Class[]{cls3}).invoke(childAt, new Object[]{Float.valueOf(bVar.f4546c)});
                                    break;
                                case 2:
                                    hashSet2 = hashSet3;
                                    cls.getMethod(str4, new Class[]{cls2}).invoke(childAt, new Object[]{Integer.valueOf(bVar.f)});
                                    break;
                                case 3:
                                    hashSet2 = hashSet3;
                                    Method method = cls.getMethod(str4, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(bVar.f);
                                    method.invoke(childAt, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    hashSet2 = hashSet3;
                                    cls.getMethod(str4, new Class[]{CharSequence.class}).invoke(childAt, new Object[]{bVar.f4547d});
                                    break;
                                case 5:
                                    hashSet2 = hashSet3;
                                    cls.getMethod(str4, new Class[]{Boolean.TYPE}).invoke(childAt, new Object[]{Boolean.valueOf(bVar.f4548e)});
                                    break;
                                case 6:
                                    hashSet2 = hashSet3;
                                    try {
                                        cls.getMethod(str4, new Class[]{cls3}).invoke(childAt, new Object[]{Float.valueOf(bVar.f4546c)});
                                    } catch (NoSuchMethodException e2) {
                                        e = e2;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                                        childCount = i6;
                                        hashSet3 = hashSet2;
                                    } catch (IllegalAccessException e3) {
                                        e = e3;
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        e.printStackTrace();
                                        childCount = i6;
                                        hashSet3 = hashSet2;
                                    } catch (InvocationTargetException e4) {
                                        e = e4;
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        e.printStackTrace();
                                        childCount = i6;
                                        hashSet3 = hashSet2;
                                    }
                                default:
                                    hashSet2 = hashSet3;
                                    break;
                            }
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            hashSet2 = hashSet3;
                            Log.e("TransitionLayout", e.getMessage());
                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                            childCount = i6;
                            hashSet3 = hashSet2;
                        } catch (IllegalAccessException e6) {
                            e = e6;
                            hashSet2 = hashSet3;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                            e.printStackTrace();
                            childCount = i6;
                            hashSet3 = hashSet2;
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            hashSet2 = hashSet3;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                            e.printStackTrace();
                            childCount = i6;
                            hashSet3 = hashSet2;
                        }
                    }
                    i2 = childCount;
                    hashSet = hashSet3;
                    childAt.setLayoutParams(eVar);
                    k kVar = hVar.b;
                    if (kVar.b == 0) {
                        childAt.setVisibility(kVar.f4688a);
                    }
                    childAt.setAlpha(kVar.f4689c);
                    l lVar = hVar.f4625e;
                    childAt.setRotation(lVar.f4692a);
                    childAt.setRotationX(lVar.b);
                    childAt.setRotationY(lVar.f4693c);
                    childAt.setScaleX(lVar.f4694d);
                    childAt.setScaleY(lVar.f4695e);
                    if (!Float.isNaN(lVar.f)) {
                        childAt.setPivotX(lVar.f);
                    }
                    if (!Float.isNaN(lVar.f4696g)) {
                        childAt.setPivotY(lVar.f4696g);
                    }
                    childAt.setTranslationX(lVar.f4697h);
                    childAt.setTranslationY(lVar.f4698i);
                    childAt.setTranslationZ(lVar.f4699j);
                    if (lVar.f4700k) {
                        childAt.setElevation(lVar.f4701l);
                    }
                } else {
                    i2 = childCount;
                    hashSet = hashSet3;
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
                i4++;
                mVar = this;
                childCount = i2;
                hashSet3 = hashSet;
                i3 = 1;
            }
            i2 = childCount;
            hashSet = hashSet3;
            i4++;
            mVar = this;
            childCount = i2;
            hashSet3 = hashSet;
            i3 = 1;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0483h hVar2 = (C0483h) hashMap.get(num);
            C0484i iVar2 = hVar2.f4624d;
            int i7 = iVar2.f4656c0;
            if (i7 != -1 && i7 == 1) {
                Context context = constraintLayout2.getContext();
                ? view = new View(context);
                view.f4549a = new int[32];
                view.f = new HashMap();
                view.f4550c = context;
                ? iVar3 = new i();
                iVar3.f4263f0 = 0;
                iVar3.f4264g0 = true;
                iVar3.f4265h0 = 0;
                view.f4544i = iVar3;
                view.f4551d = iVar3;
                view.g();
                view.setVisibility(8);
                view.setId(num.intValue());
                int[] iArr2 = iVar2.f4658d0;
                if (iArr2 != null) {
                    view.setReferencedIds(iArr2);
                } else {
                    String str5 = iVar2.e0;
                    if (str5 != null) {
                        int[] c3 = c(view, str5);
                        iVar2.f4658d0 = c3;
                        view.setReferencedIds(c3);
                    }
                }
                view.setType(iVar2.f4653a0);
                view.setMargin(iVar2.f4654b0);
                C0480e a2 = ConstraintLayout.a();
                view.g();
                hVar2.a(a2);
                constraintLayout2.addView(view, a2);
            }
            if (iVar2.f4652a) {
                o oVar = new o(constraintLayout2.getContext());
                oVar.setId(num.intValue());
                C0480e a3 = ConstraintLayout.a();
                hVar2.a(a3);
                constraintLayout2.addView(oVar, a3);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = mVar.f4705c;
        hashMap.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            C0480e eVar = (C0480e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!mVar.b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C0483h());
                }
                C0483h hVar = (C0483h) hashMap.get(Integer.valueOf(id));
                HashMap hashMap2 = mVar.f4704a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0477b bVar = (C0477b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0477b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0477b(bVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(childAt, (Object[]) null)));
                        }
                    } catch (NoSuchMethodException e2) {
                        e2.printStackTrace();
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                hVar.f = hashMap3;
                hVar.f4622a = id;
                int i3 = eVar.f4584d;
                C0484i iVar = hVar.f4624d;
                iVar.f4661g = i3;
                iVar.f4663h = eVar.f4586e;
                iVar.f4665i = eVar.f;
                iVar.f4667j = eVar.f4588g;
                iVar.f4668k = eVar.f4590h;
                iVar.f4669l = eVar.f4592i;
                iVar.f4670m = eVar.f4594j;
                iVar.f4671n = eVar.f4596k;
                iVar.f4672o = eVar.f4598l;
                iVar.f4673p = eVar.f4602p;
                iVar.f4674q = eVar.f4603q;
                iVar.f4675r = eVar.f4604r;
                iVar.f4676s = eVar.f4605s;
                iVar.f4677t = eVar.f4612z;
                iVar.f4678u = eVar.f4554A;
                iVar.f4679v = eVar.f4555B;
                iVar.f4680w = eVar.f4599m;
                iVar.f4681x = eVar.f4600n;
                iVar.f4682y = eVar.f4601o;
                iVar.f4683z = eVar.f4568P;
                iVar.f4627A = eVar.f4569Q;
                iVar.f4628B = eVar.f4570R;
                iVar.f = eVar.f4582c;
                iVar.f4657d = eVar.f4579a;
                iVar.f4659e = eVar.b;
                iVar.b = eVar.width;
                iVar.f4655c = eVar.height;
                iVar.f4629C = eVar.leftMargin;
                iVar.D = eVar.rightMargin;
                iVar.f4630E = eVar.topMargin;
                iVar.f4631F = eVar.bottomMargin;
                iVar.f4640O = eVar.f4557E;
                iVar.f4641P = eVar.D;
                iVar.f4643R = eVar.f4559G;
                iVar.f4642Q = eVar.f4558F;
                iVar.f4662g0 = eVar.f4571S;
                iVar.f4664h0 = eVar.f4572T;
                iVar.f4644S = eVar.f4560H;
                iVar.f4645T = eVar.f4561I;
                iVar.f4646U = eVar.f4564L;
                iVar.f4647V = eVar.f4565M;
                iVar.f4648W = eVar.f4562J;
                iVar.f4649X = eVar.f4563K;
                iVar.f4650Y = eVar.f4566N;
                iVar.f4651Z = eVar.f4567O;
                iVar.f4660f0 = eVar.f4573U;
                iVar.f4635J = eVar.f4607u;
                iVar.f4637L = eVar.f4609w;
                iVar.f4634I = eVar.f4606t;
                iVar.f4636K = eVar.f4608v;
                iVar.f4639N = eVar.f4610x;
                iVar.f4638M = eVar.f4611y;
                iVar.f4632G = eVar.getMarginEnd();
                iVar.f4633H = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                k kVar = hVar.b;
                kVar.f4688a = visibility;
                kVar.f4689c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                l lVar = hVar.f4625e;
                lVar.f4692a = rotation;
                lVar.b = childAt.getRotationX();
                lVar.f4693c = childAt.getRotationY();
                lVar.f4694d = childAt.getScaleX();
                lVar.f4695e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    lVar.f = pivotX;
                    lVar.f4696g = pivotY;
                }
                lVar.f4697h = childAt.getTranslationX();
                lVar.f4698i = childAt.getTranslationY();
                lVar.f4699j = childAt.getTranslationZ();
                if (lVar.f4700k) {
                    lVar.f4701l = childAt.getElevation();
                }
                if (childAt instanceof C0476a) {
                    C0476a aVar = (C0476a) childAt;
                    iVar.f4666i0 = aVar.f4544i.f4264g0;
                    iVar.f4658d0 = aVar.getReferencedIds();
                    iVar.f4653a0 = aVar.getType();
                    iVar.f4654b0 = aVar.getMargin();
                }
                i2++;
                mVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0483h d2 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f4624d.f4652a = true;
                    }
                    this.f4705c.put(Integer.valueOf(d2.f4622a), d2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
