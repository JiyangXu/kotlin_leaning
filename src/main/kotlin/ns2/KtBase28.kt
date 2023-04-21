package ns2

//TODO : 28 Kotlin lambda
fun main() {
    val addResultMethod = { number1: Int, number2: Int ->
        "add two numbers ${number1 + number2}"
    }
    println(addResultMethod(1, 2))

//    anonymous input Int, return value is Any
    val weekResultMethod = { number: Int ->
        when (number) {
            1 -> "Monday"
            2 -> "Tuesday"
            else -> -1
        }
    }
    println(weekResultMethod(1))
}
