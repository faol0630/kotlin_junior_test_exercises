package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.DescendentListWithIntervals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class DescendentListWithIntervalsTest{

    private var listWithIntervals: DescendentListWithIntervals? = null

    @Before
    fun setUp(){
        listWithIntervals = Mockito.mock(DescendentListWithIntervals::class.java)
    }

    @After
    fun tearDown(){
        listWithIntervals = null
    }

    @Test
    fun downToZeroAtLeastOnceTest(){
        listWithIntervals!!.downToZero(8, 100)
        Mockito.verify(listWithIntervals, Mockito.atLeastOnce())!!.downToZero(8, 100)
    }

    @Test
    fun downToZeroTimesTest(){
        listWithIntervals!!.downToZero(8, 100)
        listWithIntervals!!.downToZero(8, 100)
        Mockito.verify(listWithIntervals, Mockito.times(2))!!.downToZero(8, 100)
    }

    @Test
    fun downToZeroNeverTest(){
        listWithIntervals!!.downToZero(8, 100)
        listWithIntervals!!.downToZero(8, 100)
        Mockito.verify(listWithIntervals, Mockito.never())!!.downToZero(5, 50)
    }

}