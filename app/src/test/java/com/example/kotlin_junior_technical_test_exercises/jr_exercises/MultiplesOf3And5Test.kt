package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.MultiplesOf3And5
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class MultiplesOf3And5Test{

    private var multiplesOf3And5: MultiplesOf3And5? = null

    @Before
    fun setUp(){
        multiplesOf3And5 = Mockito.mock(MultiplesOf3And5::class.java)
    }

    @After
    fun tearDown(){
        multiplesOf3And5 = null
    }

    @Test
    fun getMultiplesAtLeastOnceTest(){
        multiplesOf3And5!!.getMultiples(40)
        Mockito.verify(multiplesOf3And5, Mockito.atLeastOnce())!!.getMultiples(40)
    }

    @Test
    fun getMultiplesNeverTest(){
        Mockito.verify(multiplesOf3And5, Mockito.never())!!.getMultiples(40)
    }

    @Test
    fun getMultiplesTimesTest(){
        multiplesOf3And5!!.getMultiples(40)
        multiplesOf3And5!!.getMultiples(40)
        Mockito.verify(multiplesOf3And5, Mockito.times(2))!!.getMultiples(40)
    }

    @Test
    fun getMultiplesCallRealMethodTest(){
        given(multiplesOf3And5!!.getMultiples(40)).willCallRealMethod()
        multiplesOf3And5!!.getMultiples(40)
        Mockito.verify(multiplesOf3And5, Mockito.times(1))!!.getMultiples(40)
    }

}