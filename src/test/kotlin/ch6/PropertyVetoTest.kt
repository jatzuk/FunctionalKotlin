package ch6

import org.junit.Test
import kotlin.properties.Delegates

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

class PropertyVetoTest {
    private var even by Delegates.vetoable(0) { property, oldValue, newValue ->
        println("${property.name} $oldValue -> $newValue")
        newValue % 2 == 0
    }

    private var counter by Delegates.vetoable(0) { property, oldValue, newValue ->
        println("${property.name} $oldValue -> $newValue")
        newValue > oldValue
    }

    @Test
    fun vetoTest() {
        even = 6
        even = 3
        println(even)
    }

    @Test
    fun vetoCounterTest() {
        counter = 2
        println(counter)
        counter = 5
        counter = 4
        println(counter)
        counter++
        counter--
        println(counter)
    }
}
