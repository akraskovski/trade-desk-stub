package com.github.akraskovski.trade.desk.stub.web.form

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

/**
 * MoneyForm object representation.
 */
class MoneyForm(
    @field:JsonProperty("Amount") var amount: BigDecimal? = null,

    @field:JsonProperty("CurrencyCode") var currencyCode: String? = null
)