package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Factorial
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class FactorialTest{

    private var expectedResult: Int? = null
    private var unexpectedResult: Int? = null

    companion object{

        private var factorial : Factorial? = null
        private var parameterNumber: Int? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            parameterNumber = 5
            factorial = Factorial(5)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            parameterNumber = null
            factorial = null
        }

    }

    @Before
    fun setup(){
        expectedResult = 120
        unexpectedResult = 100

    }

    @After
    fun tearDown(){
        expectedResult = null
        unexpectedResult = null

    }

    @Test
    fun getFactorialExpectedResultTest(){
        assertEquals(expectedResult, factorial!!.getFactorial(parameterNumber!!))
    }

    @Test
    fun getFactorialUnexpectedResultTest(){
        assertNotEquals(unexpectedResult, factorial!!.getFactorial(parameterNumber!!))
    }
}