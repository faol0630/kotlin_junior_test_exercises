package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.HigherAndLowestListValue
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class HigherAndLowestListValueTest {

    private var value: HigherAndLowestListValue? = null
    private var valueMock: HigherAndLowestListValue? = null
    private var numberList: List<Int>? = null
    private var numberList2: List<Int>? = null
    private var result: String? = null

    @Before
    fun setUp() {
        value = HigherAndLowestListValue()
        valueMock = Mockito.mock(HigherAndLowestListValue::class.java)
        numberList = listOf(34, 12, 56, 11, 81, 17, 6, 23, 88, 46, 28, 21, 91, 14).sorted()
        numberList2 = listOf(1, 2, 3)
        result = "Lowest value: ${numberList!![0]} Higher value: ${numberList!![numberList!!.size - 1]}"
    }

    @After
    fun tearDown() {
        value = null
        valueMock = null
        numberList = null
        numberList2 = null
    }

    @Test
    fun getHigherAndLowestValueEqualsTest() {
        assertEquals(result, value!!.getHigherAndLowestValue(numberList!!))
    }

    @Test
    fun getHigherAndLowestValueNotEqualsTest() {
        assertNotEquals(result, value!!.getHigherAndLowestValue(numberList2!!))
    }

    @Test
    fun getHigherAndLowestValueMockAtListOnceTest(){
        given(valueMock!!.getHigherAndLowestValue(numberList!!)).willReturn(result)
        valueMock!!.getHigherAndLowestValue(numberList!!)
        Mockito.verify(valueMock, Mockito.atLeastOnce())!!.getHigherAndLowestValue(numberList!!)
        assertEquals(result, valueMock!!.getHigherAndLowestValue(numberList!!))
    }

    @Test
    fun getHigherAndLowestValueMockNeverTest(){
        given(valueMock!!.getHigherAndLowestValue(numberList!!)).willReturn(result)
        valueMock!!.getHigherAndLowestValue(numberList!!)
        Mockito.verify(valueMock, Mockito.never())!!.getHigherAndLowestValue(numberList2!!)
        assertNotEquals(result, valueMock!!.getHigherAndLowestValue(numberList2!!))
    }
}