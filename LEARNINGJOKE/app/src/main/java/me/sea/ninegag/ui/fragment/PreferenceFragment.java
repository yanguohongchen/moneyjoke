package me.sea.ninegag.ui.fragment;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.Preference;

import me.sea.ninegag.R;

/**
 * Created by sea on 14-4-16.
 */
public class PreferenceFragment extends android.preference.PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);

        // 设置版本号
        Preference versionPreference = findPreference(getString(R.string.pref_key_version));
        PackageInfo packageInfo;
        try {
            packageInfo = getActivity().getPackageManager().getPackageInfo(
                    getActivity().getPackageName(), PackageManager.GET_CONFIGURATIONS);
            versionPreference.setTitle("v" + packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
