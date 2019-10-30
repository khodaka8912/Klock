package watanabe.hw.hodaka.klock.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.preference.PreferenceManager
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val appearanceData = MutableLiveData<Appearance>()

//    var appearance = ObservableField<Appearance>()

    //ViewModel初期化時にロード
    init {
        loadProject()
    }

    private fun loadProject() {
        //viewModelScope->MainViewModel.onCleared() のタイミングでキャンセルされる CoroutineScope
        viewModelScope.launch {
//                PreferenceManager.getDefaultSharedPreferences()
        }
    }

}