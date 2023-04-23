package ns4

import java.util.*

class KtBase70 {
    var name = "name"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    /*
    * backgournd
    * @NotNull
    * private String name= "name"
    *
    * public void setName(@NotNull String name){
    *       this.name = name
    * }
    *
    * @NotNull
    * public String getName(){
    *       return this.name
    * }
    *
    * */

    var value = "ABCDEF"

    /*
   * get(){
   *   return field
   * }
   *
   * set(value){
   *   field = value
   * }
   *
   * */
    var info = "info is here"
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = "***** ${value}**********"
        }
    /*
    * @NotNull
    * private String info = "info is here"
    *
    * public void setInfo(@NotNull String info){
    *   this.info= "******"+ value +"********";
    * }
    * @NotNull
    * public String getInfo(){
    *   return StringKt.capitalize(this.info);
    * }
    *
    * */


}
//TODO : 70 Kotlin field and defined class

fun main() {
    KtBase70().name = "123"
    println("================")

    println(KtBase70().name)
    println("this is info ${KtBase70().info}")
    KtBase70().info = "learning info"
    println(KtBase70().info)
}
