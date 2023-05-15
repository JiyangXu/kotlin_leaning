package ns7.`128`

class SingletonDemo2Kt {
    companion object {
        private var instance: SingletonDemo2Kt? = null
            get() {
                if (field == null) {
                    field = SingletonDemo2Kt()
                }
                return field
            }

        fun getInstanceAction(): SingletonDemo2Kt {
            return instance!!
        }
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo2Kt.getInstanceAction().show()
}
