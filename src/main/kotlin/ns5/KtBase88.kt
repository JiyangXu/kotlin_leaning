package ns5

interface RunnableKt {
    fun run()
}


open class KtBase88 {
    open fun add(info: String) {
        println("add function ${info}")
    }

    open fun del(info: String) = println("KtBase88 del : ${info}")
}

//TODO : 88 Kotlin Object expression
//1. add del printLn
//2. anonymous object expression
//3. named function implement function
//4. interface(Java) for object expression
fun main() {
//    anonymous expression
    val p = object : KtBase88() {
        override fun add(info: String) {
            super.add(info)
        }

        override fun del(info: String) {
            super.del(info)
        }
    }
    p.add("info")
    p.del("del")

    //>>>>>>>>>>>>>>>>>>>>>
    val p2 = KtBase88Impl()
    p2.add("info")
    p2.del("del")

//    java interface use KT obj method one
    val p3 = object : Runnable {
        override fun run() {
            println("Runnable run...")
        }
    }
    p3.run()
//    java interface for Java
    val p4 = Runnable {
        println("Runnable run 2 ....")
    }
    p4.run()

//    KT interface by using KT obj expression
    object : RunnableKt {
        override fun run() {
            println("this is KT interface implement")
        }
    }.run()

//    KT interface by using java
//    conclusion
//    java interface has two options to implement but KT only has one function
//    object :

}

class KtBase88Impl : KtBase88() {
    override fun add(info: String) {
        println("this is add named function : ${info}")
    }

    override fun del(info: String) {
        println("this is del named function :${info}")
    }
}
