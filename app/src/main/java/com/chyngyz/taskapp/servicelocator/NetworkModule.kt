package com.chyngyz.taskapp.servicelocator

import com.chyngyz.taskapp.data.network.RetrofitClient
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule: Module = module {
    single { RetrofitClient().provideApiService() }
}