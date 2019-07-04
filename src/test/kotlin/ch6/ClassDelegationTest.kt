package ch6

import org.junit.Test

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

class ClassDelegationTest {
    @Test
    fun classDelegationTest() {
        val person = PersonImpl("Mario Arias")
        person.printName()
        println()
        val user = User(person)
        user.printName()
    }
}
