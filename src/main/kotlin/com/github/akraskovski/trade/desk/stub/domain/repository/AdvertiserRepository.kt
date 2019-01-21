package com.github.akraskovski.trade.desk.stub.domain.repository

import com.github.akraskovski.trade.desk.stub.domain.model.advertiser.Advertiser
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Mongo data access layer for the Advertiser.
 */
interface AdvertiserRepository : MongoRepository<Advertiser, String>