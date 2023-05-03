package com.example.homevork

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var const = 0
    private var plus = ""

    val contor = MutableLiveData<String>()
    val operation = MutableLiveData<String>()

    fun increment(){
        ++const
        contor.value = const.toString()
        plus = "\n + $plus"
        operation.value = plus
    }
    fun decrement(){
        --const
        contor.value = const.toString()
        plus = "\n - $plus"
        operation.value = plus
    }
}