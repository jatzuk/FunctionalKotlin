package ch9

import io.reactivex.Observable
import org.junit.Test

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

class ObservableCreateTest {
    @Test
    fun observableCreateTest() {
        val observable = Observable.create<String> {
            it.onNext("Emitted 1")
            it.onNext("Emitted 2")
            it.onNext("Emitted 3")
            it.onNext("Emitted 4")
            it.onComplete()
        }
        observable.subscribe(observer)

        val observable2 = Observable.create<String> {
            it.onNext("Emitted 1")
            it.onNext("Emitted 2")
            it.onError(Exception("My Exception"))
        }
        observable2.subscribe(observer)
    }
}
