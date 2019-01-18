package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * OSAdjustmentsResponse.
 */
class OSAdjustmentsResponse(
    @field:JsonProperty("OSVersionAdjustments") var osVersionAdjustments: List<BidAdjustmentResponse<String>>? = null,

    @field:JsonProperty("OSFamilyAdjustments") var osFamilyAdjustments: List<BidAdjustmentResponse<String>>? = null,

    @field:JsonProperty("DefaultAdjustment") var defaultAdjustment: BigDecimal? = null
)