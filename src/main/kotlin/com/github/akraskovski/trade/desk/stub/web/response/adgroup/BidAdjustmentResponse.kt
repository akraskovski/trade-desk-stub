package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * BidAdjustmentResponse.
 */
class BidAdjustmentResponse<ID>(
    @field:JsonProperty("Id") var id: ID? = null,

    @field:JsonProperty("Adjustment") var adjustment: BigDecimal? = null
)