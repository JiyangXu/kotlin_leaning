package ns3

import kotlin.math.roundToInt

//TODO : 49 Kotlin Double converts to Int round
fun main() {
    println(6.555.toInt())

    println(553.5323.roundToInt()) // round

    println(5.33.roundToInt())//round

//    keep the 3 letters after .
//    f is flot type must be used
    val r: String = "%.3f".format(123.33333)
    println(r)
}
