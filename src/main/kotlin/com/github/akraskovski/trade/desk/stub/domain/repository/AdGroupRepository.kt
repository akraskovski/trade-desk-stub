package com.github.akraskovski.trade.desk.stub.domain.repository

import com.github.akraskovski.trade.desk.stub.domain.model.AdGroup
import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.Query

/**
 * Mongo data access layer for the AdGroup.
 */
interface AdGroupRepository : TradeDeskRepository<AdGroup, String> {

    @Query("{ 'campaignId' : ?0, 'availability' : { \$in: ?1 } }")
    override fun search(parentId: String, availabilities: Set<Availability>, pageable: Pageable): Page<AdGroup>
}