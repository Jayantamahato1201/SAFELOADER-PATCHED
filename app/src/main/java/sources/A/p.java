package A;

import F.m;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import z.C0507f;
import z.C0508g;

public final class p extends i {
    public static Font A0(FontFamily fontFamily, int i2) {
        int i3;
        int i4;
        if ((i2 & 1) != 0) {
            i3 = 700;
        } else {
            i3 = 400;
        }
        if ((i2 & 2) != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        FontStyle fontStyle = new FontStyle(i3, i4);
        Font font = fontFamily.getFont(0);
        int B02 = B0(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int B03 = B0(fontStyle, font2.getStyle());
            if (B03 < B02) {
                font = font2;
                B02 = B03;
            }
        }
        return font;
    }

    public static int B0(FontStyle fontStyle, FontStyle fontStyle2) {
        int i2;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        return abs + i2;
    }

    public final m E(int i2, m[] mVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface v(Context context, C0507f fVar, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C0508g gVar : fVar.f4859a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f).setWeight(gVar.b).setSlant(gVar.f4861c ? 1 : 0).setTtcIndex(gVar.f4863e).setFontVariationSettings(gVar.f4862d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(A0(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface w(Context context, m[] mVarArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (m mVar : mVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(mVar.f211a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(mVar.f212c).setSlant(mVar.f213d ? 1 : 0).setTtcIndex(mVar.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(A0(build2, i2).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
        throw th;
    }

    public final Typeface x(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface y(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
