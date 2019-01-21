package com.github.akraskovski.trade.desk.stub.web.service

import com.github.akraskovski.trade.desk.stub.domain.repository.TradeDeskRepository
import com.github.akraskovski.trade.desk.stub.web.form.search.SearchQuery
import com.github.akraskovski.trade.desk.stub.web.response.search.PageResponse
import org.springframework.data.domain.Page

/**
 * Generified search service around domain documents.
 */
interface SearchService {

    /**
     * Searches domain documents by a standard query.
     */
    fun <T> searchByParent(query: SearchQuery, repository: TradeDeskRepository<T, String>): Page<T>
}

/**
 * Mapper extension func from domain document to prepared search response.
 */
inline fun <reified R : Any, T> Page<T>.toResponse(noinline domainMapper: (T) -> R): PageResponse<R> =
    map(domainMapper)
        .let {
            PageResponse(it.content, it.numberOfElements.toLong(), it.totalElements, it.totalElements)
        }