package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.IteratingOverElementsOrIndices
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class IteratingOverElementsOrIndicesTest {

    private var iterating: IteratingOverElementsOrIndices? = null
    private var numberList: List<Int>? = null
    private var numberList2: List<Int>? = null

    @Before
    fun setUp() {
        iterating = Mockito.mock(IteratingOverElementsOrIndices::class.java)
        numberList = listOf(23, 45, 12, 64, 76, 32, 31, 81, 47, 21, 98)
        numberList2 = listOf()
    }

    @After
    fun tearDown() {
        iterating = null
        numberList = null
        numberList2 = null
    }

    @Test
    fun iteratingOverElementsTimesTest() {
        iterating!!.iteratingOverElements(numberList!!)
        iterating!!.iteratingOverElements(numberList!!)
        Mockito.verify(iterating, Mockito.times(2))!!.iteratingOverElements(numberList!!)
    }

    @Test
    fun iteratingOverIndicesAtLeastOnceTest() {
        iterating!!.iteratingOverIndices(numberList!!)
        Mockito.verify(iterating, Mockito.atLeastOnce())!!.iteratingOverIndices(numberList!!)
    }

    @Test
    fun iteratingOverIndicesNeverTest() {
        iterating!!.iteratingOverIndices(numberList!!)
        Mockito.verify(iterating, Mockito.never())!!.iteratingOverIndices(numberList2!!)
    }
}