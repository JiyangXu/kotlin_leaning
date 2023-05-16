package ns6

data class ResponseResult(val msg: String, val code: Int)

fun Any.showPrintInContent() = println("the current content ${this}")
fun Any.showPrintInContent2(): Any {
    println("the current content ${this}")
    return this
}

//TODO : 115 Kotlin defined expand fun

fun main() {
    ResponseResult("login success", 200).showPrintInContent()

    "this is info".showPrintInContent2().showPrintInContent2().showPrintInContent2()
}
