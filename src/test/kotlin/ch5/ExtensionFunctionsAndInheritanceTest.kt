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

class ExtensionFunctionsAndInheritanceTest {
    @Test
    fun speakTest() {
        printSpeak(Feline())
        printSpeak(Cat())
    }

    @Test
    fun speakTest1() {
        printSpeak(Primate("Koko"))
        printSpeak(GiantApe("Kong"))
    }

    private fun printSpeak(feline: Feline) {
        println(feline.speak())
    }

    private fun printSpeak(primate: Primate) {
        println(primate.speak())
    }
}
