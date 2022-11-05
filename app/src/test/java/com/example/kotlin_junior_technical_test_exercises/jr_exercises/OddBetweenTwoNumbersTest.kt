package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.OddBetweenTwoNumbers
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class OddBetweenTwoNumbersTest{

    companion object {

        private var oddNumbers: OddBetweenTwoNumbers? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            oddNumbers = OddBetweenTwoNumbers()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            oddNumbers = null
        }
    }

    private var lowerNumber: Int? = null
    private var higherNumber: Int? = null

    @Before
    fun setup(){
        lowerNumber = 5
        higherNumber = 20
    }

    @After
    fun tearDown(){
        lowerNumber = null
        higherNumber = null
    }

    @Test
    fun oddNumbersCorrectAnswerTest(){
        assertEquals(8, oddNumbers!!.oddNumbers(lowerNumber!!, higherNumber!!))
    }

    @Test
    fun oddNumbersWrongAnswerTest(){
        assertNotEquals(12, oddNumbers!!.oddNumbers(lowerNumber!!, higherNumber!!))
    }

}