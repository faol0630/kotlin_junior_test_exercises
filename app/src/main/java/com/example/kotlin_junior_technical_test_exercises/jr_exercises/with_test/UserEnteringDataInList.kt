package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val enteringData = UserEnteringDataInList()
    val numberList: List<Int> = List(5) { enteringData.validNumber() }
    println(numberList)
}

class UserEnteringDataInList {

    private var result = 0

    fun validNumber(): Int {

        try {
            println("Enter a number between 1 and 20")
            result = readLine()!!.toInt()
            if (result in 1..20) {
                enteringData(result)
                println("Number added to the list")
            } else {
                println("Invalid entry.try again")
                validNumber()
            }

        } catch (e: NumberFormatException) {
            println("Invalid entry")
            validNumber()
        }
        return result

    }

    fun enteringData(result: Int): Int {
        return result
    }

}