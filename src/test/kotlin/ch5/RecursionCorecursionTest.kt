package ch5

import org.junit.Test

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

class RecursionCorecursionTest {
    @Test
    fun corecursionTest() {
        val strings = elements("kotlin", 5)
        strings.forEach(::println)
    }

    @Test
    fun corecursionFactorialTest() {
        factorial(10).forEach(::println)
    }

    @Test
    fun corecursionFibonacciTest() {
        fibonacci(10).forEach(::println)
    }
}
