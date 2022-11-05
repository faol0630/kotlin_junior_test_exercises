package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Multiple
import junit.framework.TestCase.*
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class MultipleTest{

    private var number1True: Int? = null
    private var number1False: Int? = null

    companion object {

        private var multiple : Multiple? = null
        private var number2: Int? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            number2 = 7
            multiple = Multiple()
        }

        @AfterClass
        @JvmStatic
        fun downTearCommon(){
            number2 = null
            multiple = null
        }
    }

    @Before
    fun setup(){
        number1True = 210
        number1False = 200

    }

    @After
    fun teardown(){
        number1True = null
        number1False = null

    }

    @Test
    fun multipleTrueTest(){
        assertTrue(multiple!!.multiple(number1True!!, number2!!))
    }

    @Test
    fun multipleFalseTest(){
        assertFalse(multiple!!.multiple(number1False!!, number2!!))
    }
}