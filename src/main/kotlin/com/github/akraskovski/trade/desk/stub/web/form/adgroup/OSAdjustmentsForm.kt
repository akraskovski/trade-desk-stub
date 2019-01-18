package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * OSAdjustmentsForm.
 */
class OSAdjustmentsForm(
    @field:JsonProperty("OSVersionAdjustments") var osVersionAdjustments: List<BidAdjustmentForm<String>>? = null,

    @field:JsonProperty("OSFamilyAdjustments") var osFamilyAdjustments: List<BidAdjustmentForm<String>>? = null,

    @field:JsonProperty("DefaultAdjustment") var defaultAdjustment: BigDecimal? = null
)