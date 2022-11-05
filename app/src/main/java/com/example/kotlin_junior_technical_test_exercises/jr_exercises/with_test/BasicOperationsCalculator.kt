package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val operations = BasicOperationsCalculator()
    println(operations.calculator(4, 6, operations::addition))
    println(operations.calculator(14, 2, operations::subtraction))
    println(operations.calculator(5, 3, operations::multiplication))
    println(operations.calculator(12, 0, operations::division))
    println(operations)
    //lambda:
    println(operations.calculator(3, 11){x, y -> x + y}) //addition

    val toTheXPower = operations.calculator(2, 8){ x, y ->
        var number = 1
        for (i in 1..y){
            number *= x
        }
        number
    }
    println(toTheXPower)

}

class BasicOperationsCalculator {

    fun calculator(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int {
        return (fn(n1, n2))
    }

    fun addition(n1: Int, n2: Int) = n1 + n2

    fun subtraction(n1: Int, n2: Int) = n1 - n2

    fun multiplication(n1: Int, n2: Int) = n1 * n2

    fun division(n1: Int, n2: Int): Int {
        return try {
            n1 / n2
        }catch (e: ArithmeticException){
            0
        }

    }

    override fun toString(): String = calculator(5, 12, ::addition).toString()
}