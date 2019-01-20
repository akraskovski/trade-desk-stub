package com.github.akraskovski.trade.desk.stub.domain.repository

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.NoRepositoryBean

/**
 * Simple platform mongo extension repository.
 */
@NoRepositoryBean
interface TradeDeskRepository<T, ID> : MongoRepository<T, ID> {

    /**
     * Provide possibility to find all documents by a parent id and availabilities statuses.
     */
    fun search(parentId: String, availabilities: Set<Availability>, pageable: Pageable): Page<T>
}