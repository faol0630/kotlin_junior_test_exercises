package com.example.kotlin_junior_technical_test_exercises

//Determine how many students have passed(6.0 and higher) and how many have failed
//Print both lists

fun main() {

    val studentsList = StudentsList()
    studentsList.approvedStudents
    studentsList.failedStudents

    println("Approved list:")
    println(studentsList.approvedList)

    println("Failed list:")
    println(studentsList.failedList)

    println("Students: ${studentsList.students.size}") //8
    println("Approved: ${studentsList.approved}") //4
    println("Failed: ${studentsList.failed}") //4

}

data class Student(
    val name: String,
    val score: Double
)

class StudentsList {

    var approved: Int = 0
    var failed: Int = 0

    val students: List<Student> = listOf(
        Student("Juan", 6.45),
        Student("Ana", 5.0),
        Student("Luis", 7.14),
        Student("Ann", 7.45),
        Student("Lee", 5.8),
        Student("John", 6.7),
        Student("Liza", 4.5),
        Student("John Doe", 3.9)
    )
    val approvedList = mutableListOf<Student>()

    val failedList = mutableListOf<Student>()

    fun getStudents(
        param1: List<Student>,
        param2: MutableList<Student>,
        fn: (List<Student>, MutableList<Student>) -> Unit
    ) {
        (fn(param1, param2))
    }

    val approvedStudents = getStudents(students, approvedList) { list, list2 ->
        list.forEach { i ->
            if (i.score >= 6.0) {
                list2.add(i)
                approved++
            }
        }
    }
    //made for testing only:
    fun approvedStudentsFn(list: List<Student>, list2: MutableList<Student>){
        list.forEach { i ->
            if (i.score >= 6.0) {
                list2.add(i)
                approved++
            }
        }
    }

    val failedStudents = getStudents(students, failedList) { list, list2 ->
        list.forEach { i ->
            if (i.score < 6.0) {
                list2.add(i)
                failed++
            }
        }
    }

    //made for testing only:
    fun failedStudentsFn(list: List<Student>, list2: MutableList<Student>){
        list.forEach { i ->
            if (i.score < 6.0) {
                list2.add(i)
                failed++
            }
        }
    }

}