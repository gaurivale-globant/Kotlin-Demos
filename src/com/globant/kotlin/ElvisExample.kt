package com.globant.kotlin

fun main(args: Array<String>) {
    //printStringLengthUsingElvis(null)

    val employee: Employee = Employee("ABC", Company("Google", null))
    printShippingLabel(employee)

}

fun printStringLengthUsingElvis(s: String?) {
    var length: Int? = s?.length ?: 0
    println("Length of $s is $length")
}

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Employee(val name: String, val company: Company?)

fun printShippingLabel(employee: Employee) {
    val address = employee.company?.address
            ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}