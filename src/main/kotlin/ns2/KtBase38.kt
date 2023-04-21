package ns2

//TODO : 38 Kotlin not null assert
fun main() {
    var name: String? = null
    name = "info"
//    println(name?.replaceFirstChar(Char::uppercaseChar))

//    no mater nanme is null or not, it will execute the code after !!
    val r = name!!.replaceFirstChar(Char::uppercaseChar)

    println(r)
//    conclusion 100% sure name has a value then use !!
}
