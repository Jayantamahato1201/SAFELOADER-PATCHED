package q1;

import A.g;
import G.f;
import M0.a;
import M0.d;
import M0.e;
import T0.l;
import U0.k;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureGroupInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.net.Uri;
import b1.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class V {
    public static int a(String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (str.charAt(i3) * 31) + (i3 * 31) + (i2 * 31);
        }
        return Math.abs(i2);
    }

    public static PackageInfo b(PackageInfo packageInfo, int i2) {
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.reqFeatures = packageInfo.reqFeatures;
        packageInfo2.featureGroups = packageInfo.featureGroups;
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.splitNames = packageInfo.splitNames;
        packageInfo2.versionName = packageInfo.versionName;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.applicationInfo = packageInfo.applicationInfo;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.installLocation = packageInfo.installLocation;
        if (T4.f3997a) {
            packageInfo2.baseRevisionCode = packageInfo.baseRevisionCode;
            packageInfo2.splitRevisionCodes = packageInfo.splitRevisionCodes;
        }
        if (T4.f) {
            packageInfo2.setLongVersionCode(packageInfo.getLongVersionCode());
            if ((134217728 & i2) != 0) {
                packageInfo2.signingInfo = packageInfo.signingInfo;
            }
        } else {
            packageInfo2.versionCode = packageInfo.versionCode;
        }
        if (T4.f4003i) {
            packageInfo2.attributions = packageInfo.attributions;
        }
        if ((i2 & 1) != 0) {
            packageInfo2.activities = packageInfo.activities;
        }
        if ((i2 & 2) != 0) {
            packageInfo2.receivers = packageInfo.receivers;
        }
        if ((i2 & 8) != 0) {
            packageInfo2.providers = packageInfo.providers;
        }
        if ((i2 & 4) != 0) {
            packageInfo2.services = packageInfo.services;
        }
        if ((i2 & 4096) != 0) {
            packageInfo2.permissions = packageInfo.permissions;
            packageInfo2.requestedPermissions = packageInfo.requestedPermissions;
            packageInfo2.requestedPermissionsFlags = packageInfo.requestedPermissionsFlags;
        }
        if ((i2 & 16384) != 0) {
            packageInfo2.configPreferences = packageInfo.configPreferences;
        }
        if ((i2 & 16) != 0) {
            packageInfo2.instrumentation = packageInfo.instrumentation;
        }
        if ((i2 & 256) != 0) {
            packageInfo2.gids = packageInfo.gids;
        }
        if ((i2 & 64) != 0) {
            packageInfo2.signatures = packageInfo.signatures;
        }
        return packageInfo2;
    }

    public static void c(ApplicationInfo applicationInfo) {
        if (T4.f4001g) {
            String[] strArr = T4.f4002h ? new String[]{"/system/framework/org.apache.http.legacy.jar", "/system/framework/android.test.base.jar"} : new String[]{"/system/framework/org.apache.http.legacy.jar"};
            C0351g0 g0Var = C0447w1.f4225a;
            Collection collection = (List) ((C0) g0Var.f4098c).a(applicationInfo);
            if (collection == null) {
                collection = new ArrayList(strArr.length);
                ((C0) g0Var.f4098c).c(applicationInfo, collection);
            }
            for (String c2 : strArr) {
                SharedLibraryInfo c3 = f.c(C0455x3.f4236a.allocateInstance(f.h()));
                ((C0) C0447w1.f4229g.f4098c).c(c3, c2);
                collection.add(c3);
            }
        }
    }

    public static void d(ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
        String str;
        try {
            if (T4.f3998c) {
                applicationInfo.deviceProtectedDataDir = applicationInfo2.deviceProtectedDataDir;
            }
            if (T4.f4000e) {
                applicationInfo.splitNames = applicationInfo2.splitNames;
            }
            if (T4.f && (applicationInfo.flags & 134217728) != 0) {
                ((C0) C0447w1.f.f4098c).c(applicationInfo, 0);
            }
            applicationInfo.sharedLibraryFiles = applicationInfo2.sharedLibraryFiles;
            c(applicationInfo);
            String str2 = applicationInfo2.processName;
            if (str2 != null) {
                if (str2.length() != 0) {
                    str = applicationInfo2.processName;
                    applicationInfo.processName = str;
                    applicationInfo.nativeLibraryDir = applicationInfo2.nativeLibraryDir;
                    applicationInfo.sourceDir = applicationInfo2.sourceDir;
                    applicationInfo.publicSourceDir = applicationInfo2.publicSourceDir;
                    applicationInfo.dataDir = applicationInfo2.dataDir;
                    C0351g0 g0Var = C0447w1.b;
                    ((C0) g0Var.f4098c).c(applicationInfo, ((C0) g0Var.f4098c).a(applicationInfo2));
                    C0351g0 g0Var2 = C0447w1.f4226c;
                    ((C0) g0Var2.f4098c).c(applicationInfo, ((C0) g0Var2.f4098c).a(applicationInfo2));
                    C0351g0 g0Var3 = C0447w1.f4227d;
                    ((C0) g0Var3.f4098c).c(applicationInfo, ((C0) g0Var3.f4098c).a(applicationInfo2));
                    applicationInfo.splitSourceDirs = applicationInfo2.splitSourceDirs;
                    applicationInfo.splitPublicSourceDirs = applicationInfo2.splitPublicSourceDirs;
                }
            }
            str = applicationInfo.packageName;
            applicationInfo.processName = str;
            applicationInfo.nativeLibraryDir = applicationInfo2.nativeLibraryDir;
            applicationInfo.sourceDir = applicationInfo2.sourceDir;
            applicationInfo.publicSourceDir = applicationInfo2.publicSourceDir;
            applicationInfo.dataDir = applicationInfo2.dataDir;
            C0351g0 g0Var4 = C0447w1.b;
            ((C0) g0Var4.f4098c).c(applicationInfo, ((C0) g0Var4.f4098c).a(applicationInfo2));
            C0351g0 g0Var22 = C0447w1.f4226c;
            ((C0) g0Var22.f4098c).c(applicationInfo, ((C0) g0Var22.f4098c).a(applicationInfo2));
            C0351g0 g0Var32 = C0447w1.f4227d;
            ((C0) g0Var32.f4098c).c(applicationInfo, ((C0) g0Var32.f4098c).a(applicationInfo2));
            applicationInfo.splitSourceDirs = applicationInfo2.splitSourceDirs;
            applicationInfo.splitPublicSourceDirs = applicationInfo2.splitPublicSourceDirs;
        } catch (Exception unused) {
        }
    }

    public static void e(ComponentInfo componentInfo, ApplicationInfo applicationInfo) {
        if (componentInfo.packageName == null) {
            componentInfo.packageName = applicationInfo.packageName;
        }
        String str = componentInfo.processName;
        if (str == null || str.length() == 0) {
            String str2 = applicationInfo.processName;
            if (str2 == null || str2.length() == 0) {
                str2 = applicationInfo.packageName;
            }
            componentInfo.processName = str2;
        }
        componentInfo.applicationInfo = applicationInfo;
        String str3 = componentInfo.name;
        if (str3 != null && str3.length() > 0 && str3.charAt(0) == '.') {
            componentInfo.name = g.h(applicationInfo.packageName, componentInfo.name);
        }
    }

    public static void f(X3 x3, int i2) {
        int i3;
        int[] iArr;
        FeatureInfo[] featureInfoArr;
        ConfigurationInfo[] configurationInfoArr;
        FeatureGroupInfo[] featureGroupInfoArr;
        String str;
        int i4;
        boolean z2;
        int i5;
        X3 x32 = x3;
        int i6 = i2;
        int i7 = 1;
        try {
            PackageInfo packageInfo = x32.f4034c;
            PackageParser.Package parsePackage = new PackageParser().parsePackage(new File(x32.f4035d.sourceDir), 0);
            ApplicationInfo applicationInfo = parsePackage.applicationInfo;
            if (applicationInfo != null) {
                d(applicationInfo, x32.f4035d);
                String str2 = packageInfo.packageName;
                if (d.A0(H.f3890h, str2.hashCode())) {
                    i3 = a("com.google");
                } else {
                    String str3 = packageInfo.sharedUserId;
                    if (str3 != null) {
                        if (str3.length() != 0) {
                            i3 = a(str3);
                        }
                    }
                    i3 = a(str2);
                }
                applicationInfo.uid = (i3 % 7000) + 13000;
                applicationInfo.enabled = true;
                applicationInfo.metaData = parsePackage.mAppMetaData;
                applicationInfo.flags |= 8683588;
                packageInfo.applicationInfo = applicationInfo;
                x32.f4035d = applicationInfo;
                C0389m2 m2Var = new C0389m2(parsePackage.activities.size() + parsePackage.receivers.size() + parsePackage.services.size() + parsePackage.providers.size());
                x32.f = m2Var;
                packageInfo.activities = (ActivityInfo[]) g(parsePackage.activities, m2Var, applicationInfo, C0314a.f4046m, C0356h.f4106n);
                packageInfo.receivers = (ActivityInfo[]) g(parsePackage.receivers, m2Var, applicationInfo, C0386m.f4138m, C0457y.f4241n);
                packageInfo.services = (ServiceInfo[]) g(parsePackage.services, m2Var, applicationInfo, D.f3870m, I.f3905n);
                ArrayList arrayList = parsePackage.providers;
                int size = arrayList.size();
                int[] iArr2 = H.b;
                if (size == 0) {
                    iArr = iArr2;
                } else {
                    iArr = new int[size];
                }
                int size2 = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList.get(i9);
                    i9 += i7;
                    ProviderInfo providerInfo = ((PackageParser.Provider) obj).info;
                    String str4 = providerInfo.authority;
                    if (str4 != null) {
                        char[] cArr = new char[i7];
                        cArr[0] = ';';
                        List i02 = i.i0(str4, cArr);
                        ArrayList arrayList2 = new ArrayList(i02.size());
                        Iterator it = i02.iterator();
                        while (it.hasNext()) {
                            List list = i02;
                            String str5 = (String) it.next();
                            Iterator it2 = it;
                            int hashCode = str5.hashCode();
                            int i10 = size2;
                            int a2 = H.a(i8, hashCode, iArr);
                            if (a2 < 0) {
                                int i11 = ~a2;
                                int i12 = hashCode;
                                int i13 = i8 + 1;
                                i4 = i9;
                                if (i13 <= iArr.length) {
                                    System.arraycopy(iArr, i11, iArr, i11 + 1, i8 - i11);
                                    iArr[i11] = i12;
                                    i5 = i13;
                                } else {
                                    int i14 = 4;
                                    if (i8 >= 4) {
                                        i14 = i8 * 2;
                                    }
                                    int[] iArr3 = new int[i14];
                                    System.arraycopy(iArr, 0, iArr3, 0, i11);
                                    iArr3[i11] = i12;
                                    i5 = i13;
                                    System.arraycopy(iArr, i11, iArr3, i11 + 1, iArr.length - i11);
                                    iArr = iArr3;
                                }
                                i8 = i5;
                                z2 = true;
                            } else {
                                i4 = i9;
                                z2 = false;
                            }
                            if (z2) {
                                arrayList2.add(str5);
                            }
                            it = it2;
                            i02 = list;
                            size2 = i10;
                            i9 = i4;
                        }
                        List list2 = i02;
                        int i15 = size2;
                        int i16 = i9;
                        if (arrayList2.isEmpty()) {
                            providerInfo.authority = null;
                        } else if (arrayList2.size() != list2.size()) {
                            providerInfo.authority = e.C0(arrayList2, ";", (a) null, 62);
                        }
                        size2 = i15;
                        i9 = i16;
                        i7 = 1;
                    } else {
                        int i17 = i9;
                    }
                }
                packageInfo.providers = (ProviderInfo[]) g(arrayList, m2Var, applicationInfo, N.f3939m, S.f3982n);
                String[] strArr = (String[]) parsePackage.requestedPermissions.toArray(H.f3888e);
                packageInfo.requestedPermissions = strArr;
                int length = strArr.length;
                int[] iArr4 = new int[length];
                for (int i18 = 0; i18 < length; i18++) {
                    iArr4[i18] = 3;
                }
                packageInfo.requestedPermissionsFlags = iArr4;
                packageInfo.gids = iArr2;
                if (T4.f3997a) {
                    String[] strArr2 = packageInfo.splitNames;
                    if (strArr2 != null) {
                        if (strArr2.length != 0) {
                            iArr2 = new int[strArr2.length];
                        }
                    }
                    packageInfo.splitRevisionCodes = iArr2;
                }
                ArrayList arrayList3 = parsePackage.reqFeatures;
                if (arrayList3 != null) {
                    featureInfoArr = (FeatureInfo[]) arrayList3.toArray(new FeatureInfo[0]);
                } else {
                    featureInfoArr = null;
                }
                packageInfo.reqFeatures = featureInfoArr;
                ArrayList arrayList4 = parsePackage.configPreferences;
                if (arrayList4 != null) {
                    configurationInfoArr = (ConfigurationInfo[]) arrayList4.toArray(new ConfigurationInfo[0]);
                } else {
                    configurationInfoArr = null;
                }
                packageInfo.configPreferences = configurationInfoArr;
                ArrayList arrayList5 = parsePackage.instrumentation;
                ArrayList arrayList6 = new ArrayList(M0.g.A0(arrayList5));
                int size3 = arrayList5.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj2 = arrayList5.get(i19);
                    i19++;
                    PackageParser.Instrumentation instrumentation = (PackageParser.Instrumentation) obj2;
                    InstrumentationInfo instrumentationInfo = instrumentation.info;
                    instrumentationInfo.metaData = instrumentation.metaData;
                    arrayList6.add(instrumentationInfo);
                }
                packageInfo.instrumentation = (InstrumentationInfo[]) arrayList6.toArray(new InstrumentationInfo[0]);
                ArrayList arrayList7 = parsePackage.permissions;
                ArrayList arrayList8 = new ArrayList(M0.g.A0(arrayList7));
                int size4 = arrayList7.size();
                int i20 = 0;
                while (i20 < size4) {
                    Object obj3 = arrayList7.get(i20);
                    i20++;
                    PackageParser.Permission permission = (PackageParser.Permission) obj3;
                    PermissionInfo permissionInfo = permission.info;
                    permissionInfo.metaData = permission.metaData;
                    arrayList8.add(permissionInfo);
                }
                packageInfo.permissions = (PermissionInfo[]) arrayList8.toArray(new PermissionInfo[0]);
                ArrayList arrayList9 = parsePackage.featureGroups;
                if (arrayList9 != null) {
                    featureGroupInfoArr = (FeatureGroupInfo[]) arrayList9.toArray(new FeatureGroupInfo[0]);
                } else {
                    featureGroupInfoArr = null;
                }
                packageInfo.featureGroups = featureGroupInfoArr;
                x32.f4036e = new C0467z3(parsePackage);
                if (i6 != 0) {
                    if (i6 == 1) {
                        str = "android.intent.action.PACKAGE_ADDED";
                    } else {
                        str = "android.intent.action.PACKAGE_REPLACED";
                    }
                    Intent intent = new Intent(str);
                    intent.setData(Uri.fromParts("package", packageInfo.packageName, (String) null));
                    C0330c3.b.g0(intent, (String) null, 0);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static ComponentInfo[] g(ArrayList arrayList, C0389m2 m2Var, ApplicationInfo applicationInfo, k kVar, l lVar) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                PackageParser.Component component = (PackageParser.Component) obj;
                ComponentInfo componentInfo = (ComponentInfo) kVar.i(component);
                e(componentInfo, applicationInfo);
                componentInfo.metaData = component.metaData;
                m2Var.f4141a.b(componentInfo.name.hashCode(), componentInfo);
                arrayList2.add(componentInfo);
            }
        } catch (Exception unused) {
        }
        return (ComponentInfo[]) lVar.e(arrayList2);
    }
}
