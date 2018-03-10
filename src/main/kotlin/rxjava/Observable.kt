package rxjava

import io.reactivex.Observable
import java.util.function.Consumer

fun main(args: Array<String>) {
    //cold observable
    val observable = Observable.create<Int> { subscriber ->
        println("create")
        subscriber.onNext(7)
        subscriber.onNext(9)
        subscriber.onNext(10)
        subscriber.onComplete()
        println("complete")
    }
    println("done")

    observable.subscribe { println("next : $it") }

//    val cunsomer = object : Consumer<Int> {
//        override fun accept(t: Int) {
//            println("consumer next : $t")
//        }
//
//    }
    // After converted to lambda
    val cunsomer = Consumer<Int> { t -> println("consumer next : $t") }
}