package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.Log

class MainViewModel : ViewModel() {
    init {
        Log.d("RRR","MainViewModel")
    }
    var counter = MutableLiveData<Int>()
    fun setCounter() {
        counter.value = (counter.value ?: 0) + 1
    }
}