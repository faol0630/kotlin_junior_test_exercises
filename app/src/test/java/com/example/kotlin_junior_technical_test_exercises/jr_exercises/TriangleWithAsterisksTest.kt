package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.TriangleWithAsterisks
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class TriangleWithAsterisksTest{

    private var triangleWithAsterisks: TriangleWithAsterisks? = null

    @Before
    fun setUp(){
        triangleWithAsterisks = Mockito.mock(TriangleWithAsterisks::class.java)
    }

    @After
    fun tearDown(){
        triangleWithAsterisks = null
    }

    @Test
    fun triangleWithAsterisksAtLeastOnceTest(){
        triangleWithAsterisks!!.triangleWithAsterisks(4)
        Mockito.verify(triangleWithAsterisks, Mockito.atLeastOnce())!!.triangleWithAsterisks(4)
    }

    @Test
    fun triangleWithAsterisksNeverTest(){
        triangleWithAsterisks!!.triangleWithAsterisks(4)
        Mockito.verify(triangleWithAsterisks, Mockito.never())!!.triangleWithAsterisks(8)
    }

    @Test
    fun triangleWithAsterisksTimesTest(){
        triangleWithAsterisks!!.triangleWithAsterisks(4)
        triangleWithAsterisks!!.triangleWithAsterisks(4)
        Mockito.verify(triangleWithAsterisks, Mockito.times(2))!!.triangleWithAsterisks(4)
    }

    @Test
    fun triangleWithAsterisksCallRealMethodTest(){
        given(triangleWithAsterisks!!.triangleWithAsterisks(4)).willCallRealMethod()
        triangleWithAsterisks!!.triangleWithAsterisks(4)
        Mockito.verify(triangleWithAsterisks, Mockito.atLeastOnce())!!.triangleWithAsterisks(4)
    }
}