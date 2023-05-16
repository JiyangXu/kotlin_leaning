package ns4

class KtBase78 {
    //    lateinit val AAA; //AAA cannot change later cannot use lateinit
    lateinit var responseResultInfo: String // I can init later, define it first

    //    mimic the server load
    fun loadRequest() { //lazy loading
        responseResultInfo = "sever load is success"
    }

    fun showResponseResult() {
        //it will throw the exception due to there are no value for responseResultInfo
//        if (responseResultInfo == null) println()
        println("r $responseResultInfo")

        if (::responseResultInfo.isInitialized) {
            println("responseResultInfo : $responseResultInfo")
        } else {
            println("the value is not initialized")
        }
    }
}

//TODO : 78 Kotlin lateinit
//1. lateinit responseResultInfo defin
//2. request lazy load
//3. showResponseResult
//4. main request fist and then display
//manually lazy load

fun main() {
    var p = KtBase78()
    p.apply {
        loadRequest()
    }.apply {
        showResponseResult()
    }
}
