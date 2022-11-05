package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.UserEnteringDataInList
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.Mockito


class UserEnteringDataInListTest{

    companion object{

        private var enteringData: UserEnteringDataInList? = null

        @BeforeClass
        @JvmStatic
        fun setUpCommon(){
            enteringData = UserEnteringDataInList()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            enteringData = null
        }
    }

    private var enteringDataMock: UserEnteringDataInList? = null

    @Before
    fun setUp(){
        enteringDataMock = Mockito.mock(UserEnteringDataInList::class.java)
    }

    @After
    fun tearDown(){
        enteringDataMock = null
    }

    @Test
    fun validNumberCorrectTest(){
       assertThrows(NullPointerException::class.java){ enteringData!!.validNumber()}
    }

    @Test
    fun validNumberCorrectTest2(){
        enteringDataMock!!.enteringData(12)
        Mockito.verify(enteringDataMock, Mockito.atLeastOnce())!!.enteringData(12)
    }

    @Test
    fun enteringDataTrueTest(){
        assertEquals(12, enteringData!!.enteringData(12))
    }

    @Test
    fun enteringDataFalseTest(){
        assertNotEquals(15, enteringData!!.enteringData(10))
    }
}

