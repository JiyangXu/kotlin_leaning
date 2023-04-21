package ns2

//TODO : 30 Kotlin simplify the fun
//TODO hard
fun main() {
//    first
//    loginAPI2("info", "12344", { mes: String, code: Int ->
//        println("login message ${mes}, code ${code}")
//    })
//    second
//    loginAPI2("info", "12344", responseResult = { mes: String, code: Int ->
//        println("login message ${mes}, code ${code}")
//    })
//    third method
    loginAPI2("info", "12344") { mes: String, code: Int ->
        println("login message ${mes}, code ${code}")
    }
}

//mimic SQLServer

const val USER_NAME_SAVE_DB2 = "info"
const val USER_PWD_SAVE_DB2 = "123456"

fun loginAPI2(username: String, userpassword: String, responseResult: (String, Int) -> Unit) {
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
