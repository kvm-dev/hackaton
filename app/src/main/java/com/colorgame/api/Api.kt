package com.colorgame.api

import com.colorgame.model.level.newLevel.GetNewLevel
import retrofit2.Response
import retrofit2.http.POST

interface Api {
    @POST("art/stage/next")
    suspend fun getLevel(): Response<GetNewLevel>

}