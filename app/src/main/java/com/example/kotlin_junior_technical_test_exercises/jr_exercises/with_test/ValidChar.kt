package com.example.kotlin_junior_technical_test_exercises.jr_exercises

fun main() {
    val validChar = ValidChar()
    val getCharacterCode = GetCharacterCode(validChar)
    getCharacterCode.character = 'A' //must be in single quotes
    println(getCharacterCode)

}

class ValidChar {

    fun validChar(character: Any): Boolean {
        return if (character is Char) {
            true
        } else {
            println("Invalid entry")
            false
        }
    }
}

class GetCharacterCode(private val validChar: ValidChar) {

    var character: Any? = null

    fun getCharacterCode(character: Any): Int {
        return if (validChar.validChar(character)) {
            character.hashCode()
        }else{
            0
        }
    }

    override fun toString(): String = getCharacterCode(character!!).toString()

}

//character A = hashCode 65
//character a = hashCode 97
//character @ = hashCode 64
//character 6 = hashCode 54

//Character.hashCode() to know what code(number) is a certain character
//Int.toChar() to know what character is a certain number between 1 and 255