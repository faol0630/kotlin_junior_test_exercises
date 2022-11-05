package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Substrings
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class SubstringsTest{

    private var subStrings: Substrings? = null
    private var result: MutableList<String>? = null

    @Before
    fun setUp(){
        subStrings = Mockito.mock(Substrings::class.java)
        result = mutableListOf("Paris", "Pari", "Par", "Pa", "P", "aris", "ari", "ar", "a", "ris", "ri", "r", "is", "i", "s")
    }

    @After
    fun tearDown(){
        subStrings = null
        result = null
    }

    @Test
    fun getAllSubstringsAtLeastOnceTest(){
        given(subStrings!!.getAllSubstrings("Paris")).willReturn(result)
        subStrings!!.getAllSubstrings("Paris")
        Mockito.verify(subStrings, Mockito.atLeastOnce())!!.getAllSubstrings("Paris")
    }

    @Test
    fun getAllSubstringsTimesTest(){
        given(subStrings!!.getAllSubstrings("Paris")).willReturn(result)
        subStrings!!.getAllSubstrings("Paris")
        subStrings!!.getAllSubstrings("Paris")
        Mockito.verify(subStrings, Mockito.times(2))!!.getAllSubstrings("Paris")
    }

    @Test
    fun getAllSubstringsNeverTest(){
        given(subStrings!!.getAllSubstrings("Paris")).willReturn(result)
        subStrings!!.getAllSubstrings("Paris")
        Mockito.verify(subStrings, Mockito.never())!!.getAllSubstrings("Madrid")
    }

    @Test
    fun getAllSubstringsCallRealMethodTest(){
        given(subStrings!!.getAllSubstrings("Paris")).willCallRealMethod()
        subStrings!!.getAllSubstrings("Paris")
        Mockito.verify(subStrings, Mockito.atLeastOnce())!!.getAllSubstrings("Paris")
    }
}