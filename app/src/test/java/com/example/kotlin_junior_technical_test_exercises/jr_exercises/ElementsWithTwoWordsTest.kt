package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.ElementsWithTwoWords
import junit.framework.TestCase.*
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class ElementsWithTwoWordsTest{
    private var elements: ElementsWithTwoWords? = null
    private var elementsMock: ElementsWithTwoWords? = null
    private var citiesList: List<String>? = null
    private var result: List<String>? = null

    @Before
    fun setUp(){
        elements = ElementsWithTwoWords()
        elementsMock = Mockito.mock(ElementsWithTwoWords::class.java)
        citiesList = listOf(
            "Madrid",
            "San francisco",
            "Londres",
            "Ciudad Real",
            "Las Palmas",
            "Bogota",
            "Houston",
            "Casa Blanca")
        result = listOf("San francisco", "Ciudad Real", "Las Palmas", "Casa Blanca")
    }

    @After
    fun tearDown(){
        elements = null
        elementsMock = null
        citiesList = null
        result = null
    }

    @Test
    fun getElementsWithTwoWordsEqualsTest(){
        assertEquals(result, elements!!.getElementsWithTwoWords2(citiesList!!))
    }

    @Test
    fun getElementsWithTwoWordsNotEqualsTest(){
        assertNotEquals(citiesList, elements!!.getElementsWithTwoWords2(result!!))
    }

    @Test
    fun getElementsWithTwoWordsMockAtListOnceTest(){
        given(elementsMock!!.getElementsWithTwoWords2(citiesList!!)).willReturn(result)
        elementsMock!!.getElementsWithTwoWords2(citiesList!!)
        Mockito.verify(elementsMock, Mockito.atLeastOnce())!!.getElementsWithTwoWords2(citiesList!!)
        assertSame(result, elementsMock!!.getElementsWithTwoWords2(citiesList!!))
    }

    @Test
    fun getElementsWithTwoWordsMockNeverTest(){
        given(elementsMock!!.getElementsWithTwoWords2(citiesList!!)).willReturn(result)
        elementsMock!!.getElementsWithTwoWords2(citiesList!!)
        Mockito.verify(elementsMock, Mockito.never())!!.getElementsWithTwoWords2(result!!)
        assertNotSame(citiesList, elementsMock!!.getElementsWithTwoWords2(result!!))
    }

}