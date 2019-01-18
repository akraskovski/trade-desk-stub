package com.github.akraskovski.trade.desk.stub.domain.model

import java.math.BigDecimal

/**
 * OSAdjustments.
 */
class OSAdjustments(
    var osVersionAdjustments: List<BidAdjustment<String>>? = null,
    var osFamilyAdjustments: List<BidAdjustment<String>>? = null,
    var defaultAdjustment: BigDecimal? = null
)