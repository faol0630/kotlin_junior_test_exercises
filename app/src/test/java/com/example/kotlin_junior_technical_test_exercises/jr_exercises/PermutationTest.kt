package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.Permutation
import junit.framework.TestCase.*
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class PermutationTest {

    companion object {

        private var permutation: Permutation? = null
        private var permutationMock: Permutation? = null
        private var numberList: List<Int>? = null
        private var numberList2: List<Int>? = null

        @BeforeClass
        @JvmStatic
        fun setUpCommon() {
            permutation = Permutation()
            permutationMock = Mockito.mock(Permutation::class.java)
            numberList = listOf(4, 3, 5, 2, 1)
            numberList2 = listOf(8, 6, 10, 4, 2)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            permutation = null
            permutationMock = null
            numberList = null
            numberList2 = null
        }
    }

    @Test
    fun checkPermutationTrueTest(){
        assertTrue(permutation!!.checkPermutation(numberList!!))
    }

    @Test
    fun checkPermutationFalseTest(){
        assertFalse(permutation!!.checkPermutation(numberList2!!))
    }

    @Test
    fun checkPermutationMockAtLeastOnceTrueTest(){
        given(permutationMock!!.checkPermutation(numberList!!)).willReturn(true)
        permutationMock!!.checkPermutation(numberList!!)
        Mockito.verify(permutationMock, Mockito.atLeastOnce())!!.checkPermutation(numberList!!)
        assertTrue(permutation!!.checkPermutation(numberList!!))
    }

    @Test
    fun checkPermutationMockAtLeastOnceFalseTest(){
        given(permutationMock!!.checkPermutation(numberList2!!)).willReturn(false)
        permutationMock!!.checkPermutation(numberList2!!)
        Mockito.verify(permutationMock, Mockito.atLeastOnce())!!.checkPermutation(numberList2!!)
        assertFalse(permutation!!.checkPermutation(numberList2!!))
    }

    @Test
    fun checkPermutationMockCallRealMethodTest(){
        given(permutationMock!!.checkPermutation(numberList!!)).willCallRealMethod()
        permutationMock!!.checkPermutation(numberList!!)
        Mockito.verify(permutationMock, Mockito.atLeastOnce())!!.checkPermutation(numberList!!)
        assertTrue(permutation!!.checkPermutation(numberList!!))
    }
}
