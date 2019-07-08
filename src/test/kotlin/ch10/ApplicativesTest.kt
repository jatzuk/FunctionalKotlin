package ch10

import org.junit.Test

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

class ApplicativesTest {
    @Test
    fun applicativeTest() {
        val numbers = listOf(1, 2, 3)
        val functions = listOf<(Int) -> Int>({ it * 2 }, { it + 3 })
        val result = numbers.ap(functions).joinToString()
        println(result)
    }

    @Test
    fun applicativesInstead2Monads() {
        val maybeFive = Option.pure(5)
        val maybeTwo = Option.pure(2)
        println(maybeTwo.ap(maybeFive.map { f -> { t: Int -> f + t } }))
    }

    @Test
    fun infixApplicativeTest() {
        val maybeFive = Option.pure(5)
        val maybeTwo = Option.pure(2)
        println(Option.pure { f: Int -> { t: Int -> f + t } } inf maybeFive inf maybeTwo)
    }

    @Test
    fun functionAsApplicative() {
        val f: (String) -> Int = Function1.pure(0)
        println(f("Hello"))
        println(f("World"))
        println(f("!"))
    }

    @Test
    fun apTest() {
        val add3andMultiplyBy2: (Int) -> Int = { i: Int -> i + 3 }.ap { { j: Int -> j * 2 } }
        println(add3andMultiplyBy2(0))
        println(add3andMultiplyBy2(1))
        println(add3andMultiplyBy2(2))
    }

    @Test
    fun apComposeTest() {
        val add3AndMultiplyBy2: (Int) -> Pair<Int, Int> =
            { i: Int -> i + 3 }.ap { original -> { j: Int -> original to j * 2 } }
        println(add3AndMultiplyBy2(0))
        println(add3AndMultiplyBy2(1))
        println(add3AndMultiplyBy2(2))
    }
}
