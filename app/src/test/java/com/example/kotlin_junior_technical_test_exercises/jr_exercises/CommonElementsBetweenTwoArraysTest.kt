package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.CommonElementsBetweenTwoArrays
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test


class CommonElementsBetweenTwoArraysTest{

    private var commonElements: CommonElementsBetweenTwoArrays? = null
    private var listOne: List<Int>? = null
    private var listTwo: List<Int>? = null
    private var result: MutableList<Int>? = null

    @Before
    fun setUp(){
        commonElements = CommonElementsBetweenTwoArrays()
        listOne = listOf(1, 5, 7, 2, 9, 14, 16, 21, 22)
        listTwo = listOf(3, 8, 1, 21, 15, 9, 4, 11, 19)
        result = mutableListOf(1, 9, 21)
    }

    @After
    fun tearDown(){
        commonElements = null
        listOne = null
        listTwo = null
        result = null
    }

    @Test
    fun getCommonsElementsEqualsTest(){
        assertEquals(result, commonElements!!.getCommonsElements2(listOne!!, listTwo!!))
    }

    @Test
    fun getCommonsElementsNotEqualsTest(){
        assertNotEquals(listTwo, commonElements!!.getCommonsElements2(listOne!!, listTwo!!))
    }
}