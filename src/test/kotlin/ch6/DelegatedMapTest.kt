package ch6

import org.junit.Assert.*
import org.junit.Test
import java.text.SimpleDateFormat

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

class DelegatedMapTest {
    @Test
    fun delegatedMapTest() {
        val map1 = mapOf(
            Pair("name", "Reactive Programming in Kotlin"),
            Pair("authors", "Rivu Chakraborty"),
            Pair("pageCount", 400),
            Pair("publicationDate", SimpleDateFormat("yyyy/mm/dd").parse("2017/12/05")),
            Pair("publisher", "Packt")
        )
        val map2 = mapOf(
            "name" to "Kotlin Blueprints",
            "authors" to "Ashish Belagali, Hardik Trivedi, Akshay Chordiya",
            "pageCount" to 250,
            "publicationDate" to SimpleDateFormat("yyyy/mm/dd").parse("2017/12/05"),
            "publisher" to "Packt"
        )
        val book1 = Book(map1)
        val book2 = Book(map2)
        println("Book1 $book1\nBook2 $book2")
    }
}
