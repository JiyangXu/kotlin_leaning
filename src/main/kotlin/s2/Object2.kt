package s2

fun main() {

    //statement
//    val methodAction : () -> String

    //implement
//    methodAction={
//        "Jiyang"
//    }

    //shotcut
    val methodAction : () -> String = {
        var len = "Jiyang".count(){
            it=='a'
        }
        //do not need to use return key word
        // the last line is the return value
        len.toString()// == return ""
    }

    //call the function
    println(methodAction())
}