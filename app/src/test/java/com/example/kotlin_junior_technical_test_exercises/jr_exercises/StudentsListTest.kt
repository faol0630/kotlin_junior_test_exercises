package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import com.example.kotlin_junior_technical_test_exercises.Student
import com.example.kotlin_junior_technical_test_exercises.StudentsList
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito


class StudentsListTest {

    private var studentsListMock: StudentsList? = null
    private var students: List<Student>? = null
    private var approvedList: MutableList<Student>? = null
    private var failedList: MutableList<Student>? = null

    @Before
    fun setUp() {
        studentsListMock = Mockito.mock(StudentsList::class.java)

        students = listOf(
            Student("Juan", 6.45),
            Student("Ana", 5.0),
            Student("Luis", 7.14),
            Student("Ann", 7.45),
            Student("Lee", 5.8),
            Student("John", 6.7),
            Student("Liza", 4.5),
            Student("John Doe", 3.9)
        )
        approvedList = mutableListOf<Student>()

        failedList = mutableListOf<Student>()
    }

    @After
    fun tearDown() {
        studentsListMock = null
        students = null
        approvedList = null
        failedList = null
    }

    @Test
    fun getStudentsAtLeastOnceTest(){
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
        Mockito.verify(studentsListMock, Mockito.atLeastOnce())!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
    }

    @Test
    fun getStudentsNeverTest(){
        Mockito.verify(studentsListMock, Mockito.never())!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
    }

    @Test
    fun getStudentsTimesTest(){
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
        Mockito.verify(studentsListMock, Mockito.times(2))!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
    }

    @Test
    fun getStudentsCallRealMethodTest(){
        given(studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)).willCallRealMethod()
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
        Mockito.verify(studentsListMock, Mockito.atLeastOnce())!!.getStudents(students!!, approvedList!!, studentsListMock!!::approvedStudentsFn)
    }

    @Test
    fun failedStudentsFnAtLeastOnceTest(){
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
        Mockito.verify(studentsListMock, Mockito.atLeastOnce())!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
    }

    @Test
    fun failedStudentsFnNeverTest(){
        Mockito.verify(studentsListMock, Mockito.never())!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
    }

    @Test
    fun failedStudentsFnTimesTest(){
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
        Mockito.verify(studentsListMock, Mockito.times(2))!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
    }

    @Test
    fun failedStudentsFnCallRealMethodTest(){
        given(studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)).willCallRealMethod()
        studentsListMock!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
        Mockito.verify(studentsListMock, Mockito.atLeastOnce())!!.getStudents(students!!, approvedList!!, studentsListMock!!::failedStudentsFn)
    }


}