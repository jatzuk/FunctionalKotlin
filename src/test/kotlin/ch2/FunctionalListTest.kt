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

class FunctionalListTest {
    private val numbers = intListOf(1, 2, 3, 4)

    @Test
    fun forEachTest() {
        numbers.forEach { println("i = $it") }
    }

    @Test
    fun foldTest() {
        numbers.fold(0) { acc, i -> acc + i }
    }

    @Test
    fun mapTest() {
        println(numbers.map { it * 22 })
    }
}
