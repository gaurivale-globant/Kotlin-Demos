package com.globant.kotlin

fun String?.checkIfNullOrEmpty(): Boolean =
        this == null || this.isBlank()


fun main(args: Array<String>) {
    var input: String? = null
    println(input.checkIfNullOrEmpty())
}