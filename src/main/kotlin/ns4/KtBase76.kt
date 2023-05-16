package ns4

class KtBase76(username: String = "primary constructor", info: String = "Info", usersex: Char = 'M') {
    //    init module
//    this is not java static{} code module
//    this is like {}
//    we can use init perimeters in init
    init {
        println("primary constructor has been called $username, $info")
//        if the first perimeter is false, the lambda will be called
//        check username
//        the require logic is opposite
        println("user name is blank ${username.isBlank()}")
        require(username.isNotBlank()) {
            "the name is null"
        }

        require(usersex == 'F' || usersex == 'M') { "the user sex is awkward" }
    }

    constructor(username: String) : this(username, "Info") {
        println("secondary constructor has been called $username")
    }
}

//TODO : 76 Kotlin init module {}
//1. name, age, sex is primary constructor
//2. init code module
//3. temporary perimeters can be used in init module

fun main() {
//    KtBase76("info", "here")
    KtBase76("secondary")

    KtBase76("", "is", 'F')
}
