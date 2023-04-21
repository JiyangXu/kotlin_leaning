package ns2

//TODO : 45 Kotlin replace encoding and decoding
fun main() {

    val sourcePwd = "ABCDEFGHIJKLMN"

    println("original password $sourcePwd")

    val r1 = sourcePwd.replace(Regex("[ADF]")) {
        when (it.value) {
            "A" -> "1"
            "D" -> "2"
            "F" -> "3"
            else -> it.value
        }
    }
    println(r1)


//    decoding
    val sourcePwdNew = r1.replace(Regex("[123]")) {
        when (it.value) {
            "1" -> "A"
            "2" -> "D"
            "3" -> "F"
            else -> it.value
        }
    }

    println(sourcePwd)
}
