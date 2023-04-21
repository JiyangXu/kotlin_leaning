package s2

import Response
//TODO 30.defin a function in the function *************
fun main() {
    //first way
    loginAPI2("jiyang","12345",{ msg:String, code:Int->
        println("project 8 msg:$msg, code:$code")
    })

    //second way
    loginAPI2("jiyang","12345", responseResult = { msg:String, code:Int->
        println("project 8 msg:$msg, code:$code")
    })

    //third way
    loginAPI2("jiyang","12345"){ msg:String, code:Int->
        println("project 8 msg:$msg, code:$code")
    }
}

const val USER_NAME_SERVE_DB2="jiyang"
const val USER_PWD_SERVE_DB2= "12345"

fun loginAPI2(username: String, userpassword:String, responseResult:(String, Int) -> Unit){
    if(userpassword == null){
        TODO("")
    }
    return if(username.length >3 && userpassword.length >3){
        if(webServiceLoginAPI2(username,userpassword)){
            responseResult("login success", 200)
        }else{
            responseResult("login filed", 400)
        }
    }else{
        TODO("user name and password not valid")
    }
}

private fun webServiceLoginAPI2(name: String, password:String) : Boolean{
    return name == USER_NAME_SERVE_DB2 && password == USER_PWD_SERVE_DB2
}