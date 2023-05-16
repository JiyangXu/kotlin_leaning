package ns6


//TODO : 117 Kotlin function and extend generic

fun main() {
    "Info".mLet {}
    123.mLet {}
    'C'.mLet {}
    "Info".let {}
}

private inline fun <I, O> I.mLet(lambda: (I) -> O): O {
    return lambda(this)
}
