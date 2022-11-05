package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test.RemoveStringsFromArrayList
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito

class RemoveStringsFromArrayListTest {

    companion object {

        private var removeStrings: RemoveStringsFromArrayList? = null

        @BeforeClass
        @JvmStatic
        fun setUpCommon() {
            removeStrings = RemoveStringsFromArrayList()

        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            removeStrings = null

        }

    }
    private var removerStringMock: RemoveStringsFromArrayList? = null
    private var myList: MutableList<Any>? = null
    private var newIntList: MutableList<Int>? = null
    private var newStringList : MutableList<String>? = null

    @Before
    fun setUp() {
        removerStringMock = Mockito.mock(RemoveStringsFromArrayList::class.java)
        myList = mutableListOf(2, 5, "Word1", 87, 12, "Word2", 112, 31, 33, "Word3", "Word4", 99)
        newIntList = mutableListOf(2, 5, 87, 12, 112, 31, 33, 99)
        newStringList = mutableListOf("Word1", "Word2", "Word3", "Word4")
    }

    @After
    fun tearDown() {
        removerStringMock = null
        myList = null
        newIntList = null
        newStringList = null
    }

    @Test
    fun removeStringsTest() {
        removerStringMock!!.removeStrings(myList!!)
        Mockito.verify(removerStringMock, Mockito.atLeast(1))!!.removeStrings(myList!!)
    }

    @Test
    fun removeStringsCallRealMethodTest() {
        given(removerStringMock!!.removeStrings(myList!!)).willCallRealMethod()
        Mockito.verify(removerStringMock, Mockito.never())!!.removeStrings(myList!!)
    }

    @Test
    fun showOriginalListEqualTest() {
        assertEquals(myList, removeStrings!!.showOriginalList(myList!!))
    }

    @Test
    fun showOriginalListNotEqualTest() {
        assertNotEquals(newIntList, removeStrings!!.showOriginalList(myList!!))
    }

    @Test
    fun showNumberListEqualTest(){
        assertEquals(newIntList, removeStrings!!.showNumberList(newIntList!!))
    }

    @Test
    fun showNumberListNotEqualTest(){
        assertNotEquals(newStringList, removeStrings!!.showNumberList(newIntList!!))
    }

    @Test
    fun showStringListEqualTest(){
        assertEquals(newStringList, removeStrings!!.showStringList(newStringList!!))
    }

    @Test
    fun showStringListNotEqualTest(){
        assertNotEquals(newIntList, removeStrings!!.showStringList(newStringList!!))
    }
}

