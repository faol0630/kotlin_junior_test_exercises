package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.ReplaceWordInText
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class ReplaceWordInTextTest {



    companion object{

        private var replaceWordInText: ReplaceWordInText? = null
        private var word: String? = null
        private var text: String? = null
        private var result: String? = null

        @BeforeClass
        @JvmStatic
        fun setUpCommon(){
            word = "to"
            text = "Sample text to replace word"
            result = "Sample text -Censured- replace word"
            replaceWordInText = ReplaceWordInText(word!!, text!!)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            word = null
            text = null
            result = null
            replaceWordInText = null
        }
    }

    private var replaceWordInTextMock: ReplaceWordInText? = null

    @Before
    fun setUp(){
        replaceWordInTextMock = Mockito.mock(ReplaceWordInText::class.java)
    }

    @After
    fun tearDown(){
        replaceWordInTextMock = null
    }

    @Test
    fun replaceWordEqualsTest(){
        assertEquals(result, replaceWordInText!!.replaceWord(word!!, text!!))
    }

    @Test
    fun replaceWordNotEqualsTest(){
        assertNotEquals(word, replaceWordInText!!.replaceWord(word!!, text!!))
    }

    @Test
    fun replaceWordMockedTest(){
        given(replaceWordInTextMock!!.replaceWord(word!!, text!!)).willReturn(result)
        replaceWordInTextMock!!.replaceWord(word!!, text!!)
        Mockito.verify(replaceWordInTextMock, Mockito.atLeastOnce())!!.replaceWord(word!!, text!!)
    }

    @Test
    fun replaceWordCallRealMethodTest(){
        given(replaceWordInTextMock!!.replaceWord(word!!, text!!)).willCallRealMethod()
        replaceWordInTextMock!!.replaceWord(word!!, text!!)
        Mockito.verify(replaceWordInTextMock, Mockito.atLeastOnce())!!.replaceWord(word!!, text!!)
    }

}