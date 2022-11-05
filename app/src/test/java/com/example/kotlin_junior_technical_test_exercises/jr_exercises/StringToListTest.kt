package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.ListToString
import com.example.kotlin_junior_technical_test_exercises.StringToList
import junit.framework.TestCase.assertEquals
import org.junit.*
import org.junit.Assert.assertNotEquals


class StringToListTest {

    private var stringToList: StringToList? = null
    private var listOfString1: List<String>? = null
    private var phrase: String? = null

    @Before
    fun setUp(){
        stringToList = StringToList()
        listOfString1 = listOf("","S", "t", "r", "i", "n", "g", " " , "t", "o", " " , "l", "i", "s", "t", "")
        phrase = "String to list"
    }

    @After
    fun tearDown(){
        stringToList = null
        listOfString1 = null
        phrase = null
    }

    @Test
    fun stringToList1EqualsTest(){
        assertEquals(listOfString1, stringToList!!.stringToList1(phrase!!))
    }

    @Test
    fun stringToList1NotEqualsTest(){
        assertNotEquals(phrase, stringToList!!.stringToList1(phrase!!))
    }
}


//--------------------------



class ListToStringTest{

    private var listToString: ListToString? = null
    private var daysList: List<String>? = null

    @Before
    fun setUp(){
        listToString = ListToString()
        daysList = listOf("Monday", "Tuesday", "Wednesday")
    }

    @After
    fun tearDown(){
        listToString = null
        daysList = null
    }

    @Test
    fun listToStringEqualsTest(){
        assertEquals(daysList.toString(), listToString!!.listToString1(daysList!!))
    }

    @Test
    fun listToStringNotEqualsTest(){
        assertNotEquals(daysList, listToString!!.listToString1(daysList!!))
    }
}