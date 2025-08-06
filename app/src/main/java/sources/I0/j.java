package i0;

import F.l;
import Z.g;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.Settings;
import android.util.Base64;
import com.cheatbox.LoginActivity;
import com.cheatbox.MainActivity;
import com.cheatbox.R;
import e.C0133d;
import e.C0137h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import p1.a;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2991a;
    public final /* synthetic */ C0137h b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2992c;

    public /* synthetic */ j(C0137h hVar, Object obj, int i2) {
        this.f2991a = i2;
        this.b = hVar;
        this.f2992c = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter;
        Object obj = this.f2992c;
        C0137h hVar = this.b;
        switch (this.f2991a) {
            case 0:
                String str2 = (String) obj;
                int i3 = MainActivity.f1818B;
                MainActivity mainActivity = (MainActivity) hVar;
                try {
                    a.a(47555703264326610L);
                    if (str2.equals(a.a(47555698969359314L))) {
                        str = a.a(47555625954915282L);
                    } else {
                        if (!str2.equals(a.a(47555587300209618L))) {
                            if (!str2.equals(a.a(47555522875700178L))) {
                                throw new Exception(a.a(47555398321648594L).concat(str2));
                            }
                        }
                        str = a.a(47555445566288850L);
                    }
                    if (!new File(mainActivity.getFilesDir(), str).exists()) {
                        l lVar = new l((Context) mainActivity, (int) R.style.MT_Bin);
                        C0133d dVar = (C0133d) lVar.b;
                        dVar.f2480d = mainActivity.getString(R.string.MT_Bin);
                        dVar.f = mainActivity.getString(R.string.MT_Bin) + a.a(47555316717269970L) + str + a.a(47555303832368082L);
                        String string = mainActivity.getString(R.string.MT_Bin);
                        f fVar = new f(4);
                        dVar.f2482g = string;
                        dVar.f2483h = fVar;
                        lVar.b().show();
                        return;
                    }
                    String a2 = a.a(47555187868251090L);
                    KeyGenerator instance = KeyGenerator.getInstance(a.a(47554814206096338L));
                    instance.init(128);
                    SecretKey generateKey = instance.generateKey();
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    String encodeToString = Base64.encodeToString(MainActivity.u(a2.getBytes(), generateKey, ivParameterSpec), 2);
                    String encodeToString2 = Base64.encodeToString(ivParameterSpec.getIV(), 2);
                    String encodeToString3 = Base64.encodeToString(generateKey.getEncoded(), 2);
                    mainActivity.getApplicationContext().getPackageName();
                    File file = new File(Environment.getExternalStorageDirectory() + a.a(47555080494068690L));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, a.a(47555050429297618L));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    try {
                        fileOutputStream = new FileOutputStream(file2, false);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                        bufferedWriter.write(encodeToString);
                        bufferedWriter.newLine();
                        bufferedWriter.write(encodeToString2);
                        bufferedWriter.newLine();
                        bufferedWriter.write(encodeToString3);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                    Intent F2 = Q0.l.F(mainActivity, str2);
                    if (F2 != null) {
                        mainActivity.startActivity(F2);
                    }
                    new Thread(new l(0)).start();
                    return;
                } catch (Exception e3) {
                    l lVar2 = new l((Context) mainActivity, (int) R.style.MT_Bin);
                    String a3 = a.a(47554977414853586L);
                    C0133d dVar2 = (C0133d) lVar2.b;
                    dVar2.f2480d = a3;
                    dVar2.f = a.a(47554951645049810L) + e3.getMessage();
                    String a4 = a.a(47554917285311442L);
                    f fVar2 = new f(5);
                    dVar2.f2482g = a4;
                    dVar2.f2483h = fVar2;
                    lVar2.b().show();
                    return;
                }
            case 1:
                int i4 = MainActivity.f1818B;
                new Thread(new g((MainActivity) hVar, 3, (String) obj)).start();
                return;
            default:
                int i5 = LoginActivity.f1815x;
                LoginActivity loginActivity = (LoginActivity) hVar;
                if (!Environment.isExternalStorageManager()) {
                    loginActivity.startActivity((Intent) obj);
                }
                if (!Settings.canDrawOverlays(loginActivity)) {
                    String a5 = a.a(47558190050390994L);
                    loginActivity.startActivity(new Intent(a5, Uri.parse(a.a(47557975302026194L) + loginActivity.getPackageName())));
                }
                if (!loginActivity.getPackageManager().canRequestPackageInstalls()) {
                    String a6 = a.a(47557936647320530L);
                    loginActivity.startActivity(new Intent(a6, Uri.parse(a.a(47557747668759506L) + loginActivity.getPackageName())));
                }
                Runtime.getRuntime().exit(0);
                return;
        }
        throw th;
        throw th;
    }
}
