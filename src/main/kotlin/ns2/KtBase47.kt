package ns2

//TODO : 47 Kotlin iterate string
fun main() {
    val str = "ABCDEFGHIJKLMN"

    str.forEach { c: Char -> println(c) }
    str.forEach { println("$it") }
}
