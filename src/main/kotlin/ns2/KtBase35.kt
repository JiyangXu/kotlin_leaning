package ns2

//TODO : 35 Kotlin null feature
fun main() {
//  TODO first circumstance is default value cannot be null, cannot set the value to null
    var name: String = "info"
//    name = null
    println(name)
//    TODO second declare the value can be null
    var name2: String?
    name2 = null
    println(name2)
}
