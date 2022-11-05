package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.SquaredNumbersList2
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class SquaredNumbersList2Test{

    private var numbers: SquaredNumbersList2? = null

    @Before
    fun setUp(){
        numbers = Mockito.mock(SquaredNumbersList2::class.java)
    }

    @After
    fun tearDown(){
        numbers = null
    }

    @Test
    fun showSquaredNumbers2AtLeastOnceTest(){
        numbers!!.showSquaredNumbers2(5)
        Mockito.verify(numbers, Mockito.atLeastOnce())!!.showSquaredNumbers2(5)
    }

    @Test
    fun showSquaredNumbers2TimesTest(){
        numbers!!.showSquaredNumbers2(5)
        numbers!!.showSquaredNumbers2(5)
        numbers!!.showSquaredNumbers2(5)
        Mockito.verify(numbers, Mockito.times(3))!!.showSquaredNumbers2(5)
    }

    @Test
    fun showSquaredNumbers2NeverTest(){
        numbers!!.showSquaredNumbers2(5)
        Mockito.verify(numbers, Mockito.never())!!.showSquaredNumbers2(8)
    }

    @Test
    fun showSquaredNumbers2CallRealMethodTest(){
        given(numbers!!.showSquaredNumbers2(5)).willCallRealMethod()
        numbers!!.showSquaredNumbers2(5)
        Mockito.verify(numbers, Mockito.atLeastOnce())!!.showSquaredNumbers2(5)
    }
}