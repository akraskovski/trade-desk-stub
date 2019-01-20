package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.response.MoneyResponse

/**
 * AdGroupBudgetSettingsResponse.
 */
class AdGroupBudgetSettingsResponse(
    @field:JsonProperty("Budget") var budget: MoneyResponse? = null,

    @field:JsonProperty("BudgetInImpressions") var budgetInImpressions: Long? = null,

    @field:JsonProperty("DailyBudget") var dailyBudget: MoneyResponse? = null,

    @field:JsonProperty("DailyBudgetInImpressions") var dailyBudgetInImpressions: Long? = null,

    @field:JsonProperty("PacingMode") var pacingMode: String? = null
)