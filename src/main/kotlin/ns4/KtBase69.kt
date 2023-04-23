package ns4


//TODO : 69 Kotlin Map mutable
//1. mutable += [] put
//2. getOrPut does not have value
//3. getOrPut has value
fun main() {
//  1.
    val myMap: MutableMap<String, Double> =
        mutableMapOf<String, Double>("Info" to (65.4), "is" to (12.3), Pair("here", 566.2))

    myMap += "AAA" to (89.8)
    myMap += "BBB" to 11.1

    myMap -= "Info"
    myMap["CCC"] = 544.4

    myMap.put("EEE", 22.2) //same as []

//    2.
//    if FFF does not exist put the FFF as key and value is 5.3
    val d = myMap.getOrPut("FFF") {
        5.3
    }
//    return value is according to the value
    println(d)
    println(myMap)

//    3.
//    found is has a value do nothing
    val q = myMap.getOrPut("is") {
        5.3
    }
    println(q)
}
