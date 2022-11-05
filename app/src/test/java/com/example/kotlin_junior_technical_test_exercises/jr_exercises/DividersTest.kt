package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Dividers
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class DividersTest{

    private var dividers: Dividers? = null
    private var dividersReal: Dividers? = null
    private var emptyParam: MutableList<Int>? = null
    private var result: MutableList<Int>? = null
    private var number: Int? = null

    @Before
    fun setUp(){
        dividers = Mockito.mock(Dividers::class.java)
        dividersReal = Dividers()
        result = mutableListOf(1, 2, 17, 34)
        emptyParam = mutableListOf()
        number = 34
    }

    @After
    fun tearDown(){
        dividers = null
        dividersReal = null
        emptyParam = null
        result = null
        number = null
    }

    @Test
    fun enteringAtLeastOnceTest(){
        dividers!!.entering()
        Mockito.verify(dividers, Mockito.atLeastOnce())!!.entering()
    }

    @Test
    fun enteringNeverTest(){
        Mockito.verify(dividers, Mockito.never())!!.entering()
    }

    @Test
    fun enteringCallRealMethodTest(){
        given(dividers!!.entering()).willCallRealMethod()
        dividers!!.entering()
        Mockito.verify(dividers, Mockito.times(1))!!.entering()
    }

    @Test
    fun enteringNumberAtLeastOnceTest(){
        dividers!!.enteringNumber()
        Mockito.verify(dividers, Mockito.atLeastOnce())!!.enteringNumber()
    }

    @Test
    fun enteringNumberNeverTest(){
        Mockito.verify(dividers, Mockito.never())!!.enteringNumber()
    }

    @Test
    fun enteringNumberExceptionTest(){
        Assert.assertThrows(NullPointerException::class.java) { dividersReal!!.enteringNumber() }
    }

    @Test
    fun getAllDividersEqualsTest(){
        assertEquals(emptyParam, dividers!!.getAllDividers(number!!, emptyParam!!))
    }

    @Test
    fun getAllDividersNotEqualsTest(){
        assertNotEquals(result, dividers!!.getAllDividers(number!!, emptyParam!!))
    }

    @Test
    fun getAllDividersMockedTest(){
        given(dividers!!.getAllDividers(number!!, emptyParam!!)).willReturn(result)
        dividers!!.getAllDividers(number!!, emptyParam!!)
        Mockito.verify(dividers, Mockito.atLeastOnce())!!.getAllDividers(number!!, emptyParam!!)
    }
}