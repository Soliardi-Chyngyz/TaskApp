package com.chyngyz.taskapp.ui.activity

import androidx.lifecycle.ViewModel
import com.chyngyz.taskapp.base.BaseViewModel
import com.chyngyz.taskapp.data.models.Object
import com.chyngyz.taskapp.data.repository.Repository
import com.chyngyz.taskapp.utils.Status

class MainActivityViewModel(private val repository: Repository) : BaseViewModel() {

    fun fetchListObject() {
        val newData = mutableListOf<Object>()

        repository.fetchObject().observeForever { result ->
            if (result.status == Status.SUCCESS)
                result.data?.forEach { listOfObject ->
                    listOfObject?.let { newData?.addAll(listOf(it)) }
                }
            when (result.status) {
                Status.LOADING -> isLoading.value = true
                else -> isLoading.value = false
            }
            list.value = newData
        }
    }
}