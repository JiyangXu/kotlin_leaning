package s1

//TODO Nothing
fun main() {
    show(-1)
}

private fun show(number :Int){
    when(number){
        -1 -> TODO("Not valid score")
        in 0..59 -> println("faild")
        in 60..80-> println("pass")
        in 80..100-> println("good")
        else-> println("not inclued")
    }
}