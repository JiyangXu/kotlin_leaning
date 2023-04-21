package ns2

//TODO : 24 Kotlin fun type and implicit return
fun main() {
//    write fun
//    1.fun input and fun output : declare
    val mehtodAction: () -> String

//    2. implement the function
//    anonymous fun do not need return key word, the last line is return value
    mehtodAction = {
        val inputValue = 999
        "this is function ${inputValue}"
    }
//3. call the fun
    println(mehtodAction())
}
