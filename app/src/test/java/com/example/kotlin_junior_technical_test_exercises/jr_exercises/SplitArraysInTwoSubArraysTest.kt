package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.SplitArraysInTwoSubArrays
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class SplitArraysInTwoSubArraysTest{

    private var split: SplitArraysInTwoSubArrays? = null

    @Before
    fun setUp(){
        split = Mockito.mock(SplitArraysInTwoSubArrays::class.java)
    }

    @After
    fun tearDown(){
        split = null
    }

    @Test
    fun newArraysAtLeastOnceTest(){
        split!!.newArrays()
        Mockito.verify(split, Mockito.atLeastOnce())!!.newArrays()
    }

    @Test
    fun newArraysNeverTest(){
        Mockito.verify(split, Mockito.never())!!.newArrays()
    }

    @Test
    fun newArraysTimesTest(){
        split!!.newArrays()
        split!!.newArrays()
        Mockito.verify(split, Mockito.times(2))!!.newArrays()
    }

    @Test
    fun newArraysCallRealMethodTest(){
        given(split!!.newArrays()).willCallRealMethod()
        split!!.newArrays()
        Mockito.verify(split, Mockito.atLeastOnce())!!.newArrays()
    }

}