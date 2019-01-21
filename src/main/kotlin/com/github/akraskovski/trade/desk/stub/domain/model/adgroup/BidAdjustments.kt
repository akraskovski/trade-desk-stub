package com.github.akraskovski.trade.desk.stub.domain.model.adgroup

import java.math.BigDecimal

/**
 * BidAdjustments.
 */
class BidAdjustments<ID>(
    var defaultAdjustment: BigDecimal? = null,
    var adjustments: List<BidAdjustment<ID>>? = null
)