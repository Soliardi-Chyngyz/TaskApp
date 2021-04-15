package com.chyngyz.taskapp.data.network

import com.chyngyz.taskapp.constants.Constants
import com.chyngyz.taskapp.data.network.apiservices.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitClient {

    private val provideRetrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun provideApiService(): ApiService = provideRetrofit
        .create(ApiService::class.java)
}