package com.example.fragmentsexample.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Car(
  val name: String,
  val brand: String,
  val options: List<String>
) : Parcelable
