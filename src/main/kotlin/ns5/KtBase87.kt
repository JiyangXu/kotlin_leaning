package ns5

object KtBase87 {
    /*
    * object background
    * public static final KtBase87 INSTANCE;
    *
    * private KtBase87(){}
    *
    *
    * public final void show(){}
    *
    * static {
    *   println("KtBase87 init ...")
    * }
    *
    * */
    init {
        println("KtBase87 init ...")
    }

    fun show() {
        println("this is show function ")
    }
}

//TODO : 87 Kotlin declare Obj

fun main() {
//single instance
    println(KtBase87)
    println(KtBase87)

    println(KtBase87.show())
}
