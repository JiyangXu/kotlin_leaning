package ns6

// 1.
data class ObjectClass1(val name: String, val age: Int, val study: String)
data class ObjectClass2(val name: String, val age: Int, val study: String)
data class ObjectClass3(val name: String, val age: Int, val study: String)

class KtBase112 {
    //    all the fun will be write on the fun
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T): T? {
        val objlist: List<Any> =
            listOf(ObjectClass1("info", 22, "A"), ObjectClass2("info2", 43, "B"), ObjectClass3("info3", 34, "C"))
        val randomObj = objlist.shuffled().first()

        println("the random obj is ${randomObj}")

//        return randomObj.takeIf { it is T } as T ?: null
        return randomObj.takeIf { it is T } as T? ?: defaultLambdaAction()
    }
}

//TODO : 112 Kotlin reified
// 1. define threee Obj class
// 2. randomOrDefault function backup lambda
// 3. lists.shuffled()
fun main() {
    val final = KtBase112().randomOrDefault<ObjectClass2> {
        println("info is here")
        ObjectClass2("info4", 456, "C#")
    }
    println(final)
}
