package com.example.kotlin_junior_technical_test_exercises

//select objects that meet a condition and pass them to a new list

fun main() {
    val objects1 = ObjectsWithACondition()
    objects1.getPeopleOver18(objects1.people, objects1.peopleOver18)
    objects1.showPeopleOver18(objects1.peopleOver18)
}

data class Person(
    val name: String,
    val surname: String,
    val isOver18: Boolean
)

class ObjectsWithACondition {

    var people: MutableList<Person> = mutableListOf(
        Person("Juan", "Perez", true),
        Person("Ana", "Lopez", false),
        Person("Luis", "Ruiz", false),
        Person("Ann", "Lee", true),
        Person("Carlos", "Orozco", true),
        Person("Luisa", "Lenin", false)
    )

    var peopleOver18 = mutableListOf<Person>()

    fun getPeopleOver18(
        people1 : MutableList<Person>,
        people2 : MutableList<Person>
    ) {

        for (i in 0 until people1.size) {
            if (people1[i].isOver18) {
                people2.add(people1[i])
            }
        }
    }

    fun showPeopleOver18(people2: MutableList<Person>) {
        println("Persons over 18: ")

        for (i in 0 until people2.size){
            println("${people2[i].name} ${people2[i].surname}")
        }
    }
}