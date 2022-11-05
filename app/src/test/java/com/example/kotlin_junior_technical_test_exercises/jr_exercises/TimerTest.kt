package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Timer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class TimerTest{

    private var timer: Timer? = null

    @Before
    fun setUp(){
        timer = Mockito.mock(Timer::class.java)
    }

    @After
    fun tearDown(){
        timer = null
    }

    @Test
    fun callingFunAtLeastOnceTest(){
        timer!!.callingFun(5)
        Mockito.verify(timer, Mockito.atLeastOnce())!!.callingFun(5)
    }

    @Test
    fun callingFunTimesTest(){
        timer!!.callingFun(5)
        timer!!.callingFun(5)
        timer!!.callingFun(5)
        Mockito.verify(timer, Mockito.times(3))!!.callingFun(5)
    }

    @Test
    fun callingFunNeverTest(){
        timer!!.callingFun(5)
        Mockito.verify(timer, Mockito.never())!!.callingFun(8)
    }

    @Test
    fun callingFunCallRealMethodTest(){
        given(timer!!.callingFun(5)).willCallRealMethod()
        timer!!.callingFun(5)
        Mockito.verify(timer, Mockito.atLeastOnce())!!.callingFun(5)
    }
}