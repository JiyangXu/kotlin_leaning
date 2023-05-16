package ns5

// in kotlin all class implicit to inherit the Any() it is default
//Any is KT designed rule: we could not see the implement, that is for all platforms
class Obj1 : Any() {

}

//TODO : 86 Kotlin Any super class
//Any == java Object
fun main() {
    println(Obj1().toString())
}
