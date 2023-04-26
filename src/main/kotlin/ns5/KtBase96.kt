package ns5

//Limbs info
class LimbsInfo(var limbsInfo: String, var length: Int) {
    fun show() {
        println("${limbsInfo} length is ${length}")
    }
}

//TODO : 96 Kotlin Enum define function

enum class Limbs(private val limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("lefthand", 88)),
    RIGHT_HAND(LimbsInfo("righthand", 23)),
    LEFT_FOOT(LimbsInfo("lefthand", 44)),
    RIGHT_FOOT(LimbsInfo("righthand", 55)); //the last line need the ;

    // 1. WEEK keep the definition monotonous enum. all enum value must be same
// 2. enum constructor perimeters must be same as enum perimeter
    fun show() = "the limbs info: ${limbsInfo.limbsInfo} limbs length: ${limbsInfo.length}"

    fun updateData(limbsInfo: LimbsInfo) {
        this.limbsInfo.limbsInfo = limbsInfo.limbsInfo
        this.limbsInfo.length = limbsInfo.length
        println("the updated data will be:${this.limbsInfo.limbsInfo} and ${this.limbsInfo.length}")
    }
}

fun main() {

    /*
    * display enum
    * println(Limbs.show())
    * println(limbs().show())
    *
    * */

//    normal use
    println(Limbs.LEFT_HAND.show())

    Limbs.RIGHT_HAND.updateData(LimbsInfo("right hand", 100))

}
