package com.github.akraskovski.trade.desk.stub.domain.model.advertiser

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Domain advertiser model.
 */
@Document
class Advertiser(
    @field:Id var id: String? = null,
    var partnerId: String? = null,
    var name: String? = null,
    var description: String? = null,
    var industryCategoryId: Long? = null,
    var availability: Availability? = null,
    var attributionClickLookbackWindowInSeconds: Int? = null,
    var attributionImpressionLookbackWindowInSeconds: Int? = null,
    var clickDedupWindowInSeconds: Int? = null,
    var conversionDedupWindowInSeconds: Int? = null,
    var logoURL: String? = null,
    var domainAddress: String? = null,
    var keywords: List<String>? = null
)