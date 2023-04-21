package s1

//TODO String Template
fun main() {
    val garden= "Royal Hobart Garden"
    val time = 6
    println("Good day, go to ${garden}play, $time hours")

    val isLogin = true
    println("server reponse result: ${if(isLogin) "login success" else "login filed"} ")
}