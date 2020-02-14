package dev.milzipmoza.springbootes.controller

import dev.milzipmoza.springbootes.domain.Book
import dev.milzipmoza.springbootes.domain.BookRepository
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class BookController(val bookRepository: BookRepository) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/books/{id}")
    fun get(@PathVariable id: Long): ResponseEntity<Book> {
        log.debug("request={}", id)
        val book: Book = bookRepository.findById(id)
                .orElseThrow { return@orElseThrow IllegalArgumentException() }
        return ResponseEntity.ok(book)
    }
}