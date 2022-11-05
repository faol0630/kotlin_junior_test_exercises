package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.CheckingDataTypeWithIs
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock


class CheckingDataTypeWithIsTest{

    companion object{

        @InjectMocks
        private var checkingData: CheckingDataTypeWithIs? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            checkingData = CheckingDataTypeWithIs()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            checkingData = null
        }
    }
    @Mock
    private var varAny: Any? = null

    @Mock
    private var varAny2: Any? = null

    @Mock
    private var expectedDouble: Double? = null

    @Mock
    private var expectedDouble2: Double? = null

    @Before
    fun setup(){
        varAny = "Word"
        varAny2 = 5
        expectedDouble = 0.00
        expectedDouble2 = 5.0
    }

    @After
    fun tearDown(){
        varAny = null
        varAny2 = null
        expectedDouble = null
        expectedDouble2 = null
    }

    @Test
    fun convertingToDoubleWrongTest(){

        val operation = checkingData!!.convertingToDouble(varAny!!)
        assertEquals(expectedDouble, operation)
    }

    @Test
    fun convertingToDoubleCorrectTest(){

        val operation = checkingData!!.convertingToDouble(varAny2!!)
        assertEquals(expectedDouble2, operation)

    }
}