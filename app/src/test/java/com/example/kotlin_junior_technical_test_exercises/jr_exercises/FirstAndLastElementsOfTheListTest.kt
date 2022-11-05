package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.FirstAndLastElementsOfTheList
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class FirstAndLastElementsOfTheListTest{

    private var elements: FirstAndLastElementsOfTheList? = null
    private var numberList: List<Int>? = null
    private var firstAndLastEmpty: MutableList<Any>? = null
    private var result: MutableList<Any>? = null

    @Before
    fun setUp(){
        elements = Mockito.mock(FirstAndLastElementsOfTheList::class.java)
        numberList = listOf(45, 26, 17, 11, 62, 57, 23, 1, 5)
        firstAndLastEmpty = mutableListOf<Any>()
        result = mutableListOf(45, 5)
    }

    @After
    fun tearDown(){
        elements = null
        numberList = null
        firstAndLastEmpty = null
        result = null
    }

    @Test
    fun firstAndLastAtLeastOnceTest(){
        elements!!.firstAndLast(numberList!!, firstAndLastEmpty!!)
        Mockito.verify(elements, Mockito.atLeastOnce())!!.firstAndLast(numberList!!, firstAndLastEmpty!!)

    }

    @Test
    fun firstAndLastNeverTest(){
        elements!!.firstAndLast(numberList!!, firstAndLastEmpty!!)
        Mockito.verify(elements, Mockito.never())!!.firstAndLast(numberList!!, result!!)

    }

    @Test
    fun firstAndLastAtLeastOnceCallRealMethodTest(){
        given(elements!!.firstAndLast(numberList!!, firstAndLastEmpty!!)).willCallRealMethod()
        elements!!.firstAndLast(numberList!!, firstAndLastEmpty!!)
        Mockito.verify(elements, Mockito.atLeastOnce())!!.firstAndLast(numberList!!, firstAndLastEmpty!!)

    }
}