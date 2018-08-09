package com.globant.kotlin

fun main(args: Array<String>) {
    println(printStringLength(null))
    printAllCaps("Hello")


}

fun printStringLength(s: String?) {
    if (s != null) s.length else 0

    var length: Int? = s?.length
    println("Length of $s is $length")

}


fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}


