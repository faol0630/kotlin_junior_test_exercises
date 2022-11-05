package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.MultiplicationTable
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class MultiplicationTableTest{

    private var multiplicationTable: MultiplicationTable? = null

    @Before
    fun setUp(){
        multiplicationTable = Mockito.mock(MultiplicationTable::class.java)
    }

    @After
    fun tearDown(){
        multiplicationTable = null
    }

    @Test
    fun getMultiplicationTableAtLeastOnceTest(){
        multiplicationTable!!.getMultiplicationTable(5)
        Mockito.verify(multiplicationTable, Mockito.atLeastOnce())!!.getMultiplicationTable(5)
    }

    @Test
    fun getMultiplicationTableTimesTest(){
        multiplicationTable!!.getMultiplicationTable(5)
        multiplicationTable!!.getMultiplicationTable(5)
        Mockito.verify(multiplicationTable, Mockito.times(2))!!.getMultiplicationTable(5)
    }

    @Test
    fun getMultiplicationTableNeverTest(){
        Mockito.verify(multiplicationTable, Mockito.never())!!.getMultiplicationTable(5)
    }

    @Test
    fun getMultiplicationTableCallRealMethodTest(){
        given(multiplicationTable!!.getMultiplicationTable(5)).willCallRealMethod()
        multiplicationTable!!.getMultiplicationTable(5)
        Mockito.verify(multiplicationTable, Mockito.times(1))!!.getMultiplicationTable(5)
    }
}