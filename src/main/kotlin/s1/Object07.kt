package s1

fun main() {
    val number = 148

    if(number in 10..59){
        println("fail");
    }else if(number in 0..9){
        println("not good")
    }else if(number in 60..100){
        println("pass")
    }else if(number !in 1..100){
        println("not in the range")
    }
}