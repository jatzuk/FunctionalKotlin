package ch2

import org.junit.Test

/*
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 26.06.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class HighOrderFunctionsTest {
    @Test
    fun capitalizeTest() {
        println(capitalize("hello world!"))
        println(capitalizeExplicit("explicit world"))
    }

    @Test
    fun transformTest() {
        println(transform("kotlin", capitalize))
        println(transform("kotlin", ::reverse))
        println(transform("kotlin", MyUtils::doNothing))

        println(transform("kotlin", { str -> str.substring(0..1) }))

        println(transform("kotlin", object : Function1<String, String> {
            override fun invoke(p1: String): String {
                return p1.substring(0..2)
            }
        }))

        println(transform("kotlin", { it.substring(0..3) }))

        println(transform("kotlin") { it.substring(0..4) })
    }

    @Test
    fun unlessTest() {
        unless(false) { println("You can't access this website") }
    }

    @Test
    fun typealiasTest() {
        useMachine(5, PrintMachine())
        useMachine(5, ::println)
        useMachine(5) { println(it) }
        useMachine(5, M1())
    }
}
