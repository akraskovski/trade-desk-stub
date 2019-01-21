package com.github.akraskovski.trade.desk.stub.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * AdGroup.
 */
@Document
class AdGroup(
    @field:Id var id: String,
    var campaignId: String? = null,
    var name: String? = null,
    var description: String? = null,
    var isEnabled: Boolean? = null,
    var industryCategoryId: Long? = null,
    var rtbAttributes: AdGroupRTBAttributes? = null,
    var availability: Availability? = null
)