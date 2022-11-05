package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.UppercaseOrLowercase
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class UppercaseOrLowercaseTest{

    private var uppercaseOrLowercaseMock: UppercaseOrLowercase? = null
    private var uppercaseOrLowercase: UppercaseOrLowercase? = null

    @Before
    fun setUp(){
        uppercaseOrLowercaseMock = Mockito.mock(UppercaseOrLowercase::class.java)
        uppercaseOrLowercase = UppercaseOrLowercase()
    }

    @After
    fun tearDown(){
        uppercaseOrLowercaseMock = null
        uppercaseOrLowercase = null
    }

    @Test
    fun changeStringAtLeastOnceTest(){
        uppercaseOrLowercaseMock!!.changeString("HOUses and BUIldINgS")
        Mockito.verify(uppercaseOrLowercaseMock, Mockito.atLeastOnce())!!.changeString("HOUses and BUIldINgS")
    }

    @Test
    fun changeStringTimesTest(){
        uppercaseOrLowercaseMock!!.changeString("HOUses and BUIldINgS")
        Mockito.verify(uppercaseOrLowercaseMock, Mockito.times(1))!!.changeString("HOUses and BUIldINgS")
    }

    @Test
    fun changeStringNeverTest(){
        Mockito.verify(uppercaseOrLowercaseMock, Mockito.never())!!.changeString("HOUses and BUIldINgS")
    }

    @Test
    fun changeStringCallRealMethodTest(){
        given(uppercaseOrLowercaseMock!!.changeString("HOUses and BUIldINgS")).willCallRealMethod()
        uppercaseOrLowercaseMock!!.changeString("HOUses and BUIldINgS")
        Mockito.verify(uppercaseOrLowercaseMock, Mockito.atLeastOnce())!!.changeString("HOUses and BUIldINgS")
    }

    @Test
    fun showResultEqualsTest(){
        assertEquals("The string has the same number of uppercase and lowercase characters", uppercaseOrLowercase!!.showResult("HOUses and BUIldINgS",9, 9))
    }

    @Test
    fun showResultEquals2Test(){
        assertEquals("HOUSES AND BUILDINGS", uppercaseOrLowercase!!.showResult("HOUSES and BUIldINgS",12, 6))
    }

    @Test
    fun showResultEquals3Test(){
        assertEquals("houses and buildings", uppercaseOrLowercase!!.showResult("houses and BUIldINgS",6, 12))
    }

    @Test
    fun changeStringAtLeastOnce(){
        given(uppercaseOrLowercaseMock!!.showResult("HOUses and BUIldINgS",9, 9)).willReturn("The string has the same number of uppercase and lowercase characters")
        uppercaseOrLowercaseMock!!.showResult("HOUses and BUIldINgS",9, 9)
        Mockito.verify(uppercaseOrLowercaseMock, Mockito.atLeastOnce())!!.showResult("HOUses and BUIldINgS",9, 9)
    }
}