package ns4

//_is a rule for define perimeters in constructor
//the perimeters are temporary input cannot use directly
//need receive it to be a variable
class KtBase72(_name: String, _sex: Char, _age: Int, _info: String) {

    var name = _name
        get() = field //cannot use private for get
        private set(value) { // can use private for set
            field = value
        }

    val sex = _sex
        get() = field
//        set(value){}// this is readony value cannot use set

    val age = _age
        get() {
            return if (field < 0) -1 else 1
        }

    val info = _info
        get() = "[${field}]"

    fun show() {
//        println(_name)
        println(name)
        println(sex)
        println(info)
        println(age)
    }
}
//TODO : 72 Kotlin Constructor

fun main() {
    val p = KtBase72(_name = "info", _info = "learn Kotlin", _age = 22, _sex = 'M')
//    println(p.name)
//    p.name = "123" //set method is private
    p.show()
}
