package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import h0.C0173a;
import h0.C0174b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0173a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1106a;
        boolean z2 = true;
        if (aVar.e(1)) {
            obj = aVar.g();
        }
        remoteActionCompat.f1106a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0174b) aVar).f2902e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1107c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0174b) aVar).f2902e);
        }
        remoteActionCompat.f1107c = charSequence2;
        remoteActionCompat.f1108d = (PendingIntent) aVar.f(remoteActionCompat.f1108d, 4);
        boolean z3 = remoteActionCompat.f1109e;
        if (aVar.e(5)) {
            if (((C0174b) aVar).f2902e.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        remoteActionCompat.f1109e = z3;
        boolean z4 = remoteActionCompat.f;
        if (!aVar.e(6)) {
            z2 = z4;
        } else if (((C0174b) aVar).f2902e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0173a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1106a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        aVar.h(2);
        Parcel parcel = ((C0174b) aVar).f2902e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1107c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1108d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1109e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
