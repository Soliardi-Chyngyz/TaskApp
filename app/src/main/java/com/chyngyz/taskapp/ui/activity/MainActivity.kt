package com.chyngyz.taskapp.ui.activity

import by.kirich1409.viewbindingdelegate.viewBinding
import com.chyngyz.taskapp.R
import com.chyngyz.taskapp.base.BaseActivity
import com.chyngyz.taskapp.data.models.Object
import com.chyngyz.taskapp.databinding.ActivityMainBinding
import com.chyngyz.taskapp.ui.activity.adapter.MainActivityAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity :
    BaseActivity<MainActivityViewModel, ActivityMainBinding>(R.layout.activity_main) {

    override val viewModel: MainActivityViewModel by viewModel()
    override val binding: ActivityMainBinding by viewBinding()
    private val adapter = MainActivityAdapter(this::onItemClick)

    private fun onItemClick(data: Object) {
    }

    override fun setupRequests() {
        super.setupRequests()
        viewModel.fetchListObject()
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.getData().observe(this, {
            adapter.data = it
            binding.mainRecycler.adapter = adapter
        })
    }
}