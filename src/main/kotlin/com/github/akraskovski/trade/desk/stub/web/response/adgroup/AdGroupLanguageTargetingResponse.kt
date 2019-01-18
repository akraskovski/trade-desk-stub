package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * AdGroupLanguageTargetingResponse.
 */
class AdGroupLanguageTargetingResponse(
    @field:JsonProperty("LanguageTargetingAdjustments") var languageTargetingAdjustments: BidAdjustmentsResponse<Int>? = null
)