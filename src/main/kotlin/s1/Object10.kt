package s1

// TODO 16 Function
fun main() {
    method01(20,"zhangsan")
}

private fun method01 (age: Int =10, name :String ="lisi") : Int{
    println("Your name is: $name, your age is: $age")
    return 200
}