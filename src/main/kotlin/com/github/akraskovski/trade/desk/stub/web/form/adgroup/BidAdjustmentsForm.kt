package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * BidAdjustmentsForm.
 */
class BidAdjustmentsForm<ID>(
    @field:JsonProperty("DefaultAdjustment") var defaultAdjustment: BigDecimal? = null,

    @field:JsonProperty("Adjustments") var adjustments: List<BidAdjustmentForm<ID>>? = null
)