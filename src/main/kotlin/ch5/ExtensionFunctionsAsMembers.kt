package ch5

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

open class Caregiver(val name: String) {
    open fun Feline.react() = "PURRR!"

    private fun Primate.react() = "$name plays with $name"

    fun takeCare(feline: Feline) {
        println("Feline reacts: ${feline.react()}")
    }

    fun takeCare(primate: Primate) {
        println("Primate reacts: ${primate.react()}")
    }
}
