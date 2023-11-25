package com.example.appinformacio;

import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

public class SettingsFragment extends PreferenceFragmentCompat
{

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey)
    {
        setPreferencesFromResource(R.xml.preferences, rootKey);

        ListPreference backgroundColorPreference = findPreference("preference_key_background_color");
        if (backgroundColorPreference != null)
        {
            backgroundColorPreference.setSummaryProvider(ListPreference.SimpleSummaryProvider.getInstance());
        }
    }
}