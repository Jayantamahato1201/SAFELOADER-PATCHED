package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0173a;
import h0.C0174b;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(C0173a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1111a;
        if (aVar.e(1)) {
            i2 = ((C0174b) aVar).f2902e.readInt();
        }
        iconCompat.f1111a = i2;
        byte[] bArr = iconCompat.f1112c;
        if (aVar.e(2)) {
            Parcel parcel = ((C0174b) aVar).f2902e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1112c = bArr;
        iconCompat.f1113d = aVar.f(iconCompat.f1113d, 3);
        int i3 = iconCompat.f1114e;
        if (aVar.e(4)) {
            i3 = ((C0174b) aVar).f2902e.readInt();
        }
        iconCompat.f1114e = i3;
        int i4 = iconCompat.f;
        if (aVar.e(5)) {
            i4 = ((C0174b) aVar).f2902e.readInt();
        }
        iconCompat.f = i4;
        iconCompat.f1115g = (ColorStateList) aVar.f(iconCompat.f1115g, 6);
        String str = iconCompat.f1117i;
        if (aVar.e(7)) {
            str = ((C0174b) aVar).f2902e.readString();
        }
        iconCompat.f1117i = str;
        String str2 = iconCompat.f1118j;
        if (aVar.e(8)) {
            str2 = ((C0174b) aVar).f2902e.readString();
        }
        iconCompat.f1118j = str2;
        iconCompat.f1116h = PorterDuff.Mode.valueOf(iconCompat.f1117i);
        switch (iconCompat.f1111a) {
            case -1:
                Parcelable parcelable = iconCompat.f1113d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1113d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1112c;
                iconCompat.b = bArr3;
                iconCompat.f1111a = 3;
                iconCompat.f1114e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1112c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.f1111a == 2 && iconCompat.f1118j == null) {
                    iconCompat.f1118j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.b = iconCompat.f1112c;
                return iconCompat;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0173a aVar) {
        aVar.getClass();
        iconCompat.f1117i = iconCompat.f1116h.name();
        switch (iconCompat.f1111a) {
            case -1:
                iconCompat.f1113d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.f1113d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.f1112c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1112c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.f1112c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1111a;
        if (-1 != i2) {
            aVar.h(1);
            ((C0174b) aVar).f2902e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1112c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0174b) aVar).f2902e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1113d;
        if (parcelable != null) {
            aVar.h(3);
            ((C0174b) aVar).f2902e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1114e;
        if (i3 != 0) {
            aVar.h(4);
            ((C0174b) aVar).f2902e.writeInt(i3);
        }
        int i4 = iconCompat.f;
        if (i4 != 0) {
            aVar.h(5);
            ((C0174b) aVar).f2902e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1115g;
        if (colorStateList != null) {
            aVar.h(6);
            ((C0174b) aVar).f2902e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1117i;
        if (str != null) {
            aVar.h(7);
            ((C0174b) aVar).f2902e.writeString(str);
        }
        String str2 = iconCompat.f1118j;
        if (str2 != null) {
            aVar.h(8);
            ((C0174b) aVar).f2902e.writeString(str2);
        }
    }
}
