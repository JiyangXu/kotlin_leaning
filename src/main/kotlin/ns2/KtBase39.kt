package ns2

//TODO : 39 Kotlin using if to test null
fun main() {
    var name: String? = null

    if (name != null) {
        var r = name.replaceFirstChar(Char::uppercaseChar)
        println(r)
    } else {
        println("name is null")
    }
}
