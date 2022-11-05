package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.TextToAscii
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class TextToAsciiTest{

    private var textToAscii: TextToAscii? = null

    @Before
    fun setUp(){
        textToAscii = Mockito.mock(TextToAscii::class.java)
    }

    @After
    fun tearDown(){
        textToAscii = null
    }

    @Test
    fun printAsciiAtLeastOnceTest(){
        textToAscii!!.printAscii("aracataca")
        Mockito.verify(textToAscii, Mockito.atLeastOnce())!!.printAscii("aracataca")
    }

    @Test
    fun printAsciiTimeTest(){
        textToAscii!!.printAscii("aracataca")
        textToAscii!!.printAscii("aracataca")
        Mockito.verify(textToAscii, Mockito.times(2))!!.printAscii("aracataca")
    }

    @Test
    fun printAsciiNeverTest(){
        textToAscii!!.printAscii("aracataca")
        Mockito.verify(textToAscii, Mockito.never())!!.printAscii("Bogota")
    }

    @Test
    fun printAsciiCallRealMethodTest(){
        given(textToAscii!!.printAscii("aracataca")).willCallRealMethod()
        textToAscii!!.printAscii("aracataca")
        Mockito.verify(textToAscii, Mockito.atLeastOnce())!!.printAscii("aracataca")
    }
}