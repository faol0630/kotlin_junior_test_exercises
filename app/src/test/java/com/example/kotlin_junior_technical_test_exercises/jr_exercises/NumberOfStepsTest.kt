package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.NumberOfSteps
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class NumberOfStepsTest {

    private var numberOfSteps: NumberOfSteps? = null

    @Before
    fun setUp() {
        numberOfSteps = Mockito.mock(NumberOfSteps::class.java)
    }

    @After
    fun tearDown() {
        numberOfSteps = null
    }

    @Test
    fun stepsCorrectTest() {
        assert(numberOfSteps!!.steps(5) == print("[-]"))
    }

    @Test
    fun stepsCorrectTest2() {
        assert(numberOfSteps!!.steps(7) == println())
    }

    @Test
    fun stepsCorrectTest3(){
        numberOfSteps!!.steps(8)
        Mockito.verify(numberOfSteps, Mockito.atLeastOnce())!!.steps(8)
    }

    @Test
    fun stepsNeverTest(){
        numberOfSteps!!.steps(8)
        Mockito.verify(numberOfSteps, Mockito.never())!!.steps(6)
    }

    @Test
    fun stepsCallRealMethodTest(){
        given(numberOfSteps!!.steps(8)).willCallRealMethod()
        Mockito.verify(numberOfSteps, Mockito.never())!!.steps(8)
    }


}