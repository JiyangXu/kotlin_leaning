package ns2

//TODO : 23 Kotlin anonymous fun
fun main() {
    var len = "info".count()
    println(len)

//    get the char number in the string
    val len2 = "inofo".count {
//        it == i n o f o , Char
        it == 'o'
    }

    println(len2)
}
