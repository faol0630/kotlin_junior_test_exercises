package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.AngleType
import junit.framework.TestCase.assertEquals
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.BeforeClass
import org.junit.Test


class AngleTypeTest{


    companion object{

        private var angleType: AngleType? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            angleType = AngleType()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            angleType = null
        }
    }

    @Test
    fun getAngleTypeCorrectTest(){
        assertEquals("Acute angle", angleType!!.getAngleType(70))
    }

    @Test
    fun getAngleTypeWrongTest(){
        assertNotEquals("Right angle", angleType!!.getAngleType(95))
    }

    @Test
    fun getAngleTypeCorrectTest2(){
        assertEquals("Complete angle", angleType!!.getAngleType(360))
    }

    @Test
    fun getAngleTypeWrongTest2(){
        assertEquals("Invalid entry.Error", angleType!!.getAngleType(400))
    }

}