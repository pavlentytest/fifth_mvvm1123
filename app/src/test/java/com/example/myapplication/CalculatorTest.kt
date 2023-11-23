package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null

    @Before
    fun setUpsdffgsfdsfgh() {
        calculator = Calculator()
    }

    @After
    fun tearDownwwewrwe() {
        calculator = null
    }

    @Test
    fun sumdfgdg() {
        //Assert => если тест не пройден AssertioError(Исключение)
        //Assume => если тест не пройден (он будет проигнорирован)

        Assert.assertEquals(100,calculator?.sum(40,50) ?: 0)
    }

    @Test
    fun sum2() {
        Assert.assertEquals(90,calculator?.sum(40,50) ?: 0)
    }

    @Test
    fun sum3() {
        Assume.assumeNotNull(4,5,6,7,null)
    }

    @Test(expected = NullPointerException::class)
    fun toDo() {
        calculator?.getLength("null")
    }
}