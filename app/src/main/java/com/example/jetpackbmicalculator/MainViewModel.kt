package com.example.jetpackbmicalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
  val test = "test"

  var height by mutableStateOf("")
  var weight by mutableStateOf("")
}