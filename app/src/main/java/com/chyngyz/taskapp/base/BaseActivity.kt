package com.chyngyz.taskapp.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<ViewModel : BaseViewModel, Binding : ViewBinding>(@LayoutRes layoutId: Int) :
    AppCompatActivity(layoutId) {

    protected abstract val viewModel: ViewModel
    protected abstract val binding: Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialize()
        setupViews()
        setupListeners()
        setupRequests()
        setupObservers()
    }

    open fun setupViews() {
    }

    open fun setupObservers() {
    }

    open fun setupRequests() {
    }

    open fun setupListeners() {
    }

    open fun initialize() {
    }
}
