package ns3


//TODO : 54 Kotlin takeIf

fun main() {
//    if this is true it will return the name, otherwise it will return null
    val result = checkPermissionAction("Root2", "1234")
    println(result?.let { "welcome login ${result}" })


    println()

    println(checkPermissionAction2("Root2", "1234"))
}

//frontend
fun checkPermissionAction(name: String, password: String): String? {
    return name.takeIf { permissionAction(name, password) }
}

//normal use takeIf + ?:
fun checkPermissionAction2(name: String, password: String): String {
    return name.takeIf { permissionAction(name, password) } ?: "Login filed"
}

//authority System
fun permissionAction(username: String, password: String) = username == "Root" && password == "1234"
