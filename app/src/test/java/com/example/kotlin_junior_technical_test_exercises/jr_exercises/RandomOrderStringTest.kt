package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.RandomOrderString
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class RandomOrderStringTest{

    private var randomOrderString: RandomOrderString? = null

    @Before
    fun setUp(){
        randomOrderString = Mockito.mock(RandomOrderString::class.java)
    }

    @After
    fun tearDown(){
        randomOrderString = null
    }

    @Test
    fun randomOrderAtLeastOnceTest(){
        randomOrderString!!.randomOrder("testing string1")
        Mockito.verify(randomOrderString, Mockito.atLeastOnce())!!.randomOrder("testing string1")
    }

    @Test
    fun randomOrderNeverTest(){
        randomOrderString!!.randomOrder("testing string1")
        Mockito.verify(randomOrderString, Mockito.never())!!.randomOrder("new testing string1")
    }

    @Test
    fun randomOrderTimesTest(){
        randomOrderString!!.randomOrder("testing string1")
        randomOrderString!!.randomOrder("testing string1")
        randomOrderString!!.randomOrder("testing string1")
        Mockito.verify(randomOrderString, Mockito.times(3))!!.randomOrder("testing string1")
    }

    @Test
    fun randomOrderCallRealMethodTest(){
        given(randomOrderString!!.randomOrder("testing string1")).willCallRealMethod()
        randomOrderString!!.randomOrder("testing string1")
        Mockito.verify(randomOrderString, Mockito.atLeastOnce())!!.randomOrder("testing string1")
    }
}