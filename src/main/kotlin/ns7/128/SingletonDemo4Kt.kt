package ns7.`128`

//4.
class SingletonDemo4Kt private constructor() {
    companion object {
        val instance: SingletonDemo4Kt by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { SingletonDemo4Kt() }
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo4Kt.instance.show()
}
