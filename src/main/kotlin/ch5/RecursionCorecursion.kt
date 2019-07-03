package ch5

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 03.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun <T, S> unfold(s: S, f: (S) -> Pair<T, S>?): Sequence<T> {
    val result = f(s)
    return result?.let { sequenceOf(it.first) + unfold(it.second, f) } ?: sequenceOf()
}

fun <T> elements(element: T, numOfValues: Int): Sequence<T> {
    return unfold(1) { if (numOfValues > it) element to it + 1 else null }
}

fun factorial(size: Int): Sequence<Long> {
    return sequenceOf(1L) + unfold(1L to 1) { (acc, n) ->
        if (size > n) {
            val x = n * acc
            x to (x to n + 1)
        } else null
    }
}

fun fibonacci(size: Int): Sequence<Long> {
    return sequenceOf(1L) + unfold(Triple(0L, 1L, 1)) { (cur, next, n) ->
        if (size > n) {
            val x = cur + next
            x to Triple(next, x, n + 1)
        } else null
    }
}
