package ns4


//TODO : 63 Kotlin mutable set
//set is more like list.
fun main() {
    val set: MutableSet<String> = mutableSetOf("info", "is", "here", "here")

    set += "new"
    set += "123"
    set -= "info"
    set.add("4356")
    set.remove("is")
    println(set)
}
