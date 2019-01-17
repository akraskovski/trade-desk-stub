package com.github.akraskovski.trade.desk.stub.web.form

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * Money object representation.
 */
class Money(
    @JsonProperty("Amount")
    private var amount: BigDecimal? = null,

    @JsonProperty("CurrencyCode")
    private var currencyCode: String? = null
)