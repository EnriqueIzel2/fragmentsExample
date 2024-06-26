package com.example.fragmentsexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample.fragments.DetailsFragment
import com.example.fragmentsexample.fragments.ListFragment
import com.example.fragmentsexample.model.Car

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    inflateFragment()
  }

  private fun inflateFragment() {
    val fragmentList = ListFragment.newInstance()

    supportFragmentManager.beginTransaction().replace(
      R.id.fragment_container_main,
      fragmentList
    ).commit()
  }

  fun openDetailFragment(car: Car) {
    val detailsFragment = DetailsFragment.newInstance(car)
    val transaction = supportFragmentManager.beginTransaction()

    transaction.replace(R.id.fragment_container_main, detailsFragment)
    transaction.addToBackStack(null)

    transaction.commit()
  }
}