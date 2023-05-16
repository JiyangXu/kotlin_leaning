package ns6

//TODO : 127 Kotlin functional programming
fun main() {
    val names = listOf("info", "is", "here")
    val ages = listOf(20, 30, 40)

    names.zip(ages).toMap().map { "name is ${it.key} age is ${it.value}" }.map { println(it) }

}
