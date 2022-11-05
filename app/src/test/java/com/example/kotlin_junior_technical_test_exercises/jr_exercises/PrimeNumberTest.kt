package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class PrimeNumberTest{

    companion object{

        private var primeNumber: PrimeNumber? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            primeNumber = PrimeNumber()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            primeNumber = null
        }
    }

    private var correctPrimeNumber: Int? = null
    private var wrongPrimeNumber: Int? = null

    @Before
    fun setup(){
        correctPrimeNumber = 199
        wrongPrimeNumber = 210
    }

    @After
    fun tearDown(){
        correctPrimeNumber = null
        wrongPrimeNumber = null
    }

    @Test
    fun primeNumberTrueTest(){
        assertEquals("$correctPrimeNumber is a prime number", primeNumber!!.primeNumber(correctPrimeNumber!!))
    }

    @Test
    fun primeNumberFalseTest(){
        assertEquals("$wrongPrimeNumber is not a prime number", primeNumber!!.primeNumber(wrongPrimeNumber!!))
    }

    @Test
    fun primeNumberWrongTest(){
        assertNotEquals("$wrongPrimeNumber is a prime number", primeNumber!!.primeNumber(wrongPrimeNumber!!))
    }

}