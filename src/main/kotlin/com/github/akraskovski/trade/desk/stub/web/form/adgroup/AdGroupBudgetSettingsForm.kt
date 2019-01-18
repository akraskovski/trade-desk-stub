package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm

/**
 * AdGroupBudgetSettingsForm.
 */
class AdGroupBudgetSettingsForm(
    @field:JsonProperty("Budget") var budget: MoneyForm? = null,

    @field:JsonProperty("BudgetInImpressions") var budgetInImpressions: Long? = null,

    @field:JsonProperty("DailyBudget") var dailyBudget: MoneyForm? = null,

    @field:JsonProperty("DailyBudgetInImpressions") var dailyBudgetInImpressions: Long? = null,

    @field:JsonProperty("PacingMode") var pacingMode: String? = null
)