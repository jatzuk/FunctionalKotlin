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

class MonadsTest {
    @Test
    fun monadExample() {
        val result = listOf(1, 2, 3).flatMap { listOf(it * 2, it + 3) }.joinToString()
        println(result)
    }

    @Test
    fun flatMapTest() {
        println(calculateDiscount(Option.Some(80.0)))
        println(calculateDiscount(Option.Some(30.0)))
        println(calculateDiscount(Option.None))
    }

    @Test
    fun nestedFlatMapTest() {
        val maybeFive = Option.Some(5)
        val maybeTwo = Option.Some(2)
        println(maybeFive.mapM { f ->
            maybeTwo.mapM { t ->
                Option.Some(f + t)
            }
        })
    }

    @Test
    fun compositionTest() {
        val numbers = listOf(1, 2, 3)
        val functions = listOf<(Int) -> Int>({ it * 2 }, { it + 3 })
        val result = numbers.flatMap { functions.map { f -> f(it) } }.joinToString()
        println(result)
    }
}
