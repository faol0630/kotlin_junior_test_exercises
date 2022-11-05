package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Capitalize
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class CapitalizeTest{

    companion object{

        private var capitalize: Capitalize? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            capitalize = Capitalize()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            capitalize = null
        }
    }

    private var string1: String? = null
    private var resultString: String? = null

    @Before
    fun setup(){
        string1 = "words without capital letters"
        resultString = "Words Without Capital Letters"
    }

    @After
    fun tearDown(){
        string1 = null
    }

    @Test
    fun capitalInitialLetterCorrectTest(){
        assertEquals(resultString, capitalize!!.capitalInitialLetter(string1!!))
    }

    @Test
    fun capitalInitialLetterWrongTest(){
        assertNotEquals(string1, capitalize!!.capitalInitialLetter(string1!!))
    }
}