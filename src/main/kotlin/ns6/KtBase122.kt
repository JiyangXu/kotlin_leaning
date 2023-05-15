package ns6

//TODO : 122 Kotlin apply

private inline fun <INPUT> INPUT.mApply(lambda: INPUT.() -> Unit): INPUT {
    lambda(this)
    return this
}

fun main() {
    "this".apply { }
    "this".let { }
}
