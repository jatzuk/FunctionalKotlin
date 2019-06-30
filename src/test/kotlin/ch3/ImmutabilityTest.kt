package ch3

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlinx.coroutines.*
import kotlinx.coroutines.test.runBlockingTest

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
class ImmutabilityTest {
    private var count = 0
    private val string = "Mutable"
        get() {
            return "$field${count++}"
        }

    @Test
    fun immutabilityTest() {
        repeat(3) {
            assertEquals(it, string.last() - '0')
        }
    }

    @Test
    fun mutableObjectTest() {
        val mutableObj = MutableObj()
        mutableObj.value = "changed"
        assertEquals("changed", mutableObj.value)

        val list = mutableListOf<Char>()
        repeat(5) { list.add((it + 65).toChar()) }
        list.add('f')
        assertEquals(list.last(), 'f')
    }

    @Test
    @ExperimentalCoroutinesApi
    fun threadUnSafety() = runBlockingTest {
        val data = Data()

        launch {
            for (i in 11..20) {
                data.data += i
                println("1st ${data.data}")
                delay(500)
            }
        }

        launch {
            for (i in 1..10) {
                data.data++
                println("2nd ${data.data}")
                delay(300)
            }
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun threadSafety() = runBlockingTest {
        val data = DataImmutable()

        launch {
            var dataCopy = data.data
            for (i in 11..20) {
                dataCopy += i
                println("1st $dataCopy")
                delay(500)
            }
        }

        launch {
            var dataCopy = data.data
            for (i in 1..10) {
                dataCopy++
                println("2nd $dataCopy")
                delay(300)
            }
        }
    }
}

