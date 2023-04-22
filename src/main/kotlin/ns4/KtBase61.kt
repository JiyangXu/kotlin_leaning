package ns4


//TODO : 60 Kotlin deconstructing
//1. list and deconstructing
//2.decompile and see how java set 3 variables
//3. masking receive values for deconstruction
fun main() {
    val list: List<String> = listOf("info", "is", "here")

    var (value1, value2, value3) = list
    value1 = "OK"
    println("value1 : ${value1} value2: ${value2}, value3: ${value3}")

//    _ not receive
    val (_, n2, n3) = list
// the _is not variable, cannot print, this is filter
    println()
}
