package ns2

//TODO : 27 Kotlin anonymous fun type inference (deduction)
fun main() {
//    anonymous fun teh deduction type will be String
//    fun : we must declare perimeter type and return type
//    function name = this is can do the type deduction
    val method = { v1: Double, v2: Float, v3: Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }

    println(method(1.5, 2.5f, 3))

    val method2 = {
        3.15
    }
    println(method2())

    val method3 = { number: Int -> number }

    println(method3(1))
}
