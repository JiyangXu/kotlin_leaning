package ns5


//TODO : 93 Kotlin deconstruction
class Student93(var name: String, var age: Int, var sex: Char) {
    //    notice : the sequence must be from 1 with all perimeters
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

//data class
data class Student93Data(var name: String, var age: Int, var sex: Char)

fun main() {
    val (name, age, sex) = Student93("info", 23, 'M')
    println("normal class deconstructor : name: $name, age: $age, sex: $sex")

    val (name1, age1, sex1) = Student93Data("info2", 34, 'F')
//    val (_, age1, _) = Student93Data("info2", 34, 'F')

    println("data class : name:$name1, age: $age1, sex: $sex1")
//    println("data class :  age: $age1)
}
