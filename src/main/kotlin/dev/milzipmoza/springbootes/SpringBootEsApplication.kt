package dev.milzipmoza.springbootes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootEsApplication

fun main(args: Array<String>) {
	runApplication<SpringBootEsApplication>(*args)
}
