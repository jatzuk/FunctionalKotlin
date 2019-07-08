package ch10

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 08.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun <T, R> Option<T>.flatMap(fm: (T) -> Option<R>): Option<R> = when (this) {
    Option.None -> Option.None
    is Option.Some -> fm(value)
}

fun <T, R> Option<T>.mapM(transform: (T) -> R): Option<R> = flatMap { Option.Some(transform(it)) }

fun calculateDiscount(price: Option<Double>): Option<Double> {
    return price.flatMap {
        if (it > 50.0) Option.Some(5.0)
        else Option.None
    }
}
