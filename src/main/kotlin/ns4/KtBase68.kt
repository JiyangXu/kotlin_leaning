package ns4


//TODO : 68 Kotlin Map iterate
//3 methods
fun main() {
//  1.
    val myMap: Map<String, Double> = mapOf<String, Double>("Info" to (65.4), "is" to (12.3), Pair("here", 566.2))

    myMap.forEach {
//        it= <k,V>
//        it type Map.Entry<String, Double>
        println("key : ${it.key} , value : ${it.value}")
    }

    println()
//2.
    myMap.forEach { (key: String, value: Double) ->
        println("key : $key, value : $value")
    }
    println()
//    3.
    for (item: Map.Entry<String, Double> in myMap) {
        println("key ${item.key}, value : ${item.value}")
    }
}
