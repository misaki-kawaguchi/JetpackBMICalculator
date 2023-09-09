package com.example.jetpackbmicalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.pow
import kotlin.math.roundToInt

class MainViewModel : ViewModel() {
  val test = "test"

  var height by mutableStateOf("")
  var weight by mutableStateOf("")
  var bmi by mutableStateOf(0f)

  // BMI = (体重kg) / (身長m) ** 2
  fun calculateBMI() {
    // height.toFloatOrNull：heightが数値でない場合、nullを返す
    // nullの場合は0fを返す
    val heightNumber = height.toFloatOrNull()?.div(100) ?: 0f
    val weightNumber = weight.toFloatOrNull() ?: 0f

    bmi = if (heightNumber > 0f && weightNumber > 0f) {
      (weightNumber / heightNumber.pow(2) * 10).roundToInt() / 10f
    } else 0f
  }
}