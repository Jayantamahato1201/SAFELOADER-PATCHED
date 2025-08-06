package com.cheatbox;

import android.app.AlertDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.o;
import androidx.fragment.app.w;
import com.google.android.material.button.MaterialButton;
import e.C0137h;
import i0.i;
import i0.q;
import i0.r;
import i0.s;
import i0.t;
import i0.u;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import p1.a;
import t0.C0486a;

public class MainActivity extends C0137h {

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ int f1818B = 0;

    /* renamed from: A  reason: collision with root package name */
    public final String[] f1819A = {a.a(47556965984711634L), a.a(47556892970267602L), a.a(47556828545758162L)};

    /* renamed from: v  reason: collision with root package name */
    public final String[] f1820v;

    /* renamed from: w  reason: collision with root package name */
    public final String f1821w;

    /* renamed from: x  reason: collision with root package name */
    public String f1822x;

    /* renamed from: y  reason: collision with root package name */
    public String f1823y;

    /* renamed from: z  reason: collision with root package name */
    public u f1824z;

    public MainActivity() {
        String[] strArr = {a.a(47557180733076434L), a.a(47557107718632402L), a.a(47557043294122962L)};
        this.f1820v = strArr;
        this.f1821w = strArr[0];
        a.a(47556751236346834L);
        a.a(47556729761510354L);
        a.a(47556699696739282L);
    }

    public static void t(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File t2 : listFiles) {
                    t(t2);
                }
            }
            file.delete();
        }
    }

    public static byte[] u(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        Cipher instance = Cipher.getInstance(a.a(47554904400409554L));
        instance.init(1, secretKey, ivParameterSpec);
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = new byte[(ivParameterSpec.getIV().length + doFinal.length)];
        System.arraycopy(ivParameterSpec.getIV(), 0, bArr2, 0, ivParameterSpec.getIV().length);
        System.arraycopy(doFinal, 0, bArr2, ivParameterSpec.getIV().length, doFinal.length);
        return bArr2;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.MT_Bin);
        this.f1822x = a.a(47556673926935506L);
        this.f1823y = a.a(47556613797393362L);
        if (u.b == null) {
            u.b = new u(this);
        }
        this.f1824z = u.b;
        ((MaterialButton) findViewById(R.id.MT_Bin)).setOnClickListener(new q(this, 0));
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.MT_Bin);
        u uVar = this.f1824z;
        if (uVar.f3010a.getBoolean(a.a(47556553667851218L), false)) {
            materialButton.setIconTintResource(R.color.MT_Bin);
            materialButton.setTextColor(C0486a.d(this, R.color.MT_Bin));
        }
        materialButton.setOnClickListener(new r(this, materialButton));
        new Thread(new s(this, Native.getTime(), (TextView) findViewById(R.id.MT_Bin), 0)).start();
        String currGameVer = Native.currGameVer();
        ((TextView) findViewById(R.id.MT_Bin)).setText(Build.MANUFACTURER + a.a(47556493538309074L) + Build.MODEL + a.a(47556484948374482L) + Build.DEVICE + a.a(47556472063472594L) + Build.VERSION.RELEASE);
        MaterialButton materialButton2 = (MaterialButton) findViewById(R.id.MT_Bin);
        TextView textView = (TextView) findViewById(R.id.MT_Bin);
        String w2 = w(this.f1820v[0]);
        if (w2.equals(a.a(47556416228897746L))) {
            materialButton2.setText(this.f1823y);
        } else if (currGameVer.contains(w2)) {
            materialButton2.setOnClickListener(new q(this, 1));
        } else {
            materialButton2.setText(this.f1822x);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new o(2, this));
        } else {
            h().a(this, new w(this));
        }
        View inflate = getLayoutInflater().inflate(R.layout.MT_Bin, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.MT_Bin)).setText(getString(R.string.MT_Bin));
        u uVar2 = this.f1824z;
        if (uVar2.f3010a.contains(a.a(47556326034584530L))) {
            K0.w d2 = K0.w.d();
            u uVar3 = this.f1824z;
            d2.e(uVar3.f3010a.getString(a.a(47556304559748050L), a.a(47556283084911570L))).a((ImageView) inflate.findViewById(R.id.MT_Bin));
        }
        ((ProgressBar) inflate.findViewById(R.id.MT_Bin)).setIndeterminate(true);
        AlertDialog create = new AlertDialog.Builder(this, R.style.MT_Bin).setView(inflate).setCancelable(false).create();
        create.show();
        new Thread(new i(this, create, 0)).start();
    }

    public final void s(File file, File file2) {
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            View inflate = getLayoutInflater().inflate(R.layout.MT_Bin, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.MT_Bin);
            textView.setText(getString(R.string.MT_Bin));
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.MT_Bin);
            progressBar.setIndeterminate(false);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            AlertDialog create = new AlertDialog.Builder(this, R.style.MT_Bin).setView(inflate).setCancelable(false).create();
            create.show();
            new t(this, file, file2, progressBar, textView, create).execute(new Void[0]);
            return;
        }
        Toast.makeText(this, getString(R.string.MT_Bin), 0).show();
    }

    public final void v(String str, boolean z2) {
        BufferedOutputStream bufferedOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                if (z2) {
                    for (String file2 : Native.f1825a) {
                        File file3 = new File(getFilesDir(), file2);
                        if (file3.exists()) {
                            file3.delete();
                        }
                    }
                }
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    for (String str2 : Native.f1825a) {
                        File file4 = new File(getFilesDir(), str2);
                        if (!file4.exists() && zipEntry.getName().equals(str2)) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                            if (Build.VERSION.SDK_INT >= 26) {
                                bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(file4.toPath(), new OpenOption[0]));
                            } else {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4));
                            }
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            file4.setExecutable(true);
                            file4.setWritable(false, false);
                        }
                    }
                }
                zipFile.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final String w(String str) {
        try {
            return getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return a.a(47556338919486418L);
        }
    }
}
