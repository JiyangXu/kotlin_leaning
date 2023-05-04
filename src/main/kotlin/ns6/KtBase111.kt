package ns6

// SetClass generic in only for modify could not be a return type
// in T  out T declare relationship no similar function in Java
class SetClass<in T>() {
    fun set1(item: T) {
        println("set1 the item is :${item}")
    }
}

// GetClass T could not be modified only for return type
class GetClass<out T>(private val item: T) {
    fun get1(): T {
        return item
    }
}

//TODO : 111 Kotlin utilizing in and out


fun main() {
//    contravariance in T SetClass
    val p1 = SetClass<String>()
    p1.set1("info")
//    covariant out T GetClass
    val p2 = GetClass("info1")
    println(p2.get1())
}
