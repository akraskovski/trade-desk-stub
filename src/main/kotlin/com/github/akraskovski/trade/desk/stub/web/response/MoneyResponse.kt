package com.github.akraskovski.trade.desk.stub.web.response

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * MoneyResponse object representation.
 */
class MoneyResponse(
    @JsonProperty("Amount")
    private var amount: BigDecimal? = null,

    @JsonProperty("CurrencyCode")
    private var currencyCode: String? = null
)