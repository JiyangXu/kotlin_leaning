package ns5

data class KtBase92(var name: String, var age: Int) {
    //primary constructor
    var coreInfo: String = ""

    init {
        println("primary constructor has been called")
    }

    //secondary constructor
    constructor(name: String) : this(name, 99) {
        println("secondart constructor")
        coreInfo = "add information"
    }

    override fun toString(): String {
        return "toString name : ${name}, age: ${age}, info :${coreInfo}"
    }

    /*
       why copy function toString fun only has two perimeters
       default toString  and hashCode equals etc.. only for the primary constructor, do not care secondary constructor

    *

     public String toString(){
    *   return "KtBase92(name="+this.name+",age="+this.age+")";
    *
    * }
    * */
}
//TODO : 92 Kotlin copy fun learning

fun main() {
    val p1 = KtBase92("this is info")
    println(p1)

    val newP2 = p1.copy("copy", 23)
    println(newP2)

//    copy toString hashCode equals
//    when we use copy we have to consider the secondary constructor
}
