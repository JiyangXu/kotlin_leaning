package ns6

fun String?.outputStringValueFun(defaultValue: String) = println(this ?: defaultValue)

//TODO : 119 Kotlin null extend

fun main() {
    val infoValue: String? = null
    infoValue.outputStringValueFun("The default value 1")

    val name = "Info"
    name.outputStringValueFun("This is default value 2")
}
