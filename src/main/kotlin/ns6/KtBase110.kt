package ns6


//TODO : 110 Kotlin in
//1. producer consumer
//2. producerclass4
//3. main test
//>>>>>>>>>>>>>>>>>>> customer only

class ConsumerClass1 : Consumer<Animal> {
    override fun consumer(item: Animal) {
        println("Consumer Animal")
    }
}

class ConsumerClass2 : Consumer<Human> {
    override fun consumer(item: Human) {
        println("Consumer human")
    }
}

class ConsumerClass3 : Consumer<Man> {
    override fun consumer(item: Man) {
        println("Consumer Man")
    }
}

class ConsumerClass4 : Consumer<Woman> {
    override fun consumer(item: Woman) {
        println("Consumer Woman")
    }
}

fun main() {

//    generic default could not input parent obj
//    out: generic can pass the parent obj to child
//    ? super T == Kotlin in

    val p1: Consumer<Man> = ConsumerClass1()
    val p2: Consumer<Human> = ConsumerClass2()

    // in : parent instance can set the value to child

//    generic
//    covariant : out parent = child
//    contravariance in child = parent
}
