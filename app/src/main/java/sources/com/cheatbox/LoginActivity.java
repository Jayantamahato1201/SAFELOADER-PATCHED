package com.cheatbox;

import K0.w;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import e.C0137h;
import i0.b;
import i0.g;
import i0.h;
import i0.j;
import i0.u;
import p1.a;
import t0.C0486a;

public class LoginActivity extends C0137h {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f1815x = 0;

    /* renamed from: v  reason: collision with root package name */
    public TextInputEditText f1816v;

    /* renamed from: w  reason: collision with root package name */
    public u f1817w;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.MT_Bin);
        Thread.setDefaultUncaughtExceptionHandler(new b(this));
        getFilesDir().toString();
        if (u.b == null) {
            u.b = new u(this);
        }
        this.f1817w = u.b;
        this.f1816v = (TextInputEditText) findViewById(R.id.MT_Bin);
        u uVar = this.f1817w;
        if (uVar.f3010a.contains(a.a(47561016138871762L))) {
            w d2 = w.d();
            u uVar2 = this.f1817w;
            d2.e(uVar2.f3010a.getString(a.a(47560994664035282L), a.a(47560973189198802L))).a((ImageView) findViewById(R.id.MT_Bin));
        }
        ((TextInputLayout) findViewById(R.id.MT_Bin)).setEndIconOnClickListener(new g(this, 0));
        ((MaterialButton) findViewById(R.id.MT_Bin)).setOnClickListener(new g(this, 1));
        ((MaterialButton) findViewById(R.id.MT_Bin)).setOnClickListener(new g(this, 2));
        u uVar3 = this.f1817w;
        if (uVar3.f3010a.contains(a.a(47560968894231506L))) {
            TextInputEditText textInputEditText = this.f1816v;
            u uVar4 = this.f1817w;
            textInputEditText.setText(uVar4.f3010a.getString(a.a(47560930239525842L), a.a(47560891584820178L)));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            if (!Environment.isExternalStorageManager() || !getPackageManager().canRequestPackageInstalls() || !Settings.canDrawOverlays(this)) {
                Intent intent = new Intent(a.a(47559491425481682L));
                intent.setData(Uri.fromParts(a.a(47559250907313106L), getPackageName(), (String) null));
                Toast.makeText(this, getString(R.string.MT_Bin) + a.a(47559216547574738L) + getApplicationInfo().name, 0).show();
                new AlertDialog.Builder(this, R.style.MT_Bin).setTitle(getString(R.string.MT_Bin)).setMessage(getString(R.string.MT_Bin)).setCancelable(false).setPositiveButton(getString(R.string.MT_Bin), new j(this, intent, 2)).show();
                return;
            }
            if (!(C0486a.b(this, a.a(47560805685474258L)) == 0 && C0486a.b(this, a.a(47560629591815122L)) == 0)) {
                C0486a.p(this, new String[]{a.a(47560449203188690L), a.a(47560273109529554L)}, 101);
            }
            if (i2 >= 33 && C0486a.b(this, a.a(47560092720903122L)) == -1) {
                C0486a.p(this, new String[]{a.a(47559929512145874L)}, 1);
            }
            if (C0486a.b(this, a.a(47559766303388626L)) != 0) {
                C0486a.p(this, new String[]{a.a(47559628864435154L)}, 102);
            }
        } else if (i2 >= 26 && (!getPackageManager().canRequestPackageInstalls() || !Settings.canDrawOverlays(this))) {
            new AlertDialog.Builder(this, R.style.MT_Bin).setTitle(getString(R.string.MT_Bin)).setMessage(getString(R.string.MT_Bin)).setCancelable(false).setPositiveButton(getString(R.string.MT_Bin), new h(0, this)).show();
        } else if (C0486a.b(this, a.a(47559207957640146L)) != 0) {
            C0486a.p(this, new String[]{a.a(47559027569013714L), a.a(47558851475354578L)}, 1);
        }
    }
}
