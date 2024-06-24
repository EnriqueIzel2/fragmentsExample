package com.example.fragmentsexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsexample.databinding.ListItemBinding

class CarAdapter : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

  inner class ViewHolder(private val binding: ListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val binding = ListItemBinding.inflate(inflater, parent, false)

    return ViewHolder(binding)
  }

  override fun getItemCount(): Int {
    TODO("Not yet implemented")
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    TODO("Not yet implemented")
  }
}