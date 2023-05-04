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

open class Animal()
open class Human : Animal()
open class Man : Animal()
open class Woman : Animal()

//TODO : 109 Kotlin out
//1. producer consumer
//2. producerclass4
//3. main test
//>>>>>>>>>>>>>>>>>>> producer only

class ProducerClass1 : Producer<Animal> {
    override fun producer(): Animal {
        println("producer Animal")
        return Animal()
    }
}

class ProducerClass2 : Producer<Human> {
    override fun producer(): Human {
        println("producer human")
        return Human()
    }
}

class ProducerClass3 : Producer<Man> {
    override fun producer(): Man {
        println("producer Man")
        return Man()
    }
}

class ProducerClass4 : Producer<Woman> {
    override fun producer(): Woman {
        println("producer Woman")
        return Woman()
    }
}

fun main() {
//    java ? extend T == Kotlin out
    val p1: Producer<Animal> = ProducerClass1()
    val p2: Producer<Animal> = ProducerClass2()
    val p3: Producer<Animal> = ProducerClass3()
    val p4: Producer<Animal> = ProducerClass4()

//    generic default could not input parent obj
//    out: generic can pass the parent obj to child

}
