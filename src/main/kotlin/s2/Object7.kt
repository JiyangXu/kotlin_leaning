package s2

import Response
//TODO 29.defin a function in the function *************
fun main() {
    val response = loginAPI("jiyang","12345")
    println("final login status: ${response.message}, code: ${response.status}")
}

const val USER_NAME_SERVE_DB="jiyang"
const val USER_PWD_SERVE_DB= "12345"

fun loginAPI(username: String, userpassword:String): Response{
    if(userpassword == null){
        TODO("")
    }
    return if(username.length >3 && userpassword.length >3){
        if(webServiceLoginAPI(username,userpassword)){
            Response("login success", 200)
        }else{
            Response("login filed", 400)
        }
    }else{
        TODO("user name and password not valid")
    }
}

private fun webServiceLoginAPI(name: String, password:String) : Boolean{
    return name == USER_NAME_SERVE_DB && password == USER_PWD_SERVE_DB
}