package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.HollowSquareWithAsterisks
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class HollowSquareWithAsterisksTest{

    private var squareMock: HollowSquareWithAsterisks? = null
    private var square: HollowSquareWithAsterisks? = null
    private var result: String? = null

    @Before
    fun setUp(){
        squareMock = Mockito.mock(HollowSquareWithAsterisks::class.java)
        square = HollowSquareWithAsterisks()
        result = "* * * * \n" +
                "*     * \n" +
                "*     * \n" +
                "* * * * \n"
    }

    @After
    fun tearDown(){
        squareMock = null
        square = null
        result = null
    }

    @Test
    fun drawTheSquareAssertEqualsTest(){
        assertEquals(result, square!!.drawTheSquare(4))
    }

    @Test
    fun drawTheSquareAssertNotEqualsTest(){
        assertNotEquals(result, square!!.drawTheSquare(6))
    }

    @Test
    fun drawTheSquareAtLeastOnceTest(){
        squareMock!!.drawTheSquare(4)
        Mockito.verify(squareMock, Mockito.atLeastOnce())!!.drawTheSquare(4)
    }

    @Test
    fun drawTheSquareTimesTest(){
        squareMock!!.drawTheSquare(4)
        squareMock!!.drawTheSquare(4)
        squareMock!!.drawTheSquare(4)
        squareMock!!.drawTheSquare(4)
        Mockito.verify(squareMock, Mockito.times(4))!!.drawTheSquare(4)
    }

    @Test
    fun drawTheSquareNeverTest(){
        squareMock!!.drawTheSquare(4)
        Mockito.verify(squareMock, Mockito.never())!!.drawTheSquare(8)
    }

    @Test
    fun drawTheSquareCallRealMethodTest(){
        given(squareMock!!.drawTheSquare(4)).willCallRealMethod()
        squareMock!!.drawTheSquare(4)
        Mockito.verify(squareMock, Mockito.atLeastOnce())!!.drawTheSquare(4)
    }
}