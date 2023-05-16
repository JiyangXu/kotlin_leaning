package ns3

//TODO : 41 Kotlin Exception handler
fun main() {
    try {
        var info: String? = null

        checkException(info)

        println(info!!.length)
    } catch (e: Exception) {
        println("upper level $e")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("something wrong please check")
