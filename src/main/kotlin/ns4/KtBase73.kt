package ns4

class KtBase73(var name: String, var sex: Char, var age: Int, var info: String) {
    fun show() {
        println(name)
        println(age)
        println(info)
        println(sex)
        println()
    }
}

//TODO : 73 Kotlin constructor define attributes

fun main() {
    val p = KtBase73(name = "info", info = "learn Kotlin", age = 22, sex = 'M')
    p.show()

}
