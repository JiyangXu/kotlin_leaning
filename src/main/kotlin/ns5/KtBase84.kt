package ns5

import java.io.File

//KT all class is default value is final , cannot be inherited
//open can remove the final keyword
open class Person2(val name: String) {
    fun showName() = "Person's name is $name"

    //KT all fun is default value is final , cannot be inherited
    open fun myPrintln() = println(showName())
}

class Student2(val subName: String) : Person2(subName) {
    fun showName2(): String {
        return "Child class name : $subName"
    }

    override fun myPrintln() {
        println(showName2())
    }
}

//TODO : 84 Kotlin type convert
/*
* 1. normal child lass output
* 2. is Person Student File
* 3. is + as convert
* */
fun main() {
    val p: Person2 = Student2("123")
    p.myPrintln()

    println(p is Person2)
    println(p is Student2)
    println(p is File)

    if (p is Student2) {
        (p as Student2).myPrintln()
    }

    if (p is Person2) {
//        (p as Person2).myPrintln()  // child override the parent's function
        println((p as Person2).showName())
    }


}
