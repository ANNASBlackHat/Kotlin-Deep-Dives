package types

fun main(args: Array<String>) {
    val mutableList = mutableListOf(1,2,3)
    val list: List<Int> = mutableList

    println(list)

    mutableList.add(4)
    println(list)
}