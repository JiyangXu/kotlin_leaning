package ns5

class KtBase89 {
    companion object {
        val info = "info"

        fun showInfo() = println("display ${info}")
    }
}

//TODO : 89 Kotlin Companion Objects
//KT does not have static so companion is more like static
//no matter how many times new KtBase89, the companion object only created once
//companion object only initializes once
fun main() {
    println(KtBase89.info)
    println(KtBase89.showInfo())
}
