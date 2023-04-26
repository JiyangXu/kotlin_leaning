package ns5

enum class Exam {
    FRACTION1, //NOT PASS
    FRACTION2,// PASS
    FRACTION3,// GOOD
    FRACTION4,// EXCELLENT
    ;

    var studentName: String? = null
}

class Teacher(private val exam: Exam) {
    fun show(): String {
        return when (exam) {
            Exam.FRACTION1 -> "not pass"
            Exam.FRACTION2 -> "pass"
            Exam.FRACTION3 -> "good"
            Exam.FRACTION4 -> "excellent"
//            else -> due to we are using enum, it is a kind of algebraic data type so we do not need the else
//            because when express is clear , only has 4 types
        }
    }
}

//TODO : 97 Kotlin Algebraic data type
// 1. define enum exam class
// 2. define Teacher class, using when
// 3 requirement get excellent student info
fun main() {
    println(Teacher(Exam.FRACTION1).show())
}
