package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.ValidVowels
import com.example.kotlin_junior_technical_test_exercises.VowelsInText
import junit.framework.TestCase.*
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.stubbing.Answer


class ValidVowelsTest {

    companion object{

        private var validVowels: ValidVowels? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            validVowels = ValidVowels()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            validVowels = null
        }
    }

    @Test
    fun validVowelsTrueTest(){
        assertTrue(validVowels!!.validVowels("Words"))
    }

    @Test
    fun validVowelsFalseTest(){
        assertFalse(validVowels!!.validVowels("fly"))
    }

    @Test
    fun validVowelsFalseTest2(){
        assertEquals(false, validVowels!!.validVowels("45"))
    }

}


//----------------------



class VowelsInTextTest{

    companion object{

        @InjectMocks
        private var vowelsInText: VowelsInText? = null

        @Mock
        private var validVowels1: ValidVowels? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            validVowels1 = Mockito.mock(ValidVowels::class.java)
            vowelsInText = VowelsInText(validVowels1!!)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            validVowels1 = null
            vowelsInText = null
        }
    }

    @Test
    fun vowelsInTextTrueTest(){
        given(validVowels1!!.validVowels("Words")).willReturn(true)
        val result = vowelsInText!!.vowelsInText("Words")
        assertEquals(1, result)
    }

    @Test
    fun vowelsInTextFalseTest(){
        given(validVowels1!!.validVowels("3452")).willReturn(false)
        val result = vowelsInText!!.vowelsInText("3452")
        assertEquals(0, result)
    }

    @Test
    fun vowelsInTextMockedObjectTrueTest(){
        given(validVowels1!!.validVowels("Words")).willReturn(true)
        val result = validVowels1!!.validVowels("Words")
        Mockito.verify(validVowels1, Mockito.atLeastOnce())!!.validVowels("Words")
        assertEquals(true, result)
    }

    @Test
    fun vowelsInTextMockedObjectFalseTest(){
        given(validVowels1!!.validVowels("2341")).willReturn(false)
        val result = validVowels1!!.validVowels("2341")
        Mockito.verify(validVowels1, Mockito.atLeastOnce())!!.validVowels("2341")
        assertEquals(false, result)
    }

    @Test
    fun vowelsInTextCallingRealMethodTrueTest(){
        given(validVowels1!!.validVowels("Words")).willCallRealMethod()
        assertTrue(validVowels1!!.validVowels("Words"))
    }

    @Test
    fun vowelsInTextCallingRealMethodFalseTest(){
        given(validVowels1!!.validVowels("4563")).willCallRealMethod()
        assertFalse(validVowels1!!.validVowels("4563"))
    }

    @Test
    fun vowelsInTextWithAnswerFalseTest(){
        val answer : Answer<Boolean> = Answer{ false }
        given(validVowels1!!.validVowels("4563")).willAnswer(answer)
        val result: Boolean = validVowels1!!.validVowels("4563")
        assertEquals(false, result)
    }



}