package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * BidAdjustmentForm.
 */
class BidAdjustmentForm<ID>(
    @field:JsonProperty("Id") var id: ID? = null,

    @field:JsonProperty("Adjustment") var adjustment: BigDecimal? = null
)