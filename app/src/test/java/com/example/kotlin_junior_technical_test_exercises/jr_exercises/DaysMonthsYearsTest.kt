package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.DaysMonthsYears
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class DaysMonthsYearsTest{

    private var daysMonthsYears: DaysMonthsYears? = null

    @Before
    fun setUp(){
        daysMonthsYears = Mockito.mock(DaysMonthsYears::class.java)
    }

    @After
    fun tearDown(){
        daysMonthsYears = null
    }

    @Test
    fun getYearsAtListOnceTest(){
        daysMonthsYears!!.getYears(400.0)
        Mockito.verify(daysMonthsYears, Mockito.atLeastOnce())!!.getYears(400.0)
    }

    @Test
    fun getYearsNeverTest(){
        daysMonthsYears!!.getYears(400.0)
        Mockito.verify(daysMonthsYears, Mockito.never())!!.getYears(200.0)
    }

    @Test
    fun getMonthsAtListOnceTest(){
        daysMonthsYears!!.getMonths()
        Mockito.verify(daysMonthsYears, Mockito.atLeastOnce())!!.getMonths()
    }

    @Test
    fun getMonthsTimesTest(){
        daysMonthsYears!!.getMonths()
        daysMonthsYears!!.getMonths()
        Mockito.verify(daysMonthsYears, Mockito.times(2))!!.getMonths()
    }

    @Test
    fun getMonths2AtListOnceTest(){
        daysMonthsYears!!.getMonths2(200.0)
        Mockito.verify(daysMonthsYears, Mockito.atLeastOnce())!!.getMonths2(200.0)
    }

    @Test
    fun getMonths2NeverTest(){
        daysMonthsYears!!.getMonths2(200.0)
        Mockito.verify(daysMonthsYears, Mockito.never())!!.getMonths2(300.0)
    }

}