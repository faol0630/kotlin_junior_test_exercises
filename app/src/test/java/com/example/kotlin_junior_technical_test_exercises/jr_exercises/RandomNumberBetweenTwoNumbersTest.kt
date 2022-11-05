package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.RandomNumberBetweenTwoNumbers
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class RandomNumberBetweenTwoNumbersTest{

    private var randomNumber: RandomNumberBetweenTwoNumbers? = null

    @Before
    fun setUp(){
        randomNumber = Mockito.mock(RandomNumberBetweenTwoNumbers::class.java)
    }

    @After
    fun tearDown(){
        randomNumber= null
    }

    @Test
    fun getRandomNumberAtLeastOnceTest(){
        randomNumber!!.getRandomNumber(10, 30)
        Mockito.verify(randomNumber, Mockito.atLeastOnce())!!.getRandomNumber(10, 30)
    }

    @Test
    fun getRandomNumberNeverTest(){
        randomNumber!!.getRandomNumber(10, 30)
        Mockito.verify(randomNumber, Mockito.never())!!.getRandomNumber(20, 40)
    }

    @Test
    fun getRandomNumberTimesTest(){
        randomNumber!!.getRandomNumber(10, 30)
        randomNumber!!.getRandomNumber(10, 30)
        Mockito.verify(randomNumber, Mockito.times(2))!!.getRandomNumber(10, 30)
    }

    @Test
    fun getRandomNumberCallRealMethodTest(){
        given(randomNumber!!.getRandomNumber(10, 30)).willCallRealMethod()
        randomNumber!!.getRandomNumber(10, 30)
        Mockito.verify(randomNumber, Mockito.atLeastOnce())!!.getRandomNumber(10, 30)
    }
}