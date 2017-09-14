package kyo.watasiwa.com.logutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import kyo.watasiwa.com.logutil.util.DLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DLog.e("테스트 로그");
    }
}
