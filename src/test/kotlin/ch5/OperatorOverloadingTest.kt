package ch5

import org.junit.Test

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

class OperatorOverloadingTest {
    @Test
    fun operatorOverloadingTest() {
        val talbot = Wolf("Talbot")
        talbot + Wolf("Big Bertha")
    }
}
