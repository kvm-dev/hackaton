package com.colorgame.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    object RetrofitHelper {
        private const val BASE_URL ="http://api.datsart.dats.team/"
        fun getInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }