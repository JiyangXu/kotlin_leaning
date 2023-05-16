package ns5


//TODO : 94 Kotlin Enum
enum class Week(val week: String) {
    Mon("Monday"),
//    Tue,
//    Wed,
//    Thur,
//    Fri,
//    Sat,
//    Sun
}

fun main() {
    println(Week.Mon.week)
}
