package ns2

//TODO : 33 Kotlin return fun
fun main() {
    var nimingFunction = show("show")

    println(nimingFunction("info", 12))
}

fun show(info: String): (String, Int) -> String {
    println("this is show $info")

    return { name: String, age: Int ->
        "this is anonymous fun the name is ${name} age is ${age}"
    }
}
