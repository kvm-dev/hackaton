package com.colorgame

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.colorgame.api.Api
import com.colorgame.model.level.newLevel.GetNewLevel
import com.colorgame.retrofit.RetrofitHelper
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val result: MutableLiveData<GetNewLevel> = MutableLiveData()

    fun getLevel() {
//        CoroutineScope(Dispatchers.IO).launch {
        viewModelScope.launch {
            Log.d("work", "да")
            val resultLocal =  RetrofitHelper.getInstance().create(Api.GetLevelAPI::class.java)
                .getLevel("64343ea1293fa64343ea1293fd")
            result.value = resultLocal.body()
            Log.d("zzz_response", "is ${resultLocal.code()}")
            Log.d("work2", "да")
        }
    }
}