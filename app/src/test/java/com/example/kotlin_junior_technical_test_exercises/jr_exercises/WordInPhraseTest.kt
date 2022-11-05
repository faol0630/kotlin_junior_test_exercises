package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.WordInPhrase
import junit.framework.TestCase.*
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test


class WordInPhraseTest{

    private var wordInPhrase : WordInPhrase? = null
    private lateinit var wordTrue: String
    private lateinit var wordFalse: String
    private lateinit var phrase1: String

    @Before
    fun setup(){
        wordTrue = "a"
        wordFalse = "the"
        phrase1 = "This is a phrase to search for a chosen word"
        wordInPhrase = WordInPhrase()
    }

    @After
    fun teardown(){
        wordTrue = ""
        wordFalse = ""
        phrase1 = ""
        wordInPhrase = null
    }

    @Test
    fun wordInPhraseTrueTest(){
        assertTrue(wordInPhrase!!.wordInPhrase1(wordTrue, phrase1))
    }

    @Test
    fun wordInPhraseFalseTest(){
        assertFalse(wordInPhrase!!.wordInPhrase1(wordFalse, phrase1))
    }

    @Test
    fun wordInPhrase2EqualsTest(){
        assertEquals(2, wordInPhrase!!.wordInPhrase2(wordTrue, phrase1))
    }

    @Test
    fun wordInPhrase2NotEqualsTest(){
        assertNotEquals(2, wordInPhrase!!.wordInPhrase2(wordFalse, phrase1))
    }

}