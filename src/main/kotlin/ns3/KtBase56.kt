package ns3


//TODO : 56 Kotlin takeUnless

// takeIf and takeUnless functions are opposite
// name.takeIf{true/false} ture: return name , false return null
// name.takeUnless{true/false} false: return name, false return null
fun main() {
    val manager = Manager()

//    "info".takeIf { it =="info" }
//    "info".takeUnless { it =="info" }
//    manager.setInfoValue("123")
    val r = manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "no initialize"
    println(r)
}

class Manager {
    private var infoValue: String? = null
    fun getInfoValue() = infoValue

    fun setInfoValue(infoValue: String) {
        this.infoValue = infoValue
    }
}
