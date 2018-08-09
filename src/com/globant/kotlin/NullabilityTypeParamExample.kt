package com.globant.kotlin

fun <T> printHashCodeNullable(t: T) {
    println(t?.hashCode())
} //Here, T is Any?


fun <T : Any> printHashCode(t: T) {
    println(t.hashCode())//Now “T” can’t be nullable.
}


fun main(args: Array<String>) {
    var test: String = "abc"
    var test2: String? = null

    printHashCodeNullable(test2)
    printHashCode(test)

    /*var n: Nothing? = null
    printHashCodeNullable(n)*/

    /*var a: Any? = Any()
    var s: String? = String()*/

    //var u: Unit? = null

    //Forest class parameterized with non-nullable type argument
    var forestA: Forest<Tree>
    //Forest class parameterized with nullable type argument
    //var forestB: Forest<Tree?>

    var treeList = listOf(Tree("Redwood"), Tree("Palm"))
    var forest = Forest<Tree>(treeList)
    var tree = forest.last //Inferred type Tree
    println(tree?.name) //prints: Palm

    forest = Forest<Tree>(listOf())
//error: NoSuchElementException: List is empty
    tree = forest.last
    println(tree?.name)
}

class Tree(val name: String)
//class Forest<T> //type parameter implicitly bounded by Any?
//class Forest<T : Any?> //type parameter explicitly bounded by Any?
/*class Forest<T: Tree> //type parameter bounded by Tree
(private val list: List<T>) {
    val last: T
        get() = list.last()
}*/

class Forest<T : Tree>(private val list: List<T>) {
    val last: T? //nullable type parameter
        get() = if(list.isEmpty())
            null
        else
            list.last()

    //or
    /*
        val last: T?
        get() = list.lastOrNull()
     */
}