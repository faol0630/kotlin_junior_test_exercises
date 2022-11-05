package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.ObjectsWithACondition
import com.example.kotlin_junior_technical_test_exercises.Person
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class ObjectsWithAConditionTest {

    private var objectsWithACondition: ObjectsWithACondition? = null
    private var people: MutableList<Person>? = null
    private var peopleOver18: MutableList<Person>? = null

    @Before
    fun setUp() {
        objectsWithACondition = Mockito.mock(ObjectsWithACondition::class.java)

        people = mutableListOf(
            Person("Juan", "Perez", true),
            Person("Ana", "Lopez", false),
            Person("Luis", "Ruiz", false),
            Person("Ann", "Lee", true),
            Person("Carlos", "Orozco", true),
            Person("Luisa", "Lenin", false)
        )

        peopleOver18 = mutableListOf()

    }

    @After
    fun tearDown() {
        objectsWithACondition = null
        people = null
        peopleOver18 = null
    }

    @Test
    fun getPeopleOver18AtLeastOnceTest() {
        objectsWithACondition!!.getPeopleOver18(people!!, peopleOver18!!)
        Mockito.verify(objectsWithACondition, Mockito.atLeastOnce())!!.getPeopleOver18(people!!,peopleOver18!!)
    }

    @Test
    fun getPeopleOver18TimesTest() {
        objectsWithACondition!!.getPeopleOver18(people!!, peopleOver18!!)
        objectsWithACondition!!.getPeopleOver18(people!!, peopleOver18!!)
        Mockito.verify(objectsWithACondition, Mockito.times(2))!!.getPeopleOver18(people!!,peopleOver18!!)
    }

    @Test
    fun getPeopleOver18NeverTest() {
        Mockito.verify(objectsWithACondition, Mockito.never())!!.getPeopleOver18(people!!,peopleOver18!!)
    }

    @Test
    fun getPeopleOver18CallRealMethodTest() {
        given(objectsWithACondition!!.getPeopleOver18(people!!, peopleOver18!!)).willCallRealMethod()
        objectsWithACondition!!.getPeopleOver18(people!!, peopleOver18!!)
        Mockito.verify(objectsWithACondition, Mockito.atLeastOnce())!!.getPeopleOver18(people!!,peopleOver18!!)
    }
}