package ns6

interface IUSB {
    var usbVersionInfo: String
    var usbInsertDevice: String

    fun insertUSBS(): String
}

class Mouse(
    override var usbVersionInfo: String = "USB3.0",
    override var usbInsertDevice: String = "Mouse is using the USB"
) : IUSB {
    override fun insertUSBS(): String {
        return "$usbVersionInfo, and $usbInsertDevice"
    }
}

class Keyboard : IUSB {
    override var usbInsertDevice: String = "USB 3.1"
        //        set and get have field, but you did not give value to usbVersionInfo, that means the field cannot be given to set/get
        get() = field
        set(value) {
            field = value
        }
    override var usbVersionInfo: String = "Keyboard inserted USB"
        get() {
            println("your get the ${field} value")
            return field
        }
        set(value) {
            field = value
            println("your set ${value} value")
        }

    override fun insertUSBS(): String {
        return "Keyboard ${usbVersionInfo} and ${usbInsertDevice}"
    }
}

//TODO : 100 Kotlin interface
// 1. interface default operator is open
// 2. interface does not have constructor
// 3. when we implement the interface we have to override the attributes and functions
// 4. interface implement need add override keyword

fun main() {
    val iusb: IUSB = Mouse()
    println(iusb.insertUSBS())

    println()

    val iusb2: IUSB = Keyboard()
    iusb2.usbVersionInfo = "wtwetredgsagf"
    println(iusb2.insertUSBS())
}
