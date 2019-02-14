package com.github.akraskovski.trade.desk.stub.web.response

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * MoneyResponse object representation.
 */
class MoneyResponse(
    @field:JsonProperty("Amount") var amount: BigDecimal? = null,

    @field:JsonProperty("CurrencyCode") var currencyCode: String? = null
)