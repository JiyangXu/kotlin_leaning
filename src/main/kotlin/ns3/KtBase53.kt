package ns3


//TODO : 53 Kotlin with

//1. named fun
//2. anonymous fun
fun main() {
    val str = "info"
//1
    val len = with(str, ::getStrlen)
    val len2 = with(len, ::getLneInfo)
    val len3 = with(len2, ::getInfoMap)
    with(len3, ::showInfo)

//    2
    with(with(with(str) {
        length
    }) {
        "your string length is ${this}"
    }) {
        println("your string is [${this}]")
    }

}

fun getStrlen(str: String): Int {
    return str.length
}

fun getLneInfo(len: Int): String {
    return "your string length is ${len}"
}

fun getInfoMap(info: String): String = "[$info]"

fun showInfo(content: String) = println(content)
