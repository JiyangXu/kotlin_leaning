package s2


//TODO lambda
fun main() {
    val addResultMethod ={number1:Int, number2 : Int->
        "sum ${number1 + number2}"
    }

    println(addResultMethod(1, 2))

    val weekResultMethod ={number : Int->
        when(number){
            1->"Monday"
            2->"Tuesday"
            else -> -1
        }
        //the return type will be any, because it return the int and string
    }

    println(weekResultMethod(4))
}