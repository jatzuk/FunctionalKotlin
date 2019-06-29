package ch2

import org.junit.Test

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

class RecursiveFunctionsTest {
    private fun executionTime(body: () -> Unit): Long {
        val startTime = System.nanoTime()
        body()
        return System.nanoTime() - startTime
    }

    @Test
    fun factorial() {
        println(executionTime { factorial(20) })
    }

    @Test
    fun functionalFactorial() {
        println(executionTime { functionalFactorial(20) })
    }

    @Test
    fun tailrecFactorial() {
        println(executionTime { tailrecFactorial(20) })
    }

    @Test
    fun fib() {
        println(executionTime { fib(93) })
    }

    @Test
    fun functionalFib() {
        println(executionTime { functionalFib(93) })
    }

    @Test
    fun tailrecFib() {
        println(executionTime { tailrecFib(93) })
    }
}
