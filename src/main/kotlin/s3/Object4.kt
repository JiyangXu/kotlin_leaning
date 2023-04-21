package s3

const val INFO= "This is Kotlin practice"
//TODO 43
fun main() {
    val indexOf= INFO.indexOf("i")
    val value1: String?=null
    var value2: Boolean = false

    checkNotNull(value1)
    requireNotNull(value1)
    require(value2)
}
