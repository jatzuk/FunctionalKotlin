package ch11

import org.junit.Test
import java.util.stream.Collectors
import java.util.stream.DoubleStream
import java.util.stream.IntStream
import kotlin.streams.asStream

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

class PrimitiveStreamsTest {
    @Test
    fun prefaceTest() {
        val stream = (1 until 10).asSequence().asStream()
        val resultantList = stream.filter { it and 1 == 0 }.collect(Collectors.toList())
        println(resultantList)
    }

    @Test
    fun primitiveStreamsTest() {
        val intStream = IntStream.range(1, 10)
        val result = intStream.sum()
        println("The sum of elements is $result")
    }

    @Test
    fun primitiveDoubleStream() {
        val doubleStream = DoubleStream.iterate(1.5) { it * 1.3 }
        val avg = doubleStream.limit(10).peek { println("Item $it") }.average()
        println("Average of 10 Items $avg")
    }
}
