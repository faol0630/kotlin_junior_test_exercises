package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.SqrtAndPow
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test


class SqrtAndPowTest {

    private var sqrtAndPow: SqrtAndPow? = null
    private var number: Double? = null
    private var number2: Double? = null
    private var numberInt: Int? = null
    private var powerOf: Int? = null

    @Before
    fun setup() {
        number = 81.0
        number2 = 2.0
        numberInt = 2
        powerOf = 8
        sqrtAndPow = SqrtAndPow()
    }

    @After
    fun teardown() {
        sqrtAndPow = null
        number = null
        number2 = null
        numberInt = null
        powerOf = null
    }

    @Test
    fun sqrt1EqualsDoubleTest() {
        assertEquals(9.0, sqrtAndPow!!.sqrt1(number!!))
    }

    @Test
    fun sqrt1NotEqualsDoubleTest() {
        assertNotEquals(8.0, sqrtAndPow!!.sqrt1(number!!))
    }

    @Test
    fun pow1EqualsTest() {
        assertEquals(256.0, sqrtAndPow!!.pow1(number2!!, powerOf!!))
    }

    @Test
    fun pow1NotEqualsTest() {
        assertNotEquals(200.0, sqrtAndPow!!.pow1(number2!!, powerOf!!))
    }

    @Test
    fun pow2EqualsTest() {
        assertEquals(256, sqrtAndPow!!.pow2(numberInt!!, powerOf!!))
    }

    @Test
    fun pow2NotEqualsTest() {
        assertNotEquals(200, sqrtAndPow!!.pow2(numberInt!!, powerOf!!))
    }

}