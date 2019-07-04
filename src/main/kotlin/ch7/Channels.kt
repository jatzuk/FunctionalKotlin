package ch7

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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

fun main() = runBlocking {
    //    val result = CompletableDeferred<String>()
//    val world = launch {
//        delay(500)
//        result.complete("World (from another coroutine)")
//    }
//
//    val hello = launch { println("Hello ${result.await()}") }
//
//    hello.join()
//    world.join()

    val channel = Channel<String>()
    val world = launch {
        delay(500)
        channel.send("World (from another coroutine using a channel")
    }

    val hello = launch { println("Hello ${channel.receive()}") }

    hello.join()
    world.join()
}
