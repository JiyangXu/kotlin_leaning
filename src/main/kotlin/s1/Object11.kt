package s1

fun main() {
    loginAction(age=99, username = "12", phoneNumber = "1234")
}

private fun loginAction(username: String, userPassword: String = "aafdf", phoneNumber: String, age: Int){
    println("username:$username, userpassword:$userPassword, phonenumber:$phoneNumber, age:$age" )
}