package com.example.fragmentsexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample.fragments.ListFragment

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
}