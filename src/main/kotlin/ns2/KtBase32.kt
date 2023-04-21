package ns2

//TODO : 32 Kotlin fun reference
//TODO hard
fun main() {
//lambda blongs to fun's obj
//    we need to change the normal fun to the fun's obj
    login("info", "123456", ::methodResponseResult)
}

fun methodResponseResult(msg: String, code: Int) {
    println("the result of login ${msg} , code is ${code}")
}

const val USER_NAME_SAVE_DB4 = "info"
const val USER_PWD_SAVE_DB4 = "123456"

inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (USER_NAME_SAVE_DB4 == name && USER_PWD_SAVE_DB4 == pwd) {
        responseResult("login success", 200)
    } else {
        responseResult("login filed", 400)
    }
}
