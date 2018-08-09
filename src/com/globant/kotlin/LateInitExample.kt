package com.globant.kotlin

class MyService {
    fun performAction(): String = "foo"
}

class MyTest/*(lateinit var a: MyService)*/ {
    //@Inject
    private lateinit var myService: MyService
    /*get() = myService
    set(value) {myService = value}*/

    /*lateinit*/ var num: Int
    var label: String
    var nullableLabel: String?

    constructor() {
        num = -1
        label = "Default"
        nullableLabel = ""
    }

    fun setUp() {
        myService = MyService()
    }

    fun testAction() {
        println(myService.performAction())
    }
}

fun main(args: Array<String>) {
    var test: MyTest = MyTest()
    test.testAction()
}