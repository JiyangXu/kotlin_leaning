package ns2

//TODO : 31 Kotlin inline
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
    loginAPI3("info", "123456") { mes: String, code: Int ->
        println("login message ${mes}, code ${code}")
    }
}

//mimic SQLServer

const val USER_NAME_SAVE_DB3 = "info"
const val USER_PWD_SAVE_DB3 = "123456"

//this fun is using lambda we need to use inline
//otherwise this will cause efficient
// the inlin has to be used in private fun
//mimic loginAPI
private inline fun loginAPI3(username: String, userpassword: String, responseResult: (String, Int) -> Unit) {
    if (username == null || userpassword == null) {
        TODO("username and password is null") //it has an issue terminate this application
    }

    if (username.length > 3 && userpassword.length > 3) {
        if (webServiceLoginAPI3(username, userpassword)) {
            println("success")
            responseResult("login success", 200)
        } else {
            responseResult("login error", 400)
        }
    } else {
        TODO("username and password is not valid")
    }
}

// this fun does not use lambda  do  not need inline
private fun webServiceLoginAPI3(name: String, password: String): Boolean {
    return if (name == USER_NAME_SAVE_DB && password == USER_PWD_SAVE_DB) true else false
}
