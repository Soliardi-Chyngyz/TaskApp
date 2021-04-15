package com.chyngyz.taskapp.data.network.apiservices

import com.chyngyz.taskapp.data.models.Object
import retrofit2.http.GET

interface ApiService {
    @GET
    suspend fun getData(): Object
}