package com.globant.kotlin

fun main(args: Array<String>) {
    ignoreNulls("ABC")
    //ignoreNulls(null)
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}