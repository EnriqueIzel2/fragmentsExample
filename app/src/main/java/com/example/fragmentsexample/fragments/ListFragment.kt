package com.example.fragmentsexample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.databinding.FragmentListBinding

class ListFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val binding = FragmentListBinding.inflate(inflater, container, false)
    return binding.root
  }

  companion object {
    fun newInstance(): ListFragment {
      return ListFragment()
    }
  }
}