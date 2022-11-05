package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.AverageListOfNumbers
import junit.framework.TestCase.assertEquals
import org.junit.*
import org.junit.Assert.assertNotEquals


class AverageListOfNumbersTest {

    companion object {

        private var average: AverageListOfNumbers? = null
        private lateinit var listNumbers: List<Int>

        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            average = AverageListOfNumbers()
            listNumbers = listOf(25, 20, 50, 70, 30, 5, 10)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            average = null
            listNumbers = listOf()
        }

    }

    @Test
    fun getAverage2Test() {
        assertEquals(30, average!!.getAverage2(listNumbers))
    }

    @Test
    fun getAverageFalseTest() {
        assertNotEquals(40, average!!.getAverage2(listNumbers))
    }
}