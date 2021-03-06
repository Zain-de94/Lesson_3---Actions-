package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.NotificationUtils;
import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks{

    public static final String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";

    public static final String ACTION_DISMISS_NOTIFICATION = "dismiss-notification";

    public static void executeTask(Context context , String action)
    {

        if(ACTION_INCREMENT_WATER_COUNT.equals(action))
        {

            incrementWaterCount(context);
        }else if(ACTION_DISMISS_NOTIFICATION.equals(action)) {

            NotificationUtils.clearAllNotification(context);

        }


    }


    private static void incrementWaterCount(Context context){

        PreferenceUtilities.incrementWaterCount(context);

        NotificationUtils.clearAllNotification(context);

    }




}

