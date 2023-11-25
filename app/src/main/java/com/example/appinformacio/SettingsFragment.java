package com.example.appinformacio;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);

        // Obtén y configura la preferencia de lista para el color de fondo
        ListPreference backgroundColorPreference = findPreference("preference_key_background_color");
        if (backgroundColorPreference != null) {
            backgroundColorPreference.setSummaryProvider(ListPreference.SimpleSummaryProvider.getInstance());
        }
    }
}

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}