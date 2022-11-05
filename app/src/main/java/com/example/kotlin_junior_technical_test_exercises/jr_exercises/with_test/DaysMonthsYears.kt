package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//Given a number, show how many years, months and days it's equivalent to.
//The result is approximate. In some cases it doesn't match with reality
// even though the code works well.

fun main() {
    val daysMonthsYears = DaysMonthsYears()
    daysMonthsYears.getYears(920.0)
    daysMonthsYears.showResult()
}

class DaysMonthsYears {

    var years = 0.0
    var months = 0.0
    var days = 0.0
    var remainder = 0.0

    fun getYears(number: Double) {

        if (number >= 365.0) {
            years = number / 365.0
            remainder = number % 365.0
            getMonths()
        } else {
            years = 0.0
            getMonths2(number)
        }
    }

    fun getMonths() {
        if (remainder >= 30.416) {
            months = remainder / 30.416
            days = remainder % 30.416
        } else {
            months = 0.0
            days = remainder
        }
    }

    //------------
    fun getMonths2(number: Double) {

        when{
            number >= 30.0 && number < 360 -> {
                months = number / 30.0
                days = number % 30.0
            }
            number >= 360 && number < 365 -> {
                months = number / 30.416
                days = number % 30.416
            }
            number < 30.0 -> days = number

        }
    }

    //------------
    fun showResult() {
        println("The number is equal to: ${years.toInt()} years, ${months.toInt()} months and ${days.toInt()} days.")
    }


}