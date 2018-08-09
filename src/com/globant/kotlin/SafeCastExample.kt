package com.globant.kotlin

class Person(val firstName: String, val lastName: String) {

    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }
}

fun main(args: Array<String>) {
    val person1: Person = Person("John", "Z")
    //val person2: Person = Person("Tom", "J")
    val person3: String = "James"

    println(person1.equals(person3))
}
