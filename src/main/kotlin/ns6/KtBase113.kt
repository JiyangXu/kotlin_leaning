package ns6

class KtBase113(val name: String, val age: Int, val sex: Char)

fun KtBase113.show() {
    println("this is show function name : ${name}, age : ${age}")
}

fun String.addExtAction(number: Int): String {
    return this + "@".repeat(number)
}

fun String.showString() {
    return println("${this}")
}

//TODO : 113 Kotlin defined expand fun

fun main() {
    val p = KtBase113("info", 234, 'M')
    p.show()

    println("info".addExtAction(12))

    "info".showString()
}
