package ns3


//TODO : 54 Kotlin also
//this is similar as apply
//"ABCDEFGQWYWEOTRIPCGX"
fun main() {
    val str = "ABCDEFGQWYWEOTRIPCGX"

    val r: String = str.also {
        println(it.length)
    }

    str.also {
        println("the original value is ${it}")
    }.also {
        println("covert the str to lowercase ${it.lowercase()}")
    }.also {
        println("end")
    }
}

