package ns3

/*
* Built-in function
*
* apply:
* 1. apply fun return value is always the value itself it would not change
* 2. apply fun has this == value itself
*
* let:
* 1. let return value will be changed according to the last line
* 2. let fun has it == value itself
* */
//TODO : 51 Kotlin let

//1.normal method
//2.let method
//3.normal check null and return
//4.let method check null and return
fun main() {
//  1
    val list = listOf<Int>(2, 3, 4, 5, 6)
    val value1 = list.first()
    val result1 = value1 + value1
    println(result1)
//    2
    val value2 = list.let {
//        the last line is return value
//        apply last line is does not matter
//        because to apply will return the value itself
        it.first() + it.first()
    }

    println(value2)

    println()

    println(getMethod1(null))

    println(getMethod2(null))

}
// 3
//fun getMethod1(value: String?): String {
//    return if (value == null) "the value is null" else "welcome back ${value}"
//}

fun getMethod1(value: String?) = if (value == null) "the value is null" else "welcome back ${value}"

// 4

fun getMethod2(value: String?) = value?.let { "welcome ${it}" } ?: "this value is null"
