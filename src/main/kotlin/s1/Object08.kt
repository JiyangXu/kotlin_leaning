package s1

fun main() {
    val week = 6

    val info = when(week){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> println("not working day")
    }
    println(info)
}