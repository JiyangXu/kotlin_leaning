package ns5


//TODO : 94 Kotlin operators override
class AddClass(number1: Int, number2: Int)

data class AddClass2(var number1: Int, var number2: Int) {
    operator fun plus(p1: AddClass2): Int {
        return (number1 + p1.number1) + (number2 + p1.number2)
    }
}

fun main() {
//    KT plus represents +
    println(AddClass2(1, 1) + AddClass2(2, 3))
}
