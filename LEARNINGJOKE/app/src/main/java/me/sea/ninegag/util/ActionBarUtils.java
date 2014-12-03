package me.sea.ninegag.util;

import android.app.Activity;
import android.view.View;

/**
 * Created by sea on 14-4-14.
 */
public class ActionBarUtils {
    public static View findActionBarContainer(Activity activity) {
        int id = activity.getResources().getIdentifier("action_bar_container", "id", "android");
        return activity.findViewById(id);
    }

    public static View findSplitActionBar(Activity activity) {
        int id = activity.getResources().getIdentifier("split_action_bar", "id", "android");
        return activity.findViewById(id);
    }
}
