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

fun <T, R> List<T>.ap(fab: List<(T) -> R>): List<R> = fab.flatMap { map(it) }

fun <T> Option.Companion.pure(t: T): Option<T> = Option.Some(t)

fun <T, R> Option<T>.ap(fab: Option<(T) -> R>): Option<R> = fab.flatMap { map(it) }

infix fun <T, R> Option<(T) -> R>.inf(o: Option<T>): Option<R> =
    flatMap { f: (T) -> R -> o.map(f) }

object Function1 {
    fun <A, B> pure(b: B) = { _: A -> b }
}

fun <A, B, C> ((A) -> B).mapAp(transform: (B) -> C): (A) -> C = { transform(this(it)) }

fun <A, B, C> ((A) -> B).flatMapAp(fm: (B) -> (A) -> C): (A) -> C = { fm(this(it))(it) }

fun <A, B, C> ((A) -> B).ap(fab: (A) -> (B) -> C): (A) -> C = fab.flatMapAp { mapAp(it) }
