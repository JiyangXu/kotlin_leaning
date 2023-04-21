package s2

//TODO
fun main() {

    val methodAction : (Int, Int,Int) -> String ={number1, number2, number3 ->
        val inputVlaue = 999
        "$inputVlaue jiyang per1:$number1 , per2: $number2, per3: $number3"
    }

    println(methodAction(1, 2, 4))
}