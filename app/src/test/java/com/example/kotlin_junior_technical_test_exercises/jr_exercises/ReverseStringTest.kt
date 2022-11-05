package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.ReverseString
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class ReverseStringTest{

    companion object {

        private var reverseString: ReverseString? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            reverseString = ReverseString()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            reverseString = null
        }
    }

    private var stringTest: String? = null

    @Before
    fun setup(){
        stringTest = "Testing reversed strings"
    }

    @After
    fun tearDown(){
        stringTest = null
    }

    @Test
    fun reverseStringCorrectAnswerTest(){
        assertEquals(stringTest!!.reversed(), reverseString!!.reverseStringF(stringTest!!))
    }

    @Test
    fun reverseStringWrongAnswerTest(){
        assertNotEquals(stringTest!!, reverseString!!.reverseStringF(stringTest!!))
    }
}