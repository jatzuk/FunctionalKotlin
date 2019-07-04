package ch6

import org.junit.Test

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

class CustomDelegation {
    private var even by makeEven(0) { property, oldValue, newValue, wasEven ->
        println("${property.name} $oldValue -> $newValue, Even:$wasEven")
    }

    @Test
    fun customDelegationTest() {
        even = 6
        println(even)
        even = 3
        println(even)
        even = 5
        println(even)
        even = 8
        println(even)
    }
}
