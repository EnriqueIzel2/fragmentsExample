package com.example.fragmentsexample.util

import com.example.fragmentsexample.model.Car

object CarUtils {
  fun getCars(): List<Car> {
    val cars = mutableListOf<Car>()

    cars.add(Car("Corsa", "Chevrolet", arrayListOf("1.0", "2p", "mpfi")))
    cars.add(Car("Uno", "Fiat", arrayListOf("1.0", "2p")))

    return cars
  }
}