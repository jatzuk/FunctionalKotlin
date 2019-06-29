package ch2

/*
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 26.06.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

val capitalize = { str: String -> str.capitalize() }

val capitalizeExplicit = object : Function1<String, String> {
    override fun invoke(p1: String): String {
        return p1.capitalize()
    }
}

fun <T> transform(t: T, fn: (T) -> T): T = fn(t)

fun reverse(str: String): String = str.reversed()

object MyUtils {
    fun doNothing(str: String) = str
}

fun unless(condition: Boolean, block: () -> Unit) {
    if (!condition) block()
}

typealias Machine<T> = (T) -> Unit

fun <T> useMachine(product: T, machine: Machine<T>) {
    machine(product)
}

class PrintMachine<T> : Machine<T> {
    override fun invoke(p1: T) {
        println(p1)
    }
}

class M1<T> : Function1<T, Unit> {
    override fun invoke(p1: T) {
        println(p1)
    }
}
