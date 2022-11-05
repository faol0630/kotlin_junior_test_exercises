package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.CapicuaNumber
import junit.framework.TestCase.*
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class CapicuaNumberTest{

    private var numberTrue: Int? = null
    private var numberFalse: Int? = null

    companion object{

        private var capicuaNumber: CapicuaNumber? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            capicuaNumber = CapicuaNumber()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            capicuaNumber = null
        }
    }

    @Before
    fun setUp(){
        numberTrue = 34543
        numberFalse = 34523

    }

    @After
    fun tearDown(){
        numberTrue = null
        numberFalse = null

    }

    @Test
    fun checkTrueTest(){
        assertTrue(capicuaNumber!!.checkNumber(numberTrue!!))
    }

    @Test
    fun checkFalseTest(){
        assertFalse(capicuaNumber!!.checkNumber(numberFalse!!))
    }

}