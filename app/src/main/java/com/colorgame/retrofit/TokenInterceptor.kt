package com.colorgame.retrofit

import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Request
import okhttp3.Response

import java.io.IOException


class TokenInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Chain): Response {

        //rewrite the request to add bearer token
        val newRequest: Request = chain.request().newBuilder()
            .header("Authorization", "64343ea1293fa64343ea1293fd")
            .build()
        return chain.proceed(newRequest)
    }
}