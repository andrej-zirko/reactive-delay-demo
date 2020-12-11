package eu.zirko.reactivedelaydemo

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.*

@Component
class ThreadsCount {
    @Scheduled(fixedDelay = 1000)
    fun prinThreadCount() {
        println("${System.currentTimeMillis()} Active threads ${Thread.activeCount()}")
    }
}