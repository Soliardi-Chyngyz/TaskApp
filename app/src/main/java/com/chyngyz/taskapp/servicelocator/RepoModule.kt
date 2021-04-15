package com.chyngyz.taskapp.servicelocator

import com.chyngyz.taskapp.data.repository.Repository
import org.koin.core.module.Module
import org.koin.dsl.module

val repoModule: Module = module {
    single { Repository(get()) }
}