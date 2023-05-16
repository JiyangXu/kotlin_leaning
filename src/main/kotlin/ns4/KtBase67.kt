package ns4


//TODO : 67 Kotlin Map read
//1. [] if we cannot find return null
//2. getOrDefault
//3. getOrElse
//4. like Java throw Exception

fun main() {
    val myMap: Map<String, Double> = mapOf<String, Double>("Info" to (65.4), "is" to (12.3))
//    background heavy load
    println(myMap["Info"])
//    if cannot find return null
    println(myMap["111"])
    println(myMap.get("111")) //this is same as []

//    2
//    set a default value if the key is does not exist
    println()
    println(myMap.getOrDefault("123", "123"))
    println(myMap)
//    3
//  found return value otherwise return the lambda value
    println()
    println(myMap.getOrElse("Info") {
        "not found"
    })

//    4
//    do not use this method
    println(myMap.getValue("111"))
}
