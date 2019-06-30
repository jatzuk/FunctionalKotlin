package ch4

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 30.06.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class LambdaTest {
    @Test
    fun lambdaTest() {
        assertEquals(reverse(123), 321)
        assertEquals(reverse(654), 456)
    }

    @Test
    fun getAnotherFunctionTest() {
        getAnotherFunction(0)("abc")
        getAnotherFunction(1)
    }
}
