package ns6

//TODO : 125 Kotlin filter
fun main() {
    println("125 filter")

    val infoList = listOf(
        listOf<String>("First", "is", "here"),
        listOf<String>("Second", "is", "second"),
        listOf<String>("Third", "information", "here")
    )

    val info1 = infoList.map {
        "$it"
    }

    val info2 = infoList.flatMap {
        listOf(it)
    }

    println(info1)

    println()

    println(info2)

    val list3 = infoList.flatMap { it ->
        it.filter {
            it != "Second"
        }
    }
    println(list3)
}
