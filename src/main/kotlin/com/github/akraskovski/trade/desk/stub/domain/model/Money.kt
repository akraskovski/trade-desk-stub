package com.github.akraskovski.trade.desk.stub.domain.model

import java.math.BigDecimal

/**
 * MoneyForm object representation.
 */
class Money(
    var amount: BigDecimal? = null,
    var currencyCode: String? = null
)