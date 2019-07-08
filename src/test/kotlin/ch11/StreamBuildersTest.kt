package ch11

import org.junit.Test
import java.util.stream.Collectors
import java.util.stream.Stream

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

class StreamBuildersTest {
    @Test
    fun streamBuilderTest() {
        val stream = Stream.builder<String>()
            .add("Item 1")
            .add("Item 2")
            .add("Item 3")
            .add("Item 4")
            .add("Item 5")
            .add("Item 6")
            .add("Item 7")
            .add("Item 8")
            .add("Item 9")
            .add("Item 10")
            .build()
        println("The Stream is ${stream.collect(Collectors.toList())}")
    }

    @Test
    fun emptyStreamBuilderTest() {
        val emptyStream = Stream.empty<String>()
        val item = emptyStream.findAny()
        println("Item is $item")
    }

    @Test
    fun streamByPassingElementsTest() {
        val stream = Stream.of("Item 1", 2, "Item 3", 4, 5.0, "Item 6")
        println("Items in Stream = ${stream.collect(Collectors.toList())}")
    }

    @Test
    fun streamGenerateTest() {
        val stream = Stream.generate { (1..20).random() }
        val resultantList = stream.limit(10).collect(Collectors.toList())
        println("resultantList = $resultantList")
    }
}
