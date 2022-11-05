package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.User
import com.example.kotlin_junior_technical_test_exercises.UsersAndTheirHobbies
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class UsersAndTheirHobbiesTest {

    private var users: UsersAndTheirHobbies? = null
    private var userList: List<User>? = null
    private var hobbiesList: List<String>? = null
    private var counterList: IntArray? = null

    @Before
    fun setUp() {
        users = Mockito.mock(UsersAndTheirHobbies::class.java)

        hobbiesList = listOf(
            "Informatica", "Video games", "Movies",
            "Baseball", "Tennis", "Dancing",
            "Cooking", "Soccer", "Basketball"
        )

        userList = listOf(
            User("Ana", listOf(hobbiesList!![2], hobbiesList!![4], hobbiesList!![6])),
            User("Luis", listOf(hobbiesList!![0], hobbiesList!![5], hobbiesList!![8])),
            User("Peter", listOf(hobbiesList!![1], hobbiesList!![3], hobbiesList!![7])),
            User("Ann", listOf(hobbiesList!![3], hobbiesList!![4], hobbiesList!![0])),
            User("John", listOf(hobbiesList!![1], hobbiesList!![2], hobbiesList!![3])),
            User("Karen", listOf(hobbiesList!![4], hobbiesList!![6], hobbiesList!![8])),
            User("Lee", listOf(hobbiesList!![1], hobbiesList!![7], hobbiesList!![8])),
        )

        counterList = IntArray(hobbiesList!!.size)
    }

    @After
    fun tearDown() {
        users = null
        userList = null
        hobbiesList = null
        counterList = null
    }

    @Test
    fun repeatedHobbiesAtLeastOnceTest() {
        users!!.repeatedHobbies(userList!!)
        Mockito.verify(users, Mockito.atLeastOnce())!!.repeatedHobbies(userList!!)
    }

    @Test
    fun repeatedHobbiesNeverTest() {
        Mockito.verify(users, Mockito.never())!!.repeatedHobbies(userList!!)
    }

    @Test
    fun repeatedHobbiesTimesTest() {
        users!!.repeatedHobbies(userList!!)
        users!!.repeatedHobbies(userList!!)
        users!!.repeatedHobbies(userList!!)
        Mockito.verify(users, Mockito.times(3))!!.repeatedHobbies(userList!!)
    }

    @Test
    fun repeatedHobbiesCallRealMethodTest() {
        given(users!!.repeatedHobbies(userList!!)).willCallRealMethod()
        users!!.repeatedHobbies(userList!!)
        Mockito.verify(users, Mockito.atLeastOnce())!!.repeatedHobbies(userList!!)
    }

    @Test
    fun getHobbiesAtLeastOnceTest() {
        users!!.getHobbies(hobbiesList!!, counterList!!)
        Mockito.verify(users, Mockito.atLeastOnce())!!.getHobbies(hobbiesList!!, counterList!!)
    }

    @Test
    fun getHobbiesNeverTest() {
        Mockito.verify(users, Mockito.never())!!.getHobbies(hobbiesList!!, counterList!!)
    }

    @Test
    fun getHobbiesTimesTest() {
        users!!.getHobbies(hobbiesList!!, counterList!!)
        users!!.getHobbies(hobbiesList!!, counterList!!)
        users!!.getHobbies(hobbiesList!!, counterList!!)
        Mockito.verify(users, Mockito.times(3))!!.getHobbies(hobbiesList!!, counterList!!)
    }

}