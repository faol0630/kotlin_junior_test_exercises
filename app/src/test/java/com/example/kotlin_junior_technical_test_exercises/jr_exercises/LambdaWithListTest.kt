package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.LambdaWithList
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class LambdaWithListTest{

    private var lambdaWithList: LambdaWithList? = null
    private var numberList: IntArray? = null

    @Before
    fun setUp(){
        lambdaWithList = Mockito.mock(LambdaWithList::class.java)
        numberList = IntArray(5){it}
    }

    @After
    fun tearDown(){
        lambdaWithList = null
        numberList = null
    }

    @Test
    fun printNumberListAtLeastOnceTest(){
        lambdaWithList!!.printNumberList(numberList!!)
        Mockito.verify(lambdaWithList, Mockito.atLeastOnce())!!.printNumberList(numberList!!)
    }

    @Test
    fun printNumberListTimesTest(){
        lambdaWithList!!.printNumberList(numberList!!)
        lambdaWithList!!.printNumberList(numberList!!)
        Mockito.verify(lambdaWithList, Mockito.times(2))!!.printNumberList(numberList!!)
    }
}