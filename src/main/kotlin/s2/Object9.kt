package s2

//TODO 31.defin a function in the function *************
fun main() {
    //first way
//    loginAPI3("jiyang","12345",{ msg:String, code:Int->
//        println("project 8 msg:$msg, code:$code")
//    })

    //second way
//    loginAPI3("jiyang","12345", responseResult = { msg:String, code:Int->
//        println("project 8 msg:$msg, code:$code")
//    })

    //third way
    loginAPI3("jiyang","12345"){ msg:String, code:Int->
        println("project 8 msg:$msg, code:$code")
    }
}

const val USER_NAME_SERVE_DB3="jiyang"
const val USER_PWD_SERVE_DB3= "12345"

//if the function use lambda as the per, we should use inline
//if the function use lambda as the permiter, it will cost more memory to do
//
inline fun loginAPI3(username: String, userpassword:String, responseResult:(String, Int) -> Unit){
    if(userpassword == null){
        TODO("")
    }
    return if(username.length >3 && userpassword.length >3){
        if(webServiceLoginAPI3(username,userpassword)){
            responseResult("login success", 200)
        }else{
            responseResult("login filed", 400)
        }
    }else{
        TODO("user name and password not valid")
    }
}
//if the function not use lambda as the per , do not need inline
fun webServiceLoginAPI3(name: String, password:String) : Boolean{
    return name == USER_NAME_SERVE_DB3 && password == USER_PWD_SERVE_DB3
}