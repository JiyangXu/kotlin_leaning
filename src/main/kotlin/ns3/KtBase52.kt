package ns3


//TODO : 52 Kotlin run
//1. run fun feature delay the string
//2. named fun adjust isLong
//3. named fun check text showText
//4.named fun add [] mapText
//5.named output
fun main() {
    val str = "Info is here"

//    named fun run
    str.run(::isLong)
        .run(::showText)
        .run(::mapText)
        .run(::println)
//end named fun
//    named fun let

    str.let(::isLong)
        .let(::showText)
        .let(::mapText)
        .let(::println)
//    end named fun let

//    anonymous fun
    str.run {
        if (length > 5) true else false
    }.run {
        if (this) "The string is pass" else "It is not a valid string"
    }.run {
        "[$this]"
    }
//        .run {
//        println("anonymous the final step for run ${this}")
//    }
        .run(::println)
//    end anonymous fun
}

fun isLong(str: String) = if (str.length > 5) true else false

fun showText(isLong: Boolean): String {
    return if (isLong) "The string is pass" else "It is not a valid string"
}

fun mapText(str: String): String {
    return "named fun this string has [] [${str}]"
}
