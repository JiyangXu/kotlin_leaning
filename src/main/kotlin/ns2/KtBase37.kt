package ns2

//TODO : 37 Kotlin using let to call
fun main() {
//    var name: String? = null
//    var name: String? = "this "
    var name: String? = ""
    val r = name?.let {
        if (it.isBlank()) {
            "info"
        } else {
            "[$it]"
        }
    }

    println(r)
}
