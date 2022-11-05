package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.MajorAndMinorNumber
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class MajorAndMinorNumberTest{

    companion object{

        private var number : MajorAndMinorNumber? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            number = MajorAndMinorNumber()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            number= null
        }
    }

    private var number1 : Int? = null
    private var number2 : Int? = null

    @Before
    fun setup(){
        number1 = 25
        number2 = 15
    }

    @After
    fun tearDown(){
        number1 = null
        number2 = null
    }

    @Test
    fun getMajorAndMinorNumberCorrectTest(){
        assertEquals("$number1 is major and $number2 es minor", number!!.getMajorAndMinorNumber(number1!!, number2!!))
    }

    @Test
    fun getMajorAndMinorNumberWrongTest(){
        assertNotEquals("$number2 is major and $number1 es minor", number!!.getMajorAndMinorNumber(number1!!, number2!!))
    }
}