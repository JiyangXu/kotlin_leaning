package ns2

//TODO : 34 Kotlin named fun and anonymous fun
fun main() {
    showPersonInfo("info", 99, 'M', "study Kotlin") {
        println("result $it")
    }

    showPersonInfo("info1", 11, 'F', "learn C++", ::showResultImpl)
}

fun showResultImpl(result: String) {
    println("the final result is $result")
}

inline fun showPersonInfo(name: String, age: Int, sex: Char, study: String, showResult: (String) -> Unit) {
    val str = "name:${name} age: ${age}, sex:${sex}, study:${study}"
    showResult(str)
}
