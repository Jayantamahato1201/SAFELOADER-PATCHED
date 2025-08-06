package j1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o1.h;

/* renamed from: j1.e  reason: case insensitive filesystem */
public abstract class C0224e {

    /* renamed from: a  reason: collision with root package name */
    public static final C0221b[] f3226a;
    public static final Map b;

    static {
        C0221b bVar = new C0221b(C0221b.f3211i, "");
        h hVar = C0221b.f;
        C0221b bVar2 = new C0221b(hVar, "GET");
        C0221b bVar3 = new C0221b(hVar, "POST");
        h hVar2 = C0221b.f3209g;
        C0221b bVar4 = new C0221b(hVar2, "/");
        C0221b bVar5 = new C0221b(hVar2, "/index.html");
        h hVar3 = C0221b.f3210h;
        C0221b bVar6 = new C0221b(hVar3, "http");
        C0221b bVar7 = new C0221b(hVar3, "https");
        h hVar4 = C0221b.f3208e;
        C0221b bVar8 = bVar;
        C0221b bVar9 = bVar2;
        C0221b[] bVarArr = {bVar8, bVar9, bVar3, bVar4, bVar5, bVar6, bVar7, new C0221b(hVar4, "200"), new C0221b(hVar4, "204"), new C0221b(hVar4, "206"), new C0221b(hVar4, "304"), new C0221b(hVar4, "400"), new C0221b(hVar4, "404"), new C0221b(hVar4, "500"), new C0221b("accept-charset", ""), new C0221b("accept-encoding", "gzip, deflate"), new C0221b("accept-language", ""), new C0221b("accept-ranges", ""), new C0221b("accept", ""), new C0221b("access-control-allow-origin", ""), new C0221b("age", ""), new C0221b("allow", ""), new C0221b("authorization", ""), new C0221b("cache-control", ""), new C0221b("content-disposition", ""), new C0221b("content-encoding", ""), new C0221b("content-language", ""), new C0221b("content-length", ""), new C0221b("content-location", ""), new C0221b("content-range", ""), new C0221b("content-type", ""), new C0221b("cookie", ""), new C0221b("date", ""), new C0221b("etag", ""), new C0221b("expect", ""), new C0221b("expires", ""), new C0221b("from", ""), new C0221b("host", ""), new C0221b("if-match", ""), new C0221b("if-modified-since", ""), new C0221b("if-none-match", ""), new C0221b("if-range", ""), new C0221b("if-unmodified-since", ""), new C0221b("last-modified", ""), new C0221b("link", ""), new C0221b("location", ""), new C0221b("max-forwards", ""), new C0221b("proxy-authenticate", ""), new C0221b("proxy-authorization", ""), new C0221b("range", ""), new C0221b("referer", ""), new C0221b("refresh", ""), new C0221b("retry-after", ""), new C0221b("server", ""), new C0221b("set-cookie", ""), new C0221b("strict-transport-security", ""), new C0221b("transfer-encoding", ""), new C0221b("user-agent", ""), new C0221b("vary", ""), new C0221b("via", ""), new C0221b("www-authenticate", "")};
        f3226a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (!linkedHashMap.containsKey(bVarArr[i2].f3212a)) {
                linkedHashMap.put(bVarArr[i2].f3212a, Integer.valueOf(i2));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(h hVar) {
        int l2 = hVar.l();
        int i2 = 0;
        while (i2 < l2) {
            byte g2 = hVar.g(i2);
            if (g2 < 65 || g2 > 90) {
                i2++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.o());
            }
        }
    }
}
