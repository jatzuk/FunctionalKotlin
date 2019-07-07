package ch9

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

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

val observer: Observer<String> = object : Observer<String> {
    override fun onComplete() {
        println("All Completed")
    }

    override fun onSubscribe(d: Disposable) {
        println("New Subscription $d")
    }

    override fun onNext(t: String) {
        println("Next $t")
    }

    override fun onError(e: Throwable) {
        println("Error Occurred => ${e.message}")
    }
}
