package ns6

import java.util.*

// 1. String type output length
fun <T> T.showContentInfo() =
    println(if (this is String) "this is String ${length}" else "this is not String ${this}")

fun <T> T.showTime() =
    println("the time is ${Date(System.currentTimeMillis())}")

fun <INPUTTYPE> INPUTTYPE.showTypeAction() {
    when (this) {
        is String -> println("this is string")
        is Int -> "this is Int"
        else -> "unknow type"
    }
}

//TODO : 116 Kotlin extend generic
// 1. String type output length
// 2. display call time
// 3. display caller type

fun main() {
    345.showContentInfo()
    'C'.showContentInfo()
    "Info".showContentInfo()

    345.showTime()
    'C'.showTime()
    "Info".showTime()

    345.showTypeAction()
    'C'.showTypeAction()
    "Info".showTypeAction()
}
