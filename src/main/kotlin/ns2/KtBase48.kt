package ns2

//TODO : 48 Kotlin safety type convert
fun main() {
    val number: Int = "666".toInt()
    println(number)

//    number2 cannot be convert to double will have exception
//    val number2: Int = "666.4545".toInt()
//    println(number2)

    val number3: Int? = "222.22".toIntOrNull()
    println(number3 ?: "this is null")

    val number4: Int? = "999".toIntOrNull()
    println(number4)

}
