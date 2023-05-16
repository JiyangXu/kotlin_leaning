package ns4


//TODO : 60 Kotlin iterate the list

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list) // this is not iterate

//    for
    for (i in list) {
        println("the item is $i")
    }

//    forEach
    list.forEach { s ->
        println("this is using foreach $s")
    }
//    list foreachIndexed
    list.forEachIndexed { index, item ->
        println("this with index $index , and item is $item")
    }
}
