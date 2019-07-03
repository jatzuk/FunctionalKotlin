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

open class Feline

fun Feline.speak() = "<generic feline noise>"

class Cat : Feline()

fun Cat.speak() = "meow!"

open class Primate(val name: String)

fun Primate.speak() = "$name <generic primate noise>"

open class GiantApe(name: String) : Primate(name)

fun GiantApe.speak() = "$name <scary 100db roar>"
