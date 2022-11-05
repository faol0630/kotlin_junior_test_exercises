package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.RepeatedInPhrase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class RepeatedInPhraseTest{

    private var repeatedInPhrase: RepeatedInPhrase? = null
    private var phrase: String? = null
    private var emptyPhrase: String? = null

    @Before
    fun setUp(){
        repeatedInPhrase = Mockito.mock(RepeatedInPhrase::class.java)
        phrase = "Phrase where the repeated ones are going to be searched"
        emptyPhrase = ""
    }

    @After
    fun tearDown(){
        repeatedInPhrase = null
        phrase = null
        emptyPhrase = null
    }

    @Test
    fun countRepeatedAtLeastOnceTest(){
        repeatedInPhrase!!.countRepeated(phrase!!)
        Mockito.verify(repeatedInPhrase, Mockito.atLeastOnce())!!.countRepeated(phrase!!)
    }

    @Test
    fun countRepeatedNeverTest(){
        repeatedInPhrase!!.countRepeated(phrase!!)
        Mockito.verify(repeatedInPhrase, Mockito.never())!!.countRepeated(emptyPhrase!!)
    }

    @Test
    fun countRepeatedTimesTest(){
        repeatedInPhrase!!.countRepeated(phrase!!)
        repeatedInPhrase!!.countRepeated(phrase!!)
        Mockito.verify(repeatedInPhrase, Mockito.times(2))!!.countRepeated(phrase!!)
    }

    @Test
    fun countRepeatedCallRealMethodTest(){
        given(repeatedInPhrase!!.countRepeated(phrase!!)).willCallRealMethod()
        repeatedInPhrase!!.countRepeated(phrase!!)
        Mockito.verify(repeatedInPhrase, Mockito.atLeastOnce())!!.countRepeated(phrase!!)
    }

    @Test
    fun findRepeatedAtLeastOnceTest(){
        repeatedInPhrase!!.findRepeated()
        Mockito.verify(repeatedInPhrase, Mockito.atLeastOnce())!!.findRepeated()
    }

    @Test
    fun findRepeatedNeverTest(){
        Mockito.verify(repeatedInPhrase, Mockito.never())!!.findRepeated()
    }

    @Test
    fun findRepeatedTimesTest(){
        repeatedInPhrase!!.findRepeated()
        repeatedInPhrase!!.findRepeated()
        Mockito.verify(repeatedInPhrase, Mockito.times(2))!!.findRepeated()
    }

}