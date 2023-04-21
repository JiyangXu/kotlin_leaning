package ns1

//TODO : 16 Kotlin function
fun main() {
    method01(99, "lee")
}

//default public
//kotlin fun is more make sense input and then output
private fun method01(age: Int, name: String): Int {
    println("you name is ${name}, your age is ${age}")
    return 200
}
