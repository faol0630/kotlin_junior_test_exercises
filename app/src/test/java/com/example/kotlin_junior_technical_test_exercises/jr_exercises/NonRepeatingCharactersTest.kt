package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.NonRepeatingCharacters
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class NonRepeatingCharactersTest{

    private var nonRepeatingCharactersMock: NonRepeatingCharacters? = null
    private var nonRepeatingCharacters: NonRepeatingCharacters? = null

    @Before
    fun setUp(){
        nonRepeatingCharactersMock = Mockito.mock(NonRepeatingCharacters::class.java)
        nonRepeatingCharacters = NonRepeatingCharacters()
    }

    @After
    fun tearDown(){
        nonRepeatingCharactersMock = null
        nonRepeatingCharacters = null
    }

    @Test
    fun nonRepeat1AtLeastOnceTest(){
        nonRepeatingCharactersMock!!.nonRepeat1("Phrase to find the unrepeated")
        Mockito.verify(nonRepeatingCharactersMock, Mockito.atLeastOnce())!!.nonRepeat1("Phrase to find the unrepeated")
    }

    @Test
    fun nonRepeatNeverTest(){
        Mockito.verify(nonRepeatingCharactersMock, Mockito.never())!!.nonRepeat1("Phrase to find the unrepeated")
    }

    @Test
    fun nonRepeat1CallRealMethod(){
        given(nonRepeatingCharactersMock!!.nonRepeat1("Phrase to find the unrepeated")).willCallRealMethod()
        nonRepeatingCharactersMock!!.nonRepeat1("Phrase to find the unrepeated")
        Mockito.verify(nonRepeatingCharactersMock, Mockito.atLeastOnce())!!.nonRepeat1("Phrase to find the unrepeated")
    }

    @Test
    fun showingNonRepeat1AtLeastOnceTest(){
        nonRepeatingCharactersMock!!.showingNonRepeat1()
        Mockito.verify(nonRepeatingCharactersMock, Mockito.atLeastOnce())!!.showingNonRepeat1()
    }

    @Test
    fun showingNonRepeat1NeverTest(){
        Mockito.verify(nonRepeatingCharactersMock, Mockito.never())!!.showingNonRepeat1()
    }

}