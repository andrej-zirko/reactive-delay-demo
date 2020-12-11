package eu.zirko.reactivedelaydemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.Duration
import java.util.*

@RestController
class Controller {
    @GetMapping("/simulator")
    fun delayAndReturn(): Mono<String> {
        val random = UUID.randomUUID()
        return Mono.just("result $random").delayElement(Duration.ofSeconds(5))
    }
}