package kyo.watasiwa.com.logutil;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by heroi on 2017-09-09.
 */

public class BaseApplication extends Application {

    public static boolean DEBUG = false;
    @Override
    public void onCreate() {
        super.onCreate();
        DEBUG = isDebuggable(this);
    }


    /**
     * 현재 디버그모드여부를 리턴
     *
     * @param context
     * @return
     */
    private boolean isDebuggable(Context context){
        boolean isDebug = false;

        PackageManager pm = context.getPackageManager();
        try {
            ApplicationInfo applnfo = pm.getApplicationInfo(context.getPackageName(), 0);
            isDebug = (0 != (applnfo.flags & ApplicationInfo.FLAG_DEBUGGABLE));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return isDebug;
    }
}
