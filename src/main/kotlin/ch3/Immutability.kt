package ch3

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

class MutableObj {
    var value = ""

    override fun toString(): String {
        return "MutableObj(value=$value)"
    }
}

class Data {
    var data = 0
}

class DataImmutable {
    var data = 0
}
