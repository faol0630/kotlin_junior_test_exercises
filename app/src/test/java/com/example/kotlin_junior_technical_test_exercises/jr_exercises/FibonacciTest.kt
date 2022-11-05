package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Fibonacci
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock


class FibonacciTest{

    companion object{

        @InjectMocks
        private var fibonacci: Fibonacci? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            fibonacci = Fibonacci()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            fibonacci = null
        }
    }

    @Mock
    var fibonacciList: MutableList<Int>? = null

    @Mock
    var expectedNumber: Int? = null

    @Mock
    var unexpectedNumber: Int? = null

    @Mock
    var position: Int? = null

    @Before
    fun setup(){
        fibonacciList = mutableListOf(0, 1)
        expectedNumber = 55
        unexpectedNumber = 60
        position = 10
    }

    @After
    fun tearDown(){
        fibonacciList = null
        expectedNumber = null
        unexpectedNumber = null
        position = null
    }

    @Test
    fun fibonacciAddNumbersCorrectTest(){
        assertEquals(expectedNumber, fibonacci!!.fibonacciAddNumbers(position!!, fibonacciList!!))
    }

    @Test
    fun fibonacciAddNumbersWrongTest(){
        assertNotEquals(unexpectedNumber, fibonacci!!.fibonacciAddNumbers(position!!, fibonacciList!!))
    }
}