package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.SquaredNumbersList
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class SquaredNumbersListTest{

    private var squaredNumbersListClass: SquaredNumbersList? = null
    private var squaredNumbersListMock: SquaredNumbersList? = null
    private var numberList: List<Any>? = null
    private var squaredNumberListResult: MutableList<Int>? = null
    private var squaredEmptyNumberList1: MutableList<Int>? = null

    @Before
    fun setUp(){
        squaredNumbersListClass = SquaredNumbersList()
        squaredNumbersListMock = Mockito.mock(SquaredNumbersList::class.java)
        numberList = listOf(2, true, "Word1", 5, 3, "Word2", 7, 12, false, 9, 8, "Word3", 6, 15)
        squaredEmptyNumberList1 = mutableListOf()
        squaredNumberListResult = mutableListOf(4, 25, 9, 49, 144, 81, 64, 36, 225)
    }

    @After
    fun tearDown(){
        squaredNumbersListClass = null
        squaredNumbersListMock = null
        numberList = null
        squaredEmptyNumberList1 = null
        squaredNumberListResult = null
    }

    @Test
    fun squaredNumberEqualsList1Test(){
        assertEquals(squaredNumberListResult, squaredNumbersListClass!!.squaredNumberList1(numberList!!, squaredEmptyNumberList1!!))
    }

    @Test
    fun squaredNumberNotEqualsList1Test(){
        assertNotEquals(numberList, squaredNumbersListClass!!.squaredNumberList1(numberList!!, squaredNumberListResult!!))
    }

    @Test
    fun squaredNumberMockAtLeastOnceTest(){
        given(squaredNumbersListMock!!.squaredNumberList1(numberList!!, squaredEmptyNumberList1!!)).willReturn(squaredNumberListResult!!)
        squaredNumbersListMock!!.squaredNumberList1(numberList!!,squaredEmptyNumberList1!!)
        Mockito.verify(squaredNumbersListMock, Mockito.atLeastOnce())!!.squaredNumberList1(numberList!!, squaredEmptyNumberList1!!)
    }

    @Test
    fun squaredNumberMockTimesTest(){
        given(squaredNumbersListMock!!.squaredNumberList1(numberList!!, squaredEmptyNumberList1!!)).willReturn(squaredNumberListResult!!)
        squaredNumbersListMock!!.squaredNumberList1(numberList!!,squaredEmptyNumberList1!!)
        squaredNumbersListMock!!.squaredNumberList1(numberList!!,squaredEmptyNumberList1!!)
        Mockito.verify(squaredNumbersListMock, Mockito.times(2))!!.squaredNumberList1(numberList!!, squaredEmptyNumberList1!!)
    }

    @Test
    fun squaredNumberMockNeverTest(){
        given(squaredNumbersListMock!!.squaredNumberList1(numberList!!, squaredEmptyNumberList1!!)).willReturn(squaredNumberListResult!!)
        squaredNumbersListMock!!.squaredNumberList1(numberList!!,squaredEmptyNumberList1!!)
        squaredNumbersListMock!!.squaredNumberList1(numberList!!,squaredEmptyNumberList1!!)
        Mockito.verify(squaredNumbersListMock, Mockito.never())!!.squaredNumberList1(numberList!!, squaredNumberListResult!!)
    }
}