package com.github.akraskovski.trade.desk.stub.domain.model.creative

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Domain video creative model.
 */
@Document
class VideoCreative(
    @field:Id var id: String? = null,
    var advertiserId: String? = null,
    var name: String? = null,
    var videoContent: String? = null,
    var description: String? = null,
    var availability: Availability? = null,
    var adTechnologyIds: List<String>? = mutableListOf(),
    var rightMediaOfferTypeId: Long? = null,
    var landingPageUrl: String? = null,
    var clickthroughUrl: String? = null,
    var isSecurable: Boolean? = null,
    var adServerName: String? = null,
    var adServerCreativeId: String? = null
) : Creative