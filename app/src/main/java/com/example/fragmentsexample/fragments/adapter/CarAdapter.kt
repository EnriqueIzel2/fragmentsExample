package com.example.fragmentsexample.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsexample.databinding.ListItemBinding
import com.example.fragmentsexample.model.Car

class CarAdapter(private val items: List<Car>,
  private val onClick: (Car) -> Unit) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

  inner class ViewHolder(private val binding: ListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Car) {
      binding.textViewName.text = item.name
      binding.textViewBrand.text = item.brand

      itemView.setOnClickListener {
        onClick.invoke(item)
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val binding = ListItemBinding.inflate(inflater, parent, false)

    return ViewHolder(binding)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = getItem(position)

    holder.bind(item)
  }

  override fun getItemCount(): Int = items.size

  private fun getItem(position: Int) = items[position]
}