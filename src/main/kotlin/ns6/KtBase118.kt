package ns6


val String.myInfo: String
    get() = "the current info is ${this}"

fun String.showPringLn(): String {
    println("this is the extend function $this")
    return this
}

//TODO : 118 Kotlin attributes extend

fun main() {
    val str: String = "ABC"
    str.myInfo.showPringLn()
}
