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

class PropertyDelegationTest {
    private var notNullStr by Delegates.notNull<String>()
    private lateinit var lateinitString: String

    private val lazy by lazy {
        println("Just initialized")
        "lazy value"
    }

    @Test
    fun lateinitPropertyTest() {
        notNullStr = "Initial value"
        println(notNullStr)

        lateinitString = "lateinit initialization"
        println(lateinitString)
    }

    @Test
    fun lazyTest() {
        println("Not initialized")
        println(lazy)
    }
}
