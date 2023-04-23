package ns4


//TODO : 66 Kotlin Map

fun main() {
    val myMap: Map<String, Double> = mapOf<String, Double>("Info" to (65.4), "is" to (12.3))

    val myMap1 = mapOf(Pair("info", 43.3), Pair("is", 44.2))
    println(myMap)
    println(myMap1)
}
