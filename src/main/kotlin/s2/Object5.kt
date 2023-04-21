package s2

// TODO type deduction
fun main() {
    // Anonymous Function
    // Function name : must have permiter type and return type
    // Function = type deduction accoridng to the return type
    val method1 ={v1:Double, v2:Float, v3:Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }
    println(method1(1.5,2.3f,3))

    val method2 ={
        34.5
    }
    println(method2())

    val method3={number:Int ->
        number
    }
    println(method3(9))
}