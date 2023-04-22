package com.colorgame.retrofit

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object RetrofitHelper {

    var interceptor = TokenInterceptor()
    var client = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

        private const val BASE_URL ="http://api.datsart.dats.team/"
        private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
        fun getInstance(): Retrofit {
            return Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()
        }
    }