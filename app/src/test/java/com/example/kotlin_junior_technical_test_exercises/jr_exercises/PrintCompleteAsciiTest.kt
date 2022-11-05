package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.PrintCompleteAscii
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class PrintCompleteAsciiTest{

    private var printCompleteAscii: PrintCompleteAscii? = null

    @Before
    fun setUp(){
        printCompleteAscii = Mockito.mock(PrintCompleteAscii::class.java)
    }

    @After
    fun tearDown(){
        printCompleteAscii = null
    }

    @Test
    fun printAsciiAtLeastOnceTest(){
        printCompleteAscii!!.printAscii()
        Mockito.verify(printCompleteAscii, Mockito.atLeastOnce())!!.printAscii()
    }

    @Test
    fun printAsciiNeverTest(){
        Mockito.verify(printCompleteAscii, Mockito.never())!!.printAscii()
    }

    @Test
    fun printAsciiTimesTest(){
        printCompleteAscii!!.printAscii()
        printCompleteAscii!!.printAscii()
        Mockito.verify(printCompleteAscii, Mockito.times(2))!!.printAscii()
    }
}