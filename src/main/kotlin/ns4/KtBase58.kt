package ns4


//TODO : 58 Kotlin list collection
//1.mutable list
//2.fixed list to mutable list
//3.mutable list to fixed list
fun main() {
//    1.
    val list: MutableList<String> = mutableListOf<String>("info", "is", "here")
    list.add("123")
    list.remove("info")
    println(list)
//    2.
    val list2 = listOf<Int>(123, 435, 345)
//    fixed list does not have fun like add and remove

//    2.
    val list3: MutableList<Int> = list2.toMutableList()
    list3.add(696969)
    list3.remove(123)

    println(list3)

//    3,
    val list4: MutableList<Char> = mutableListOf('A', 'b', 'C')

    list4.add('2')
    list4.remove('b')
    println("this is mutalbe list $list4")

    var fixedList = list4.toList()

    println("this is fixed list$fixedList")
}
