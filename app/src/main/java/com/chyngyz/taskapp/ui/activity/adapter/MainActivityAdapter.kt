package com.chyngyz.taskapp.ui.activity.adapter

import com.chyngyz.taskapp.R
import com.chyngyz.taskapp.base.BaseAdapter
import com.chyngyz.taskapp.data.models.Object
import com.chyngyz.taskapp.databinding.ItemOfObjectRecyclerBinding

class MainActivityAdapter(
    val onItemClick: (Object) -> Unit,
) : BaseAdapter<Object, ItemOfObjectRecyclerBinding>(
    R.layout.item_of_object_recycler,
    mutableListOf(),
    inflater = ItemOfObjectRecyclerBinding::inflate,
){
    override fun onBind(binding: ItemOfObjectRecyclerBinding, model: Object) {
        binding.itemType.text = model.type
        binding.itemSetup.text = model.setup
        binding.itemPunchline.text = model.punchline

        binding.itemCard.setOnClickListener {
            onItemClick(model)
        }
    }
}