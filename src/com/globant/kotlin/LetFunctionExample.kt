package com.globant.kotlin

fun sendEmailTo(email: String) {
    println("Sending email to $email...")

}

fun main(args: Array<String>) {
    var email: String? = "abc@abc.com"

    /*JAVA*/
    if (email != null) sendEmailTo(email)

    email?.let { email -> sendEmailTo(email) }

}