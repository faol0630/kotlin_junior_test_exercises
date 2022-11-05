package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.CountCharactersInAText
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class CountCharactersInATextTest {

    private var countCharacters: CountCharactersInAText? = null
    private var string1: String? = null
    private var counter: IntArray? = null
    private var counter2: IntArray? = null

    @Before
    fun setUp() {
        countCharacters = Mockito.mock(CountCharactersInAText::class.java)
        string1 = "Count characters in this sentence"
        counter = IntArray(256)
        counter2 = IntArray(1)
    }

    @After
    fun tearDown() {
        countCharacters = null
        string1 = null
        counter = null
        counter2 = null
    }

    @Test
    fun countCharactersInAText1AtListOnceTest() {
        countCharacters!!.countCharactersInAText1(string1!!)
        Mockito.verify(countCharacters, Mockito.atLeastOnce())!!.countCharactersInAText1(string1!!)
    }

    @Test
    fun countCharactersInAText1NeverTest() {
        countCharacters!!.countCharactersInAText1(string1!!)
        Mockito.verify(countCharacters, Mockito.never())!!.countCharactersInAText1("")
    }

    @Test
    fun showResultAtListOnceTest() {
        countCharacters!!.showResult(counter!!)
        Mockito.verify(countCharacters, Mockito.atLeastOnce())!!.showResult(counter!!)
    }

    @Test
    fun showResultNeverTest() {
        countCharacters!!.showResult(counter!!)
        Mockito.verify(countCharacters, Mockito.never())!!.showResult(counter2!!)
    }
}