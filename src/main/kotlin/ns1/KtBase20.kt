package ns1

//TODO : 20 Kotlin Nothing
fun main() {
    show(-1)
}

// the default return value is Unit
private fun show(number: Int) {
    when (number) {
        -1 -> TODO("not valid score")
        in 0..59 -> println("not pass")
        in 60..70 -> println("pass")
    }
}

interface A {
    fun show()
}

class AImpl : A {
    override fun show() {
//        this is not comment notice, this is Kotlin Nothing
//        like the Exception handler
        TODO("Not yet implemented")
    }

}
