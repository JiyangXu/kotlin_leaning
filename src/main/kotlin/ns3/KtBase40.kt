package ns3

//TODO : 40 Kotlin unite null operation
fun main() {
    var info: String? = "info"

    info = null
    println(info ?: "the info is null")

//    using let and ?:

    println(info?.let {
        "$it is not null"
    } ?: "the info is null second")
}
