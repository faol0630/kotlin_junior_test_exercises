package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.BasicOperationsCalculator
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class BasicOperationsCalculatorTest{

    private var operations: BasicOperationsCalculator? = null

    @Before
    fun setUp(){
        operations = Mockito.mock(BasicOperationsCalculator::class.java)
    }

    @After
    fun tearDown(){
        operations = null
    }

    @Test
    fun additionAtLeastOnceTest(){
        operations!!.addition(3, 4)
        Mockito.verify(operations, Mockito.atLeastOnce())!!.addition(3, 4)
    }

    @Test
    fun additionNeverTest(){
        operations!!.addition(3, 4)
        Mockito.verify(operations, Mockito.never())!!.addition(2, 4)
    }

    @Test
    fun subtractionAtLeastOnceTest(){
        operations!!.subtraction(13, 4)
        Mockito.verify(operations, Mockito.atLeastOnce())!!.subtraction(13, 4)
    }

    @Test
    fun subtractionNeverTest(){
        operations!!.subtraction(13, 4)
        Mockito.verify(operations, Mockito.never())!!.subtraction(2, 4)
    }

    @Test
    fun multiplicationAtLeastOnceTest(){
        operations!!.multiplication(3, 4)
        Mockito.verify(operations, Mockito.atLeastOnce())!!.multiplication(3, 4)
    }

    @Test
    fun multiplicationNeverTest(){
        operations!!.multiplication(3, 4)
        Mockito.verify(operations, Mockito.never())!!.multiplication(2, 4)
    }

    @Test
    fun divisionAtLeastOnceTest(){
        operations!!.division(12, 4)
        Mockito.verify(operations, Mockito.atLeastOnce())!!.division(12, 4)
    }

    @Test
    fun divisionNeverTest(){
        operations!!.division(12, 4)
        Mockito.verify(operations, Mockito.never())!!.division(15, 4)
    }

    @Test
    fun calculatorEqualsAtLastOnceTest(){
        given(operations!!.calculator(3, 4, operations!!::addition)).willReturn(7)
        operations!!.calculator(3, 4, operations!!::addition)
        Mockito.verify(operations, Mockito.atLeastOnce())!!.calculator(3, 4, operations!!::addition)
        assertEquals(7, operations!!.calculator(3, 4, operations!!::addition))
    }

    @Test
    fun calculatorEqualsNeverTest(){
        given(operations!!.calculator(13, 4, operations!!::subtraction)).willReturn(9)
        operations!!.calculator(13, 4, operations!!::subtraction)
        Mockito.verify(operations, Mockito.never())!!.calculator(3, 4, operations!!::addition)
        assertEquals(9, operations!!.calculator(13, 4, operations!!::subtraction))
    }
}