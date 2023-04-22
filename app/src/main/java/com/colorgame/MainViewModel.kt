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
            val rLocal = RetrofitHelper.getInstance().create(Api::class.java)
            val resultLocal = rLocal.getLevel()
            result.value = resultLocal.body()
            Log.d("zzz_response", "is ${resultLocal.code()}")
            Log.d("work2", "да")
        }
    }
}