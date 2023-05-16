package ns4

class KtBase74(var name: String) { //this is primary constructor
    //    secondary constructor must call primary and then use, otherwise does not work
    constructor(name: String, sex: Char) : this(name) {
        println("2 perimeters name : $name, sex : $sex")
    }

    constructor(name: String, sex: Char, info: String) : this(name) {
        println("3 perimeters name : $name, sex : $sex, info: $info")
    }
}

//TODO : 74 Kotlin primary and secondary constructor

fun main() {
    val p = KtBase74("info")

    KtBase74("T", 'M')

    KtBase74("T", 'M', "Info")
}
