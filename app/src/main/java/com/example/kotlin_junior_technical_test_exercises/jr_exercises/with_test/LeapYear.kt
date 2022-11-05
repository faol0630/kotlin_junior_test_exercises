package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

import java.time.LocalDate

fun main() {
    val leapYear = LeapYear()
    println(leapYear)

    val leapYear2 = LeapYear2()
    println(leapYear2)
}

class LeapYear {

    fun leapYear1(agno: Int): Boolean {
        return agno % 4 == 0 &&
                agno % 100 == 0 &&
                agno % 400 == 0 &&
                agno > 1582
    }

    override fun toString(): String {
        return leapYear1(1200).toString()
        //true : 2000,
        //false : 1200
    }
}

class LeapYear2 {
    //requires min API level 26:
    var leapYear: Boolean = LocalDate.of(1800, 11, 23).isLeapYear

    private fun leapYear1(): Boolean = leapYear

    override fun toString(): String = leapYear1().toString()
}
