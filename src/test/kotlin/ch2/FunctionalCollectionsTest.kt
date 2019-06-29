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

class FunctionalCollectionsTest {
    private val numbers = listOf(1, 2, 3, 4)

    @Test
    fun functionalCollectionsTest() {
        val numbersTwice = numbers.map { it * 2 }
        println(numbersTwice)
    }

    @Test
    fun sumAll() {
        println(numbers.sum())
    }

    @Test
    fun fold() {
        val sum = numbers.fold(0) { acc, i ->
            println("acc, i = $acc, $i")
            acc + i
        }
        println(sum)
    }

    @Test
    fun reduce() {
        println(
            numbers.reduce { acc, i ->
                println("acc, i = $acc, $i")
                acc + i
            }
        )
    }

    @Test
    fun foldRight() {
        println(
            numbers.foldRight(0) { acc, i ->
                println("acc, i = $acc, $i")
                acc + i
            }
        )
    }

    @Test
    fun reduceRight() {
        println(
            numbers.reduceRight { acc, i ->
                println("acc, i = $acc, $i")
                acc + i
            }
        )
    }
}
