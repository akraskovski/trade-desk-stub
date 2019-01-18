package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * BidAdjustmentsResponse.
 */
class BidAdjustmentsResponse<ID>(
    @field:JsonProperty("DefaultAdjustment") var defaultAdjustment: BigDecimal? = null,

    @field:JsonProperty("Adjustments") var adjustments: List<BidAdjustmentResponse<ID>>? = null
)