package ch7

import kotlinx.coroutines.*

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
    println("run blocking coroutineContext = $coroutineContext")
    println("coroutineContext[Job] = ${coroutineContext[Job]}")
    println(Thread.currentThread().name)
    println("-----")
    val jobs = listOf(
        launch {
            println("launch coroutineContext = $coroutineContext")
            println("coroutineContext[Job] = ${coroutineContext[Job]}")
            println(Thread.currentThread().name)
            println("-----")
        },
        async {
            println("async coroutineContext = $coroutineContext")
            println("coroutineContext[Job] = ${coroutineContext[Job]}")
            println(Thread.currentThread().name)
            println("-----")
        },
        launch(Dispatchers.Default) {
            println("common launch coroutineContext	= $coroutineContext")
            println("coroutineContext[Job] = ${coroutineContext[Job]}")
            println(Thread.currentThread().name)
            println("-----")
        },
        launch(coroutineContext) {
            println("inherit launch coroutineContext = $coroutineContext")
            println("coroutineContext[Job] = ${coroutineContext[Job]}")
            println(Thread.currentThread().name)
            println("-----")
        }
    )
    jobs.forEach { job ->
        println("job = $job")
        job.join()
    }
}
