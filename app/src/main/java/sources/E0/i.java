package E0;

public final class i extends A.i {
    public final void I(u uVar, float f, float f2) {
        uVar.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        q qVar = new q(0.0f, 0.0f, f3, f3);
        qVar.f = 180.0f;
        qVar.f180g = 90.0f;
        uVar.f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f188g.add(oVar);
        uVar.f186d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d2 = (double) 270.0f;
        uVar.b = (((float) Math.cos(Math.toRadians(d2))) * f5) + f4;
        uVar.f185c = (f5 * ((float) Math.sin(Math.toRadians(d2)))) + f4;
    }
}
