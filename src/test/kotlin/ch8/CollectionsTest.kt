package ch8

import org.junit.Test
import kotlin.math.roundToInt
import kotlin.math.sqrt

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 04.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class CollectionsTest {
    @Test
    fun mapTest() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val modifiedList = list.map { it * 2 }
        println(modifiedList)
    }

    @Test
    fun filterTest() {
        val list = (1..50).toList()
        val filteredListEven = list.filter { it and 1 == 0 }
        println(filteredListEven)

        val filteredListPSquare = list.filter {
            val sqrt = sqrt(it.toDouble()).roundToInt()
            sqrt * sqrt == it
        }
        println(filteredListPSquare)
    }

    @Test
    fun flatMapTest() {
        val list = listOf(10, 20, 30)
        val flatMappedList = list.flatMap { it.rangeTo(it + 2).toList() }
        println(flatMappedList)
    }

    @Test
    fun dropTest() {
        val list = (1 until 50).toList()
        println(list.drop(25))
        println(list.dropLast(25))
    }

    @Test
    fun takeTest() {
        val list = (1 until 50).toList()
        println(list.take(25))
        println(list.takeLast(25))
        println(list.takeWhile { it <= 10 })
        println(list.takeLastWhile { it >= 40 })
    }

    @Test
    fun zipTest() {
        val list1 = listOf(1, 2, 3, 4)
        val list2 = listOf(
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5"
        )

        val resultantList = list1.zip(list2)
        println(resultantList)
    }

    @Test
    fun zipNextTest() {
        val list1 = listOf(1, 2, 3, 4)
        println(list1.zipWithNext())
    }

    @Test
    fun groupingTest() {
        val list = (1..50).toList()
        println(list.groupBy { it % 5 })
    }
}
