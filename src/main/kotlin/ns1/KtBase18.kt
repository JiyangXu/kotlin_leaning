package ns1

//TODO : 18 Kotlin named function
fun main() {
    loginAction(age = 99, password = "123", username = "123", phonenumber = "132456")
}

private fun loginAction(username: String, password: String, phonenumber: String, age: Int) {
    println("username  = ${username}, password=${password}, phonenumber=${phonenumber}, age=${age}")
}

