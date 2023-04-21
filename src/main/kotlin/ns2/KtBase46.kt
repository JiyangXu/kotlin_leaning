package ns2

//TODO : 46 Kotlin == and ===
fun main() {
//    == value compare
//    === reference compare

    val name1 = "info"
    val name2 = "info"

//    this is Java
    println(name1.equals(name2))
//    this is kotlin
    println(name1 == name2)
//this is still true
    println(name1 === name2)
}
