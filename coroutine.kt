import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        for (i in 0..5){
            delay(100)
            println("тик $i")
        }
    }
    launch {
        for (i in 0..7){
            delay(100)
            println("так $i")
        }
    }
    launch {
        for (i in 0..10){
            delay(100)
            println("тик так $i")
        }
    }
    return@coroutineScope
}