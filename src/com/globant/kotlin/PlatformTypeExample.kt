package com.globant.kotlin

import com.globant.java.Student

fun main(args: Array<String>) {
    var student: Student = Student("abc", "pqr")

    var firstName: String = student.firstName
    var lastName: String? = student.lastName
    var studentName: String = student.name
    //var id: String? = student.id
    //student.setId(null)
    /*var name: Int = student.firstName*/
}