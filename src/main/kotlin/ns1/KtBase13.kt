package ns1

//TODO : 13 Kotlin range expression
fun main() {
    val number = 148
//    range from ... to ...
    if (number in 10..59) {
        println("not pass")
    } else if (number in 0..9) {
        println("lower score")
    } else if (number in 60..100) {
        println("pass")
    } else if (number !in 0..100) {
        println("not valid score")
    }
}

