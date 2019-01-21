package com.github.akraskovski.trade.desk.stub.domain.model.adgroup

import com.github.akraskovski.trade.desk.stub.domain.model.Money

/**
 * AdGroupBudgetSettings.
 */
class AdGroupBudgetSettings(
    var budget: Money? = null,
    var budgetInImpressions: Long? = null,
    var dailyBudget: Money? = null,
    var dailyBudgetInImpressions: Long? = null,
    var pacingMode: String? = null
)