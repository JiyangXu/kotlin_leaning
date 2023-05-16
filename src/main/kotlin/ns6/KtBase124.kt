package ns6

//TODO : 124 Kotlin flatMap
// map {it == T String Int Boolean Clear ....}
// flatMap { it == T collection1 collection2 collection3 ...}
// flatMap return collection (listOf(...))
fun main() {
    val list: List<String> = listOf("Info", "this", "here")
    val list2 = list.map {
        "the item is [$it]"
    }.flatMap {
        listOf("$it is first", "$it is second", "$it is third")
    }

    println(list2)
}
