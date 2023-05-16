package ns6


//TODO : 120 Kotlin infix keyword

// mapOf("info" to 1)
//normal use
// mapOf("info".to(1))

private infix fun <I1, I2> I1.test(i2: I2) {
    println("this is the prefix: $this")
    println("this is the second info $i2")
}

fun main() {
    123 test "1235"
    "this is test" test 'M'
}
