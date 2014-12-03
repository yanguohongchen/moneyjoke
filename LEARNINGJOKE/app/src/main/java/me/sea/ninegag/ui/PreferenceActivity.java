package me.sea.ninegag.ui;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;

import me.sea.ninegag.R;
import me.sea.ninegag.ui.fragment.PreferenceFragment;
import me.sea.ninegag.view.swipeback.SwipeBackActivity;

/**
 * Created by sea on 14-4-16.
 */
public class PreferenceActivity extends SwipeBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.action_settings);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenceFragment())
                .commit();
    }
}
