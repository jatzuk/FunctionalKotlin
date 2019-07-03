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

class VarargLambdaTest {
    @Test
    fun transformTest() {
        println(transform(1, 2, 3, 4) { it.toString() })
    }

    @Test
    fun emitTest() {
        emit(1, ::println, { println(it * 2) })
    }
}
