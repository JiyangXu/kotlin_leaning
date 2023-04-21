package ns2

//TODO : 26 Kotlin it key word
fun main() {
    val methodAction: (Int, Int, Int) -> String = { number1, number2, number3 ->
        val number = 24
        println("info ${number}, ${number1},${number2},${number3}")
        "info ${number}, ${number1},${number2},${number3}"
    }
//    methodAction.invoke(1, 2, 3) same as the under function
    methodAction(1, 2, 3)

    val methodAction2: (String) -> String = { "${it}is the test" }

    println(methodAction2("aaaaa"))

    val methodAction3: (Double) -> String = { "${it} is the number" }

    println(methodAction3(3.1415))
}
