package ns3

import java.io.File

//TODO : 50 Kotlin apply
fun main() {
    val info = "Info is here"

//    1. normal method
//    println("info string length is ${info.length}")
//    println("info the last cahr is ${info[info.length - 1]}")
//    println("info lowercase is ${info.lowercase()}")


//    2.apply method
//    info.apply feature: the return value is always info itself
//    type is String
//    val infoNew: String = info.apply {
//        println(length)
//        println(length - 1)
//        println(lowercase())
//    }

//    return the info itself
//    println(infoNew)
//    the purpose of apply is like blew
    info.apply {
        println(length)
    }.apply {
        println(length - 1)
    }.apply {
        println(lowercase())
    }

    val file = File("D:\\a.txt")
    file.apply {
        setExecutable(true)
    }.apply {
        setReadable(true)
    }.apply {
        println(readLines())
    }
}
