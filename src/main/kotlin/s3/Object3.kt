package s3

//TODO 37. kotlin let
fun main() {
    var name: String? = null
    name = "Jiyang"

    val r= name?.let{
        if(it.isBlank()){
            "Default"
        }else{
            "[$it]"
        }
    }
    println(r)
}