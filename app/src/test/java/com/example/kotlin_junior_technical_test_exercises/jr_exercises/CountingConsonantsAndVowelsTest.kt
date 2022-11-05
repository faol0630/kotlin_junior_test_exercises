package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.CountingConsonantsAndVowels
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock


class CountingConsonantsAndVowelsTest {

    companion object {
        @InjectMocks
        private var counting: CountingConsonantsAndVowels? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            counting = CountingConsonantsAndVowels()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            counting = null
        }
    }

    @Mock
    private var string1: String? = null

    @Mock
    private var vowelsCounter: Int? = null

    @Mock
    private var consonantsCounter: Int? = null

    @Before
    fun setup() {
        string1 = "This is a text to be used counting letters "
        vowelsCounter = 13
        consonantsCounter = 21
    }

    @After
    fun tearDown() {
        string1 = null
        vowelsCounter = null
        consonantsCounter = null
    }

    @Test
    fun countingTest() {
        assertEquals(
            "Vowels: $vowelsCounter .Consonants: $consonantsCounter",
            counting!!.counting(string1!!)
        )
    }
}