package com.chyngyz.taskapp.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chyngyz.taskapp.data.models.Object
import org.koin.androidx.viewmodel.ViewModelOwner

open class BaseViewModel : ViewModel() {

    protected val isLoading = MutableLiveData(false)
    protected val toast = MutableLiveData<String>()
    protected val list = MutableLiveData<MutableList<Object>>()

    fun getToast(): LiveData<String> = toast

    fun getData(): LiveData<MutableList<Object>> = list

    fun isLoading(): LiveData<Boolean> = isLoading
}