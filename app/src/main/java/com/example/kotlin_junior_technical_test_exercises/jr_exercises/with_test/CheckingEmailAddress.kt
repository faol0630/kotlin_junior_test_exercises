package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main(){
    println(CheckingEmailAddress().checkingEmailAddress("MiNombre@correo.com"))

}

class CheckingEmailAddress {
    fun checkingEmailAddress(email: String): Boolean = email.contains("@")

}