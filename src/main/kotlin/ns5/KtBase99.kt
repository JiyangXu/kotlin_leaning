package ns5

data class LoginRequest(var info: String)

//TODO : 99 Kotlin data class condition
// circumstance 1: server response JavaBean LoginResponseBean
// circumstance 2: data class must have at lest one perimeter constructor
// circumstance 3: data class has perimeter , var and val
// circumstance 4: data class not use abstract , open , sealed, inner operator
// circumstance 5: requirement compare, copy, toString, destruction etc. we can use data class
fun main() {

}
