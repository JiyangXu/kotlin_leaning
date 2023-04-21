package ns1

//TODO : 17 Kotlin function default perimeters
fun main() {
    action02("lee")
}

private fun action01(name: String, age: Int) {
    println("you name is ${name}, your age is ${age}")
}

private fun action02(name: String, age: Int = 77) {
    println("you name is ${name}, your age is ${age}")
}
