package edu.washington.ksf7.activityspy;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by keegomyneego on 1/21/17.
 *
 * Used to programatically add watchers for each activity life cycle event within an application.
 */

public class ActivitySpy {
    public static void createSpy(Activity activity) {

        final String activityClassName = activity.getClass().getSimpleName();

        activity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Log.i(activityClassName, "onActivityCreated event fired");
            }

            @Override
            public void onActivityStarted(Activity activity) {
                Log.i(activityClassName, "onActivityStarted event fired");
            }

            @Override
            public void onActivityResumed(Activity activity) {
                Log.i(activityClassName, "onActivityResumed event fired");
            }

            @Override
            public void onActivityPaused(Activity activity) {
                Log.i(activityClassName, "onActivityPaused event fired");
            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.i(activityClassName, "onActivityStopped event fired");
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Log.i(activityClassName, "onActivitySaveInstanceState event fired");
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.i(activityClassName, "onActivityDestroyed event fired");
            }
        });
    }
}
