package ch9

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import java.util.concurrent.TimeUnit

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

class DisposableTest {
    private val observable = Observable.interval(100, TimeUnit.MILLISECONDS)
    private val observer = object : Observer<Long> {
        lateinit var disposable: Disposable

        override fun onComplete() {
            println("Complete")
        }

        override fun onSubscribe(d: Disposable) {
            disposable = d
        }

        override fun onNext(t: Long) {
            println("Received $t")
            if (t >= 10 && !disposable.isDisposed) {
                disposable.dispose()
                println("Disposed")
            }
        }

        override fun onError(e: Throwable) {
            println("Error ${e.message}")
        }
    }

    @ExperimentalCoroutinesApi
    @Test
    fun disposableTest() = runBlockingTest {
        observable.subscribe(observer)
        delay(1500)
    }
}
