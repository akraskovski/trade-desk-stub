package com.github.akraskovski.trade.desk.stub.domain.repository

import com.github.akraskovski.trade.desk.stub.domain.model.AdGroup
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Mongo data access layer for the AdGroup.
 */
interface AdGroupRepository : MongoRepository<AdGroup, String>