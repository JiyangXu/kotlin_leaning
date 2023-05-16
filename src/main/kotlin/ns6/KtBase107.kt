package ns6

//1.

class KtBase107<T>(vararg val objects: T, var isMap: Boolean) {
    //     out T read only
//     no matter val or var
    val objectArray: Array<out T> = objects

    //    2. showObj(index)
//    fun showObj(): Array<out T>? = objectArray.takeIf { true }
    fun showObj(index: Int): T? = objectArray[index].takeIf { isMap } ?: null

    //    3. mapObj(index, change lambda)
    fun <O> mapObj(index: Int, mapAction: (T?) -> O): O? {
        return mapAction(objectArray[index].takeIf { isMap })
    }
}

//TODO : 107 Kotlin vararg (dynamic parameters)
// 1. objectArray:Array<T>
// 2. showObj(index)
// 3. mapObj(index, change lambda)
// 4. p.showOBj p.mapObj(int -> str)
// 5. p type it type

fun main() {
    val p: KtBase107<Any?> = KtBase107("info", false, 23423, isMap = true)
    println(p.showObj(0))
    println(p.showObj(1))
    println(p.mapObj(2) {
        it.toString()
        it.toString().length
    })
}
