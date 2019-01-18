package com.github.akraskovski.trade.desk.stub.domain.model

import java.math.BigDecimal

/**
 * BidAdjustment.
 */
class BidAdjustment<ID>(
    var id: ID? = null,
    var adjustment: BigDecimal? = null
)