package ns5

//KT all class is default value is final , cannot be inherited
//open can remove the final keyword
open class Person(val name: String) {
    private fun showName() = "Person's name is $name"

    //KT all fun is default value is final , cannot be inherited
    open fun myPrintln() = println(showName())
}

class Student(val subName: String) : Person(subName) {
    private fun showName(): String {
        return "Child class name : $subName"
    }

    override fun myPrintln() {
        println(showName())
    }
}

//TODO : 83 Kotlin inherits and override the key word open
/*
* 1. parent class val name showName()->String myPrintline->Unit
* 2. child class myPrintlin->Unit
*
* */
fun main() {
    val person: Person = Student("123")
    person.myPrintln()
}
