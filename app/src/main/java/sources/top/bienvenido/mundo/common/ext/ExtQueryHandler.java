package top.bienvenido.mundo.common.ext;

import android.os.IpcDataCache;

public final class ExtQueryHandler extends IpcDataCache.QueryHandler<Object, Object> {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰  reason: collision with root package name */
    public final IpcDataCache.QueryHandler f4715;

    public ExtQueryHandler(IpcDataCache.QueryHandler<Object, Integer> queryHandler) {
        this.f4715 = queryHandler;
    }

    public Object apply(Object obj) {
        try {
            return this.f4715.apply(obj);
        } catch (Exception unused) {
            return 0;
        }
    }
}
