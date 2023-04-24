package ns4

class KtBase79 {
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  do not use lazy initialization normal method
//    if not comment out the method will initialize the value first
    val databaseData1: String = readSQLServerDatabaseAction()

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> use lazy initialization
    val databasedata2 by lazy { readSQLServerDatabaseAction() }

    private fun readSQLServerDatabaseAction(): String {
        println("start loading data......")
        println("end loading data......")
        return "database data load success ok"
    }

}

//TODO : 79 Kotlin lateinit
/*
* 1. do not use lazy initialization databaseData1 = readSQLServerDatabaseAction()
* 2. use lazy initialization databaseData2 by lazy
* 3. KtBase82() sleep db1.databaseData1
*
* lateinit : we need manually to load first
* in this demo the lazy load will automate to load
* */

fun main() {
    val p = KtBase79()
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> not use by lazy
//    Thread.sleep(5000)
//    println("final display${p.databaseData1}")

    //>>>>>>>>>>>>>>>>>>>>>>> use by lazy
    Thread.sleep(5000)
    println(p)
//    println("will use the lazy loading")
//    println("final display ${p.databasedata2}")
}
