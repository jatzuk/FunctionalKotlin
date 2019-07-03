package ch5

import org.junit.Test

import org.junit.Assert.*

/*
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 03.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class InfixFunctionsTest {
    @Test
    fun superOperationTest() {
        1 superOperation 2
        1.superOperation(2)
    }
}
