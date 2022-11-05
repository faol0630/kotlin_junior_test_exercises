package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.MostUsedCharacter
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class MostUsedCharacterTest{

    private var mostUsedCharacter: MostUsedCharacter? = null

    @Before
    fun setUp(){
        mostUsedCharacter = Mockito.mock(MostUsedCharacter::class.java)
    }

    @After
    fun tearDown(){
        mostUsedCharacter = null
    }

    @Test
    fun characterToHashCodeAtLeastOnceTest(){
        mostUsedCharacter!!.characterToHashCode("Game of thrones")
        Mockito.verify(mostUsedCharacter, Mockito.atLeastOnce())!!.characterToHashCode("Game of thrones")
    }

    @Test
    fun characterToHashCodeNeverTest(){
        mostUsedCharacter!!.characterToHashCode("Game of thrones")
        Mockito.verify(mostUsedCharacter, Mockito.never())!!.characterToHashCode("Juego de tronos")
    }

    @Test
    fun characterToHashCodeTimesTest(){
        mostUsedCharacter!!.characterToHashCode("Game of thrones")
        mostUsedCharacter!!.characterToHashCode("Game of thrones")
        Mockito.verify(mostUsedCharacter, Mockito.times(2))!!.characterToHashCode("Game of thrones")
    }

    @Test
    fun lookingMostUsedAtLeastOnceTest(){
        mostUsedCharacter!!.lookingMostUsed()
        Mockito.verify(mostUsedCharacter, Mockito.atLeastOnce())!!.lookingMostUsed()
    }

    @Test
    fun lookingMostUsedNeverTest(){
        Mockito.verify(mostUsedCharacter, Mockito.never())!!.lookingMostUsed()
    }

    @Test
    fun lookingMostUsedTimesTest(){
        mostUsedCharacter!!.lookingMostUsed()
        Mockito.verify(mostUsedCharacter, Mockito.times(1))!!.lookingMostUsed()
    }

    @Test
    fun printMostUsedAtLeastOnceTest(){
        mostUsedCharacter!!.printMostUsed()
        Mockito.verify(mostUsedCharacter, Mockito.atLeastOnce())!!.printMostUsed()
    }

    @Test
    fun printMostUsedNeverTest(){
        Mockito.verify(mostUsedCharacter, Mockito.never())!!.printMostUsed()
    }

    @Test
    fun printMostUsedTimesTest(){
        mostUsedCharacter!!.printMostUsed()
        mostUsedCharacter!!.printMostUsed()
        Mockito.verify(mostUsedCharacter, Mockito.times(2))!!.printMostUsed()
    }
}