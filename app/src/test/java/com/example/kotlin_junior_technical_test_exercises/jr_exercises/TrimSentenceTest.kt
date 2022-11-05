package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.TrimSentence
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class TrimSentenceTest{

    private var trimSentence: TrimSentence? = null
    private var trimSentenceMock: TrimSentence? = null
    private var string1: String? = null
    private var subSequence: CharSequence? = null
    private var result2: String? = null

    @Before
    fun setUp(){
        trimSentence = TrimSentence()
        trimSentenceMock = Mockito.mock(TrimSentence::class.java)
        string1 = "Paris, Roma, Madrid, Lisboa"
        subSequence = string1!!.subSequence(0, 12)
        result2 = " P a r i s    R o m a"
    }

    @After
    fun tearDown(){
        trimSentence = null
        trimSentenceMock = null
        string1 = null
        subSequence = null
        result2 = null
    }

    @Test
    fun trimStringEqualsTest(){
        assertEquals(subSequence, trimSentence!!.trimString(string1!!))
    }

    @Test
    fun trimStringNotEqualsTest(){
        assertNotEquals(string1, trimSentence!!.trimString(subSequence.toString()))
    }

    @Test
    fun trimString2EqualsTest(){
        assertEquals(result2, trimSentence!!.trimString2(string1!!))
    }

    @Test
    fun trimString2NotEqualsTest(){
        assertNotEquals(string1, trimSentence!!.trimString2(subSequence.toString()))
    }

    @Test
    fun trimStringMockAtListOnceTest(){
        given(trimSentenceMock!!.trimString(string1!!)).willReturn(subSequence)
        trimSentenceMock!!.trimString(string1!!)
        Mockito.verify(trimSentenceMock, Mockito.atLeastOnce())!!.trimString(string1!!)
        assertEquals(subSequence, trimSentenceMock!!.trimString(string1!!))
    }

}