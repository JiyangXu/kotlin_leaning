package ns6

class KtBase103<T>(private val obj: T) { // output
    fun show() = println("print out obj = ${obj}")
}

data class Student(val name: String, val age: Int, val sex: Char)

data class Teacher(val name: String, val age: Int, val sex: Char)
//TODO : 103 Kotlin generic Class

fun main() {
    val stu1 = Student("info", 11, 'M')
    val stu3 = Student("info2", 12, 'F')
    val tea1 = Teacher("info3", 1234, 'M')

    KtBase103(stu1).show()
    KtBase103(stu3).show()
    KtBase103(tea1).show()
}
