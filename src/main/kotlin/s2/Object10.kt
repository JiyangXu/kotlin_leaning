package s2

//TODO 32 funciton reference
fun main() {
    login("jiyang","12345", ::methodResponseResult)
}

fun methodResponseResult(message:String, code: Int){
    println("the final result message:$message, code:$code")
}

const val USER_NAME_SERVE_DB4="jiyang"
const val USER_PWD_SERVE_DB4= "12345"
inline fun login(name:String, password:String, responseResult:(String,Int)-> Unit){
    if(USER_NAME_SERVE_DB4 == name && USER_PWD_SERVE_DB4== password){
        responseResult("success",200)
    }else{
        responseResult("filed",400)
    }
}