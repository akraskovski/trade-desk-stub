package com.github.akraskovski.trade.desk.stub.domain.repository

import com.github.akraskovski.trade.desk.stub.domain.model.Campaign
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Mongo data access layer for the Campaign.
 */
interface CampaignRepository : MongoRepository<Campaign, String>