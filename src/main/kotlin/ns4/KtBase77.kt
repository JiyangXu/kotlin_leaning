package ns4

// 1. create val sex: Char
class KtBase77(_name: String, val sex: Char) {
    // 2. create val mName
    val mName = _name

    init {
        val nameValue = _name //3. create the details of nameValue
        println("init module pring : nameValue : $nameValue")
    }

    constructor(name: String = "primary constructor", sex: Char = 'M', age: Int = 10) : this(name, sex) {
//        5. create secondary constructor details
        println("this is secondary constructor username : $name, sex : $sex, age : $age")
    }

    //4.
    val test = "test"
}

//TODO : 77 Kotlin constructor sequence
//1. main (name sex age)
//2. primary constructor val
//3. var mName=_name
//4. init{nameValue Print}
fun main() {
    KtBase77("Info", 'M', 23)
}
