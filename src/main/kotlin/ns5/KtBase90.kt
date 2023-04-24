package ns5

//TODO nesting class
//inner class features : inner class can access outside class
//                       out class can access inner class
class Body(_bodyInfo: String) {
    val bodyInfo = _bodyInfo

    fun show() {
        Heart().run()
    }

    //    default : the inner class could not access the out side class, must add modifier inner
    inner class Heart {
        fun run() = println("heart class access body info $bodyInfo")
    }

    inner class Kidney {
        fun work() {
            println("this is kidney access body class info ${bodyInfo}")
        }
    }

    inner class Hand {
        inner class LeftHand {
            fun run() = println("left hand access body info ${bodyInfo}")
        }

        inner class RightHand {
            fun run() = println("right hand access body info ${bodyInfo}")
        }
    }
}

//default  nesting class
//nesting class out side class can access inner class
//inner class cannot access outside class
class Outer() {
    val info: String = "OK"
    fun show() {
        Nested().output()
    }

    class Nested {
        fun output() = println("this is nesting class")
    }
}

//TODO : 90 Kotlin nesting class

fun main() {
//    inner class
    Body("isOk").Heart().run()

//    nesting class
    Outer.Nested().output()
//    Outer().info
//  Outer().Nested //cannot access
}
