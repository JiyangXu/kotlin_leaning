package ns6

//1.
class KtBase105<T>(private val isMap: Boolean = false, val inputType: T) {
    //    mimic RxJava T is input type, R is output type
//    requirement map return type is R
    fun <R> map(mapAction: (T) -> R): R? { //The return type maybe R or Null
        return mapAction(inputType).takeIf { isMap }
    }
}

fun <I, O> map(inputValue: I, mapActionLambda: (I) -> O): O {
    return mapActionLambda(inputValue)
}

//TODO : 105 Kotlin generic change
// 1. class isMap map takeIf, what is map type
// 2. map int -> str the final receive type
// 3. map per -> stu the final type
// 4. verify type and null
fun main() {
//    2.
    val r = KtBase105(isMap = false, 1234)
        .map {
            it.toString()
        }

//    4.
    val str1: String = "OK1"
    val str2: String? = "OK2"
    println(if (r is String) "this is String" else "this is not String")
    println(if (r is String?) "this is String with null" else "this is not String")
    println(r)

//    3.
    val p2 = KtBase105(true, Persons("info", 99))
    val r2 = p2.map {
//        it == Persons obj === inputType
        println(it)
        Students(it.name, it.age)
    }
    println(r2)

    val r4 = map(123) {
        it.toString()
    }

    println("r4 is  $r4")
}

//
data class Persons(val name: String, val age: Int)
data class Students(val name: String, val age: Int)