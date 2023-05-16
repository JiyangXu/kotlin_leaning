package ns4


//TODO : 57 Kotlin create list and get items
//TODO getorelse
//TODO getornull + ?:
//index
//prevent exception
fun main() {
    val list: List<String> = listOf<String>("info", "text", "this")
//    index get value
    println(list[0])
//    println(list[3])// Exception Index 3 out of bounds for length 3
//KT does not have non pointer and array index out exception

    println(list.getOrElse(3) { "out of bounds" })

    println()

    println(list.getOrNull(3) ?: "out of bounds")
}
