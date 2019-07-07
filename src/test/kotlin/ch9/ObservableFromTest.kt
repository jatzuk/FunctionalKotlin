package ch9

import io.reactivex.Observable
import io.reactivex.internal.operators.observable.ObservableFromCallable
import io.reactivex.internal.operators.observable.ObservableFromIterable
import org.junit.Test
import java.util.concurrent.Callable
import java.util.concurrent.Future
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

class ObservableFromTest {
    @Test
    fun observableFromTest() {
        val list = listOf("Str 1", "Str 2", "Str 3", "Str 4")
        val observableFromIterable = ObservableFromIterable(list)
        observableFromIterable.subscribe(observer)

        val callable = Callable { "I'm From Callable" }
        val observableFromCallable = ObservableFromCallable(callable)
        observableFromCallable.subscribe(observer)

        val future = object : Future<String> {
            val retStr = "I'm from Future"

            override fun isDone() = true

            override fun get() = retStr

            override fun get(timeout: Long, unit: TimeUnit) = retStr

            override fun cancel(mayInterruptIfRunning: Boolean) = false

            override fun isCancelled() = false
        }
        val observableFromFuture = Observable.fromFuture(future)
        observableFromFuture.subscribe(observer)
    }
}
