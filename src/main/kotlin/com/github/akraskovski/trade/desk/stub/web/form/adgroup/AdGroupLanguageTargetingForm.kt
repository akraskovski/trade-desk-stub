package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * AdGroupLanguageTargetingForm.
 */
class AdGroupLanguageTargetingForm(
    @field:JsonProperty("LanguageTargetingAdjustments") var languageTargetingAdjustments: BidAdjustmentsForm<Int>? = null
)