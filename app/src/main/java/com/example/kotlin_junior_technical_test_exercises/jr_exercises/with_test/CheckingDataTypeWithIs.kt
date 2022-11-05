package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {

    val checking = CheckingDataTypeWithIs()
    checking.varC = "Word"
    println(checking)
}

class CheckingDataTypeWithIs {

    var varC: Any? = null

    fun convertingToDouble(obj: Any): Double {

        val newObj: Double = if (obj is Int) { //if obj is an Integer
            obj.toString().toDouble()
        } else {
            0.00
        }
        return newObj

    }

    override fun toString(): String = convertingToDouble(varC!!).toString()
}
