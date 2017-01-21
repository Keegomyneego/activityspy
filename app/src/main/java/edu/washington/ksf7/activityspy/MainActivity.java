package edu.washington.ksf7.activityspy;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String activityClassName = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(activityClassName, "onCreate event fired");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(activityClassName, "onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(activityClassName, "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(activityClassName, "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(activityClassName, "onStop event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(activityClassName, "onRestart event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(activityClassName, "onDestroy event fired");
        Log.e(activityClassName, "We’re going down, Captain!");
    }
}
