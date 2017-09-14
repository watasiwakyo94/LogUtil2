package kyo.watasiwa.com.logutil.util;

import android.util.Log;

import kyo.watasiwa.com.logutil.BaseApplication;

/**
 * Created by heroi on 2017-09-09.
 */

public class DLog {

    private static final String TAG = "KYO";

    /** Log Error Level **/
    public static final void e(String msg){
        if(BaseApplication.DEBUG) Log.e(TAG, buildMsg(msg));
    }

    /** Log Warnging Level **/
    public static final void w(String msg){
        if(BaseApplication.DEBUG) Log.w(TAG, buildMsg(msg));
    }

    /** Log Information Level **/
    public static final void i(String msg){
        if(BaseApplication.DEBUG) Log.i(TAG, buildMsg(msg));
    }

    /** Log Debug Level **/
    public static final void d(String msg){
        if(BaseApplication.DEBUG) Log.d(TAG, buildMsg(msg));
    }

    /** Log Verbose Level **/
    public static final void v(String msg){
        if(BaseApplication.DEBUG) Log.v(TAG, buildMsg(msg));
    }


    private static String buildMsg(String msg) {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[4];
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        sb.append(ste.getFileName().replace(".java", ""));
        sb.append(".");
        sb.append(ste.getMethodName());
        sb.append("()");
        sb.append(":");
        sb.append(ste.getLineNumber());
        sb.append("] ");
        sb.append(msg);

        return sb.toString();
    }
}
