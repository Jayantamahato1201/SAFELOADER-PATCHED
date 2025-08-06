package q1;

public final class W4 extends V4 {
    public static final W4 b = new V4();

    public final void b() {
        String str;
        S3 s3 = C0458y0.f4243c;
        this.f4021a = s3;
        boolean z2 = T4.f4003i;
        if (z2) {
            c("people", "vibrator_manager", "game");
            C0413q2 q2Var = C0388m1.f4140a;
            C0412q1 c2 = C0388m1.c("domain_verification", this.f4021a, (String) null);
            if (c2 != null) {
                c2.f4174a.b(-692070383, C0458y0.f4247h);
            }
            C0412q1 c3 = C0388m1.c("permission_checker", this.f4021a, (String) null);
            if (c3 != null) {
                c3.a(new int[]{686218487, 742313225}, C0458y0.f4244d);
            }
        } else {
            C0388m1.c("vibrator", s3, (String) null);
        }
        if (T4.f3997a) {
            c("graphicsstats", "usagestats");
            if (T4.b) {
                c("fingerprint", "netstats");
                if (T4.f3998c) {
                    C0388m1.c("hardware_properties", this.f4021a, (String) null);
                    if (T4.f4000e) {
                        C0388m1.c("companiondevice", this.f4021a, (String) null);
                        C0412q1 c4 = C0388m1.c("device_identifiers", this.f4021a, (String) null);
                        if (c4 != null) {
                            c4.a(new int[]{509696967, 790175978, -75128768}, new C0357h0((Object) f5.f4095a));
                        }
                        C0412q1 c5 = C0388m1.c("storagestats", this.f4021a, (String) null);
                        if (c5 != null) {
                            c5.f4174a.b(421238612, new C0376k1(3));
                        }
                        if (T4.f) {
                            c("slice", "crossprofileapps");
                            if (T4.f4001g) {
                                c("role", "face", "uri_grants");
                                if (T4.f4002h) {
                                    c("permissionmgr", "auth");
                                    C0412q1 c6 = C0388m1.c("vpn_management", this.f4021a, (String) null);
                                    if (c6 != null) {
                                        c6.f4174a.b(-1710356229, V3.f4020d);
                                    }
                                    if (T4.f4004j) {
                                        C0388m1.c("locale", this.f4021a, (String) null);
                                        C0412q1 c7 = C0388m1.c("safety_center", this.f4021a, (String) null);
                                        if (c7 != null) {
                                            c7.f4174a.b(-487933456, C0458y0.f4246g);
                                        }
                                        if (T4.f4005k) {
                                            c("grammatical_inflection", "credential");
                                            if (T4.f4007m) {
                                                C0388m1.c("advanced_protection", this.f4021a, (String) null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (T4.f4010p) {
            if (!T4.f4009o || !z2) {
                str = "phone_huawei";
            } else {
                str = "phone_honor";
            }
            C0412q1 c8 = C0388m1.c(str, this.f4021a, (String) null);
            if (c8 != null) {
                c8.f4174a.b(-258390536, new C0357h0((Object) f5.b));
            }
            if (z2) {
                C0388m1.c("HwMagicWindowService", this.f4021a, (String) null);
            }
        }
    }
}
