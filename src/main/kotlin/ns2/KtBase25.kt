package ns2

//TODO : 25 Kotlin fun type and implicit return
fun main() {
//    write fun
//    1.fun input and fun output : declare //    2. implement the function
    val methodAction: (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputValue = 999
        "${number1} is number 1, ${number2} is number2,${number3} and ${inputValue}"
    }

    println(methodAction(1, 2, 3))
}
