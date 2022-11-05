package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.RepeatStringSeveralTimes
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class RepeatStringSeveralTimesTest{

    private var repeat: RepeatStringSeveralTimes? = null

    @Before
    fun setUp(){
        repeat = Mockito.mock(RepeatStringSeveralTimes::class.java)
    }

    @After
    fun tearDown(){
        repeat = null
    }

    @Test
    fun repeatStringAtLeastOnceTest(){
        repeat!!.repeatString("Phrase to repeat", 3)
        Mockito.verify(repeat, Mockito.atLeastOnce())!!.repeatString("Phrase to repeat", 3)
    }

    @Test
    fun repeatStringTimesTest(){
        repeat!!.repeatString("Phrase to repeat", 3)
        repeat!!.repeatString("Phrase to repeat", 3)
        Mockito.verify(repeat, Mockito.times(2))!!.repeatString("Phrase to repeat", 3)
    }

    @Test
    fun repeatStringNeverTest(){
        Mockito.verify(repeat, Mockito.never())!!.repeatString("Phrase to repeat", 3)
    }

    @Test
    fun repeatStringCallRealMethodTest(){
        given(repeat!!.repeatString("Phrase to repeat", 3)).willCallRealMethod()
        repeat!!.repeatString("Phrase to repeat", 3)
        Mockito.verify(repeat, Mockito.atLeastOnce())!!.repeatString("Phrase to repeat", 3)
    }
}