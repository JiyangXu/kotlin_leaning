package s2

//TODO it key word
fun main() {
    val methodAction : (Int, Int, Int) -> String ={ n1,n2,n3->
        val number = 234

        println("$number jiyang, n1:$n1, n2:$n2, n3:$n3")
        "$number jiyang, n1:$n1, n2:$n2, n3:$n3"
    }

    methodAction(1,2,3)
    //same function
    //methodAction.invoke(1,2,3)

    val methodAction2 : (String) -> String = {
        //it is default value for the singal per
        "$it Jiyang"
    }

    val mehtodAction3 : (Double) -> String ={
        "$it Jiyang"
    }
}