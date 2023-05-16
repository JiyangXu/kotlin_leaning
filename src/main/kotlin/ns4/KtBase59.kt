package ns4


//TODO : 59 Kotlin mutator
//1. mutator += and -=
//2. removeIf

fun main() {
//    1
    val list: MutableList<String> = mutableListOf("info", "is", "here")

    list += "add info 1"
    list += "add info 2"
    list -= "info"
    println(list)

//    2
//    list.removeIf { true }  // it will remove all the items automatically

    list.removeIf { it.contains("info") } // if it contains info the value is true then remove
    println(list)
}
