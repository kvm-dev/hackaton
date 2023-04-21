package com.colorgame

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.colorgame.api.Api
import com.colorgame.model.newLevel.GetNewLevel
import com.colorgame.retrofit.RetrofitHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val result: MutableLiveData<GetNewLevel> = MutableLiveData()

    fun getLevel() {
        CoroutineScope(Dispatchers.IO).launch {
            result.value =  RetrofitHelper.getInstance().create(Api.GetLevelAPI::class.java)
                .getLevel("64343ea1293fa64343ea1293fd").body()
        }
    }
}