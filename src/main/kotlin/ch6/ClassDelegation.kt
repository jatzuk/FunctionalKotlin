package ch6

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

interface Person {
    fun printName()
}

class PersonImpl(val name: String) : Person {
    override fun printName() {
        println(name)
    }
}

class User(private val person: Person): Person by person {
    override fun printName() {
        println("Printing name: ")
        person.printName()
    }
}
