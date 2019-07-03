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

fun <T, R> transform(vararg ts: T, f: (T) -> R): List<R> = ts.map(f)

fun <T> emit(t: T, vararg listeners: (T) -> Unit) = listeners.forEach { it(t) }
