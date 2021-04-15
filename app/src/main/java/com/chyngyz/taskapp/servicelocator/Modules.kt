package com.chyngyz.taskapp.servicelocator

import com.chyngyz.taskapp.data.network.RetrofitClient
import com.chyngyz.taskapp.data.repository.Repository
import com.chyngyz.taskapp.ui.activity.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = listOf(
    viewModules,
    networkModule,
    repoModule,
)

/*
val viewModelsModule : Module = module {
    viewModel { MainActivityViewModel(get()) }
}

val networkModule : Module = module {
    single { RetrofitClient().provideApiService() }
}

val repoModule : Module = module {
    factory { Repository(get()) }
}*/
