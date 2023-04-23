package ns4

import java.io.File


//TODO : 65 Kotlin Array
/*
* IntArray          IntArrayOf
* DoubleArray       doubleArrayOf
* LongArray         longArrayOf
* ShortArray        shortArrayOf
* ByteArray         byteArrayOf
* FloatArray        floatArrayOf
* BooleanArray      booleanArrayOf
* Array<Obj>            arrayOf         object array
* */

//1. intArrayOf for out of boundary
//2. elementAtOrElse elementAtOrNull
//3. List to Array
//4. arrayOf Array<File>
fun main() {
//    1.intArrayOf
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(intArray[0])

//    println(intArray[5]) //exception

    println()
//    2.elementAtOrElse elementAtNull
    println(intArray.elementAtOrElse(5) { -1 })
    println(intArray.elementAtOrElse(0) { -1 })

    intArray.elementAtOrNull(0)
    println(intArray.elementAtOrNull(5) ?: "this array is out of boundary")

//    3.
    val charArray = listOf('A', 'B', 'C').toCharArray()
    val stringArray = listOf<String>("123", "456", "789") //cannot do it for string
    println(stringArray)

//    4.
    val obj: Array<File> = arrayOf(File("AAA"), File("BBB"), File("CCC"))
}
