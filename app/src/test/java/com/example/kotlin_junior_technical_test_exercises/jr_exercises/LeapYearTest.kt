package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.LeapYear
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test


class LeapYearTest{

    companion object{

        private var leapYear: LeapYear? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            leapYear = LeapYear()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            leapYear = null
        }
    }

    @Test
    fun leapYear1TrueTest(){
        assertTrue(true.toString(), leapYear!!.leapYear1(2000))
    }

    @Test
    fun leapYear1FalseTest(){
        assertFalse(true.toString(), leapYear!!.leapYear1(1200))
    }

}