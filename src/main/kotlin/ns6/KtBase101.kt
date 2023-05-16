package ns6

interface IUSB2 {
    //    1. var in interface could not set value
//    2. any interface val represents read only

    val usbVersionInfo: String
        get() = (1..100).shuffled().last().toString()

    //       val does not need set
    var usbInsertDevice: String
    fun insertUSBS(): String
}

class Mouse1(
    override var usbInsertDevice: String = "Mouse is using the USB"
) : IUSB2 {
    override val usbVersionInfo: String
        get() = super.usbVersionInfo

    override fun insertUSBS(): String {
        return "$usbVersionInfo, and $usbInsertDevice"
    }
}

//TODO : 101 Kotlin interface default implement
// 1.
fun main() {
    val iusb: IUSB2 = Mouse1()
    println(iusb.insertUSBS())
}
