package com.example.fragmentsexample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.MainActivity
import com.example.fragmentsexample.databinding.FragmentListBinding
import com.example.fragmentsexample.fragments.adapter.CarAdapter
import com.example.fragmentsexample.util.CarUtils

class ListFragment : Fragment() {

  private lateinit var binding: FragmentListBinding
  private val recyclerView by lazy { binding.recyclerViewList }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    if (!::binding.isInitialized) {
      binding = FragmentListBinding.inflate(inflater, container, false)
    }

    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val carList = CarUtils.getCars()
    val carAdapter = CarAdapter(carList) {
      (activity as MainActivity).openDetailFragment(it)
    }

    recyclerView.adapter = carAdapter
  }

  companion object {
    fun newInstance(): ListFragment {
      return ListFragment()
    }
  }
}