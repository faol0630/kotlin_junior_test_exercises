package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Percentage
import junit.framework.TestCase.assertEquals
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.BeforeClass
import org.junit.Test


class PercentageTest{

    companion object{

        private var percentage: Percentage? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            percentage = Percentage()
        }

        @AfterClass
        fun tearDownCommon(){
            percentage = null
        }
    }

    @Test
    fun correctPercentageTest(){
        assertEquals(720, percentage!!.getPercentage(800,90))
    }

    @Test
    fun wrongPercentageTest(){
        assertNotEquals(200, percentage!!.getPercentage(500, 10))
    }
}