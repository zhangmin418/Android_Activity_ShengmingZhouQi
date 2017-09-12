package jiyun.com.example.lenovo.android_activity_shengmingzhouqi;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    private RelativeLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
        Log.e("TAG","------onCreate-------");
    }

    @Override
    protected void onRestart() {
        Log.e("TAG","------onRestart-------");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.e("TAG","------onStart-------");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("TAG","------onResume-------");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("TAG","------onPause-------");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("TAG","------onStop-------");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("TAG","------onDestroy-------");
        super.onDestroy();
    }
}
