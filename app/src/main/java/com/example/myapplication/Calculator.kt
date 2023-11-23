package com.example.myapplication

class Calculator {
    fun sum(a: Int, b: Int) = a + b
    fun getLength(str: String?) {
        println(str!!.length)
    }
}