package U;

import A.g;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f731A;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f732k = {8, 8, 8};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f733l = {8};

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f734m = {-1, -40, -1};

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f735n = {79, 76, 89, 77, 80, 0};

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f736o = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: p  reason: collision with root package name */
    public static final String[] f737p = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f738q = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f739r = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: s  reason: collision with root package name */
    public static final c f740s = new c("StripOffsets", 273, 3);

    /* renamed from: t  reason: collision with root package name */
    public static final c[][] f741t;

    /* renamed from: u  reason: collision with root package name */
    public static final c[] f742u;

    /* renamed from: v  reason: collision with root package name */
    public static final HashMap[] f743v = new HashMap[10];

    /* renamed from: w  reason: collision with root package name */
    public static final HashMap[] f744w = new HashMap[10];

    /* renamed from: x  reason: collision with root package name */
    public static final HashSet f745x = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: y  reason: collision with root package name */
    public static final HashMap f746y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public static final Charset f747z;

    /* renamed from: a  reason: collision with root package name */
    public final String f748a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap[] f749c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f750d;

    /* renamed from: e  reason: collision with root package name */
    public ByteOrder f751e = ByteOrder.BIG_ENDIAN;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f752g;

    /* renamed from: h  reason: collision with root package name */
    public int f753h;

    /* renamed from: i  reason: collision with root package name */
    public int f754i;

    /* renamed from: j  reason: collision with root package name */
    public int f755j;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        c cVar = new c("NewSubfileType", 254, 4);
        c cVar2 = new c("SubfileType", 255, 4);
        c cVar3 = new c(256, "ImageWidth");
        c cVar4 = cVar2;
        c cVar5 = cVar3;
        c[] cVarArr = {cVar, cVar4, cVar5, new c(257, "ImageLength"), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c(273, "StripOffsets"), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c(278, "RowsPerStrip"), new c(279, "StripByteCounts"), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c(40962, "PixelXDimension"), new c(40963, "PixelYDimension"), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c(50720, "DefaultCropSize")};
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        c cVar6 = new c("NewSubfileType", 254, 4);
        c cVar7 = new c("SubfileType", 255, 4);
        c cVar8 = new c(256, "ThumbnailImageWidth");
        c cVar9 = cVar6;
        c cVar10 = new c(257, "ThumbnailImageLength");
        c[] cVarArr5 = cVarArr4;
        c cVar11 = new c("BitsPerSample", 258, 3);
        c cVar12 = new c("Compression", 259, 3);
        c cVar13 = new c("PhotometricInterpretation", 262, 3);
        c cVar14 = new c("ImageDescription", 270, 2);
        c cVar15 = new c("Make", 271, 2);
        c cVar16 = new c("Model", 272, 2);
        c cVar17 = new c(273, "StripOffsets");
        c cVar18 = cVar13;
        c cVar19 = new c("Orientation", 274, 3);
        c cVar20 = new c("SamplesPerPixel", 277, 3);
        String str = "SubIFDPointer";
        c cVar21 = cVar14;
        c cVar22 = cVar15;
        String str2 = "ExifIFDPointer";
        c cVar23 = cVar12;
        String str3 = "GPSInfoIFDPointer";
        f741t = new c[][]{cVarArr, cVarArr2, cVarArr3, cVarArr5, new c[]{cVar9, cVar7, cVar8, cVar10, cVar11, cVar23, cVar18, cVar21, cVar22, cVar16, cVar17, cVar19, cVar20, new c(278, "RowsPerStrip"), new c(279, "StripByteCounts"), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c(str, 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c(str2, 34665, 4), new c(str3, 34853, 4), new c("DNGVersion", 50706, 1), new c(50720, "DefaultCropSize")}, cVarArr, new c[]{new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)}, new c[]{new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)}, new c[]{new c("AspectFrame", 4371, 3)}, new c[]{new c("ColorSpace", 55, 3)}};
        f742u = new c[]{new c(str, 330, 4), new c(str2, 34665, 4), new c(str3, 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        f747z = forName;
        f731A = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            c[][] cVarArr6 = f741t;
            if (i2 < cVarArr6.length) {
                f743v[i2] = new HashMap();
                f744w[i2] = new HashMap();
                for (c cVar24 : cVarArr6[i2]) {
                    f743v[i2].put(Integer.valueOf(cVar24.f727a), cVar24);
                    f744w[i2].put(cVar24.b, cVar24);
                }
                i2++;
            } else {
                HashMap hashMap = f746y;
                c[] cVarArr7 = f742u;
                hashMap.put(Integer.valueOf(cVarArr7[0].f727a), 5);
                hashMap.put(Integer.valueOf(cVarArr7[1].f727a), 1);
                hashMap.put(Integer.valueOf(cVarArr7[2].f727a), 2);
                hashMap.put(Integer.valueOf(cVarArr7[3].f727a), 3);
                hashMap.put(Integer.valueOf(cVarArr7[4].f727a), 7);
                hashMap.put(Integer.valueOf(cVarArr7[5].f727a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[SYNTHETIC, Splitter:B:16:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.lang.String r3) {
        /*
            r2 = this;
            r2.<init>()
            U.c[][] r0 = f741t
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.f749c = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.f750d = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.f751e = r0
            if (r3 == 0) goto L_0x0036
            r2.f748a = r3
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x002c }
            r1.<init>(r3)     // Catch:{ all -> 0x002c }
            r2.m(r1)     // Catch:{ all -> 0x0029 }
            r1.close()     // Catch:{ RuntimeException -> 0x0027, Exception -> 0x0026 }
        L_0x0026:
            return
        L_0x0027:
            r3 = move-exception
            throw r3
        L_0x0029:
            r3 = move-exception
            r0 = r1
            goto L_0x002d
        L_0x002c:
            r3 = move-exception
        L_0x002d:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ RuntimeException -> 0x0033, Exception -> 0x0035 }
            goto L_0x0035
        L_0x0033:
            r3 = move-exception
            throw r3
        L_0x0035:
            throw r3
        L_0x0036:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.<init>(java.lang.String):void");
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static ByteOrder o(a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String c2 = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.f749c;
        if (c2 != null && c("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = c2.concat("\u0000").getBytes(f747z);
            hashMap.put("DateTime", new b(bytes, 2, bytes.length));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", b.a(0, this.f751e));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", b.a(0, this.f751e));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", b.a(0, this.f751e));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", b.a(0, this.f751e));
        }
    }

    public final String c(String str) {
        b d2 = d(str);
        if (d2 != null) {
            if (!f745x.contains(str)) {
                return d2.f(this.f751e);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d2.f725a;
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) d2.g(this.f751e);
                    if (dVarArr == null || dVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                        return null;
                    }
                    d dVar = dVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) dVar.f730a) / ((float) dVar.b)));
                    d dVar2 = dVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) dVar2.f730a) / ((float) dVar2.b)));
                    d dVar3 = dVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) dVar3.f730a) / ((float) dVar3.b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                return null;
            }
            try {
                return Double.toString(d2.d(this.f751e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < f741t.length; i2++) {
            b bVar = (b) this.f749c[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0084 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0107 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(U.a r12, int r13, int r14) {
        /*
            r11 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r12.f722g = r0
            long r0 = (long) r13
            r12.k(r0)
            byte r0 = r12.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x015c
            byte r3 = r12.readByte()
            r4 = -40
            if (r3 != r4) goto L_0x0144
            r0 = 2
            int r13 = r13 + r0
        L_0x001b:
            byte r1 = r12.readByte()
            if (r1 != r2) goto L_0x012a
            byte r1 = r12.readByte()
            r3 = -39
            if (r1 == r3) goto L_0x0125
            r3 = -38
            if (r1 != r3) goto L_0x002f
            goto L_0x0125
        L_0x002f:
            int r3 = r12.readUnsignedShort()
            int r4 = r3 + -2
            int r5 = r13 + 4
            java.lang.String r6 = "Invalid length"
            if (r4 < 0) goto L_0x011f
            r7 = -31
            r8 = 0
            java.lang.String r9 = "Invalid exif"
            if (r1 == r7) goto L_0x00c0
            java.util.HashMap[] r13 = r11.f749c
            r7 = -2
            r10 = 1
            if (r1 == r7) goto L_0x008c
            switch(r1) {
                case -64: goto L_0x0056;
                case -63: goto L_0x0056;
                case -62: goto L_0x0056;
                case -61: goto L_0x0056;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r1) {
                case -59: goto L_0x0056;
                case -58: goto L_0x0056;
                case -57: goto L_0x0056;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r1) {
                case -55: goto L_0x0056;
                case -54: goto L_0x0056;
                case -53: goto L_0x0056;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r1) {
                case -51: goto L_0x0056;
                case -50: goto L_0x0056;
                case -49: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x00f3
        L_0x0056:
            int r1 = r12.skipBytes(r10)
            if (r1 != r10) goto L_0x0084
            r1 = r13[r14]
            int r4 = r12.readUnsignedShort()
            long r7 = (long) r4
            java.nio.ByteOrder r4 = r11.f751e
            U.b r4 = U.b.a(r7, r4)
            java.lang.String r7 = "ImageLength"
            r1.put(r7, r4)
            r13 = r13[r14]
            int r1 = r12.readUnsignedShort()
            long r7 = (long) r1
            java.nio.ByteOrder r1 = r11.f751e
            U.b r1 = U.b.a(r7, r1)
            java.lang.String r4 = "ImageWidth"
            r13.put(r4, r1)
            int r4 = r3 + -7
            goto L_0x00f3
        L_0x0084:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid SOFx"
            r12.<init>(r13)
            throw r12
        L_0x008c:
            byte[] r1 = new byte[r4]
            int r3 = r12.read(r1)
            if (r3 != r4) goto L_0x00ba
            java.lang.String r3 = "UserComment"
            java.lang.String r4 = r11.c(r3)
            if (r4 != 0) goto L_0x00b8
            r13 = r13[r10]
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r7 = f747z
            r4.<init>(r1, r7)
            java.lang.String r1 = "\u0000"
            java.lang.String r1 = r4.concat(r1)
            byte[] r1 = r1.getBytes(r7)
            U.b r4 = new U.b
            int r7 = r1.length
            r4.<init>(r1, r0, r7)
            r13.put(r3, r4)
        L_0x00b8:
            r4 = 0
            goto L_0x00f3
        L_0x00ba:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x00c0:
            r1 = 6
            if (r4 >= r1) goto L_0x00c4
            goto L_0x00f3
        L_0x00c4:
            byte[] r4 = new byte[r1]
            int r5 = r12.read(r4)
            if (r5 != r1) goto L_0x0119
            int r5 = r13 + 10
            int r13 = r3 + -8
            byte[] r1 = f731A
            boolean r1 = java.util.Arrays.equals(r4, r1)
            if (r1 != 0) goto L_0x00da
            r4 = r13
            goto L_0x00f3
        L_0x00da:
            if (r13 <= 0) goto L_0x0113
            r11.f = r5
            byte[] r1 = new byte[r13]
            int r3 = r12.read(r1)
            if (r3 != r13) goto L_0x010d
            int r5 = r5 + r13
            U.a r3 = new U.a
            r3.<init>((byte[]) r1)
            r11.n(r3, r13)
            r11.p(r3, r14)
            goto L_0x00b8
        L_0x00f3:
            if (r4 < 0) goto L_0x0107
            int r13 = r12.skipBytes(r4)
            if (r13 != r4) goto L_0x00ff
            int r13 = r5 + r4
            goto L_0x001b
        L_0x00ff:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid JPEG segment"
            r12.<init>(r13)
            throw r12
        L_0x0107:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r6)
            throw r12
        L_0x010d:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x0113:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x0119:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x011f:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r6)
            throw r12
        L_0x0125:
            java.nio.ByteOrder r13 = r11.f751e
            r12.f722g = r13
            return
        L_0x012a:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid marker:"
            r13.<init>(r14)
            r14 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0144:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r14 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x015c:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r14 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.e(U.a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f734m;
            if (i2 >= bArr2.length) {
                return 4;
            }
            if (bArr[i2] != bArr2[i2]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    if (bArr[i3] != bytes[i3]) {
                        a aVar = new a(bArr);
                        ByteOrder o2 = o(aVar);
                        this.f751e = o2;
                        aVar.f722g = o2;
                        short readShort = aVar.readShort();
                        aVar.close();
                        if (readShort == 20306 || readShort == 21330) {
                            return 7;
                        }
                        a aVar2 = new a(bArr);
                        ByteOrder o3 = o(aVar2);
                        this.f751e = o3;
                        aVar2.f722g = o3;
                        short readShort2 = aVar2.readShort();
                        aVar2.close();
                        if (readShort2 == 85) {
                            return 10;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i2++;
        }
    }

    public final void g(a aVar) {
        int i2;
        int i3;
        i(aVar);
        HashMap[] hashMapArr = this.f749c;
        b bVar = (b) hashMapArr[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.f726c);
            aVar2.f722g = this.f751e;
            byte[] bArr = f735n;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.k(0);
            byte[] bArr3 = f736o;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.k(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.k(12);
            }
            p(aVar2, 6);
            b bVar2 = (b) hashMapArr[7].get("PreviewImageStart");
            b bVar3 = (b) hashMapArr[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", bVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = (b) hashMapArr[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.g(this.f751e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    b c2 = b.c(i6, this.f751e);
                    b c3 = b.c(i7, this.f751e);
                    hashMapArr[0].put("ImageWidth", c2);
                    hashMapArr[0].put("ImageLength", c3);
                }
            }
        }
    }

    public final void h(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i2, 5);
        aVar.k((long) i3);
        aVar.f722g = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f740s.f727a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b c2 = b.c(readShort, this.f751e);
                b c3 = b.c(readShort2, this.f751e);
                HashMap[] hashMapArr = this.f749c;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(a aVar) {
        b bVar;
        n(aVar, aVar.f.available());
        p(aVar, 0);
        s(aVar, 0);
        s(aVar, 5);
        s(aVar, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        HashMap[] hashMapArr = this.f749c;
        b bVar2 = (b) hashMapArr[1].get("PixelXDimension");
        b bVar3 = (b) hashMapArr[1].get("PixelYDimension");
        if (!(bVar2 == null || bVar3 == null)) {
            hashMapArr[0].put("ImageWidth", bVar2);
            hashMapArr[0].put("ImageLength", bVar3);
        }
        if (hashMapArr[4].isEmpty() && l(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!l(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.b == 8 && (bVar = (b) hashMapArr[1].get("MakerNote")) != null) {
            a aVar2 = new a(bVar.f726c);
            aVar2.f722g = this.f751e;
            aVar2.k(6);
            p(aVar2, 9);
            b bVar4 = (b) hashMapArr[9].get("ColorSpace");
            if (bVar4 != null) {
                hashMapArr[1].put("ColorSpace", bVar4);
            }
        }
    }

    public final void j(a aVar) {
        i(aVar);
        HashMap[] hashMapArr = this.f749c;
        if (((b) hashMapArr[0].get("JpgFromRaw")) != null) {
            e(aVar, this.f755j, 5);
        }
        b bVar = (b) hashMapArr[0].get("ISO");
        b bVar2 = (b) hashMapArr[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", bVar);
        }
    }

    public final void k(a aVar, HashMap hashMap) {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int e2 = bVar.e(this.f751e);
            int min = Math.min(bVar2.e(this.f751e), aVar.f.available() - e2);
            int i3 = this.b;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.f;
            } else {
                if (i3 == 7) {
                    i2 = this.f752g;
                }
                if (e2 > 0 && min > 0 && this.f748a == null) {
                    aVar.k((long) e2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            e2 += i2;
            if (e2 > 0) {
            }
        }
    }

    public final boolean l(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        int e2 = bVar.e(this.f751e);
        int e3 = bVar2.e(this.f751e);
        if (e2 > 512 || e3 > 512) {
            return false;
        }
        return true;
    }

    public final void m(FileInputStream fileInputStream) {
        int i2 = 0;
        while (i2 < f741t.length) {
            try {
                this.f749c[i2] = new HashMap();
                i2++;
            } catch (IOException unused) {
                a();
                return;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.b = f(bufferedInputStream);
        a aVar = new a((InputStream) bufferedInputStream);
        switch (this.b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(aVar);
                break;
            case 4:
                e(aVar, 0, 0);
                break;
            case 7:
                g(aVar);
                break;
            case 9:
                h(aVar);
                break;
            case 10:
                j(aVar);
                break;
        }
        q(aVar);
        a();
    }

    public final void n(a aVar, int i2) {
        ByteOrder o2 = o(aVar);
        this.f751e = o2;
        aVar.f722g = o2;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.b;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(g.f(readInt, "Invalid first Ifd offset: "));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException(g.f(i4, "Couldn't jump to first Ifd: "));
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(U.a r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r3 = r1.f724i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f750d
            r4.add(r3)
            int r3 = r1.f724i
            int r3 = r3 + 2
            int r5 = r1.f723h
            if (r3 <= r5) goto L_0x001b
            goto L_0x031b
        L_0x001b:
            short r3 = r1.readShort()
            int r6 = r1.f724i
            int r7 = r3 * 12
            int r7 = r7 + r6
            if (r7 > r5) goto L_0x031b
            if (r3 > 0) goto L_0x002a
            goto L_0x031b
        L_0x002a:
            r7 = 0
        L_0x002b:
            java.util.HashMap[] r8 = r0.f749c
            java.lang.String r12 = "ExifInterface"
            if (r7 >= r3) goto L_0x02bd
            int r13 = r1.readUnsignedShort()
            int r14 = r1.readUnsignedShort()
            int r15 = r1.readInt()
            int r6 = r1.f724i
            r16 = 0
            long r9 = (long) r6
            r18 = 4
            long r9 = r9 + r18
            java.util.HashMap[] r6 = f743v
            r6 = r6[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Object r6 = r6.get(r11)
            U.c r6 = (U.c) r6
            if (r6 != 0) goto L_0x006f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r21 = r3
            java.lang.String r3 = "Skip the tag entry since tag number is not defined: "
            r11.<init>(r3)
            r11.append(r13)
            java.lang.String r3 = r11.toString()
            android.util.Log.w(r12, r3)
            r23 = r7
        L_0x006b:
            r22 = r8
            goto L_0x0117
        L_0x006f:
            r21 = r3
            if (r14 <= 0) goto L_0x0078
            int[] r3 = f738q
            int r11 = r3.length
            if (r14 < r11) goto L_0x007e
        L_0x0078:
            r23 = r7
            r22 = r8
            goto L_0x0106
        L_0x007e:
            int r11 = r6.f728c
            r22 = r3
            r3 = 7
            if (r11 == r3) goto L_0x008e
            if (r14 != r3) goto L_0x0088
            goto L_0x008e
        L_0x0088:
            if (r11 == r14) goto L_0x008e
            int r3 = r6.f729d
            if (r3 != r14) goto L_0x0091
        L_0x008e:
            r23 = r7
            goto L_0x009f
        L_0x0091:
            r23 = r7
            r7 = 4
            if (r11 == r7) goto L_0x0098
            if (r3 != r7) goto L_0x009a
        L_0x0098:
            r7 = 3
            goto L_0x009d
        L_0x009a:
            r7 = 9
            goto L_0x00a1
        L_0x009d:
            if (r14 != r7) goto L_0x009a
        L_0x009f:
            r3 = 7
            goto L_0x00d5
        L_0x00a1:
            if (r11 == r7) goto L_0x00a5
            if (r3 != r7) goto L_0x00aa
        L_0x00a5:
            r7 = 8
            if (r14 != r7) goto L_0x00aa
            goto L_0x009f
        L_0x00aa:
            r7 = 12
            if (r11 == r7) goto L_0x00b0
            if (r3 != r7) goto L_0x00b5
        L_0x00b0:
            r3 = 11
            if (r14 != r3) goto L_0x00b5
            goto L_0x009f
        L_0x00b5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since data format ("
            r3.<init>(r7)
            java.lang.String[] r7 = f737p
            r7 = r7[r14]
            r3.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r3.append(r7)
            java.lang.String r7 = r6.b
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r12, r3)
            goto L_0x006b
        L_0x00d5:
            if (r14 != r3) goto L_0x00d8
            r14 = r11
        L_0x00d8:
            r3 = r8
            long r7 = (long) r15
            r11 = r22[r14]
            r24 = r7
            long r7 = (long) r11
            long r7 = r7 * r24
            int r11 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00f1
            r24 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ed
            goto L_0x00f1
        L_0x00ed:
            r11 = 1
            r22 = r3
            goto L_0x011a
        L_0x00f1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r22 = r3
            java.lang.String r3 = "Skip the tag entry since the number of components is invalid: "
            r11.<init>(r3)
            r11.append(r15)
            java.lang.String r3 = r11.toString()
            android.util.Log.w(r12, r3)
        L_0x0104:
            r11 = 0
            goto L_0x011a
        L_0x0106:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r3.<init>(r7)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r12, r3)
        L_0x0117:
            r7 = r16
            goto L_0x0104
        L_0x011a:
            if (r11 != 0) goto L_0x0121
            r1.k(r9)
            goto L_0x02b4
        L_0x0121:
            java.lang.String r3 = "Compression"
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ba
            int r11 = r1.readInt()
            r18 = r13
            int r13 = r0.b
            r24 = r7
            r7 = 7
            if (r13 != r7) goto L_0x0184
            java.lang.String r7 = r6.b
            java.lang.String r8 = "MakerNote"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0143
            r0.f752g = r11
        L_0x0140:
            r19 = r14
            goto L_0x0196
        L_0x0143:
            r7 = 6
            if (r2 != r7) goto L_0x0140
            java.lang.String r8 = r6.b
            java.lang.String r13 = "ThumbnailImage"
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L_0x0140
            r0.f753h = r11
            r0.f754i = r15
            java.nio.ByteOrder r8 = r0.f751e
            U.b r7 = U.b.c(r7, r8)
            int r8 = r0.f753h
            r19 = r14
            long r13 = (long) r8
            java.nio.ByteOrder r8 = r0.f751e
            U.b r8 = U.b.a(r13, r8)
            int r13 = r0.f754i
            long r13 = (long) r13
            java.nio.ByteOrder r2 = r0.f751e
            U.b r2 = U.b.a(r13, r2)
            r20 = 4
            r13 = r22[r20]
            r13.put(r3, r7)
            r7 = r22[r20]
            java.lang.String r13 = "JPEGInterchangeFormat"
            r7.put(r13, r8)
            r7 = r22[r20]
            java.lang.String r8 = "JPEGInterchangeFormatLength"
            r7.put(r8, r2)
            goto L_0x0196
        L_0x0184:
            r19 = r14
            r2 = 10
            if (r13 != r2) goto L_0x0196
            java.lang.String r2 = r6.b
            java.lang.String r7 = "JpgFromRaw"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0196
            r0.f755j = r11
        L_0x0196:
            long r7 = (long) r11
            long r13 = r7 + r24
            r26 = r13
            long r13 = (long) r5
            int r2 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x01a4
            r1.k(r7)
            goto L_0x01c0
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r12, r2)
            r1.k(r9)
            goto L_0x02b4
        L_0x01ba:
            r24 = r7
            r18 = r13
            r19 = r14
        L_0x01c0:
            java.util.HashMap r2 = f746y
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            java.lang.Object r2 = r2.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0254
            r14 = r19
            r7 = 3
            if (r14 == r7) goto L_0x01fc
            r7 = 4
            if (r14 == r7) goto L_0x01f0
            r7 = 8
            if (r14 == r7) goto L_0x01eb
            r7 = 9
            if (r14 == r7) goto L_0x01e5
            r3 = 13
            if (r14 == r3) goto L_0x01e5
            r6 = -1
            goto L_0x0201
        L_0x01e5:
            int r3 = r1.readInt()
        L_0x01e9:
            long r6 = (long) r3
            goto L_0x0201
        L_0x01eb:
            short r3 = r1.readShort()
            goto L_0x01e9
        L_0x01f0:
            int r3 = r1.readInt()
            long r6 = (long) r3
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r13
            goto L_0x0201
        L_0x01fc:
            int r3 = r1.readUnsignedShort()
            goto L_0x01e9
        L_0x0201:
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x023f
            long r13 = (long) r5
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x023f
            int r3 = (int) r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x0220
            r1.k(r6)
            int r2 = r2.intValue()
            r0.p(r1, r2)
            goto L_0x0250
        L_0x0220:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.<init>(r8)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r12, r2)
            goto L_0x0250
        L_0x023f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r12, r2)
        L_0x0250:
            r1.k(r9)
            goto L_0x02b4
        L_0x0254:
            r14 = r19
            r7 = r24
            int r2 = (int) r7
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            U.b r7 = new U.b
            r7.<init>(r2, r14, r15)
            r2 = r22[r30]
            java.lang.String r8 = r6.b
            r2.put(r8, r7)
            java.lang.String r2 = r6.b
            java.lang.String r6 = "DNGVersion"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0277
            r6 = 3
            r0.b = r6
        L_0x0277:
            java.lang.String r6 = "Make"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0287
            java.lang.String r6 = "Model"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0295
        L_0x0287:
            java.nio.ByteOrder r6 = r0.f751e
            java.lang.String r6 = r7.f(r6)
            java.lang.String r8 = "PENTAX"
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x02a6
        L_0x0295:
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02aa
            java.nio.ByteOrder r2 = r0.f751e
            int r2 = r7.e(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x02aa
        L_0x02a6:
            r7 = 8
            r0.b = r7
        L_0x02aa:
            int r2 = r1.f724i
            long r2 = (long) r2
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x02b4
            r1.k(r9)
        L_0x02b4:
            int r7 = r23 + 1
            short r7 = (short) r7
            r2 = r30
            r3 = r21
            goto L_0x002b
        L_0x02bd:
            r22 = r8
            r16 = 0
            int r2 = r1.f724i
            r7 = 4
            int r2 = r2 + r7
            if (r2 > r5) goto L_0x031b
            int r2 = r1.readInt()
            long r8 = (long) r2
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x030a
            if (r2 >= r5) goto L_0x030a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x02f8
            r1.k(r8)
            r2 = r22[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02eb
            r0.p(r1, r7)
            return
        L_0x02eb:
            r2 = 5
            r3 = r22[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x031b
            r0.p(r1, r2)
            return
        L_0x02f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r12, r1)
            return
        L_0x030a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r12, r1)
        L_0x031b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.p(U.a, int):void");
    }

    public final void q(a aVar) {
        b bVar;
        HashMap hashMap = this.f749c[4];
        b bVar2 = (b) hashMap.get("Compression");
        if (bVar2 != null) {
            int e2 = bVar2.e(this.f751e);
            if (e2 != 1) {
                if (e2 == 6) {
                    k(aVar, hashMap);
                    return;
                } else if (e2 != 7) {
                    return;
                }
            }
            b bVar3 = (b) hashMap.get("BitsPerSample");
            if (bVar3 != null) {
                int[] iArr = (int[]) bVar3.g(this.f751e);
                int[] iArr2 = f732k;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.b == 3 && (bVar = (b) hashMap.get("PhotometricInterpretation")) != null) {
                        int e3 = bVar.e(this.f751e);
                        if ((e3 != 1 || !Arrays.equals(iArr, f733l)) && (e3 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                b bVar4 = (b) hashMap.get("StripOffsets");
                b bVar5 = (b) hashMap.get("StripByteCounts");
                if (bVar4 != null && bVar5 != null) {
                    long[] b2 = b(bVar4.g(this.f751e));
                    long[] b3 = b(bVar5.g(this.f751e));
                    if (b2 == null) {
                        Log.w("ExifInterface", "stripOffsets should not be null.");
                    } else if (b3 == null) {
                        Log.w("ExifInterface", "stripByteCounts should not be null.");
                    } else {
                        long j2 = 0;
                        for (long j3 : b3) {
                            j2 += j3;
                        }
                        byte[] bArr = new byte[((int) j2)];
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 0; i4 < b2.length; i4++) {
                            int i5 = (int) b2[i4];
                            int i6 = (int) b3[i4];
                            int i7 = i5 - i2;
                            if (i7 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                            }
                            aVar.k((long) i7);
                            int i8 = i2 + i7;
                            byte[] bArr2 = new byte[i6];
                            aVar.read(bArr2);
                            i2 = i8 + i6;
                            System.arraycopy(bArr2, 0, bArr, i3, i6);
                            i3 += i6;
                        }
                    }
                }
            }
        } else {
            k(aVar, hashMap);
        }
    }

    public final void r(int i2, int i3) {
        HashMap[] hashMapArr = this.f749c;
        if (!hashMapArr[i2].isEmpty() && !hashMapArr[i3].isEmpty()) {
            b bVar = (b) hashMapArr[i2].get("ImageLength");
            b bVar2 = (b) hashMapArr[i2].get("ImageWidth");
            b bVar3 = (b) hashMapArr[i3].get("ImageLength");
            b bVar4 = (b) hashMapArr[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int e2 = bVar.e(this.f751e);
                int e3 = bVar2.e(this.f751e);
                int e4 = bVar3.e(this.f751e);
                int e5 = bVar4.e(this.f751e);
                if (e2 < e4 && e3 < e5) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void s(a aVar, int i2) {
        b bVar;
        b bVar2;
        b bVar3;
        HashMap[] hashMapArr = this.f749c;
        b bVar4 = (b) hashMapArr[i2].get("DefaultCropSize");
        b bVar5 = (b) hashMapArr[i2].get("SensorTopBorder");
        b bVar6 = (b) hashMapArr[i2].get("SensorLeftBorder");
        b bVar7 = (b) hashMapArr[i2].get("SensorBottomBorder");
        b bVar8 = (b) hashMapArr[i2].get("SensorRightBorder");
        if (bVar4 != null) {
            if (bVar4.f725a == 5) {
                d[] dVarArr = (d[]) bVar4.g(this.f751e);
                if (dVarArr == null || dVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
                bVar3 = b.b(dVarArr[0], this.f751e);
                bVar2 = b.b(dVarArr[1], this.f751e);
            } else {
                int[] iArr = (int[]) bVar4.g(this.f751e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                bVar3 = b.c(iArr[0], this.f751e);
                bVar2 = b.c(iArr[1], this.f751e);
            }
            hashMapArr[i2].put("ImageWidth", bVar3);
            hashMapArr[i2].put("ImageLength", bVar2);
        } else if (bVar5 == null || bVar6 == null || bVar7 == null || bVar8 == null) {
            b bVar9 = (b) hashMapArr[i2].get("ImageLength");
            b bVar10 = (b) hashMapArr[i2].get("ImageWidth");
            if ((bVar9 == null || bVar10 == null) && (bVar = (b) hashMapArr[i2].get("JPEGInterchangeFormat")) != null) {
                e(aVar, bVar.e(this.f751e), i2);
            }
        } else {
            int e2 = bVar5.e(this.f751e);
            int e3 = bVar7.e(this.f751e);
            int e4 = bVar8.e(this.f751e);
            int e5 = bVar6.e(this.f751e);
            if (e3 > e2 && e4 > e5) {
                b c2 = b.c(e3 - e2, this.f751e);
                b c3 = b.c(e4 - e5, this.f751e);
                hashMapArr[i2].put("ImageLength", c2);
                hashMapArr[i2].put("ImageWidth", c3);
            }
        }
    }
}
