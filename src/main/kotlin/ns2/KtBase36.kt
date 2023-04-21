package ns2

//TODO : 36 Kotlin null feature
fun main() {
    var name: String? = "info"

    name = null
//    if name is null, the code after ? will not be executed
    println(name?.replaceFirstChar(Char::uppercaseChar))
}
