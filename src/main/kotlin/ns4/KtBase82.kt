package ns4

class KtBase82(_info: String) {
    private val info = _info

    val len: String = getInfo()

    // change this line to the first line solve the isseu
//    private val info = _info

    private fun getInfo() = info

}

//TODO : 82 Kotlin trap 3
//reference the Kotlin sequence
// variable number is not initialization before use
fun main() {
    println("the info length is : ${KtBase82("123").len.length}")
}
