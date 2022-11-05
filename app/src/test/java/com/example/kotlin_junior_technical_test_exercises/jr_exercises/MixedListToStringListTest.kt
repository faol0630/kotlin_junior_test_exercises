package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.MixedListToStringList
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class MixedListToStringListTest{

    private var mixedListToStringList: MixedListToStringList? = null
    private var mixedList: MutableList<Any>? = null
    private var stringsList: MutableList<String>? = null
    private var stringsList2: MutableList<String>? = null


    @Before
    fun setUp(){
        mixedListToStringList = Mockito.mock(MixedListToStringList::class.java)
        mixedList = mutableListOf(1, 4, "Red", false, "12", "Yellow", "14", "Blue", true, 17, 23, 27, "Orange")
        stringsList = mutableListOf()
        stringsList2 = mutableListOf()
    }

    @After
    fun tearDown(){
        mixedListToStringList = null
        mixedList = null
        stringsList = null
        stringsList2 = null
    }

    @Test
    fun mixedListToStringListAtLeastOnceTest(){
        mixedListToStringList!!.mixedListToStringList(mixedList!!, stringsList!!)
        Mockito.verify(mixedListToStringList, Mockito.atLeastOnce())!!.mixedListToStringList(mixedList!!, stringsList!!)
    }

    @Test
    fun mixedListToStringListNeverTest(){
        Mockito.verify(mixedListToStringList, Mockito.never())!!.mixedListToStringList(mixedList!!, stringsList!!)
    }

    @Test
    fun mixedListToStringListTimesTest(){
        mixedListToStringList!!.mixedListToStringList(mixedList!!, stringsList!!)
        mixedListToStringList!!.mixedListToStringList(mixedList!!, stringsList!!)
        Mockito.verify(mixedListToStringList, Mockito.times(2))!!.mixedListToStringList(mixedList!!, stringsList!!)
    }

    @Test
    fun mixedListToStringListCallRealMethodTest(){
        given(mixedListToStringList!!.mixedListToStringList(mixedList!!, stringsList!!)).willCallRealMethod()
        mixedListToStringList!!.mixedListToStringList(mixedList!!, stringsList!!)
        Mockito.verify(mixedListToStringList, Mockito.times(1))!!.mixedListToStringList(mixedList!!, stringsList!!)
    }
}