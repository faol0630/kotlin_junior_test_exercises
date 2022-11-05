package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val triangle = TriangleWithAsterisks()
    println(triangle.triangleWithAsterisks(4))

}

class TriangleWithAsterisks {

    fun triangleWithAsterisks(sizeT: Int) : String{

        val half = sizeT - 1 //3
        var result = ""

        for (i in 0..half ) {//in this example print 4 lines 0, 1, 2, 3

            var character = "" //must be inside the for loop

            for (j in 0 until sizeT + half) {// 0 until 6 (the last one is not included)

                if (half - i <= j && half + i >= j) {
                    character += "*"
                }else{
                    character += " "
                }

            }
            result += character + "\n"
        }
        return result

    }
}