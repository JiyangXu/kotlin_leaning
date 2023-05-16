package ns6

//TODO : 126 Kotlin zip
fun main() {
    val name = listOf("info", "is", "here")
    val age = listOf(20, 30, 40)
//    integrate two list
    val zippedVlaue = name.zip(age)

    println(zippedVlaue)
    println(zippedVlaue.toMap())
    println(zippedVlaue.toMutableList())
    println(zippedVlaue.toMutableSet())

    zippedVlaue.forEach {
//        it == Pair<String,Int>
        println("name is ${it.first}, age is ${it.second} ")
    }

    zippedVlaue.forEach { (name, value) ->
        println("name is $name, age is $value ")
    }
}
