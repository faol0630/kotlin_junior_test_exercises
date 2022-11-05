package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.SplitArraysInSubArrays
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class SplitArraysInSubArraysTest {

    private var split: SplitArraysInSubArrays? = null
    private var languagesList: List<String>? = null

    @Before
    fun setUp() {
        split = Mockito.mock(SplitArraysInSubArrays::class.java)
        languagesList = listOf(
            "PHP",
            "Javascript",
            "Go",
            "Rust",
            "Java",
            "C",
            "Python",
            "Kotlin",
            "Pascal",
            "C++",
            "Latino",
            "Matlab",
            "Cobol",
            "R",
            "Visual basic",
            "C#",
            "Fortran",
            "Matlab",
            "Clojure",
            "Ada",
            "Erlang"
        )
    }

    @After
    fun tearDown() {
        split = null
        languagesList = null
    }

    @Test
    fun splitListAtLeastOnceTest() {
        split!!.splitList(languagesList!!, 3)
        Mockito.verify(split, Mockito.atLeastOnce())!!.splitList(languagesList!!, 3)
    }

    @Test
    fun splitListNeverTest() {
        Mockito.verify(split, Mockito.never())!!.splitList(languagesList!!, 3)
    }

    @Test
    fun splitListTimesTest() {
        split!!.splitList(languagesList!!, 3)
        split!!.splitList(languagesList!!, 3)
        split!!.splitList(languagesList!!, 3)
        Mockito.verify(split, Mockito.times(3))!!.splitList(languagesList!!, 3)
    }

    @Test
    fun splitListCallRealMethodTest() {
        given(split!!.splitList(languagesList!!, 3)).willCallRealMethod()
        split!!.splitList(languagesList!!, 3)
        Mockito.verify(split, Mockito.atLeastOnce())!!.splitList(languagesList!!, 3)
    }
}