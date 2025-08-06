package i0;

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cheatbox.MainActivity;
import com.cheatbox.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p1.a;

public final class t extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f3006a;
    public final /* synthetic */ File b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ProgressBar f3007c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f3008d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f3009e;
    public final /* synthetic */ MainActivity f;

    public t(MainActivity mainActivity, File file, File file2, ProgressBar progressBar, TextView textView, AlertDialog alertDialog) {
        this.f = mainActivity;
        this.f3006a = file;
        this.b = file2;
        this.f3007c = progressBar;
        this.f3008d = textView;
        this.f3009e = alertDialog;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        File file = this.f3006a;
        try {
            if (!file.exists()) {
                return Boolean.FALSE;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(this.b);
            byte[] bArr = new byte[8192];
            long length = file.length();
            long j2 = 0;
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                    j2 += (long) read;
                    publishProgress(new Integer[]{Integer.valueOf((int) ((100 * j2) / length))});
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return Boolean.TRUE;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        MainActivity mainActivity = this.f;
        if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
            AlertDialog alertDialog = this.f3009e;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
        }
        if (bool.booleanValue()) {
            new AlertDialog.Builder(mainActivity, R.style.MT_Bin).setTitle(mainActivity.getString(R.string.MT_Bin)).setMessage(mainActivity.getString(R.string.MT_Bin)).setPositiveButton(mainActivity.getString(R.string.MT_Bin), new f(7)).show();
        } else {
            new AlertDialog.Builder(mainActivity, R.style.MT_Bin).setTitle(mainActivity.getString(R.string.MT_Bin)).setMessage(mainActivity.getString(R.string.MT_Bin)).setPositiveButton(mainActivity.getString(R.string.MT_Bin), new f(8)).show();
        }
    }

    public final void onProgressUpdate(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        this.f3007c.setProgress(numArr[0].intValue());
        this.f3008d.setText(this.f.getString(R.string.MT_Bin) + a.a(47557197912945618L) + numArr[0] + a.a(47557189323011026L));
    }
}
