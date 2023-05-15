package ns6

//TODO : 123 Kotlin map
fun main() {
    val list = listOf<String>("Info", "this", "here")

    val list2 = list.map {
        "[$it]"
        if (it.equals("Info"))
            99
        else
            it
    }
    println(list2)
}
