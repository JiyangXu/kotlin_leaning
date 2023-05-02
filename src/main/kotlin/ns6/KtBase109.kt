package ns6

// out T read only
interface Producer<out T> {
    fun producer(): T
}

// in can only be modified
interface Consumer<in T> {
    fun consumer(item: T)
}

//default can be modified and can be read
interface ProducerAndConsumer<T> {
    fun consumer(item: T)
    fun producer(): T
}

open class Animal
open class Human : Animal()
open class Man : Animal()
open class Woman : Animal()

//TODO : 109 Kotlin out
//1. producer consumer
//2. producerclass4
//3. main test
fun main() {

}
