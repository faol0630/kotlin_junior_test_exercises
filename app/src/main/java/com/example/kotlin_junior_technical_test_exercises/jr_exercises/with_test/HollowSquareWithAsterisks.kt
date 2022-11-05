package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val hollowSquare = HollowSquareWithAsterisks()
    println(hollowSquare.drawTheSquare(4))
}

class HollowSquareWithAsterisks {

    fun drawTheSquare(side: Int): String {

        var result = ""

        for (i in 1..side) {
            var character = "" //must be inside the for loop

            for (j in 1..side) {

                if (i == 1 || i == side) {
                    character += "* "
                } else if (j == 1 || j == side) {
                    character += "* "
                } else {
                    character += "  "
                    //live one space for each asterisk when printing something blank.otherwise the square is not drawn well
                }
            }
            result += character + "\n"
        }
        return result
    }
}