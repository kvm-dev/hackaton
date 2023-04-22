package com.colorgame

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.colorgame.api.Api
import com.colorgame.model.level.newLevel.GetNewLevel
import com.colorgame.retrofit.RetrofitHelper
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val result: MutableLiveData<GetNewLevel> = MutableLiveData()

    fun getLevel() {
//        CoroutineScope(Dispatchers.IO).launch {
        val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
        viewModelScope.launch {
            Log.d("work", "да")
            val resultLocal =  RetrofitHelper.getInstance().create(Api::class.java)
                .getLevel()
            result.value = resultLocal.body()
            Log.d("zzz_response", "is ${resultLocal.code()}")
            Log.d("work2", "да")
        }
    }
}