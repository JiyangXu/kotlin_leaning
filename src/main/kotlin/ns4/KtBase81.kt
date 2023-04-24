package ns4

class KtBase81 {
    val info: String

    init {
        getInfoMethod()
        info = "info"
    }

    fun getInfoMethod() {
        println("info")
    }


}

//TODO : 81 Kotlin trap 2
//reference the Kotlin sequence
// variable number is not initialization before use
fun main() {
    KtBase81().getInfoMethod()
//    var p = KtBase81()
//    p.getInfoMethod()
}
