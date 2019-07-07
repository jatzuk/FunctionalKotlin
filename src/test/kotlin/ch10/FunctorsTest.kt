package ch10

import org.junit.Test

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 07.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class FunctorsTest {
    @Test
    fun functorsPreview() {
        listOf(1, 2, 3).map { it * 2 }.map(Int::toString).forEach(::print)
    }

    @Test
    fun functorsMapTest() {
        println(Option.Some("Kotlin").map(String::toUpperCase))
        println(Option.None.map(String::toUpperCase))
    }

    @Test
    fun forwardFunctionCompositionTest() {
        val add3AndMultiplyBy2: (Int) -> Int = { i: Int -> i + 3 }.map { j: Int -> j * 2 }
        println(add3AndMultiplyBy2(0))
        println(add3AndMultiplyBy2(1))
        println(add3AndMultiplyBy2(2))
    }
}
