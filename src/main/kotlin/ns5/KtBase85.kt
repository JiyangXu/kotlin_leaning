package ns5


open class Person3(val name: String) {
    fun showName() = "Person's name is $name"

    //KT all fun is default value is final , cannot be inherited
    open fun myPrintln() = println(showName())

    fun methodPerson() = println("this is parent method...") //parent method
}

class Student3(val subName: String) : Person3(subName) {
    override fun myPrintln() {
        println("child class display ${subName}")
    }

    fun methodStudent() = println("I am the child method....") //child method
}

//TODO : 85 Kotlin smart type convert

fun main() {
    val p: Person3 = Student3("Info")

//    if we comment out the line p could not call mehtodStudent
    (p as Student3).methodStudent()
//    refer the above line
    p.methodStudent()
//        (p as Student3).methodStudent()
//        p.methodStudent()

}
