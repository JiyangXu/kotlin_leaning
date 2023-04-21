package ns2

//TODO : 29 Kotlin define a perimeter which is fun in a fun
//TODO hard
fun main() {
    loginAPI("info", "12344") { mes: String, code: Int ->
        println("login message ${mes}, code ${code}")
    }
}

//mimic SQLServer

const val USER_NAME_SAVE_DB = "info"
const val USER_PWD_SAVE_DB = "123456"

fun loginAPI(username: String, userpassword: String, responseResult: (String, Int) -> Unit) {
    if (username == null || userpassword == null) {
        TODO("username and password is null") //it has an issue terminate this application
    }

    if (username.length > 3 && userpassword.length > 3) {
        if (webServiceLoginAPI(username, userpassword)) {
            println("success")
            responseResult("login success", 200)
        } else {
            responseResult("login error", 400)
        }
    } else {
        TODO("username and password is not valid")
    }
}

private fun webServiceLoginAPI(name: String, password: String): Boolean {
    return if (name == USER_NAME_SAVE_DB && password == USER_PWD_SAVE_DB) true else false
}
