package dev.milzipmoza.springbootes.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

data class HealthDto(val name: String, val age: Long, val status: String)

@RestController
class HealthController {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/health")
    fun get(@RequestParam name: String): ResponseEntity<Map<String, String>> {
        log.debug("request param name={}", name)
        return ResponseEntity.ok(mapOf(Pair("name", name)))
    }

    @PostMapping("/health")
    fun post(@RequestBody health: HealthDto): ResponseEntity<Map<String, Any>> {
        log.debug("request health={}", health)
        return ResponseEntity.ok(mapOf(Pair("health", health)))
    }
}