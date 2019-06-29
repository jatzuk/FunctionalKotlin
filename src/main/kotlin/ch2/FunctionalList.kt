package ch2

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 29.06.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

sealed class FunctionalList<out T> {
    object Nil : FunctionalList<Nothing>()

    data class Cons<out T>(val head: T, val tail: FunctionalList<T>) : FunctionalList<T>()

    fun forEach(f: (T) -> Unit) {
        tailrec fun go(list: FunctionalList<T>, f: (T) -> Unit) {
            when (list) {
                is Cons -> {
                    f(list.head)
                    go(list.tail, f)
                }
                is Nil -> Unit
            }
        }

        go(this, f)
    }

    fun <R> fold(init: R, f: (R, T) -> R): R {
        tailrec fun go(list: FunctionalList<T>, init: R, f: (R, T) -> R): R = when (list) {
            is Cons -> go(list.tail, f(init, list.head), f)
            is Nil -> init
        }

        return go(this, init, f)
    }

    fun reverse(): FunctionalList<T> = fold(Nil as FunctionalList<T>) { acc, i -> Cons(i, acc) }

    fun <R> foldRight(init: R, f: (R, T) -> R): R {
        return this.reverse().fold(init, f)
    }

    fun <R> map(f: (T) -> R): FunctionalList<R> {
        return foldRight(Nil as FunctionalList<R>) { tail, head -> Cons(f(head), tail) }
    }
}

fun intListOf(vararg numbers: Int): FunctionalList<Int> {
    return if (numbers.isEmpty()) FunctionalList.Nil
    else FunctionalList.Cons(
        numbers.first(),
        intListOf(*numbers.drop(1).toTypedArray().toIntArray())
    )
}
