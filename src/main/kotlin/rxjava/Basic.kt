package rxjava

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

fun main(args: Array<String>) {
    println("Run....")
    Observable.just(1,2,3)
            .subscribeOn(Schedulers.io())
            .map { " (ᵔᴥᵔ) ".repeat(it) }  // Data transformation
            .filter { it.length > 2 } // Chaining
            .subscribe { println(it) }
    println("Done...")

    val smile = listOf(1, 2, 3)
            .map { " :D ".repeat(it) }
            .filter { it.length>4 }
    println(smile)

}