package com.github.akraskovski.trade.desk.stub.domain.model.creative

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Domain image creative model.
 */
@Document
class ImageCreative(
    @field:Id val id: String,
    var advertiserId: String? = null,
    var name: String? = null,
    var imageContent: String? = null,
    var description: String? = null,
    var availability: Availability? = null,
    var adTechnologyIds: List<String>? = mutableListOf(),
    var rightMediaOfferTypeId: Long? = null,
    var width: Int? = null,
    var height: Int? = null,
    var imageUrl: String? = null,
    var landingPageUrl: String? = null,
    var clickthroughUrl: String? = null,
    var thirdPartyTrackingTags: List<String>? = mutableListOf(),
    var thirdPartyImpressionTrackingUrl: String? = null,
    var thirdPartyImpressionTrackingUrl2: String? = null,
    var thirdPartyImpressionTrackingUrl3: String? = null,
    var isSecurable: Boolean? = null,
    var adServerName: String? = null,
    var adServerCreativeId: String? = null
)