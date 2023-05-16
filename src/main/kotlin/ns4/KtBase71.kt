package ns4


//TODO : 71 Kotlin Computed properties and prevent static condition
class KtBase71 {
    //    val only get no set
    val number: Int = 0

    /*
    * private int number = 0;
    *
    * public int getnumber(){
    *    return this.number
    * }
    *
    * */

//    computed properties
//    get fun override field
//    cannot initialize the value here

    val number2: Int
        get():Int {
            return (1..100).shuffled().first()
        }
    /*
    * background
    *
    * we cannot see the number2 defined attribute
    *
    * public int getNumber2(){
    *   return (1..100).shuffled().first()
    * }
    *
    * */

    val info: String? = /*null*/ ""

    //    prevent static condition the variable could be null or empty, must use prevent condition,this is the rule of KT
    fun getShowInfo(): String {
//also return info itself
//        so use let
        return info?.let {
            if (it.isBlank()) "the value is blank"
            else
                "the final result is $it"
        } ?: "the value is null, please check"
    }
}

fun main() {
    println(KtBase71().number)

    println(KtBase71().number2)

    println(KtBase71().getShowInfo())
}
