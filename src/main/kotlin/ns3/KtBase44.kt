package ns3

//TODO : 44 Kotlin split operation
fun main() {
    val jsonText = "info,is,let"
    val list = jsonText.split(',')

//    deconstruction
    val (v1, v2, v3) = list

    println("$v1, $v2, $v3")

    println(list)
}
