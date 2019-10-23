package watanabe.hw.hodaka.klock.ui.preference

import android.os.Bundle
import android.view.Menu
import androidx.preference.PreferenceFragmentCompat
import watanabe.hw.hodaka.klock.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}