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

class PropertyObservingTest {
    private var string by Delegates.observable("init value") { property, oldValue, newValue ->
        println("Property ${property.name} changed value from $oldValue to $newValue")
    }

    @Test
    fun observableTest() {
        string = "change value"
        string = "change value again"
    }
}
