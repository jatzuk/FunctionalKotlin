package ch11

import org.junit.Test
import java.util.stream.Collectors
import java.util.stream.Stream
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

class StreamCollectorsTest {
    @Test
    fun streamCollectTest() {
        val resultantSet = (0..10).asSequence().asStream()
            .collect(Collectors.toCollection { LinkedHashSet<Int>() })
        println("resultantSet = $resultantSet")
    }

    @Test
    fun streamCollectToMapTest() {
        val resultantMap = (0..10).asSequence().asStream()
            .collect(Collectors.toMap<Int, Int, Int>({ it }, { it * it }))
        println("resultantMap = $resultantMap")
    }

    @Test
    fun streamJoiningTest() {
        val resultantString = Stream.builder<String>()
            .add("Item 1")
            .add("Item 2")
            .add("Item 3")
            .add("Item 4")
            .add("Item 5")
            .add("Item 6")
            .build()
            .collect(Collectors.joining(" - ", "Starts Here =>", "<= Ends Here"))
        println("resultantString = $resultantString")
    }

    @Test
    fun streamGroupingByTest() {
        val resultantSet =
            (1..20).asSequence().asStream().collect(Collectors.groupingBy<Int, Int> { it % 5 })
        println("resultantSet = $resultantSet")
    }
}
