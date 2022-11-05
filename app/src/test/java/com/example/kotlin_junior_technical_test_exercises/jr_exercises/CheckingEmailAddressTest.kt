package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.CheckingEmailAddress
import junit.framework.TestCase.*
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class CheckingEmailAddressTest {

    private lateinit var emailTrue: String
    private lateinit var emailFalse: String

    companion object{

        private var checkingEmailAddress: CheckingEmailAddress? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            checkingEmailAddress = CheckingEmailAddress()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            checkingEmailAddress = null
        }
    }

    @Before
    fun setUp() {
        emailTrue = "email5@email.com"
        emailFalse = "email.com"
    }

    @After
    fun tearDown() {
        emailTrue = ""
        emailFalse = ""
    }

    @Test
    fun checkTrueTest() {
        assertTrue(checkingEmailAddress!!.checkingEmailAddress(emailTrue))
    }

    @Test
    fun checkFalseTest() {
        assertFalse(checkingEmailAddress!!.checkingEmailAddress(emailFalse))
    }

}

