package ns4

class KtBase75(var name: String = "primary constructor") { //this is primary constructor
    //    secondary constructor must call primary and then use, otherwise does not work
    constructor(name: String = "secondary constructor", sex: Char = 'M') : this(name) {
        println("2 perimeters name : $name, sex : $sex")
    }

    constructor(name: String = "third constructor", sex: Char = 'F', info: String = "Info") : this(name) {
        println("3 perimeters name : $name, sex : $sex, info: $info")
    }
}

//TODO : 75 Kotlin primary and secondary constructor default perimeter

fun main() {
    val p = KtBase75("info")

    KtBase75("T", 'M')

    KtBase75("T", 'M', "Info new")
}
