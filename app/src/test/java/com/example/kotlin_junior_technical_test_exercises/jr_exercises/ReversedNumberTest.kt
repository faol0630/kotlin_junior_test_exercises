package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.ReversedNumber
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito

class ReversedNumberTest{

    private var reversedNumber: ReversedNumber? = null
    private var reversedNumberMock: ReversedNumber? = null

    @Before
    fun setUp(){
        reversedNumber = ReversedNumber()
        reversedNumberMock = Mockito.mock(ReversedNumber::class.java)
    }

    @After
    fun tearDown(){
        reversedNumber = null
        reversedNumberMock = null
    }

    @Test
    fun reversedNumberEqualsTest(){
        assertEquals(54321, reversedNumber!!.reverseNumber(12345))
    }

    @Test
    fun reversedNumberNotEqualsTest(){
        assertNotEquals(54332, reversedNumber!!.reverseNumber(12345))
    }

    @Test
    fun reversedNumberAtLeastOnceMockTest(){
        given(reversedNumberMock!!.reverseNumber(12345)).willReturn(54321)
        reversedNumberMock!!.reverseNumber(12345)
        Mockito.verify(reversedNumberMock, Mockito.atLeastOnce())!!.reverseNumber(12345)
    }

    @Test
    fun reversedNumberNeverMockTest(){
        given(reversedNumberMock!!.reverseNumber(12345)).willReturn(54321)
        reversedNumberMock!!.reverseNumber(12345)
        Mockito.verify(reversedNumberMock, Mockito.never())!!.reverseNumber(33345)
    }

    @Test
    fun reversedNumberTimesMockTest(){
        given(reversedNumberMock!!.reverseNumber(12345)).willReturn(54321)
        reversedNumberMock!!.reverseNumber(12345)
        reversedNumberMock!!.reverseNumber(12345)
        reversedNumberMock!!.reverseNumber(12345)
        Mockito.verify(reversedNumberMock, Mockito.times(3))!!.reverseNumber(12345)
    }

    @Test
    fun reversedNumberCallRealMethodMockTest(){
        given(reversedNumberMock!!.reverseNumber(12345)).willCallRealMethod()
        reversedNumberMock!!.reverseNumber(12345)
        Mockito.verify(reversedNumberMock, Mockito.atLeastOnce())!!.reverseNumber(12345)
    }
}