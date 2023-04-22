package ns4


//TODO : 60 Kotlin set creation and get item

fun main() {
    val set: Set<String> = setOf("info", "is", "here", "here") // set would not contain duplicated items
    println(set)
//    set[0] //set does not have this method
    println(set.elementAt(3))
    println(set.elementAtOrElse(3) { "out of boundary" })
    println(set.elementAtOrElse(0) { "out of boundary" })
//    normally with ?:
    println(set.elementAtOrNull(3))
}
