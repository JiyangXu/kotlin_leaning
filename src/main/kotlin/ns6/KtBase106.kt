package ns6

open class MyAnyClass(val name: String) // Parent
open class PersonClass(name: String) : MyAnyClass(name = name) //Child
class StudentClass(name: String) : PersonClass(name = name)// child
class TeacherClass(name: String) : PersonClass(name = name)//child

class DogClass(name: String)// other class

//TODO : 106 Kotlin generic restriction
// T: PersonClass same as java T extends PersonClass
// Person and other classes which inherit person class can use
// other classes cannot use this class
class KtBase106<T : PersonClass>(val inputTypeValue: T, private val isR: Boolean = true) {
    fun getObj() = inputTypeValue.takeIf { isR }
}

fun main() {
    val any = MyAnyClass("any") //Parent

    val person = PersonClass("person") //Child

    val student = StudentClass("student") // child
    val teacher = TeacherClass("teacher") // child

    val dog = DogClass("dog") // other class

    println(KtBase106(person).getObj()?.name)
}
