package com.example.kotlin_junior_technical_test_exercises

//count how many users like a certain hobb
fun main() {

    val hobbiesList = listOf(
        "Informatica", "Video games", "Movies",
        "Baseball", "Tennis", "Dancing",
        "Cooking", "Soccer", "Basketball"
    )

    val counterList = IntArray(hobbiesList.size)

    val usersList: List<User> = listOf(
        User("Ana", listOf(hobbiesList[2], hobbiesList[4], hobbiesList[6])),
        User("Luis", listOf(hobbiesList[0], hobbiesList[5], hobbiesList[8])),
        User("Peter", listOf(hobbiesList[1], hobbiesList[3], hobbiesList[7])),
        User("Ann", listOf(hobbiesList[3], hobbiesList[4], hobbiesList[0])),
        User("John", listOf(hobbiesList[1], hobbiesList[2], hobbiesList[3])),
        User("Karen", listOf(hobbiesList[4], hobbiesList[6], hobbiesList[8])),
        User("Lee", listOf(hobbiesList[1], hobbiesList[7], hobbiesList[8])),
    )

    val hobbies = UsersAndTheirHobbies()
    hobbies.repeatedHobbies(usersList)
    hobbies.getHobbies(hobbiesList, counterList)
    hobbies.printResult(hobbiesList, counterList)
}

data class User(
    val name: String,
    val hobbies: List<String>
)

class UsersAndTheirHobbies {

    var repeatedHobbies = mutableListOf<String>()

    fun repeatedHobbies(list: List<User>) {

        val repeatedHobbiesInside = mutableListOf<String>()

        list.forEach { i ->
            i.hobbies.forEach { j ->
                repeatedHobbiesInside.add(j)
            }
        }
        repeatedHobbies = repeatedHobbiesInside

    }


    fun getHobbies(hobbiesList: List<String>, counterList: IntArray) {

        for (i in repeatedHobbies.indices) {
            for (j in hobbiesList.indices) {
                if (repeatedHobbies[i] == hobbiesList[j]) {
                    counterList[j]++
                }
            }
        }

    }

    fun printResult(hobbiesList: List<String>, counterList: IntArray) {
        counterList.indices.forEach {
            println("${hobbiesList[it]}: ${counterList[it]} ")
        }
    }

}