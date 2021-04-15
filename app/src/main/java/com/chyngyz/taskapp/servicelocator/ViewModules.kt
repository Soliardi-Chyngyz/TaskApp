package com.chyngyz.taskapp.servicelocator

import com.chyngyz.taskapp.ui.activity.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModules: Module = module {
    viewModel { MainActivityViewModel(get()) }
}