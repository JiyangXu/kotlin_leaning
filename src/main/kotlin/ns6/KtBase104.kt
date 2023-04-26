package ns6

//1. return any type, utilizing Boolean to control return type, takeIf
class KtBase104<T>(private val isR: Boolean, private val obj: T) {
    fun getObj(): T? = obj.takeIf { isR }
}

//TODO : 104 Kotlin generic function
// 1. return any type, utilizing Boolean to control return type, takeIf
// 2. four objects print
// 3. print object + run + ?:
// 4. print object + apply + ?:
// 5. show(t:T) + apply + ?:
fun main() {
    val stu1 = Student("info", 11, 'M')
    val stu3 = Student("info2", 12, 'F')
    val tea1 = Teacher("info3", 1234, 'M')

//    print 3 objects
    println(KtBase104(true, stu1).getObj())
    println(KtBase104(true, stu3).getObj())
    println(KtBase104(true, tea1).getObj())

    println(KtBase104(false, stu1).getObj() ?: "this is null")

//    run and ?:
    val r: Any = KtBase104(true, stu1).getObj()?.run {
        println(this)
        99//Int
    } ?: println("the value is null") //UNIT

    println(r)


    //4. print + apply +?:

    KtBase104(true, stu3).getObj().apply {
        if (this == null) {
            println("this will return null")
        } else {
            println("universal $this")
        }
    }

    //5. show(t: T) + also + ?:

    fun <B> show(item: B) {
        item?.also { println("universal obj is $it") } ?: println("the item is null")
    }

    fun <B> show2(item: B) {
        val r1: B = item?.also { println("universal obj is $it") }!!
        println(r1)
    }

    println(show2("123"))
}
