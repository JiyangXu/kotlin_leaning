package ns5

// normal class
class ResponseResultBean(var msg: String, var code: Int, var data: String)

//set get constructor

//data class
data class ResponseResultBean2(var msg: String, var code: Int, var data: String)
//set get constructor deconstruction copy toString hashcode and equals

//TODO : 91 Kotlin Data class
//1. normal and data class toString theory
//2. == and ===
//3. normal class == background
//4. data class == background
fun main() {
    println(ResponseResultBean("Login success", 200, "Login success...."))
//    :Any() toString() print address
    println(ResponseResultBean2("Login success", 200, "Login success...."))
//    override :Any() the toString() method

    println()

//    the two values are not equal
    println(
        ResponseResultBean("Login success", 200, "Login success....") == ResponseResultBean(
            "Login success",
            200,
            "Login success...."
        )
    )
    //Any class equals implement (ResponseResultBean1) reference obj compare ResponseResultBean1 object reference
//    so this is false

    println(
        ResponseResultBean2("Login success", 200, "Login success....") == ResponseResultBean2(
            "Login success",
            200,
            "Login success...."
        )
    )
//    parent Any class equals is overrideed by the data class equals so it will call the child equals fun and compare teh values
}
