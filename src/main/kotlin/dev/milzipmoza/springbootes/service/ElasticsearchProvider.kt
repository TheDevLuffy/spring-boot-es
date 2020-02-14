//package dev.milzipmoza.springbootes.service
//
//import dev.milzipmoza.springbootes.domain.Book
//import org.elasticsearch.action.index.IndexRequest
//import org.elasticsearch.action.index.IndexResponse
//import org.elasticsearch.client.RestHighLevelClient
//import org.springframework.stereotype.Component
//import reactor.core.publisher.Mono
//import java.awt.event.ActionListener
//
//@Component
//class ElasticsearchProvider(private val restHighLevelClient: RestHighLevelClient) : BookUseCase {
//
//    override fun addDocument(book: Book): Mono<Void> {
//        val indexRequest = IndexRequest("library")
//                .id("book")
//                .source("title", book.title, "price", book.price)
//
//        return Mono.create {
//            val actionListener = ActionListener{
//            }
//        }
//    }
//}