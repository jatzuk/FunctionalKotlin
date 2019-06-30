package ch4

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

val reverse: (Int) -> Int = {
    var n = it
    var revNumber = 0
    while (n > 0) {
        val digit = n % 10
        revNumber = revNumber * 10 + digit
        n /= 10
    }
    revNumber
}

fun getAnotherFunction(n: Int): (String) -> Unit {
    return { println("n:$n it: $it") }
}
