package androidx.appcompat.view.menu;

import I.O;
import N.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.cheatbox.R;
import d.a;
import j.C0191A;
import j.C0211o;
import java.util.WeakHashMap;

public class ListMenuItemView extends LinearLayout implements C0191A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public C0211o f897a;
    public ImageView b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f898c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f899d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f900e;
    public TextView f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f901g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f902h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f903i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f904j;

    /* renamed from: k  reason: collision with root package name */
    public final int f905k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f906l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f907m;

    /* renamed from: n  reason: collision with root package name */
    public final Drawable f908n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f909o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutInflater f910p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f911q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g E2 = g.E(getContext(), attributeSet, a.f2208r, R.attr.MT_Bin);
        this.f904j = E2.p(5);
        TypedArray typedArray = (TypedArray) E2.f606c;
        this.f905k = typedArray.getResourceId(1, -1);
        this.f907m = typedArray.getBoolean(7, false);
        this.f906l = context;
        this.f908n = E2.p(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.MT_Bin, 0);
        this.f909o = obtainStyledAttributes.hasValue(0);
        E2.F();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f910p == null) {
            this.f910p = LayoutInflater.from(getContext());
        }
        return this.f910p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        int i2;
        ImageView imageView = this.f901g;
        if (imageView != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f902h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f902h.getLayoutParams();
            rect.top = this.f902h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r0 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(j.C0211o r11) {
        /*
            r10 = this;
            r10.f897a = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f3134e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            j.m r0 = r11.f3142n
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0038
            j.m r0 = r11.f3142n
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0032
            char r0 = r11.f3138j
            goto L_0x0034
        L_0x0032:
            char r0 = r11.f3136h
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            j.m r4 = r11.f3142n
            r4.n()
            if (r0 == 0) goto L_0x005f
            j.o r0 = r10.f897a
            j.m r4 = r0.f3142n
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005b
            j.m r4 = r0.f3142n
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0055
            char r0 = r0.f3138j
            goto L_0x0057
        L_0x0055:
            char r0 = r0.f3136h
        L_0x0057:
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = 8
        L_0x0061:
            if (r2 != 0) goto L_0x011f
            android.widget.TextView r0 = r10.f
            j.o r4 = r10.f897a
            j.m r5 = r4.f3142n
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0072
            char r5 = r4.f3138j
            goto L_0x0074
        L_0x0072:
            char r5 = r4.f3136h
        L_0x0074:
            if (r5 != 0) goto L_0x007a
            java.lang.String r1 = ""
            goto L_0x011c
        L_0x007a:
            j.m r6 = r4.f3142n
            android.content.Context r7 = r6.f3104a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f3104a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009d
            r9 = 2131689489(0x7f0f0011, float:1.9007995E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009d:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x00a6
            int r4 = r4.f3139k
            goto L_0x00a8
        L_0x00a6:
            int r4 = r4.f3137i
        L_0x00a8:
            r6 = 2131689485(0x7f0f000d, float:1.9007987E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            j.C0211o.c(r8, r4, r9, r6)
            r6 = 2131689481(0x7f0f0009, float:1.9007979E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            j.C0211o.c(r8, r4, r9, r6)
            r6 = 2131689480(0x7f0f0008, float:1.9007977E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            j.C0211o.c(r8, r4, r9, r6)
            r6 = 2131689486(0x7f0f000e, float:1.9007989E38)
            java.lang.String r6 = r7.getString(r6)
            j.C0211o.c(r8, r4, r3, r6)
            r3 = 2131689488(0x7f0f0010, float:1.9007993E38)
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            j.C0211o.c(r8, r4, r6, r3)
            r3 = 2131689484(0x7f0f000c, float:1.9007985E38)
            java.lang.String r3 = r7.getString(r3)
            j.C0211o.c(r8, r4, r1, r3)
            if (r5 == r1) goto L_0x010e
            r1 = 10
            if (r5 == r1) goto L_0x0103
            r1 = 32
            if (r5 == r1) goto L_0x00f8
            r8.append(r5)
            goto L_0x0118
        L_0x00f8:
            r1 = 2131689487(0x7f0f000f, float:1.900799E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0118
        L_0x0103:
            r1 = 2131689483(0x7f0f000b, float:1.9007983E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0118
        L_0x010e:
            r1 = 2131689482(0x7f0f000a, float:1.900798E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x0118:
            java.lang.String r1 = r8.toString()
        L_0x011c:
            r0.setText(r1)
        L_0x011f:
            android.widget.TextView r0 = r10.f
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x012c
            android.widget.TextView r0 = r10.f
            r0.setVisibility(r2)
        L_0x012c:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f3145q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(j.o):void");
    }

    public C0211o getItemData() {
        return this.f897a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = O.f393a;
        setBackground(this.f904j);
        TextView textView = (TextView) findViewById(R.id.MT_Bin);
        this.f899d = textView;
        int i2 = this.f905k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f906l, i2);
        }
        this.f = (TextView) findViewById(R.id.MT_Bin);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Bin);
        this.f901g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f908n);
        }
        this.f902h = (ImageView) findViewById(R.id.MT_Bin);
        this.f903i = (LinearLayout) findViewById(R.id.MT_Bin);
    }

    public final void onMeasure(int i2, int i3) {
        if (this.b != null && this.f907m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        View view;
        CompoundButton compoundButton;
        if (z2 || this.f898c != null || this.f900e != null) {
            if ((this.f897a.f3152x & 4) != 0) {
                if (this.f898c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.MT_Bin, this, false);
                    this.f898c = radioButton;
                    LinearLayout linearLayout = this.f903i;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f898c;
                view = this.f900e;
            } else {
                if (this.f900e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.MT_Bin, this, false);
                    this.f900e = checkBox;
                    LinearLayout linearLayout2 = this.f903i;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f900e;
                view = this.f898c;
            }
            if (z2) {
                compoundButton.setChecked(this.f897a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f900e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f898c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f897a.f3152x & 4) != 0) {
            if (this.f898c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.MT_Bin, this, false);
                this.f898c = radioButton;
                LinearLayout linearLayout = this.f903i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f898c;
        } else {
            if (this.f900e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.MT_Bin, this, false);
                this.f900e = checkBox;
                LinearLayout linearLayout2 = this.f903i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f900e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f911q = z2;
        this.f907m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        int i2;
        ImageView imageView = this.f902h;
        if (imageView != null) {
            if (this.f909o || !z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f897a.f3142n.getClass();
        boolean z2 = this.f911q;
        if (z2 || this.f907m) {
            ImageView imageView = this.b;
            if (imageView != null || drawable != null || this.f907m) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.MT_Bin, this, false);
                    this.b = imageView2;
                    LinearLayout linearLayout = this.f903i;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f907m) {
                    ImageView imageView3 = this.b;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.b.getVisibility() != 0) {
                        this.b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f899d.setText(charSequence);
            if (this.f899d.getVisibility() != 0) {
                this.f899d.setVisibility(0);
            }
        } else if (this.f899d.getVisibility() != 8) {
            this.f899d.setVisibility(8);
        }
    }
}
