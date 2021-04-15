package com.chyngyz.taskapp.data.repository

import androidx.lifecycle.liveData
import com.chyngyz.taskapp.data.models.Object
import com.chyngyz.taskapp.data.network.apiservices.ApiService
import com.chyngyz.taskapp.utils.Resource
import kotlinx.coroutines.Dispatchers

class Repository(private var api: ApiService) {

    fun fetchObject() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            val receivedData = api.getData()
            receivedData?.let {
                val listOfData = mutableListOf<Object>()
                listOfData.add(it)
                emit(Resource.success(data = listOfData))
            }
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Resource.error(data = null, message = e.message ?: "Error"))
        }
    }
}