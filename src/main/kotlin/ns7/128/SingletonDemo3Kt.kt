package ns7.`128`

//3.
class SingletonDemo3Kt {
    companion object {
        private var instance: SingletonDemo3Kt? = null
            get() {
                if (field == null) {
                    field = SingletonDemo3Kt()
                }
                return field
            }

        @Synchronized
        fun getInstanceAction(): SingletonDemo3Kt {
            return instance!!
        }
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo3Kt.getInstanceAction().show()
}
