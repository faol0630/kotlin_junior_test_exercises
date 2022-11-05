package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//According to the given number, determine what type of angle it is

fun main() {
    val angleType = AngleType()
    angleType.cNumber = 180
    println(angleType)
}

class AngleType {

    var cNumber: Int? = null

    fun getAngleType(number: Int): String {

        val result: String = when {
            number <= 0 -> "Invalid entry.Error"
            number in 1..89 -> "Acute angle"
            number == 90 -> "Right angle"
            number in 91..179 -> "Obtuse angle"
            number == 180 -> "Straight angle"
            number in 181..359 -> "Concave angle"
            number == 360 -> "Complete angle"
            else -> "Invalid entry.Error"

        }
        return result
    }

    override fun toString(): String = getAngleType(cNumber!!)

}