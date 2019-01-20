package com.github.akraskovski.trade.desk.stub.web.service

import com.github.akraskovski.trade.desk.stub.domain.repository.TradeDeskRepository
import com.github.akraskovski.trade.desk.stub.web.form.search.SearchQuery
import com.github.akraskovski.trade.desk.stub.web.form.search.SearchService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

/**
 * The type Campaign search service.
 */
@Service
class BasicSearchService : SearchService {

    override fun <T> searchByParent(query: SearchQuery, repository: TradeDeskRepository<T, String>): Page<T> {
        val pageRequest = PageRequest.of(query.pageStartIndex, query.pageSize ?: repository.count().toInt())
        return repository.search(query.getParentId(), query.availabilities, pageRequest)
    }
}