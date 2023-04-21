package ns1

//TODO : 14 Kotlin when expression
//this is like the switch
//when has a return value
fun main() {
    val week = 5
//the return value is Any
//    because the first is String but the in else it is object
    val info = when (week) {
        1 -> "today is Monday"
        2 -> "Today is Tues"
        5 -> "Today is Friday"
        else -> {
            println("ignore which day is")
        }
    }
    println(info)
}
