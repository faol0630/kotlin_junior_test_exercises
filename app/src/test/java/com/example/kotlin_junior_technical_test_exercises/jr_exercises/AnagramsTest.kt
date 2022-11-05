package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Anagrams
import junit.framework.TestCase.*
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.InjectMocks


class AnagramsTest {

    companion object {

        @InjectMocks
        private var anagrams: Anagrams? = null

        @BeforeClass
        @JvmStatic
        fun setUpCommon() {
            anagrams = Anagrams()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            anagrams = null
        }
    }

    private var word1: String? = null
    private var word2: String? = null

    @Before
    fun setup(){
        word1 = "Calienta"
        word2 = "Alicante"
    }

    @After
    fun tearDown(){
        word1 = null
        word2 = null
    }

    @Test
    fun checkTrueTest() {
        assertTrue(anagrams!!.checkAnagrams(word1!!, word2!!))
    }

    @Test
    fun checkFalseTest() {
        assertFalse(anagrams!!.checkAnagrams("Paris", "Prosa"))
    }

    @Test
    fun checkTrueTest2(){
        val result: Boolean = anagrams!!.checkAnagrams(word1!!, word2!!)
        assertEquals(true, result)
    }
}