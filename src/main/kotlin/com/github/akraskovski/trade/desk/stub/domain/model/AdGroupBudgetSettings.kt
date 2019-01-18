package com.github.akraskovski.trade.desk.stub.domain.model

import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm

/**
 * AdGroupBudgetSettings.
 */
class AdGroupBudgetSettings(
    var budget: MoneyForm? = null,
    var budgetInImpressions: Long? = null,
    var dailyBudget: MoneyForm? = null,
    var dailyBudgetInImpressions: Long? = null,
    var pacingMode: String? = null
)