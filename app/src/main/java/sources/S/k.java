package s;

import java.util.ArrayList;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public m f4468a;
    public ArrayList b;

    public static long a(f fVar, long j2) {
        m mVar = fVar.f4458d;
        if (mVar instanceof i) {
            return j2;
        }
        ArrayList arrayList = fVar.f4464k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4458d != mVar) {
                    j3 = Math.min(j3, a(fVar2, ((long) fVar2.f) + j2));
                }
            }
        }
        if (fVar != mVar.f4477i) {
            return j3;
        }
        long j4 = mVar.j();
        f fVar3 = mVar.f4476h;
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(fVar3, j5)), j5 - ((long) fVar3.f));
    }

    public static long b(f fVar, long j2) {
        m mVar = fVar.f4458d;
        if (mVar instanceof i) {
            return j2;
        }
        ArrayList arrayList = fVar.f4464k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4458d != mVar) {
                    j3 = Math.max(j3, b(fVar2, ((long) fVar2.f) + j2));
                }
            }
        }
        if (fVar != mVar.f4476h) {
            return j3;
        }
        long j4 = mVar.j();
        f fVar3 = mVar.f4477i;
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(fVar3, j5)), j5 - ((long) fVar3.f));
    }
}
