package ns2

const val INFO = "Info is recorded"

//TODO : 43 Kotlin Substring
fun main() {
    val indexOf = INFO.indexOf('i')
    println(INFO.substring(0, indexOf))
    println(INFO.substring(0 until indexOf)) //normal use
    println(INFO.substring(0..indexOf))
}
