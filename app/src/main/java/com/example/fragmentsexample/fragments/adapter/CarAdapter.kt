package com.example.fragmentsexample.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsexample.databinding.ListItemBinding
import com.example.fragmentsexample.model.Car

class CarAdapter(private val items: List<Car>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

  inner class ViewHolder(private val binding: ListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val binding = ListItemBinding.inflate(inflater, parent, false)

    return ViewHolder(binding)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    TODO("Not yet implemented")
  }

  override fun getItemCount(): Int = items.size
}