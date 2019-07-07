package ch9

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.junit.Test
import io.reactivex.rxkotlin.toObservable
import io.reactivex.rxkotlin.subscribeBy

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 07.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class PullVsPushMechanismTest {
    @Test
    fun pullVsPush() {
        val list = listOf(1, "Two", 3, "Four", "Five", 5.5F)
        val observable = list.toObservable()
        observable.subscribeBy(
            onNext = { println(it) },
            onError = { it.printStackTrace() },
            onComplete = { println("Done!") }
        )
    }

    @Test
    fun howObservableWorks() {
        val observer = object : Observer<Any> {
            override fun onComplete() {
                println("All Completed")
            }

            override fun onSubscribe(d: Disposable) {
                println("Subscribed to $d")
            }

            override fun onNext(t: Any) {
                println("Next $t")
            }

            override fun onError(e: Throwable) {
                println("Error Occurred $e")
            }
        }

        val observable = listOf(1, "Two", 3, "Four", "Five", 5.5F).toObservable()
        observable.subscribe(observer)
        val observableOnList = Observable.just(
            listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0F),
            listOf("List with 1 Item"),
            listOf(1, 2, 3)
        )
        observableOnList.subscribe(observer)
    }
}
