package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Palindrome
import junit.framework.TestCase.*
import org.junit.After
import org.junit.Before
import org.junit.Test


class PalindromeTest{

    private var palindrome : Palindrome? = null
    private  var wordTrue: String? = null
    private  var wordFalse: String? = null

    @Before
    fun setUp(){
        wordTrue = "Ana"
        wordFalse = "Jose"
        palindrome = Palindrome(wordTrue!!)
    }

    @After
    fun teardown(){
        wordTrue = null
        wordFalse = null
        palindrome = null
    }

    @Test
    fun checkTrueTest(){
        assertTrue(palindrome!!.palindrome1(wordTrue!!))
    }

    @Test
    fun checkFalseTest(){
        assertFalse(palindrome!!.palindrome1(wordFalse!!))
    }
}