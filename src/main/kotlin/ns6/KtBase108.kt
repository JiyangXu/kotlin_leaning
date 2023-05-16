package ns6

class KtBase108<INPUT>(vararg objects: INPUT, var isR: Boolean = true) {
    // generic read only type
    val objectArray: Array<out INPUT> = objects

    //    1. five return types
    fun getR(): Array<out INPUT>? = objectArray.takeIf { isR }
    fun getR1(): Any = objectArray.takeIf { isR } ?: "the value is null"

    operator fun get(index: Int): INPUT? = objectArray[index].takeIf { isR }
}

fun <INPUT> inputObj(item: INPUT) {
//    println((item as String).length) // in generic wo normally do not do this way
//    using String? can receive null

    println((item as String?)?.length ?: "the value is null")
}

//TODO : 108 Kotlin [ ]
//1. return value change define
//2. pass null to generic
fun main() {
    inputObj("Thomas")
    inputObj(null)

    val p1 = KtBase108("12", "345", "567")
    for (index in 0..2) {
        println(p1[index])
    }
}
