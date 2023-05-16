package ns5

sealed class Exam1 {

    // object? Franction1 --- Franction3 do not need any perimeter so we use object
    object FRACTION1 : Exam1() //NOT PASS
    object FRACTION2 : Exam1()// PASS
    object FRACTION3 : Exam1()// GOOD

    // if Fractions4 using object , it does not make any sense, we do have obj 1 and obj 2
    class FRACTION4(var studentName1: String) : Exam1()// EXCELLENT

//    var studentName: String? = "1231"
}

class Teacher1(private val exam: Exam1) {
    fun show(): String {
        return when (exam) {
            is Exam1.FRACTION1 -> "not pass"
            is Exam1.FRACTION2 -> "pass"
            is Exam1.FRACTION3 -> "good"
            is Exam1.FRACTION4 -> "excellent ${(this.exam as Exam1.FRACTION4).studentName1}"
//            else -> due to we are using enum, it is a kind of algebraic data type so we do not need the else
//            because when express is clear , only has 4 types
        }
    }
}

//TODO : 98 Kotlin sealed class

fun main() {
    println(Teacher1(Exam1.FRACTION4("123")).show())

    println(Exam1.FRACTION1 === Exam1.FRACTION1) // this is obj only create once

    println(Exam1.FRACTION4("AAA") === Exam1.FRACTION4("AAA")) // this is class they are going to use different memory
}
