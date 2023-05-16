package ns4


//TODO : 64 Kotlin integrate list and function
//1. list
//2. convert list to set
//3. convert set to List and remove duplicate items
//4. remove duplicate items using distinct
fun main() {
    val list: MutableList<String> = mutableListOf("info", "info", "is", "here", "here")
    println(list)
    val set = list.toSet();
    println(set)

    val list2 = list.toSet().toList()

//    distinct using to mutable set and then to list
    println(list.distinct())
}
