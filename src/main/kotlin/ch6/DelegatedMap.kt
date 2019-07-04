package ch6

import java.util.*

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

data class Book(val delegate: Map<String, Any?>) {
    val name: String by delegate
    val authors: String by delegate
    val pageCount: Int by delegate
    val publicationDate: Date by delegate
    val publisher: String by delegate
}
